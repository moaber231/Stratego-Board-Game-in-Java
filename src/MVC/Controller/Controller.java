package MVC.Controller;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import MVC.Controller.Controller.CardListener;
import MVC.View.Menu;
import MVC.View.View;
import MVC.model.*;
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
import MVC.model.player.*;

import javax.swing.*;

/**
 * This class represents the controller of the game
 * @author Konstantinos Gkogkos
 *  * *
 *  
 */
public class Controller {
	/**
	 * <b>Constructor:</b>The constructor of the class controller making 2 players with 2 groupteams 
	 *<b> Postcodition:</b>The players and groupteams are set
	 * @param p1 player1
	 * @param p2 player 2
	 * @param blue team blue
	 * @param red team red
	 */
   public Controller (Player p1,Player p2, GroupPiece blue,GroupPiece red) 
   {
	this.p1 = p1;
	this.p2 = p2;
	this.red = red;
	this.blue = blue;
   }
   /**
    * init_players:Is not used!
    */
   public void init_players () 
   {
	   for(int i=0; i<60; i++)
	   {
		   if(i<30)
		   {
			   //this.blue.addMember(this.b1.gPieces.get(i));
		   }
		   else
			{
			  // this.red.addMember(this.b1.gPieces.get(i));
		    }
	   } 
   }
   /**
    * player 1
    */
   final private Player p1;
   /**
    * player 2
    */
  final  private Player p2;
  /**
   * groupteam red
   */
  final  private GroupPiece red;
  /**
   * groupteam blue
   */
  final  private GroupPiece blue;
   /**
    * rounds
    */
   private int round;
   /**
    * the board
    */
   Board b1;
   /**
    * The menu
    */
   private Menu m;
   /**
    * The view of board
    */
  View v1;
  /**
   * <b>Transformer:</b> It is used for the mode lower_army and it divides the pieces of each player by 2,by using some methods called from view.java
   * <b> Postcodition:</b> Lower army is set
   */
  public void lower_army()
  {
	  v1.lower_army();
	  for(int i=0; i<80; i++)
	  {
			  if(i<30 || i>50)
			  {
				  if(v1.arrayP[i]==null)
				  {
					  b1.pos[i]="blank";   
				  } 
			  }
		  
	  }
  }
  /**
   * <b>Transformer:</b>It is used for starting the game set the player 1 to play and set round to 0 start the gui and menu etc
   * <b>Precodition:</b>The game should not already started
   * <b>Postcodition:</b>The game has started
  * @throws IOException .
   */
   public void Start () throws IOException
      {
	   this.v1=new View();
	   this.b1=new Board();
	   this.b1.init_board();
	   this.p1.SetPlay(true);
	   this.p2.SetPlay(false);
	   Controller.CardListener c1=this.new CardListener();
	   int ke=0;
       for(int i=0; i<80; i++)
       {
    	   if(i<=30)
    	   {
    		   this.blue.addMember(v1.arrayP[i]); 
    		 // this.blue.PIECE.get(i).position=v1.arrayP[i].position;
    	   }
    	   if(i>=50)
    	   {
    	    this.red.addMember(v1.arrayP[i]);  
    	  this.red.PIECE.get(i-50).position=v1.arrayP[i].position;
    	  }
        if(i>29 && i<50)
        {
			if(i==32 || i==33 || i==42 ||i==43 || i==36|| i==37 || i==46 ||i==47)
			{
				v1.Ppieces[i].setBackground(Color.YELLOW);;
				v1.Ppieces[i].setOpaque(true);
			}
        }
			//Ppieces[i].setBorder(BorderFactory.createLineBorder(Color.black));
        v1.Ppieces[i].addMouseListener(c1);
       }
      }
/**
 * <b>Transformer:</b> game_finish is used when the player killls other player flag so the name of the winner pops up in the screen and the programm terminates
 * <b>Precodition:</b>The other player's flag should b dead
 * <b>Postcodition:</b>Player won and game ended
 * @param p the player who won
 * @return false
 */
   
  public boolean game_finish(Player p) {
	 JOptionPane.showMessageDialog(null, "Player:"+p.GetName()+"won the game.\n !!!!!!!!!!!!!!CONGRATULATIONS!!!!!!!!!!!!!"); 
     return false;
  }
   
