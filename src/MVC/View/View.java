
package MVC.View;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.Dimension;
import MVC.model.Piece;
import MVC.model.piece.immovable.Bomb;
import MVC.model.piece.immovable.flag;
import MVC.model.piece.moveable.BeastRider;
import MVC.model.piece.moveable.Drake;
import MVC.model.piece.moveable.Elf;
import MVC.model.piece.moveable.Knight;
import MVC.model.piece.moveable.LavaBeast;
import MVC.model.piece.moveable.Mage;
import MVC.model.piece.moveable.Sorceress;
import MVC.model.piece.moveable.Yeti;
import MVC.model.piece.moveable.SpecialPiece.Dwarf;
import MVC.model.piece.moveable.SpecialPiece.Scout;
import MVC.model.piece.moveable.SpecialPiece.Slayer;

/**
 *
 * @author Thanos
 */
public class View extends JFrame {
	/**
	 * The iconselected
	 */
    public boolean iconSelected;
    /**
     * The Jbutton of the selected button
     */
    public JButton selectedButton;
    /**
     * An array of Jbutton representing the board in the game
     */
    public JButton[] Ppieces=new JButton [80];
    /**
     * An array list type of pieces so it can store some pieces
     */
    public ArrayList<Piece> gPieces=new ArrayList<Piece>();
    /**
     * An array of pieces
     */
    public Piece arrayP[]=new Piece[80];
    /**
     * 
     * The main Jpanel used for the board of the game
     */
    public JPanel panel = new JPanel();
    /**
     * The image of the blue drake
     */
    ImageIcon dragonB=new ImageIcon(this.getClass().getResource("/bluePieces/dragonB.png"));
    /**
     * The image of the blue mage
     */
    ImageIcon mageB=new ImageIcon(this.getClass().getResource("/bluePieces/mageB.png"));
    /**
     * The image of the knight blue
     */
    ImageIcon knightB=new ImageIcon(this.getClass().getResource("/bluePieces/knightB.png"));
    /**
     * The image of the beastrider blue
     */
    ImageIcon beastRiderB=new ImageIcon(this.getClass().getResource("/bluePieces/beastRiderB.png"));
    /**
     * The image of sorceress blue
     */
	ImageIcon sorceress=new ImageIcon(this.getClass().getResource("/bluePieces/sorceressB.png"));
	/**
	 * The image of the yeti
	 */
	ImageIcon yeti=new ImageIcon(this.getClass().getResource("/bluePieces/yeti.png"));
	/**
	 * the image of the elf blue
	 */
	ImageIcon elf=new ImageIcon(this.getClass().getResource("/bluePieces/elfB.png"));
	/**
	 * The imga of the dwarf blue
	 */
    ImageIcon dwarf=new ImageIcon(this.getClass().getResource("/bluePieces/dwarfB.png"));
    /**
     * The image of the scout blue
     */
	ImageIcon scout=new ImageIcon(this.getClass().getResource("/bluePieces/scoutB.png"));
	/**
	 * The image of the slayer blue
	 */
	ImageIcon slayer=new ImageIcon(this.getClass().getResource("/bluePieces/slayerB.png"));
	/**
	 * The Jlabel of the dragon blue
	 */
	JLabel drake1=new JLabel(dragonB);
	/**
	 * The Jlabel of the mage blue
	 */
	JLabel mage1=new JLabel(mageB);
	/**
	 * The Jlabel of the Knight blue
	 */
	JLabel Knight1=new JLabel(knightB);
	/**
	 * The JLabel of the beastrider
	 */
	JLabel beastRider1=new JLabel(beastRiderB);
	/**
	 * The Jlabel of the sorceress
	 */
	JLabel Sorceress1=new JLabel(sorceress);
	/**
	 * The JLabel of the Yeti
	 */
	JLabel Yeti1=new JLabel(yeti);
	/**
	 * The JLabel of the elf
	 */
	JLabel Elf1=new JLabel(elf);
	/**
	 * The Jlabel of the Dwarf
	 */
	JLabel Dwarf1=new JLabel(dwarf);
	/**
	 * The JLabel of the Scout
	 */
	JLabel Scout1=new JLabel(scout);
	/**
	 * The Jlabel of the slayer
	 */
	JLabel Slayer1=new JLabel(slayer);
	/**
	 * This array used for the Hidden S purpose so it can store each time all the pieces that are goin to be replaced with s and then putting thm back when the turn is changed!
	 */
    JButton[] bef=new JButton[80];
    /**
     * Panel used for rules
     */
    JPanel panel1=new JPanel();
    /**
     * Panel used for the JLabel of statisticks
     */
    JPanel panel22=new JPanel();
    /**
     * Pnael used for the Players's turn
     */
    JPanel panel2=new JPanel();
    /**
     * Panel used for the rescue and round and attack percentage
     */
    JPanel panel33=new JPanel();
    /**
     * used for the captures
     */
    JPanel panel444=new JPanel();
    /**
     * Used for the captures
     */
    JPanel panel4444=new JPanel();
    /**
     * Panel used for the whole captures
     */
    JPanel panels=new JPanel();
    /**
     * These panel is super panel for toher panel's in the menu
     */
    JPanel panel3=new JPanel();
    /**
     * Used for the captures
     */
    JPanel panel44=new JPanel();
    /**
     * Super panel for all captures statistikcs (photo's etc)
     */
    JPanel panel4=new JPanel();
    /**
     * Captured Drakes blue
     */
    JLabel drake=new JLabel("0");
    /**
     * Captured mage blue 
     */
    JLabel mage=new JLabel("0");
    /**
     * Captured Knight's blue 
     */
    JLabel Knight=new JLabel("0");
    /**
     * Captured BeastRider's blue 
     */
    JLabel beastRider=new JLabel("0");
    /**
     * Captured BeastRiders blue 
     */
    JLabel Sorceress=new JLabel("0");
    /**
     * captured Yeti blue
     */
	JLabel Yeti=new JLabel("0");
	/**
	 * Captured Elf's blue
	 */
	JLabel Elf=new JLabel("0");
	/**
	 * Captured Dwarf blue
	 */
	JLabel Dwarf=new JLabel("0");
	/**
	 * Captured Scout blue
	 */
	JLabel Scout=new JLabel("0");
	/**
	 * Captured slayer blue
	 */
	JLabel Slayer=new JLabel("0");
	/**
	 * Captured drake red
	 */
	JLabel drakeR=new JLabel("0");
	/**
	 * captured mage red
	 */
    JLabel mageR=new JLabel("0");
    /**
     * Captured Kinght red
     */
    JLabel KnightR=new JLabel("0");
    /**
     * captured beastrider red
     */
    JLabel beastRiderR=new JLabel("0");
    /**
     * Captured sorceress red
     */
    JLabel SorceressR=new JLabel("0");
    /**
     * Captured lavabeast
     */
	JLabel YetiR=new JLabel("0");
	/**
	 * Captured elf red
	 */
	JLabel ElfR=new JLabel("0");
	/**
	 * Captured Dwarf red
	 */
	JLabel DwarfR=new JLabel("0");
	/**
	 * Captured Scout red
	 */
	JLabel ScoutR=new JLabel("0");
	/**
	 * Captured Slayer red
	 */
	JLabel SlayerR=new JLabel("0");
     /**
      * Jlabel for attack percentage
      */
	 JLabel percentage = new JLabel();
	 /**
	  * AMount fo rescue's
	  */
     JLabel rescue = new JLabel();
     /**
      * round's Jlabel
      */
     JLabel round = new JLabel();
     /**
      * Total captures Jlabel
      */
     JLabel captures=new JLabel("ΣΥΝΟΛΙΚΕΣ ΚΑΤΑΚΤΗΣΕΙΣ :0");
     /**
      * Turn's jlabel
      */
     JLabel turn = new JLabel();
     /**
      * RULES JLABEL
      */
     JLabel Menu1=new JLabel("                            ΕΝΕΡΓΟΙ ΚΑΝΟΝΕΣ");
     /**
      * STATISTCKS JLABEL
      */
     JLabel Menu2=new JLabel("                            ΣΤΑΤΙΣΤΙΚΑ");
     /**
      * CAPTURES JLABEL
      */
     JLabel Menu3=new JLabel("                            ΑΙΧΜΑΛΩΤΙΣΕΙΣ");
     /**
      * CHECKBOX FOR LOWER_ARMY
      */
     public JCheckBox checkbox = new JCheckBox("ΜΕΙΩΜΕΝΟΣ ΣΤΡΑΤΟΣ");
     /**
      * CHECK BOX FOR NO_RETREAT
      */
    public  JCheckBox checkbox1 = new JCheckBox("ΚΑΜΙΑ ΥΠΟΧΩΡΗΣΗ");
    /**
     * <b>Transformer:</b>Used for the activity of rescue ,brings back to the board an captured pawn
     * <b>Precodition:</b>The pawn should exist,the pawn should be dead,the position given should be valid for each player
     * <b>Postcodition:</b>The pawn selected by the user is set back to game
     * @param p the current position of the pawn that is going to be used for the rescue activity
     * @param pos an array of strings used for identifying which block is occupied by who?
     * @return the new position of the rescued pawn
     */
    public int Rescue(int p,String pos[])
    {
    	if(p>=0 && p<10)
    	{
    		boolean thereIs=false;
    		int answer=JOptionPane.showConfirmDialog(null,"Do you want to rescue?");   
    		if(answer==JOptionPane.YES_OPTION)
    		{
    			String name=JOptionPane.showInputDialog(null,"Input the rank");
    			while(thereIs!=true)
    			{
    			while( Integer. parseInt(name)<0 || Integer. parseInt(name)>10)
    			{
    				name=JOptionPane.showInputDialog(null,"Input the rank");
    			}
    			if( Integer.parseInt(name)==10)
    			{
    				if(drake.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Drake is alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==9)
    			{
    				if(mage.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Mage is alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==8)
    			{
    				if(Knight.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Knight's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==7)
    			{
    				if(beastRider.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"BeastRider's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==6)
    			{
    				if(Sorceress.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Sorceress's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==5)
    			{
    				if(Yeti.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"LavaBeast's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==4)
    			{
    				if(Elf.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Elf's are alive");name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==3)
    			{
    				if(Dwarf.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Dwarf's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==2)
    			{
    				if(Scout.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Scout's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==1)
    			{
    				if(Slayer.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Slayer is alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			}
    			String position=JOptionPane.showInputDialog(null,"Input the position you want to be in");
    			while( Integer. parseInt(position)<50 || Integer. parseInt(position)>80 || pos[Integer. parseInt(position)]=="blue")
    			{
    				position=JOptionPane.showInputDialog(null,"Input the position you want to be in");
    			}
    			if( Integer. parseInt(name)==1)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/slayerR.png")));	
    				arrayP[Integer. parseInt(position)]=new Slayer("Slayer",1,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==2)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/scoutB.png")));	
    				arrayP[Integer. parseInt(position)]=new Scout("Scout",2,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==3)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/dwarfR.png")));	
    				arrayP[Integer. parseInt(position)]=new Dwarf("Dwarf",Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==4)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/elfR.png")));	
    				arrayP[Integer. parseInt(position)]=new Elf("Elf",4,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==5)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/lavabeast.png")));	
    				arrayP[Integer. parseInt(position)]=new LavaBeast("LavaBeast",5,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==6)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/sorceressR.png")));	
    				arrayP[Integer. parseInt(position)]=new Sorceress("Sorceress",6,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==7)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/beastRiderR.png")));	
    				arrayP[Integer. parseInt(position)]=new BeastRider("BeastRider",7,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==8)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/knightR.png")));	
    				arrayP[Integer. parseInt(position)]=new Knight("Knight",8,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==9)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/mageR.png")));	
    				arrayP[Integer. parseInt(position)]=new Mage("Mage",9,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==10)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(new ImageIcon(this.getClass().getResource("/RedPieces/dragonR.png")));	
    				arrayP[Integer. parseInt(position)]=new Drake("Drake",10,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			
    		}
    	}
    	if(p>=70 && p<80)
    	{
    		int answer=JOptionPane.showConfirmDialog(null,"Do you want to rescue?");   
    		if(answer==JOptionPane.YES_OPTION)
    		{
    			String name=JOptionPane.showInputDialog(null,"Input the rank");
    			boolean thereIs=false;
    			while(thereIs!=true)
    			{
    			while( Integer. parseInt(name)<0 || Integer. parseInt(name)>10)
    			{
    				name=JOptionPane.showInputDialog(null,"Input the rank");
    			}
    			if( Integer.parseInt(name)==10)
    			{
    				if(drakeR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Drake is alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==9)
    			{
    				if(mageR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Mage is alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==8)
    			{
    				if(KnightR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Knight's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==7)
    			{
    				if(beastRiderR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"BeastRider's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==6)
    			{
    				if(SorceressR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Sorceress's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==5)
    			{
    				if(YetiR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"LavaBeast's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==4)
    			{
    				if(ElfR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Elf's are alive");name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==3)
    			{
    				if(DwarfR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Dwarf's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==2)
    			{
    				if(ScoutR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Scout's are alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			if(Integer.parseInt(name)==1)
    			{
    				if(SlayerR.getText().equals("0"))
    				{
    					JOptionPane.showMessageDialog(null,"Slayer is alive");
    					name=JOptionPane.showInputDialog(null,"Input the rank");
    				}
    				else
    				{
    					thereIs=true;
    				}
    			}
    			}
    			String position=JOptionPane.showInputDialog(null,"Input the position you want to be in");
    			while( Integer. parseInt(position)<0 || Integer. parseInt(position)>30 || pos[Integer. parseInt(position)]=="red")
    			{
    				position=JOptionPane.showInputDialog(null,"Input the position you want to be in");
    			}
    			if( Integer. parseInt(name)==1)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(slayer);	
    				arrayP[Integer. parseInt(position)]=new Slayer("Slayer",1,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==2)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(scout);	
    				arrayP[Integer. parseInt(position)]=new Scout("Scout",2,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==3)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(dwarf);	
    				arrayP[Integer. parseInt(position)]=new Dwarf("Dwarf",Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==4)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(elf);	
    				arrayP[Integer. parseInt(position)]=new Elf("Elf",4,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==5)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(yeti);	
    				arrayP[Integer. parseInt(position)]=new LavaBeast("LavaBeast",5,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==6)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(sorceress);	
    				arrayP[Integer. parseInt(position)]=new Sorceress("Sorceress",6,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==7)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(beastRiderB);	
    				arrayP[Integer. parseInt(position)]=new BeastRider("BeastRider",7,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==8)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(knightB);	
    				arrayP[Integer. parseInt(position)]=new Knight("Knight",8,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			if( Integer. parseInt(name)==9)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(mageB);	
    				arrayP[Integer. parseInt(position)]=new Mage("Mage",9,Integer. parseInt(position),"");	return Integer. parseInt(position);
    			}
    			else if(Integer. parseInt(name)==10)
    			{
    				Ppieces[Integer. parseInt(position)].setIcon(dragonB);	
    				arrayP[Integer. parseInt(position)]=new Drake("Drake",10,Integer. parseInt(position),"");
    				return Integer. parseInt(position);
    			}
    			
    		}
    	}
    	return 0;
    }
    /**
     * <b>Transformer:</b>It is used for changing the map layout by deacreasing each player's pawn by half
     * <b>Postcodition:</b> The layout based of deacrising by half is done
     */
    public void lower_army()
    {
    int b=0,d=0,sc=0,k=0,bo=0,e=0,s=0,y=0; 
    for(int i=0; i<80; i++)
    {
    	if(i<30)
    	{
    	if(arrayP[i] instanceof Knight && k==0)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		k=1;
    	}
    	if(arrayP[i] instanceof BeastRider && b<=1)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		b++;
    	}
    	if(arrayP[i] instanceof Sorceress && s==0)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		s=1;
    	}
    	if(arrayP[i] instanceof Yeti && y==0)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		y=1;
    	}
    	if(arrayP[i] instanceof Elf && e==0)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		e=1;
    	}
    	if(arrayP[i] instanceof Dwarf && d<=2)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		d++;
    	}
    	if(arrayP[i] instanceof Scout && sc<=1)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		sc++;
    	}
    	if(arrayP[i] instanceof Bomb && bo<=2)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		bo++;
    	}
    	}	
    	if(i>=50)
    	{
    	if(arrayP[i] instanceof Knight && k==1)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		k=2;
    	}
    	if(arrayP[i] instanceof BeastRider && b<=3)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		b++;
    	}
    	if(arrayP[i] instanceof Sorceress && s==1)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		s=2;
    	}
    	if(arrayP[i] instanceof LavaBeast && y==1)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		y=2;
    	}
    	if(arrayP[i] instanceof Elf && e==1)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		e=2;
    	}
    	if(arrayP[i] instanceof Dwarf && d<=5)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		d++;
    	}
    	if(arrayP[i] instanceof Scout && sc<=4)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		sc++;
    	}
    	if(arrayP[i] instanceof Bomb && bo<=5)
    	{
    		arrayP[i]=null;
    		Ppieces[i].setIcon(null);
    		bo++;
    	}
    	}	
    }	  
    }
    /**
     * !!!!!!!!!!Not used!!!!!
     * @param pos not used
     */
    public void SetPawnsP1(String pos[])
    {
    	for(int i=0; i<80; i++)
		   {
 			if(pos[i]=="blue")
     		{
 				  Ppieces[i].setIcon(null);
 	 			  Ppieces[i]=bef[i];   	
     		}
		   }	
    }
    /**
     * <b>Transformer:</b>It is used for changing after every move of a player the map layout and the menu information!
     * <b>Precodition:</b>The parametetrs given by the controller should be valid and non error
     * <b>Postcodition:</b>The Menu is refreshed and the turn of players is changed !
     * @param flag1 player 1's turn
     * @param pos an array of strings shwoing each time which block are occupied by who!
     * @param flag2 players'2 turn
     * @param r round
     * @param attack succeful attack's
     * @param attack1 attack attempts
     * @param rank_power the power of the pawn last died
     * @param r_p if the player's turn who is now killed or got kileld 
     * @param Rescue the rescue amount if done
     */
    public void TurnChange(boolean flag1,String pos[],boolean flag2,int r,int attack,int attack1,int rank_power,int r_p,int Rescue)
    {JPanel jp=new JPanel();
    jp.setLayout(new GridLayout(8, 10));
    int counter=0,d=0,m=0,k=0,b=0,s=0,y=0,l=0,e=0,dw=0,sc=0,sl=0,bo=0;
    	if(flag1==false)
    	{
    		for(int i=0; i<80; i++)
 		   {
    			if(i==32 || i==33 || i==42 ||i==43 || i==36|| i==37 || i==46 ||i==47)
    			{
    				this.Ppieces[i].setName("forbidden");
    				this.Ppieces[i].setBackground(Color.YELLOW);
    				this.Ppieces[i].setOpaque(true);
    				jp.add(Ppieces[i]);
    			}
 			   if(pos[i]=="blue")
 			   {
 				   if((arrayP[i] instanceof Drake)==true)
 				   {
 					   d++;
 				   }
 				   if(((arrayP[i] instanceof Mage)==true))
 				   {
 					  m++;
 				   }
 				  if((arrayP[i] instanceof Knight)==true)
				   {
					   k++;
				   }
				   if(((arrayP[i] instanceof BeastRider)==true))
				   {
					  b++;
				   }
				   if((arrayP[i] instanceof Sorceress)==true)
 				   {
 					   s++;
 				   }
 				   if(((arrayP[i] instanceof Yeti)==true))
 				   {
 					  y++;
 				   }
				   if(((arrayP[i] instanceof Elf)==true))
				   {
					  e++;
				   }
				   if((arrayP[i] instanceof Dwarf)==true)
 				   {
 					   dw++;
 				   }
 				   if(((arrayP[i] instanceof Scout)==true))
 				   {
 					  sc++;
 				   }
 				   if((arrayP[i] instanceof Slayer)==true)
 				   {
 					   sl++;
 				   }
 				   counter++;
 				   bef[i]=new JButton();
 				  bef[i].setIcon(Ppieces[i].getIcon());
 				 this.Ppieces[i].setName("blueHidden");
 				   ImageIcon S=new ImageIcon(this.getClass().getResource("/bluePieces//blueHidden.png"));
 				  Ppieces[i].setIcon(S);
 				  jp.add(this.Ppieces[i]);
 			   }
 			  if(pos[i]=="red")
      		   {
 				 Ppieces[i].setIcon(null);
 				Ppieces[i].setName(bef[i].getName());
 				Ppieces[i].setIcon(bef[i].getIcon());
  				jp.add(Ppieces[i]);
  				//System.out.println("edo3");
      		   }
 			  if(pos[i]=="blank")
 			  {
 	        	 this.Ppieces[i].setName("blank"+i);
 	        	jp.add(Ppieces[i]);
 			  }
 		   }
    		turn.setText("Player's 2 turn");
    		int counterr=0;
    		if(attack1!=0)
    		{
    			percentage.setText("Ποσοστο επιθεσης:"+new DecimalFormat("##.##").format((100.0f)*Double.valueOf( attack)/Double.valueOf(attack1))+"%");		
    			captures.setText("ΣΥΝΟΛΙΚΕΣ ΚΑΤΑΚΤΗΣΕΙΣ :"+attack);
    		}
    		else
    		{
    			percentage.setText("Ποσοστο επιθεσης:0%");
    		}
    		if(d==0)
    		{
    			//JOptionPane.showMessageDialog(null, "drake");
    			drakeR.setText(Integer.toString(1));
    			counterr++;
    		}
    		if(m==0)
    		{
    			//JOptionPane.showMessageDialog(null, "mage");
    			mageR.setText(Integer.toString(1));
    			counterr++;
    		}
    		if(k<2)
    		{
    			//JOptionPane.showMessageDialog(null, "knight");
    			KnightR.setText(Integer.toString(2-k));
    			counterr++;
    		}
    		if(b<3)
    		{
    			//JOptionPane.showMessageDialog(null, "beastrider");
    			beastRiderR.setText(Integer.toString(3-b));
    			counterr++;
    		}
    		if(s<2)
    		{
    			//JOptionPane.showMessageDialog(null, "sorceress");
    			SorceressR.setText(Integer.toString(2-s));
    			counterr++;
    		}
    		if(y<2)
    		{
    		//	JOptionPane.showMessageDialog(null, "yeti");
    			YetiR.setText(Integer.toString(2-l));
    			counterr++;
    		}
    		if(e<2)
    		{
    			//JOptionPane.showMessageDialog(null, "elf");
    			ElfR.setText(Integer.toString(2-e));
    			counterr++;
    		}
    		if(dw<5)
    		{
    			//JOptionPane.showMessageDialog(null, "dwarf");
    			DwarfR.setText(Integer.toString(5-dw));
    			counterr++;
    		}
    		if(sc<4)
    		{
    			///JOptionPane.showMessageDialog(null, "Scout");
    			ScoutR.setText(Integer.toString(4-b));
    			counterr++;
    		}
    		if(sl==0)
    		{
    			//JOptionPane.showMessageDialog(null, "slayer");
    			SlayerR.setText(Integer.toString(1));
    			counterr++;
    		}
    		rescue.setText("Διασωσεις:"+Rescue);
    		round.setText("Γυρος:"+r);
    		captures.setText("ΣΥΝΟΛΙΚΕΣ ΑΙΧΜΑΛΩΤΙΣΕΙΣ:"+counterr);
    		panel33.add(turn);
    		panel33.add(percentage);
            panel33.add(rescue);
    		panel33.add(round);
    		panel3.add(panel33);
    		 panel3.add(Menu3);
    		panel1.add(panel3);
    		panel44.remove(drake);
    		panel44.revalidate();
    		panel44.repaint();
    		panel44.remove(mage);
    		panel44.revalidate();
    		panel44.repaint();
    		panel44.remove(Knight);
    		panel44.revalidate();
    		panel44.repaint();
    		panel444.remove(beastRider);
    		panel444.revalidate();
    		panel444.repaint();
    		panel444.remove(Sorceress);
    		panel444.revalidate();
    		panel444.repaint();
    		panel444.remove(Yeti);
    		panel444.revalidate();
    		panel444.repaint();
    		panel444.remove(Elf);
    		panel444.revalidate();
    		panel444.repaint();
    		panels.remove(Dwarf);
    		panels.revalidate();
    		panels.repaint();
    		panels.remove(Scout);
    		panels.revalidate();
    		panels.repaint();
    		panels.remove(Slayer);
    		panels.revalidate();
    		panels.repaint();
    		 panel44.add(drake1);
    		 drakeR.setForeground(Color.white);
    			drakeR.setFont(new Font("", Font.PLAIN, 20));
    			mageR.setForeground(Color.white);
    			mageR.setFont(new Font("", Font.PLAIN, 20));
    		    KnightR.setForeground(Color.white);
    			KnightR.setFont(new Font("", Font.PLAIN, 20));
    			beastRiderR.setForeground(Color.white);
    			beastRiderR.setFont(new Font("", Font.PLAIN, 20));
    			SorceressR.setForeground(Color.white);
    			SorceressR.setFont(new Font("", Font.PLAIN, 20));
    			YetiR.setForeground(Color.white);
    			YetiR.setFont(new Font("", Font.PLAIN, 20));
    		    ElfR.setForeground(Color.white);
    			ElfR.setFont(new Font("", Font.PLAIN, 20));
    			DwarfR.setForeground(Color.white);
    			DwarfR.setFont(new Font("", Font.PLAIN, 20));
    			ScoutR.setForeground(Color.white);
    		    ScoutR.setFont(new Font("", Font.PLAIN, 20));
    		     SlayerR.setForeground(Color.white);
    		    SlayerR.setFont(new Font("", Font.PLAIN, 20));	
    	        panel44.add(drakeR);
    	        panel44.add(mage1);
    	        panel44.add(mageR);
    	        panel44.add(Knight1);
    	        panel44.add(KnightR);
    	        panel4.add(panel44);
    	        panel444.add(beastRider1);
    	        panel444.add(beastRiderR);
    	        panel444.add(Sorceress1); 
    	        panel444.add(SorceressR);
    	        panel444.add(Yeti1);
    	        panel444.add(YetiR);
    	        panel444.add(Elf1);
    	        panel444.add(ElfR);
    	        panel4.add(panel444);
    	        panels.add(Dwarf1);
    	        panels.add(DwarfR);
    	        panels.add(Scout1); 
    	        panels.add(ScoutR); 
    	        panels.add(Slayer1);
    	        panels.add(SlayerR);
    	        panel4.add(panels);
    	        panel4444.add(captures);
    	        panel4.add(panel4444);
        		panel1.add(panel4);
    		add(jp);
    	}
    	if(flag2==false)
    	{
    		for(int i=0; i<80; i++)
  		   {
     			if(i==32 || i==33 || i==42 ||i==43 || i==36|| i==37 || i==46 ||i==47)
     			{
     				this.Ppieces[i].setName("forbidden");
     				this.Ppieces[i].setBackground(Color.YELLOW);
     				this.Ppieces[i].setOpaque(true);
     				jp.add(Ppieces[i]);
     			}
  			   if(pos[i]=="red")
  			   {
  				 if((arrayP[i] instanceof Drake)==true)
				   {
					   d++;
				   }
				   if(((arrayP[i] instanceof Mage)==true))
				   {
					  m++;
				   }
				  if((arrayP[i] instanceof Knight)==true)
				   {
					   k++;
				   }
				   if(((arrayP[i] instanceof BeastRider)==true))
				   {
					  b++;
				   }
				   if((arrayP[i] instanceof Sorceress)==true)
				   {
					   s++;
				   }
				  if((arrayP[i] instanceof Yeti)==true)
				   {
					   y++;
				   }
				   if(((arrayP[i] instanceof Elf)==true))
				   {
					  e++;
				   }
				   if((arrayP[i] instanceof Dwarf)==true)
				   {
					   dw++;
				   }
				   if(((arrayP[i] instanceof Scout)==true))
				   {
					  sc++;
				   }
				   if((arrayP[i] instanceof Slayer)==true)
				   {
					   sl++;
				   }
  				   bef[i]=new JButton();
  				  bef[i].setIcon(Ppieces[i].getIcon());
  				 this.Ppieces[i].setName("redHidden");
  				   ImageIcon S=new ImageIcon(this.getClass().getResource("/RedPieces//redHidden.png"));
  				   Ppieces[i].setIcon(S);
  				  //Ppieces[i]=new JButton(S);
  				  jp.add(this.Ppieces[i]);
  			   }
  			  if(pos[i]=="blue")
       		   {
  				 Ppieces[i].setIcon(null);
  				Ppieces[i].setName(bef[i].getName());
  				Ppieces[i].setIcon(bef[i].getIcon());
   				jp.add(Ppieces[i]);
   				//.out.println("edo3");
       		   }
  			  if(pos[i]=="blank")
  			  {
  				 //this.Ppieces[i]=new JButton();
  	        	 this.Ppieces[i].setName("blank"+i);
  	        	jp.add(Ppieces[i]);
  			  }
  		   }
    		 turn.setText("Player's 1 turn"); 
    		 int counterr=0;
    			if(attack1!=0)
        		{
        			percentage.setText("Ποσοστο επιθεσης:"+new DecimalFormat("##.##").format((100.0f)*Double.valueOf( attack)/Double.valueOf(attack1))+"%");		
        			captures.setText("ΣΥΝΟΛΙΚΕΣ ΚΑΤΑΚΤΗΣΕΙΣ :"+attack);
        		}
        		else
        		{
        			percentage.setText("Ποσοστο επιθεσης:0%");
        		}		
    			if(d==0)
        		{
        			//JOptionPane.showMessageDialog(null, "drake");
        			drake.setText(Integer.toString(1));
        			counterr++;
        		}
        		if(m==0)
        		{
        			//JOptionPane.showMessageDialog(null, "mage");
        			mage.setText(Integer.toString(1));
        			counterr++;
        		}
        		if(k<2)
        		{
        			//JOptionPane.showMessageDialog(null, "knight");
        			Knight.setText(Integer.toString(2-k));
        			counterr++;
        		}
        		if(b<3)
        		{
        			//JOptionPane.showMessageDialog(null, "beastrider");
        			beastRider.setText(Integer.toString(3-b));
        			counterr++;
        		}
        		if(s<2)
        		{
        			//JOptionPane.showMessageDialog(null, "sorceress");
        			Sorceress.setText(Integer.toString(2-s));
        			counterr++;
        		}
        		if(y<2)
        		{
        			//JOptionPane.showMessageDialog(null, "yeti");
        			Yeti.setText(Integer.toString(2-y));
        			counterr++;
        		}
        		if(e<2)
        		{
        			//JOptionPane.showMessageDialog(null, "elf");
        			Elf.setText(Integer.toString(2-e));
        			counterr++;
        		}
        		if(dw<5)
        		{
        			//JOptionPane.showMessageDialog(null, "dwarf");
        			Dwarf.setText(Integer.toString(5-dw));
        			counterr++;
        		}
        		if(sc<4)
        		{
        			//JOptionPane.showMessageDialog(null, "Scout");
        			Scout.setText(Integer.toString(4-b));
        			counterr++;
        		}
        		if(sl==0)
        		{
        			//JOptionPane.showMessageDialog(null, "slayer");
        			Slayer.setText(Integer.toString(1));
        			counterr++;
        		}
     		rescue.setText("Διασωσεις:"+Rescue);

    		 round.setText("Γυρος:"+r);
    		 captures.setText("ΣΥΝΟΛΙΚΕΣ ΑΙΧΜΑΛΩΤΙΣΕΙΣ:"+counterr);
    		 panel33.add(turn);
     		panel33.add(percentage);
             panel33.add(rescue);
     		panel33.add(round);
    		 panel3.add(panel33);
    		 panel3.add(Menu3);
    		panel1.add(panel3);
    		panel44.remove(drakeR);
    		panel44.revalidate();
    		panel44.repaint();
    		panel44.remove(mageR);
    		panel44.revalidate();
    		panel44.repaint();
    		panel44.remove(KnightR);
    		panel44.revalidate();
    		panel44.repaint();
    		panel444.remove(beastRiderR);
    		panel444.revalidate();
    		panel444.repaint();
    		panel444.remove(SorceressR);
    		panel444.revalidate();
    		panel444.repaint();
    		panel444.remove(YetiR);
    		panel444.revalidate();
    		panel444.repaint();
    		panel444.remove(ElfR);
    		panel444.revalidate();
    		panel444.repaint();
    		panels.remove(DwarfR);
    		panels.revalidate();
    		panels.repaint();
    		panels.remove(ScoutR);
    		panels.revalidate();
    		panels.repaint();
    		panels.remove(SlayerR);
    		panels.revalidate();
    		panels.repaint();
    		 panel44.add(drake1);
    	        panel44.add(drake);
    	        panel44.add(mage1);
    	        panel44.add(mage);
    	        panel44.add(Knight1);
    	        panel44.add(Knight);
    	        panel4.add(panel44);
    	        panel444.add(beastRider1);
    	        panel444.add(beastRider);
    	        panel444.add(Sorceress1); 
    	        panel444.add(Sorceress);
    	        panel444.add(Yeti1);
    	        panel444.add(Yeti);
    	        panel444.add(Elf1);
    	        panel444.add(Elf);
    	        panel4.add(panel444);
    	        panels.add(Dwarf1);
    	        panels.add(Dwarf);
    	        panels.add(Scout1); 
    	        panels.add(Scout); 
    	        panels.add(Slayer1);
    	        panels.add(Slayer);
    	        panel4.add(panels);
    	        panel4444.add(captures);
    	        panel4.add(panel4444);
        		panel1.add(panel4);
     		add(jp);
     	}
    	
    	this.getContentPane().removeAll();
    	JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jp,panel1);
        this.getContentPane().add(sp);
        sp.setResizeWeight(0.7);
        this.setVisible(true);
    }
    /**
     * <b>Transformer:</b>Initialize piece is used at the creation of the board and it creates 60 pieces and storing them into the an arraylist ,thne making 60 Jbutton of this pieces after with the help of two other arraylist by using shuffle method they are shufled properly and after all these the pieces are found again into the array by their names and refreshing the new positions ofthem
     * <b>Postcodition:</b>The start of the board is set for the pieces
     */
    public void initpiece() 
    {
    	 gPieces.add(new Drake("dragonB",10,0,""));
         gPieces.add(new Mage("mageB",9,0,""));
         gPieces.add(new Knight("knightB",8,0,""));
         gPieces.add(new Knight("knightB1",8,0,""));
         gPieces.add(new BeastRider("beastRiderB",7,0,""));
         gPieces.add(new BeastRider("beastRiderB1",7,0,""));
         gPieces.add(new BeastRider("beastRiderB2",7,0,""));
         gPieces.add(new Sorceress("sorceress",6,0,""));
         gPieces.add(new Sorceress("sorceress1",6,0,""));
         gPieces.add(new Yeti("yeti",5,0,""));
         gPieces.add(new Yeti("yeti1",5,0,""));
         gPieces.add(new Elf("elf",4,0,""));
         gPieces.add(new Elf("elf1",4,0,""));
         gPieces.add(new Dwarf("dwarf",00,""));
         gPieces.add(new Dwarf("dwarf1",00,""));
         gPieces.add(new Dwarf("dwarf2",00,""));
         gPieces.add(new Dwarf("dwarf3",00,""));
         gPieces.add(new Dwarf("dwarf4",00,""));
         gPieces.add(new Scout("scout",2,0,""));
         gPieces.add(new Scout("scout1",2,0,""));
         gPieces.add(new Scout("scout2",2,0,""));
         gPieces.add(new Scout("scout3",2,0,""));
         gPieces.add(new Slayer("slayer",2,0,""));
         gPieces.add(new Bomb("bomb",0,""));
         gPieces.add(new Bomb("bomb1",0,""));
         gPieces.add(new Bomb("bomb2",0,""));
         gPieces.add(new Bomb("bomb3",0,""));
         gPieces.add(new Bomb("bomb4",0,""));
         gPieces.add(new Bomb("bomb5",0,""));
         gPieces.add(new flag("flag",0,""));
         gPieces.add(new Drake("dragon",10,0,""));
         gPieces.add(new Mage("mage",9,0,""));
         gPieces.add(new Knight("knight",8,0,""));
         gPieces.add(new Knight("knight1",8,0,""));
         gPieces.add(new BeastRider("beastRider",7,0,""));
         gPieces.add(new BeastRider("beastRider1",7,0,""));
         gPieces.add(new BeastRider("beastRider2",7,0,""));
         gPieces.add(new Sorceress("sorceressR",6,0,""));
         gPieces.add(new Sorceress("sorceressR1",6,0,""));
         gPieces.add(new Yeti("lavabeast",5,0,""));
         gPieces.add(new Yeti("lavabeast1",5,0,""));
         gPieces.add(new Elf("elfR",4,0,""));
         gPieces.add(new Elf("elfR1",4,0,""));
         gPieces.add(new Dwarf("dwarfR",00,""));
         gPieces.add(new Dwarf("dwarfR1",00,""));
         gPieces.add(new Dwarf("dwarfR2",00,""));
         gPieces.add(new Dwarf("dwarfR3",00,""));
         gPieces.add(new Dwarf("dwarfR4",00,""));
         gPieces.add(new Scout("scoutR",2,0,""));
         gPieces.add(new Scout("scoutR1",2,0,""));
         gPieces.add(new Scout("scoutR2",2,0,""));
         gPieces.add(new Scout("scoutR3",2,0,""));
         gPieces.add(new Slayer("slayerR",2,0,""));
         gPieces.add(new Bomb("bombR",0,""));
         gPieces.add(new Bomb("bombR1",0,""));
         gPieces.add(new Bomb("bombR2",0,""));
         gPieces.add(new Bomb("bombR3",0,""));
         gPieces.add(new Bomb("bombR4",0,""));
         gPieces.add(new Bomb("bombR5",0,""));
         gPieces.add(new flag("flagR",0,""));
    	ImageIcon dragonB=new ImageIcon(this.getClass().getResource("/bluePieces//dragonB.png"));
    	ImageIcon mageB=new ImageIcon(this.getClass().getResource("/bluePieces//mageB.png"));
    	ImageIcon knightB=new ImageIcon(this.getClass().getResource("/bluePieces//knightB.png"));
    	ImageIcon knightB1=new ImageIcon(this.getClass().getResource("/bluePieces//knightB.png"));
    	ImageIcon beastRiderB=new ImageIcon(this.getClass().getResource("/bluePieces//beastRiderB.png"));
    	ImageIcon beastRiderB1=new ImageIcon(this.getClass().getResource("/bluePieces//beastRiderB.png"));
    	ImageIcon beastRiderB2=new ImageIcon(this.getClass().getResource("/bluePieces//beastRiderB.png"));
    	ImageIcon sorceress=new ImageIcon(this.getClass().getResource("/bluePieces//sorceressB.png"));
    	ImageIcon sorceress1=new ImageIcon(this.getClass().getResource("/bluePieces//sorceressB.png"));
    	ImageIcon yeti=new ImageIcon(this.getClass().getResource("/bluePieces//yeti.png"));
    	ImageIcon yeti1=new ImageIcon(this.getClass().getResource("/bluePieces//yeti.png"));
    	ImageIcon elf=new ImageIcon(this.getClass().getResource("/bluePieces//elfB.png"));
    	ImageIcon elf1=new ImageIcon(this.getClass().getResource("/bluePieces//elfB.png"));
    	ImageIcon dwarf=new ImageIcon(this.getClass().getResource("/bluePieces//dwarfB.png"));
    	ImageIcon dwarf1=new ImageIcon(this.getClass().getResource("/bluePieces//dwarfB.png"));
    	ImageIcon dwarf2=new ImageIcon(this.getClass().getResource("/bluePieces//dwarfB.png"));
    	ImageIcon dwarf3=new ImageIcon(this.getClass().getResource("/bluePieces//dwarfB.png"));
    	ImageIcon dwarf4=new ImageIcon(this.getClass().getResource("/bluePieces//dwarfB.png"));
    	ImageIcon scout=new ImageIcon(this.getClass().getResource("/bluePieces//scoutB.png"));
    	ImageIcon scout1=new ImageIcon(this.getClass().getResource("/bluePieces//scoutB.png"));
    	ImageIcon scout2=new ImageIcon(this.getClass().getResource("/bluePieces//scoutB.png"));
    	ImageIcon scout3=new ImageIcon(this.getClass().getResource("/bluePieces//scoutB.png"));
    	ImageIcon slayer=new ImageIcon(this.getClass().getResource("/bluePieces//slayerB.png"));
    	ImageIcon bomb=new ImageIcon(this.getClass().getResource("/bluePieces//trapB.png"));
    	ImageIcon bomb5=new ImageIcon(this.getClass().getResource("/bluePieces//trapB.png"));
    	ImageIcon bomb1=new ImageIcon(this.getClass().getResource("/bluePieces//trapB.png"));
    	ImageIcon bomb2=new ImageIcon(this.getClass().getResource("/bluePieces//trapB.png"));
    	ImageIcon bomb3=new ImageIcon(this.getClass().getResource("/bluePieces//trapB.png"));
    	ImageIcon bomb4=new ImageIcon(this.getClass().getResource("/bluePieces//trapB.png"));
    	ImageIcon flag=new ImageIcon(this.getClass().getResource("/bluePieces//flagB.png"));
    	ImageIcon dragon=new ImageIcon(this.getClass().getResource("/RedPieces//dragonR.png"));
    	ImageIcon mage=new ImageIcon(this.getClass().getResource("/RedPieces//mageR.png"));
    	ImageIcon knight=new ImageIcon(this.getClass().getResource("/RedPieces//knightR.png"));
    	ImageIcon knight1=new ImageIcon(this.getClass().getResource("/RedPieces//knightR.png"));
    	ImageIcon beastRider=new ImageIcon(this.getClass().getResource("/RedPieces//beastRiderR.png"));
    	ImageIcon beastRider1=new ImageIcon(this.getClass().getResource("/RedPieces//beastRiderR.png"));
    	ImageIcon beastRider2=new ImageIcon(this.getClass().getResource("/RedPieces//beastRiderR.png"));
    	ImageIcon sorceressR=new ImageIcon(this.getClass().getResource("/RedPieces//sorceressR.png"));
    	ImageIcon sorceressR1=new ImageIcon(this.getClass().getResource("/RedPieces//sorceressR.png"));
    	ImageIcon lavabeast=new ImageIcon(this.getClass().getResource("/RedPieces/lavaBeast.png"));
    	ImageIcon lavabeast1=new ImageIcon(this.getClass().getResource("/RedPieces/lavaBeast.png"));
    	ImageIcon elfR=new ImageIcon(this.getClass().getResource("/RedPieces//elfR.png"));
    	ImageIcon elfR1=new ImageIcon(this.getClass().getResource("/RedPieces//elfR.png"));
    	ImageIcon dwarfR=new ImageIcon(this.getClass().getResource("/RedPieces//dwarfR.png"));
    	ImageIcon dwarfR1=new ImageIcon(this.getClass().getResource("/RedPieces//dwarfR.png"));
    	ImageIcon dwarfR2=new ImageIcon(this.getClass().getResource("/RedPieces//dwarfR.png"));
    	ImageIcon dwarfR3=new ImageIcon(this.getClass().getResource("/RedPieces//dwarfR.png"));
    	ImageIcon dwarfR4=new ImageIcon(this.getClass().getResource("/RedPieces//dwarfR.png"));
    	ImageIcon scoutR=new ImageIcon(this.getClass().getResource("/RedPieces//scoutB.png"));
    	ImageIcon scoutR1=new ImageIcon(this.getClass().getResource("/RedPieces//scoutB.png"));
    	ImageIcon scoutR2=new ImageIcon(this.getClass().getResource("/RedPieces//scoutB.png"));
    	ImageIcon scoutR3=new ImageIcon(this.getClass().getResource("/RedPieces//scoutB.png"));
    	ImageIcon slayerR=new ImageIcon(this.getClass().getResource("/RedPieces//slayerR.png"));
    	ImageIcon bombR=new ImageIcon(this.getClass().getResource("/RedPieces//trapR.png"));
    	ImageIcon bombR5=new ImageIcon(this.getClass().getResource("/RedPieces//trapR.png"));
    	ImageIcon bombR1=new ImageIcon(this.getClass().getResource("/RedPieces//trapR.png"));
    	ImageIcon bombR2=new ImageIcon(this.getClass().getResource("/RedPieces//trapR.png"));
    	ImageIcon bombR3=new ImageIcon(this.getClass().getResource("/RedPieces//trapR.png"));
    	ImageIcon bombR4=new ImageIcon(this.getClass().getResource("/RedPieces//trapR.png"));
    	ImageIcon flagR=new ImageIcon(this.getClass().getResource("/RedPieces//flagR.png"));
    	this.Ppieces[0]=new JButton(dragonB);
    	this.Ppieces[0].setName("dragonB");
    	this.Ppieces[1]=new JButton(mageB);
    	this.Ppieces[1].setName("mageB");
    	this.Ppieces[2]=new JButton(knightB);
    	this.Ppieces[2].setName("knightB");
    	this.Ppieces[3]=new JButton(knightB1);
    	this.Ppieces[3].setName("knightB1");
    	this.Ppieces[4]=new JButton(beastRiderB);
    	this.Ppieces[4].setName("beastRiderB");
    	this.Ppieces[5]=new JButton(beastRiderB1);
    	this.Ppieces[5].setName("beastRiderB1");
    	this.Ppieces[6]=new JButton(beastRiderB2);
    	this.Ppieces[6].setName("beastRiderB2");
    	this.Ppieces[7]=new JButton(sorceress);
    	this.Ppieces[7].setName("sorceress");
    	this.Ppieces[8]=new JButton(sorceress1);
    	this.Ppieces[8].setName("sorceress1");
    	this.Ppieces[9]=new JButton(yeti);
    	this.Ppieces[9].setName("yeti");
    	this.Ppieces[10]=new JButton(yeti1);
    	this.Ppieces[10].setName("yeti1");
    	this.Ppieces[11]=new JButton(elf);
    	this.Ppieces[11].setName("elf");
    	this.Ppieces[12]=new JButton(elf1);
    	this.Ppieces[12].setName("elf1");
    	this.Ppieces[13]=new JButton(dwarf);
    	this.Ppieces[13].setName("dwarf");
    	this.Ppieces[14]=new JButton(dwarf1);
    	this.Ppieces[14].setName("dwarf1");
    	this.Ppieces[15]=new JButton(dwarf2);
    	this.Ppieces[15].setName("dwarf2");
    	this.Ppieces[16]=new JButton(dwarf3);
    	this.Ppieces[16].setName("dwarf3");
    	this.Ppieces[17]=new JButton(dwarf4);
    	this.Ppieces[17].setName("dwarf4");
    	this.Ppieces[18]=new JButton(scout);
    	this.Ppieces[18].setName("scout");
    	this.Ppieces[19]=new JButton(scout1);
    	this.Ppieces[19].setName("scout1");
    	this.Ppieces[20]=new JButton(scout2);
    	this.Ppieces[20].setName("scout2");
    	this.Ppieces[21]=new JButton(scout3);
    	this.Ppieces[21].setName("scout3");
    	this.Ppieces[22]=new JButton(slayer);
    	this.Ppieces[22].setName("slayer");
    	this.Ppieces[23]=new JButton(bomb);
    	this.Ppieces[23].setName("bomb");
    	this.Ppieces[24]=new JButton(bomb1);
    	this.Ppieces[24].setName("bomb1");
    	this.Ppieces[25]=new JButton(bomb2);
    	this.Ppieces[25].setName("bomb2");
    	this.Ppieces[26]=new JButton(bomb3);
    	this.Ppieces[26].setName("bomb3");
    	this.Ppieces[27]=new JButton(bomb4);
    	this.Ppieces[27].setName("bomb4");
    	this.Ppieces[28]=new JButton(bomb5);
    	this.Ppieces[28].setName("bomb5");
    	this.Ppieces[29]=new JButton(flag);
    	this.Ppieces[29].setName("flag");
    	this.Ppieces[50]=new JButton(dragon);
    	this.Ppieces[50].setName("dragon");
    	this.Ppieces[51]=new JButton(mage);
    	this.Ppieces[51].setName("mage");
    	this.Ppieces[52]=new JButton(knight);
    	this.Ppieces[52].setName("knight");
    	this.Ppieces[53]=new JButton(knight1);
    	this.Ppieces[53].setName("knight1");
    	this.Ppieces[54]=new JButton(beastRider);
    	this.Ppieces[54].setName("beastRider");
    	this.Ppieces[55]=new JButton(beastRider1);
    	this.Ppieces[55].setName("beastRider1");
    	this.Ppieces[56]=new JButton(beastRider2);
    	this.Ppieces[56].setName("beastRider2");
    	this.Ppieces[57]=new JButton(sorceressR);
    	this.Ppieces[57].setName("sorceressR");
    	this.Ppieces[58]=new JButton(sorceressR1);
    	this.Ppieces[58].setName("sorceressR1");
    	this.Ppieces[59]=new JButton(lavabeast);
    	this.Ppieces[59].setName("lavabeast");
    	this.Ppieces[60]=new JButton(lavabeast1);
    	this.Ppieces[60].setName("lavabeast1");
    	this.Ppieces[61]=new JButton(elfR);
    	this.Ppieces[61].setName("elfR");
    	this.Ppieces[62]=new JButton(elfR1);
    	this.Ppieces[62].setName("elfR1");
    	this.Ppieces[63]=new JButton(dwarfR);
    	this.Ppieces[63].setName("dwarfR");
    	this.Ppieces[64]=new JButton(dwarfR1);
    	this.Ppieces[64].setName("dwarfR1");
    	this.Ppieces[65]=new JButton(dwarfR2);
    	this.Ppieces[65].setName("dwarfR2");
    	this.Ppieces[66]=new JButton(dwarfR3);
    	this.Ppieces[66].setName("dwarfR3");
    	this.Ppieces[67]=new JButton(dwarfR4);
    	this.Ppieces[67].setName("dwarfR4");
    	this.Ppieces[68]=new JButton(scoutR);
    	this.Ppieces[68].setName("scoutR");
    	this.Ppieces[69]=new JButton(scoutR1);
    	this.Ppieces[69].setName("scoutR1");
    	this.Ppieces[70]=new JButton(scoutR2);
    	this.Ppieces[70].setName("scoutR2");
    	this.Ppieces[71]=new JButton(scoutR3);
    	this.Ppieces[71].setName("scoutR3");
    	this.Ppieces[72]=new JButton(slayerR);
    	this.Ppieces[72].setName("slayerR");
    	this.Ppieces[73]=new JButton(bombR);
    	this.Ppieces[73].setName("bombR");
    	this.Ppieces[74]=new JButton(bombR1);
    	this.Ppieces[74].setName("bombR1");    	
    	this.Ppieces[75]=new JButton(bombR2);
    	this.Ppieces[75].setName("bombR2");
    	this.Ppieces[76]=new JButton(bombR3);
    	this.Ppieces[76].setName("bombR3");
    	this.Ppieces[77]=new JButton(bombR4);
    	this.Ppieces[77].setName("bombR4");
    	this.Ppieces[78]=new JButton(bombR5);
    	this.Ppieces[78].setName("bombR5");
    	this.Ppieces[79]=new JButton(flagR);
    	this.Ppieces[79].setName("flagR");
    	ArrayList<JButton> Pieces=new ArrayList<JButton>();
    	ArrayList<JButton> Pieces1=new ArrayList<JButton>();
    	for(int i=0; i<30; i++)
    	{
    		Pieces.add(Ppieces[i]); 	
    	}
    	Collections.shuffle(Pieces);
    	for(int i=0; i<30; i++)
    	{
    		Ppieces[i]=Pieces.get(i);
    	}
    	for(int i=50; i<80; i++)
    	{
    		Pieces1.add(Ppieces[i]);
    	}
    	Collections.shuffle(Pieces1);
    	for(int i=0; i<30; i++)
    	{
    		Ppieces[i+50]=Pieces1.get(i);
    	}
    	int counter=0;
    	
    	for(int i=0; i<30; i++)
    	{
    			int j=0;
    			while(j!=30)
    			{
    	    		 if(gPieces.get(i).GetName()==Ppieces[j].getName())
    	    		 {counter++;
    	    			 gPieces.get(i).position=j;
    	    			 arrayP[j]=gPieces.get(i);
    	    			 break;
    	    		}
    				j++;
                  }
    	}
    	for(int i=30; i<60; i++)
    	{
    			int j=50;
    			while(j!=80)
    			{
    	    		 if(gPieces.get(i).GetName()==Ppieces[j].getName())
    	    		 {
    	    			 System.out.println(Ppieces[j].getName());
    	    			 counter++;
    	    			 gPieces.get(i).position=j;
    	    			 arrayP[j]=gPieces.get(i);
    	    			 if( arrayP[j]==null)
    	    			 {
    	    				 System.out.println("yooo"+arrayP[j].position); 
    	    			 }
    	    			 break;
    	    		}
    				j++;
                  }
    	}
    	for(int i=31; i<50; i++)
    	{
    		arrayP[i]=null;	
    	}
   
    }
    /**
     * <b>Constructor:</b>View constructor that sets the size of the jframe its title then it sets a layout8,10 for the board and used initpiece  for itss purposes and then its sets all the jbutton to the layout of 8:10 .Also it sets all the titles for the menu and 2 checkboxes 4 variables with title (round ,percentage attack,rescue ,turn) and capture activity with photo's and the number near it of each capture
     * @throws IOException .
     */
    public View() throws IOException {
        // this.setResizable(false);
    	this.setSize(900,900);
        this.setTitle("STRATEGO");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //CardListener cl = new CardListener();
        this.initpiece();
        panel.setLayout(new GridLayout(8, 10));
        for(int i=0; i<80; i++)
        {
         if(i>29 && i<50)
         {
        	 this.Ppieces[i]=new JButton();
        	 this.Ppieces[i].setName("blank"+i);
			if(i==32 || i==33 || i==42 ||i==43 || i==36|| i==37 || i==46 ||i==47)
			{
				this.Ppieces[i].setName("forbidden");
				this.Ppieces[i].setBackground(Color.YELLOW);;
				this.Ppieces[i].setOpaque(true);
			}
         }
         if(i>=50)
         {
        	 bef[i]=new JButton();
        	 bef[i].setIcon(Ppieces[i].getIcon());
        	 bef[i].setName(Ppieces[i].getName());
			   ImageIcon S=new ImageIcon(this.getClass().getResource("/RedPieces/redHidden.png"));
			  Ppieces[i].setIcon(null);
			  Ppieces[i]=new JButton(S);
         }
		Ppieces[i].setBorder(BorderFactory.createLineBorder(Color.black));
         //this.Ppieces[i].addMouseListener(cl);
            panel.add(this.Ppieces[i]);
        add(panel);
        }
    	drake.setForeground(Color.white);
    	drake.setFont(new Font("", Font.PLAIN, 20));
    	mage.setForeground(Color.white);
    	mage.setFont(new Font("", Font.PLAIN, 20));
        Knight.setForeground(Color.white);
    	Knight.setFont(new Font("", Font.PLAIN, 20));
    	beastRider.setForeground(Color.white);
    	beastRider.setFont(new Font("", Font.PLAIN, 20));
    	Sorceress.setForeground(Color.white);
    	Sorceress.setFont(new Font("", Font.PLAIN, 20));
    	Yeti.setForeground(Color.white);
    	Yeti.setFont(new Font("", Font.PLAIN, 20));
        Elf.setForeground(Color.white);
    	Elf.setFont(new Font("", Font.PLAIN, 20));
    	Dwarf.setForeground(Color.white);
    	Dwarf.setFont(new Font("", Font.PLAIN, 20));
    	Scout.setForeground(Color.white);
        Scout.setFont(new Font("", Font.PLAIN, 20));
         Slayer.setForeground(Color.white);
        Slayer.setFont(new Font("", Font.PLAIN, 20));	
        Menu1.setFont(new Font("", Font.PLAIN, 29));
        Menu2.setFont(new Font("", Font.PLAIN, 40));
        Menu3.setFont(new Font("", Font.PLAIN, 40));
        turn.setText("Player's 1 turn");
        turn.setBackground(Color.DARK_GRAY);
        turn.setForeground(Color.white);
        turn.setFont(new Font("", Font.PLAIN, 20));
        percentage.setText("Ποσοστο επιθεση : 0%");
        percentage.setBackground(Color.DARK_GRAY);
        percentage.setForeground(Color.white);
        percentage.setFont(new Font("", Font.PLAIN, 20));
        rescue.setText("Διασώσεις : 0");
        rescue.setBackground(Color.DARK_GRAY);
        rescue.setForeground(Color.white);
        rescue.setFont(new Font("", Font.PLAIN, 20));
        round.setText("Γυρος : 0");
        round.setBackground(Color.DARK_GRAY);
        round.setForeground(Color.white);
        round.setFont(new Font("", Font.PLAIN, 20));
        panel1 = new JPanel(); 
        panel1.setLayout(new GridLayout(3 ,0));
        panel1.setBackground(Color.GRAY);
        panel2 = new JPanel(); 
        panel2.setLayout(new GridLayout(4 , 0));
        panel1.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel2.setBackground(Color.GRAY);
        checkbox.setBackground(Color.DARK_GRAY);
        checkbox.setForeground(Color.white);
        checkbox.setFont(new Font("", Font.PLAIN, 20));
        panel2.add(Menu1);
        panel2.add(checkbox);
        checkbox1.setBackground(Color.DARK_GRAY);
        checkbox1.setForeground(Color.white);
        checkbox1.setFont(new Font("", Font.PLAIN, 20));
        panel2.add(checkbox1);
        panel1.add(panel2);
        panel2.add(Menu2);
         panel3 = new JPanel(); // sub-panel 2
        panel3.setLayout(new GridLayout(2 ,0, 5, 5));
        panel3.setBackground(Color.GRAY);
        panel1.add(panel3);
        panel33 = new JPanel(new GridLayout(2 ,2, 5, 5)); // sub-panel 2
        panel33.setBackground(Color.DARK_GRAY);
        panel33.add(turn, SwingConstants.CENTER);
        panel33.add(percentage);
        panel33.add(rescue);
        panel33.add(round);
        panel3.add(panel33);
        panel4 = new JPanel(new GridLayout(4,0)); // sub-panel 2
        panel3.add(Menu3);
        panel4.setBackground(Color.GRAY);
        panel1.add(panel4);
        panel44 = new JPanel(new GridLayout(0 ,8));
        panel44.setBackground(Color.DARK_GRAY);
        panel44.add(drake1);
        panel44.add(drake);
        panel44.add(mage1);
        panel44.add(mage);
        panel44.add(Knight1);
        panel44.add(Knight);
        panel4.add(panel44);
        panel444 = new JPanel(new GridLayout(0 ,8));
        panel444.setBackground(Color.DARK_GRAY);
        panel444.add(beastRider1);
        panel444.add(beastRider);
        panel444.add(Sorceress1); 
        panel444.add(Sorceress);
        panel444.add(Yeti1);
        panel444.add(Yeti);
        panel444.add(Elf1);
        panel444.add(Elf);
        panel4.add(panel444);
        panels = new JPanel(new GridLayout(0 ,8));
        panels.setBackground(Color.DARK_GRAY);
        panels.add(Dwarf1);
        panels.add(Dwarf);
        panels.add(Scout1); 
        panels.add(Scout); 
        panels.add(Slayer1);
        panels.add(Slayer);
        panel4.add(panels);
        panel4444 = new JPanel();
        panel4444.setBackground(Color.DARK_GRAY);
        panel4444.add(captures,SwingConstants.CENTER);
        captures.setFont(new Font("", Font.PLAIN, 20));
        captures.setForeground(Color.white);
        panel4.add(panel4444);
        iconSelected = false;
        JSplitPane sp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panel,panel1);
        this.getContentPane().add(sp);
        sp.setResizeWeight(0.7);
        this.setVisible(true);
         }
/**
 * Not used
 * @return not used
 */
    private ImageIcon getImageBack() { // image for background
        try {
            return new ImageIcon(ImageIO.read(getClass().getResource("./images/RedPieces/dragonR.png"))); // image
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
/**
 * Not used
 * @return not used
 */
    private ImageIcon getImageCard() { // image for card
        try {
            // System.out.println(getClass().getResource("./images/bluePieces/beastRiderB.png"));
            return new ImageIcon(ImageIO.read(getClass().getResource("./images/bluePieces/beastRiderB.png"))
                    .getScaledInstance(100, 80, Image.SCALE_SMOOTH)); // image
        } catch (IOException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    /**
     * Not used
     * @param error not used
     */
   public void error(String error) 
   {
    	
   } 
   /**
    * Not used
    */
    public static String cardname = "My Card";
}
