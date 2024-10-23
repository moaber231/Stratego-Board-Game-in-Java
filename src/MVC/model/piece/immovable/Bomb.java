package MVC.model.piece.immovable;
import MVC.model.Piece;
/**
 * This class is used to represent the bomb in the game and it extends the abstract class piece
 * @author moaber231
 *
 */
public class Bomb extends Piece {
    /**Constructor
     * <b>Postcodition: </b> the name of the bomb ,the position of the bomb ,if its alive or not and the image of the bomb
     * @param in_position the position of the bomb
     * @param in_image the image of the bomb 
     * @param Name name
     */
	public Bomb(String Name,int in_position, String in_image) {
		super(Name, 0, in_position, in_image);
		// TODO Auto-generated constructor stub
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
	public boolean CanKill(Piece p) {
		// TODO Auto-generated method stub
		if(p.GetRank()==3)
		{
			return false;
		}
		return true;
	}

	@Override
	public void Kill(Piece p) {
		// TODO Auto-generated method stub
		
	}

}