  /**
   * <b>Transformer:</b>It is used for the rescue activity by calling  the Rescue method from view.java
   * <b>Precodition:</b>Dead pawns and valid position should be set
   * <b>Postcodition:</b>The pawn is rescued
   * @param pos the position of the pawn that is going to rescue
   */
   public void rescue (int pos)
    {
	   int position=v1.Rescue(pos,b1.pos);
	   if(position>=0 && position<30)
	   {
		   b1.pos[position]="blue"   ;
	   }
	   else
	   {
		   b1.pos[position]="red";
	   }
   }
   /**
    * This method used for the sensning of the mouse motion,pressed etc
    */
   public void setlisteners ()
   {
   }
  /**
  * This class is used to implement the setListeners method and it contains if the mouse is clicked,pressed released etc,the whole project is based here so every variablea nd method called here will be explained im the report given!
  * @author Konstantinos Gkogkos
  *  
  */
   public  class CardListener implements MouseListener {
	   /**
	    * The icon selected last
	    */
      boolean iconSelected=false;
      /**
       * if a piece is a scout
       */
      boolean IsScout=false;
      /**
       * The JButton for the selectedbutton
       */
       JButton selectedButton;
       /**
        * checks how many blue team have rescued
        */
       int counter_blue=0;
       /**
        * How many time red team have rescued
        */
       int  counter_red=0;
       /**
        * The name of the piece that is goin to rescue for blue team
        */
       String res;
       /**
        * The name of the red piece that is going to rescue
        */
       String res1;
       /**
        * Used for menu purposes
        */
       int rescue1=0;
       
