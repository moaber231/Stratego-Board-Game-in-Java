package MVC.View;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import MVC.model.*;
//import MVC.Controller.*;
/**
 * This class is made fot the menu of tha game and it extends Jframe
 * @author Konstantinos Gkogkos
 *
 */
public class Menu extends JFrame
{
	/**
	 * The rescues happened
	 */
	int rescues; 
	/**
	 * The bumber of the round
	 */
	int  round;
	/**
	 * Attack percentage based on each player
	 */
	int attackpercantage;
	/**
	 * And total captures happened
	 */
	int captures;
	/**
	 * Enabled for mode 1
	 */
	boolean mode1;
	/**
	 * Enabled for mode 2
	 */
	boolean mode2;
	/**
	 * The title of the menu
	 */
    String title;
    /**
     * The name of the first mode
     */
    String Mode1;
    /**
     * The name for the second mode
     */
    String Mode2;
    /**
     * Constructor
     */
   public  Menu()
    {
    	JFrame win = new JFrame("My First GUI Program");
    	win.setSize(250, 150);
    	win.setVisible(true);

    	
    }
    /**
     * <b>Transformer:</b>It activate the mode 1 in the game
     * <b>Precodition:</b>It should not be already activated
     * <b>Postcodition:</b>The mode 1 is activated
     */
    public void enablemode1() {}
    /**
     * <b>Transformer:</b>It activate the mode 2 in the game
     * <b>Precodition:</b>It should not be already activated
     * <b>Postcodition:</b>The mode 2 is activated
     */
    public void enablemode2() {}
    /**
     * <b>Transformer:</b>It updates certaint things such as:The turn of a player ,its attacking percentage,how many rescues he has and the total capture in tis round
     * <b>Precodition:</b>The statistics should be valid according to the controller happenings,ex round cant be deacreased ,or increased more than 1 etc
     * <b>Postcodition:</b>The statisticks are updated
     */
    public void update_statisticks() {}
    
    }
