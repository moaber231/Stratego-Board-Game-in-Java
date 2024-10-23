package MVC.model.player;

import java.util.ArrayList;
import java.util.Scanner;

import MVC.model.Piece;
/**
 * This class represents the group of the piece of each player and its used in the player class
 * @author Konstantinos Gkogkos
 *
 */

public class GroupPiece 
{
	/**
	 * The name of the GrouPiece
	 */
      final private String name;	
      /**
       * The array list of pieces of this group
       */
	  public  ArrayList<Piece> PIECE = new ArrayList<Piece>();
	  /**
	   * <b>Constructor:</b>
	   * <b>Precodition:</b>The team name should be blue or red only and if the other team has 1 name already this team should have the opposite 1
	   * <b>Postcodition:</b>The team name given by the user is set
	   * @param s the name of team
	   */
	  public GroupPiece(String s)
	  {
		  while(s!="BLUE" && s!="RED")
		  {
			     System.out.println("String cant be blank!");
				 Scanner sc= new Scanner(System.in); 
				 System.out.print("Enter a name for the team: ");
				 s= sc.nextLine(); 
		  }
		  this.name=s;
	  }
	  /**
	   * <b>Accessor:</b>Get the name of the group
	   * <b>Postcodition:</b>The name of this group returned
	   * @return the name of the group
	   */
	  public String getGroupName()//getter for name
	  {
	 	 return this.name;
	  }
	  /**
	   * <b>Accessor:</b>Gets the size of the group,according how many piece it has
	   * <b>Postcodition:</b>The size is returned
	   * @return the size of the gorup
	   */
	  public int getSize() //getter for size of group
	  {
	 	 return this.PIECE.size();
	  }
	  /**
	   * <b>Accessor:</b>Get the number of alive pieces of this group
	   * <b>Postrcodition:</b>Alive members are returned
	   * @return the alive members
	   */
	  public int getNumberOfAliveMembers()//getter of the alive players
	  {
	 	 int counter=0;
	 	 for(int i=0; i<PIECE.size(); i++)
	 	 {
	 		 if(PIECE.get(i).IsAlive()==true)
	 		 {
	 			 counter++;
	 		 }
	 	 }
	 	 return counter;
	  }
	  /**
	   * <b>Observer:</b>Checks if the group is defeted by checking how many alive member it has
	   * <b>Precodition:</b>It should have more than 1 or 0 alive members
	   * <b>Postcodition:</b>If the group is defetead or not is returned
	   * @return if the group is defetead!
	   */
	  public  boolean isDefeated()//checking if the groups is defeatead by checking if all players are dead
	  {
	 	 if(this.getNumberOfAliveMembers()==0)
	 	 {
	 		 return true;
	 	 }
	 	 return false;
	  }
	  /**
	   * <b>Transformer:</b>Add a  new piece in the group
	   * <b>Precodition:</b>The piece should be valid,and the size should be less or euqal than the starting onbe
	   * <b>Postcodition:</b>The piece is added
	   * @param p the piece that is going to be added
	   */
	  public void addMember(Piece p)//add members to the group
	  {
	 	 if(p!=null)
	 	 {
	 		  this.PIECE.add(p);
	 	 }
	  }
	  /**
	   * <b>Accessor:</b>Get the pieces of the group
	   * <b>Postcodition:</b>The pieces are returned
	   * @return the pieces of the group
	   */
	  public ArrayList<Piece> getPiece() {
		     return this.PIECE;
		 }
}