       /**
        * Used for menu purposes
        */
       int rescue2=0;
       /**
        * Used for game mode 2
        */
       boolean no_retreat=false;
       /**
        * Used for menuy purposes
        */
       int TC=0;
       /**
        * Used for attack percentage for the menu for player1
        */
       int attack3=0;
       /**
        * Used for aatack percentage player1
        */
    	int attack33=0;
    	/**
    	 * Used for attack percentage player 2
    	 */
    	int attack4=0;
    	/**
    	 * Used for attack percentage player2
    	 */
    	int attack44=0;
    	/**
    	 * Menu purposes
    	 */
       int attack1=0;
       /**
        * Menu purposes
        */
       int attack11=0;
       /**
        * Menu purposes
        */
       int attack2=0;
       /**
        * Menu purposes
        */
       int attack22=0;
       /**
        * Menu purposes
        */
       int start=0;
       /**
        * Menu purposes
        */
       int rank_power;
       /**
        * Mneu purposes
        */
       int r_p;
       public void mouseClicked(MouseEvent e) {
    	   if(start==0)
        	  {
    		   if(v1.checkbox.isSelected()==true)
        	   {
        			lower_army();
        	   }
        	   if(v1.checkbox1.isSelected()==true)
        	   {
        			no_retreat=true;
        	   }
        	  }
    	   start++;
           JButton but = ((JButton) e.getSource());
           String name=but.getName();
           boolean flag=false,ownp=false;
           boolean n_r=false;
           int i=0;
    	   int b=0;
    	   int j=0,sel=0;
    	   while(i<80)
    	   {
    	      if(but==v1.Ppieces[i])
    		   {
    			   break;
    		   }
    		   i++;
    	   }
    	  b=i;
    	  j=0;
       	  while(j<80)
      	       {
      	      if(selectedButton==v1.Ppieces[j])
      		   {
      	    	if((v1.arrayP[j] instanceof Scout)==true)
      	    	{
      	    		IsScout=true;
      	    	}
      			   break;
      		   }
      	  	   j++;
      	      }
      	      sel=j;
      	     
      	    if(no_retreat==true && j!=80)
        	  {
        		  if(b1.pos[sel]=="blue" && (b-sel)==-10)
        		  {
        			n_r=true;
        		  }
        		  if(b1.pos[sel]=="red" && (b-sel)==10)
        		  {
        			 
        			  n_r=true;
        		  }
        	  }
      	    if(j!=80)
      	    {
      	    	if(b1.pos[j].equals(b1.pos[i]))
      	    	{
      	    		ownp=true;
      	    	}
      	    }
           if (iconSelected && !but.equals(selectedButton) && (v1.arrayP[j] instanceof flag==false) &&(v1.arrayP[j] instanceof Bomb==false) && but.getName()!="forbidden" && v1.Ppieces[j].getName()!="redHidden" && v1.Ppieces[j].getName()!="blueHidden" && b1.pos[j]!="blank" &&((b-sel)==1 || (b-sel)==-1||(b-sel)==-10 ||(b-sel)==10) && n_r==false  && !b1.pos[j].equals(b1.pos[i])) { // move(swap) buttons
          	  boolean flag1=false;
          	  String str;
          	  if(j>=70 && j<80 && (v1.arrayP[j] instanceof Scout)==false && counter_blue<2 && !v1.arrayP[j].GetName().equals(res))
          	  {
          		  if(b1.pos[j]=="blue")
          		  {
          			  counter_blue++;
          			  rescue1++;
          			  rescue(j);
          			  res=v1.arrayP[j].GetName();
          		  }
          	  }
          	  if(j>=0 && j<10 && (v1.arrayP[j] instanceof Scout)==false && counter_red<2 && !v1.arrayP[j].GetName().equals(res1))
          	  {
          		 if(b1.pos[j]=="red")
         		  {
          			 counter_red++;
          			 rescue2++;
         			  rescue(j);
         			 res1=v1.arrayP[j].GetName();
         		  }
          	  }
                if(((b-sel)==1 || (b-sel)==-1||(b-sel)==-10 ||(b-sel)==10 ) && flag1==false)
        	   {
        		   int temp1;
        		   if( v1.arrayP[j]!=null)
        		   {
        			   v1.arrayP[j].position=i;   
        		   }
              if(v1.arrayP[i]==null)
               {
            	   if(v1.arrayP[j] instanceof Drake)
            	   {
            		   v1.arrayP[i]=new Drake(v1.arrayP[j].GetName(),10,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Mage)
            	   {
            		   v1.arrayP[i]=new Mage(v1.arrayP[j].GetName(),9,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Knight)
            	   {
            		   v1.arrayP[i]=new Knight(v1.arrayP[j].GetName(),8,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof BeastRider)
            	   {
            		   v1.arrayP[i]=new BeastRider(v1.arrayP[j].GetName(),7,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Sorceress)
            	   {
            		   v1.arrayP[i]=new Sorceress(v1.arrayP[j].GetName(),6,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Yeti)
            	   {
            		      v1.arrayP[i]=new Yeti(v1.arrayP[j].GetName(),5,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof LavaBeast)
            	   {
            		   v1.arrayP[i]=new LavaBeast(v1.arrayP[j].GetName(),5,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Elf)
            	   {
            		   v1.arrayP[i]=new Elf(v1.arrayP[j].GetName(),4,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Dwarf)
            	   {
            		   v1.arrayP[i]=new Dwarf(v1.arrayP[j].GetName(),v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Scout)
            	   {
            		   v1.arrayP[i]=new Scout(v1.arrayP[j].GetName(),2,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Slayer)
            	   {
            		   v1.arrayP[i]=new Slayer(v1.arrayP[j].GetName(),1,v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof Bomb)
            	   {
            		   
            		   v1.arrayP[i]=new Bomb(v1.arrayP[j].GetName(),v1.arrayP[j].position,"");
            	   }
            	   if(v1.arrayP[j] instanceof flag)
            	   {
            		   v1.arrayP[i]=new flag(v1.arrayP[j].GetName(),v1.arrayP[j].position,"");
            	   }
            		   v1.arrayP[j]=null;
            	   
               }
              else if(v1.arrayP[b]!=null)
        		  {
            	  if( v1.arrayP[i].Rank<0)
            	  {
            		  v1.arrayP[i].Rank*=-1;
            	  }
            	  if( v1.arrayP[j].Rank<0)
            	  {
            		  v1.arrayP[j].Rank*=-1;
            	  }
        			  flag=v1.arrayP[sel].CanKill(v1.arrayP[i]); 
        			  if(p1.GetPlays()==true)
        			  {
        				  attack3++;
        			  }
        			  else
        			  {
        				  attack4++;
        			  }
        			  if(v1.arrayP[sel].Rank==v1.arrayP[i].Rank)
        			  {
        				  flag=true;
        			  }
        			 if(flag==true)
        			 {
        				 rank_power=v1.arrayP[i].Rank;
        				 r_p=0;
        				 if(p1.GetPlays()==true && v1.arrayP[i] instanceof flag)
        				 {
        					 game_finish(p1); 
        					 System.exit(0);
        				 }
        				 if(p2.GetPlays()==true && v1.arrayP[i] instanceof flag)
        				 {
        					 game_finish(p2);
        					 System.exit(0);
        				 }
        				 if(p1.GetPlays()==true)
        				 {
        					 attack1++;
        				 }
        				 else
        				 {
        					 attack2++;
        				 }
        				 JOptionPane.showMessageDialog(null, "you got it");
        				 but.setIcon(selectedButton.getIcon());
                         but.setName(selectedButton.getName());
                         selectedButton.setIcon(null);
                         selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                         selectedButton.setName(name);
                         selectedButton = but;
        				 v1.arrayP[b]=v1.arrayP[sel];
        				 v1.arrayP[sel]=null;
        				 b1.pos[i]= b1.pos[sel];
               		     b1.pos[sel]="blank";  
        			  }
        			 else
        			 {
        				 rank_power=v1.arrayP[j].Rank;
        				 r_p=1;
        				 b1.pos[sel]="blank";
        				 v1.arrayP[sel]=null;
        				 JOptionPane.showMessageDialog(null, "he killed u");
        				 selectedButton.setIcon(null);
                         selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
        			 }
        		  }
        	    
        	    if(b1.pos[sel]!="blank")
         	   {
        	     if(b1.pos[b]=="blank")
        	     {
        	    	  str= b1.pos[sel];
            		   b1.pos[sel]="blank";
            		   b1.pos[i]=str;
            		  but.setIcon(selectedButton.getIcon());
                     but.setName(selectedButton.getName());
                     selectedButton.setIcon(null);
                     selectedButton.setBorder(BorderFactory.createLineBorder(Color.black));
                     selectedButton.setName(name);
                     selectedButton = but; 
        	     }
        	   }
               iconSelected = false;
        	   }
        	   int rcheck=0;
       	    
        	   if(p1.GetPlays()==true && p2.GetPlays()==false)
        	   {
        		   p1.SetPlay(false);
        		   p2.SetPlay(true);
        		   v1.TurnChange(p1.GetPlays(), b1.pos, p2.GetPlays(),round,attack22,attack44,rank_power,r_p,rescue2);
        		   round++;
        	   }
        	   else if(p2.GetPlays()==true && p1.GetPlays()==false)
        	   { 
        		   p2.SetPlay(false);
        		   p1.SetPlay(true);
            	   v1.TurnChange(p1.GetPlays(), b1.pos, p2.GetPlays(),round,attack11,attack33,rank_power,r_p,rescue1);
        		   
        	   }   
        	   attack11=attack1;
        	   attack33=attack3;
        	   attack22=attack2;
        	   attack44=attack4;
        		 
        	   }
           else if (!iconSelected || but.getName() != null) { // if not selected icon is joker then select
        	   if((v1.arrayP[b] instanceof Bomb==false) && but.getName()!="forbidden" && v1.Ppieces[b].getName()!="redHidden" && v1.Ppieces[b].getName()!="blueHidden" && (v1.arrayP[b] instanceof flag==false) && b1.pos[b]!="blank" && n_r==false &&ownp==false)
        	   {
        		   iconSelected = true; // we can do without it, we can check for null selected button
                   selectedButton = but;
                   selectedButton.setName(name);
                   but.setBorder(BorderFactory.createLineBorder(Color.YELLOW, 3));   
        	   }
        	   else
        	   {
        		   if(v1.Ppieces[b].getName()=="redHidden")
        		   {
        			   JOptionPane.showMessageDialog(null, "Its Player's 1 turn");   
        		   }
        		   else if(v1.Ppieces[b].getName()=="blueHidden")
        		   {
        			   JOptionPane.showMessageDialog(null, "Its Player's 2 turn");
        		   }
        		   else if((v1.arrayP[b] instanceof Bomb==true))
        		   {
        			   JOptionPane.showMessageDialog(null, "Cant move a bomb");   
        		   }
        		   else if(b1.pos[j].equals(b1.pos[i]))
        		   {
        			   JOptionPane.showMessageDialog(null, "Cant attack yourself");
        		   }
        		   else if(n_r==true)
        		   {
        			   JOptionPane.showMessageDialog(null, "ΚΑΜΙΑ ΥΠΟΧΩΡΗΣΗ");
        		   }
        		   else if(b1.pos[b]=="blank")
        		   {
        			   JOptionPane.showMessageDialog(null, "Cant move this");
        		   }
        		   else  if((v1.arrayP[b] instanceof flag==true))
        		   {
        			   JOptionPane.showMessageDialog(null, "Cant move a flag");   
        		   }
        		   else
        		   {
        			   JOptionPane.showMessageDialog(null, "Forbidden area");   
        		   }
        		   
        	   }
               if (iconSelected) {
            	   System.out.println(b1.pos[45]);
                   System.out.println("Already Selected");
               } else {
                   System.out.println("Not selected");
               }
           }
       }

       @Override
       public void mousePressed(MouseEvent e) {
       }

       @Override
       public void mouseReleased(MouseEvent e) {
       }

       @Override
       public void mouseEntered(MouseEvent e) {
       }

       @Override
       public void mouseExited(MouseEvent e) {
       }
   } 
   /**
    * Main where the programm will start worniking by creating 2 player with default names player1,2 and theri team red and blue accordinly!
    * 
    * @param args string args
    * @throws IOException exception
    */
   public static void main(String args[]) throws IOException
   {
	
	   GroupPiece Gp1=new GroupPiece("BLUE");
	   GroupPiece Gp2=new GroupPiece("RED");
	   Player p1=new Player("Player1",Gp1,false,false);
	   Player p2=new Player("Player2",Gp2,false,false);
	   Controller c=new Controller(p1,p2,Gp1,Gp2);
	   c.Start(); 
  }
}
 