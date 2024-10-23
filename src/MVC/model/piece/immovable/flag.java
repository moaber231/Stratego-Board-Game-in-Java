package MVC.model.piece.immovable;
import MVC.model.Piece;
/**
 * This class is made for the flag piece and it extends the abstract class piece
 * @author Konstantinos Gkogkos
 *
 */
public class flag extends Piece
{
	/**Constructor
	 * <b>Postcodition:</b>The name flag is set,its position,if its alive or not and its image
	 * @param in_position the position of the flag
	 * @param in_Image the image of the flag
	 * @param name name
	 */
 public flag(String name,int in_position,String in_Image)
 {
	 super(name,0,in_position,in_Image);
 }
 /**
  * <b>Observer:</b>Ends the if the flag is killed 
  * <b>Postcodition:</b> returns if the flag is killed and ends the game
  * @return if the game ends or not
  */
 public boolean ENDGAME()
 {
	 if(this.IsAlive()==false)
	 {
		 return true;
	 }
	 return false;
 }
@Override
public boolean CanKill(Piece p) {
	return false;
	
}
@Override
public void Kill(Piece p) {
	// TODO Auto-generated method stub
	
}
@Override
public void SetName(String in_name) {
	// TODO Auto-generated method stub
	
}

@Override
public String GetName() {
	// TODO Auto-generated method stub
	return this.Name;
}

@Override
public void SetRank(int in_rank) {
	// TODO Auto-generated method stub
	
}

@Override
public int GetRank() {
	// TODO Auto-generated method stub
	return this.Rank;
}

@Override
public void SetAlive(boolean flag) {
	// TODO Auto-generated method stub
	
}

@Override
public boolean IsAlive() {
	// TODO Auto-generated method stub
	return this.alive;
}

@Override
public void SetPosition(String in_position) {
	// TODO Auto-generated method stub
	
}

@Override
public int GetPosition() {
	// TODO Auto-generated method stub
	return this.position;
}

@Override
public void SetImage(String in_image) {
	// TODO Auto-generated method stub
	
}

@Override
public String GetImage() {
	// TODO Auto-generated method stub
	return this.Image;
}


}
