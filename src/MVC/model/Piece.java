package MVC.model;

import java.util.ArrayList;
/**
 * This  abstract class is for pieces of stratego 
 * @author Konstantinos Gkogkos
 *
 */
public abstract class Piece
{
 /**
  * The Name of the piece,can not change after the name inputed
  */
 final protected String Name;
 /**
  * The rank of the piece, can not change after the name inputed
  */
 public int Rank;
 /**
  * If the piece is alive or not
  */
 protected boolean alive;
 /**
  * The position of the piece into the board
  */
 public int position;
 /**
  * The image of the piece,
  */
 final protected String Image;
 /**Constructor 
  * <b>Postcodition</b> Creates a piece by giving it a name ,a rank, a position, an image(url)
  * @param in_name name of the piece
  * @param in_rank the rank of the piece
  * @param in_position position of the piece 
  * @param in_image the image of the piece
  */
 protected Piece(String in_name,int in_rank,int in_position,String in_image )
  {
   this.Name=in_name;
   this.Image=in_image;
   this.alive=true;
   this.position=in_position;
   this.Rank=-in_rank;
  }
 /**Accessor
  * <b> Transformer:</b> set the piece name
  * <b> Postcodition:</b> piece name is set
  * @param in_name cands name
  */
  public abstract void SetName(String in_name);
  /**
   * <b>Accessor :</b> returns the piece's name
   * <b>Postcoidition:</b> the piece name is returned
   * @return the piece name
   */
  public abstract String GetName();
  /**
   * <b> Transformer:</b> set the piece's rank
   * <b> Postcodition:</b> piece's rank is set
   * @param in_rank the rank of the piece
   */
  public abstract void SetRank(int in_rank);
  /**
   * <b>Accessor :</b> returns the piece's rank
   * <b>Postcoidition:</b> the piece rank is returned
   * @return the piece rank
   */
  public abstract int GetRank();
  /**
   * <b> Transformer:</b> set the piece's alive
   * <b> Postcodition:</b> piece's alive is set
   * @param flag the boolean that set if its alive or not 
   */
  public abstract void SetAlive(boolean flag);
  /**
   * <b>Accessor :</b> returns the piece if its alive or not
   * <b>Postcoidition:</b> the piece if its alive or not is returned
   * @return if its alive or not
   */
  public abstract boolean IsAlive();
  /**
   * <b>Transformer :</b> set the piece's position
   * <b>Postcoidition:</b> the piece position is set
   * @param in_position the position of this piece
   */
  public abstract void SetPosition(String in_position);
  /**
   * <b>Accessor :</b> returns the piece position
   * <b>Postcoidition:</b> the piece position is returned
   * @return the position 
   */
  public abstract int GetPosition();
  /**  
   * <b>Transformer :</b> set the piece's image
   * <b>Postcoidition:</b> the piece image is set
   * @param in_image the image of this piece
   */
   public abstract void SetImage(String in_image);
   /**
    * <b>Accessor :</b> returns the piece's image
    * <b>Postcoidition:</b> the piece image  is returned
    * @return the piece's image
    */
  public abstract String GetImage();
  /**
   * <b> Observer:</b> checks if the piece is able to kill other piece
   * <b> Postcodition:</b> if the piece can be kiled is returned
   * @param p the piece that the current piece faces off
   * @return if the piece is killed or not!
   */
  public abstract boolean CanKill(Piece p);
  /**
   * <b>Transformer:</b> Destroys the piece;
   * @param p the piece is going to be killed or kill the current piece
   */
  public abstract void Kill(Piece p);
}
