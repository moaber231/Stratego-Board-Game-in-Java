package MVC.model.piece.moveable;
import MVC.model.Piece;
import MVC.model.piece.immovable.Bomb;
/**
 * this class is made for the lavabeast and it extends piece
 * @author Konstantinos Gkogkos
 *
 */
 public class LavaBeast extends Piece {

	 /**Constructor
	  * <b>Postcodition:</b> set the name LavaBeast ,the rank 5 ,its position and its image
	  * @param in_name LavaBeast
	  * @param in_rank 5
	  * @param in_position its position
	  * @param in_image the lavabeast's image
	  */
	public LavaBeast(String in_name, int in_rank, int in_position, String in_image) {
		super(in_name, 5, in_position, in_image);
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
			if(p.GetRank()>this.GetRank() || p instanceof Bomb)
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
