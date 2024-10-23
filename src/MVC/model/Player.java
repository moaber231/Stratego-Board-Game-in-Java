package MVC.model;
import java.util.ArrayList;

import MVC.model.player.GroupPiece;
/**
 * This class represents the player of the game  startego
 * @author Konstantinos Gkogkos
 *
 */
public class Player {
	/**
	 * The name of the player
	 */
 final  private String Name;
 /**
 *The name of the GroupPiece that the player is 
 */
 final private GroupPiece Tname;
 /**
  * If its turn to play and if he has lost or not
  */
 private boolean plays,lost;
 /**Constructor
  * <b>Postcodition:</b> Name ,GroupPiece(red or blue),if it plays or not ,if he has lost or not are set 
  * @param in_name The name of the player
  * @param in_Tname The GroupPiece of the player
  * @param in_plays If it its  its turn or not
  * @param lost If he is able to continue playing or not
  */
 public Player(String in_name,GroupPiece in_Tname,boolean in_plays,boolean lost)
 {
	 this.Name=in_name;
	 this.lost=false;
	 this.Tname=in_Tname;
	 this.plays=true;
 }
 /**
  * <b>Transformer:</b>Set the name of the player
  * <b>Precodition:</b>It should not be blank
  * <b>Postcodition:</b>The name is set
  * @param name the name of the player
  */
 public void SetName(String name)
 {
	 
 }
 /**
  * <b>Accessor:</b>Get the name of the player
  * <b>Postcodition:</b>The name of the player is returned
  * @return the name of the player
  */
 public String GetName()
 {
	 return this.Name;
 }
 /**
  * <b>Transformer</b>Set the name of the team that the players has
  * <b>Precodition</b>The team should be named blue or red,and if already the other player has blue or red his team named it should have the opposite
  * <b>Postcodition:</b>The team name of the player is set
  * @param name the name of its team
  */
 public void SetTeamName(GroupPiece name)
 {}
 /**
  * <b>Accessor</b>Get the name of the team's playres
  * <b>Postocodition</b>The name of the team's player is returned
  * @return the name of the player's team
  */
 public GroupPiece GetTName()
 {
	 return this.Tname;
}
 /**
  * <b>Transformer:</b>It moves the player's piece 
  * <b>Precodition:</b>The function IsValidMove() should return true to do the move
  * <b>Postcodition:</b>The move is done
  * @param p piece
  * @param newpos new position
  */
 public void MovePiece(Piece p,int newpos)
 {
	 if(IsValidMove( newpos, p)==true)
	 {
		 p.position=p.position+newpos;
	 }
 }
 /**
  * <b>Observer:</b>It checks if the move that the user wants to do is valid or not, or the piece is immovable
  * <b>Postcodition:</b>The move's valdity is returned
  * @param newpos new position
  * @param p piece
  * @return if the move is valid or not
  */
 public boolean IsValidMove(int newpos,Piece p)
 {
	 if(p.position+newpos<0 || p.position+newpos>79)
	 {
		 return false; 
	 }
	 if(p.position+newpos==32 || p.position+newpos==33 || p.position+newpos==42 || p.position+newpos==43 || p.position+newpos==36 || p.position+newpos==37  || p.position+newpos==46 || p.position+newpos==47)
	 {
		 return false; 
	 }
	 if(newpos!=-10 || newpos!=10 ||newpos!=1 || newpos!=-1)
	 {
		 return false; 
	 }
	 return true;
 }
 /**
  * <b>Transformer:</b>It sets the turn of this player
  * <b>Precodition:</b>The other player's turn should have ended 
  * <b>Postcodition:</b>The players turn is set
  * @param playss the turn of the player
  */
 public void SetPlay(boolean playss)
 {
	 this.plays=playss;
 }
 /**
  * <b>Accessor</b>It returns if its player turn or not
  * <b>Postcodition</b>Players turn is returned
  * @return players turn
  */
 public boolean GetPlays()
 {
	 return this.plays;
 }
 /**
  * <b>Transformer</b>Set the loss of this player
  * <b>Precodition:</b>Its flag should be killed or he cant move any piece of his
  * <b>Postcodition:</b>The loss of this player is set
  * @param lostt the loss of this player
  */
 public void SetLost(boolean lostt)
 {
	 
 }
 /**
  * <b>Accessor:</b>Get if the player has lost or not
  * <b>Postcodition:</b>If he has lost or not its returned
  * @return the loss of this player
  */
 public boolean GetLost()
 {
	 return this.lost;
 }
 /**
  * <b>Accessor:</b>Get the pieces of this player
  * <b>Postcodition:</b>The player's pieces are returned
  * @return the player's pieces
  */
 public ArrayList<Piece> getPieces() {
     return this.Tname.getPiece();
 }

 /**
  * <b>Transformer:</b>Add pieces in this player
  * <b>Precodition:</b>The piece's should be valid
  * <b>Postcodition:</b>The new piece of this player is set
  * @param p the piece that is going to be added
  */
 public void addPieces(Piece p) {
 }

}
