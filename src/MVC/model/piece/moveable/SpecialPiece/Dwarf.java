package MVC.model.piece.moveable.SpecialPiece;
import MVC.model.Piece;
//import MVC.model.piece.moveable;
/**
 * this class is made for the Dwarf and it extends the abstract class piece
 * @author Konstantinos Gkogkos
 *
 */
public class Dwarf extends Piece {
   /**Constrcutor
    * <b>Postcodition:</b> set the name Dwarf ,the rank 3 ,its position and its image
    * @param in_position its position
    * @param in_image its image
    * @param Name name
    */
	public Dwarf(String Name,int in_position,String in_image) {
		super(Name, 3, in_position, in_image);
		// TODO Auto-generated constructor stub
	}

	/**
	 * CanKill is changed for the dwarf that means it can kill the bomb
	 */
	@Override
	public boolean CanKill(Piece p) {
		// TODO Auto-generated method stub
		if(p.GetRank()>this.GetRank())
		{
			return false;
		}
		return true;
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

	@Override
	public void Kill(Piece p) {
		// TODO Auto-generated method stub
		
	}

}
