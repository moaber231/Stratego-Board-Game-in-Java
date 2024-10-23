package MVC.model;
import java.util.ArrayList;
import java.util.Random;

import MVC.model.piece.immovable.Bomb;
import MVC.model.piece.immovable.flag;
import MVC.model.piece.moveable.BeastRider;
import MVC.model.piece.moveable.Drake;
import MVC.model.piece.moveable.Elf;
import MVC.model.piece.moveable.Knight;
import MVC.model.piece.moveable.Mage;
import MVC.model.piece.moveable.Sorceress;
import MVC.model.piece.moveable.Yeti;
import MVC.model.piece.moveable.SpecialPiece.Dwarf;
import MVC.model.piece.moveable.SpecialPiece.Scout;
import MVC.model.piece.moveable.SpecialPiece.Slayer;
/**
 * This class represents the board of the stratego boardgame
 * @author Konstantinos Gkogkos
 *
 */
public class Board
{
	/**
	 * array of strings which can be blue red blank so controller knwos which place is occupied by who or not
	 */
	public String[] pos=new String[80];
	/**
	 * boolean array of which blocks are occupied or not
	 */
	boolean Pos[]=new boolean[60];
	/**
	 * The last piece played
	 */
	Piece last;
	/**
	 * The pieces on the board
	 */
	public ArrayList<Piece> gPieces=new ArrayList<Piece>();
	/**
	 * <b>Accessor:</b>It returns the pieces into the board
	 * <b> Postcoiditon:</b> the pieces of the board returned
	 * @return the piece of the board
	 */
    public ArrayList<Piece> getgamePiece() {
        return gPieces;
    }
    /**
     * <b>Transformer:</b>It is used fot the initialization fo the board ex set the position of the boards,the images of the pieces into the board  etc
     */
    public void init_board() 
    {
    	for(int i=0; i<80; i++)
    	{
    		if(i<30)
    		{
    			pos[i]="blue";
    		}
    		if(i>=30 && i<50)
    		{
    			if(i==32 || i==33 || i==42 ||i==43 || i==36|| i==37 || i==46 ||i==47)
    			{
    				pos[i]="forbidden";
    			}
    			else
    				
    			{
    				pos[i]="blank";
    			}
    			
    		}
    		if(i>=50)
    		{
    			pos[i]="red";
    		}
    	}
    	this.initPieces();
    	this.setGamePieces(gPieces);
    }
    /**
     * <b>Transformer:</b> Sets the pieces of this game board
     * <b>Postcodition:</b> the game pieces are set
     * @param gamePiece the pieces of the game
     */
    public void setGamePieces(ArrayList<Piece> gamePiece) 
    {
    	/*for(int i=0; i<60; i++)
    	{
    		Pos[i]=true;
    	}
    	gPieces.get(29).position=5;
    	Pos[5]=false;
    	gPieces.get(59).position=75;
    	Pos[59]=false;
    	int i=0;
    	while(i!=80)
    	{
    		if(i>29 && i<50)
    		{
    			i++;
    		}
    		else
    	    {
    		Random randomGenerator = new Random();
    	    int randomInt = randomGenerator.nextInt(59-0) + 0;
    	    while(Pos[randomInt]!=true)
    			{
    		     randomInt = randomGenerator.nextInt(59-0) + 0;
    			}
    			gPieces.get( randomInt).position=i;
				Pos[randomInt]=false;
				System.out.println(gPieces.get(randomInt).GetPosition());
				i++;
    		}
    	}*/
    }
    /**
     * <b>Transformer:</b>It is used fot the in	itialization of the pieces ex the images of the pieces into the board  etc
     * 
     */
    public void initPieces() 
    { /*gPieces.add(new Drake("dragonB",10,0,""));
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
    gPieces.add(new Scout("cout1",2,0,""));
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
    gPieces.add(new Yeti("lavaBeast",5,0,""));
    gPieces.add(new Yeti("lavaBeast",5,0,""));
    gPieces.add(new Elf("elfR",4,0,""));
    gPieces.add(new Elf("elf1R",4,0,""));
    gPieces.add(new Dwarf("dwarfR",00,""));
    gPieces.add(new Dwarf("dwarfR1",00,""));
    gPieces.add(new Dwarf("dwarfR2",00,""));
    gPieces.add(new Dwarf("dwarfR3",00,""));
    gPieces.add(new Dwarf("dwarfR4",00,""));
    gPieces.add(new Scout("scoutR",2,0,""));
    gPieces.add(new Scout("coutR1",2,0,""));
    gPieces.add(new Scout("scoutR2",2,0,""));
    gPieces.add(new Scout("scoutR3",2,0,""));
    gPieces.add(new Slayer("slayerR",2,0,""));
    gPieces.add(new Bomb("bombR",0,""));
    gPieces.add(new Bomb("bombR1",0,""));
    gPieces.add(new Bomb("bombR2",0,""));
    gPieces.add(new Bomb("bombR3",0,""));
    gPieces.add(new Bomb("bombR4",0,""));
    gPieces.add(new Bomb("bombR5",0,""));
    gPieces.add(new flag("flagR",0,""));*/
      }
    /**
     * <b> Accessor:</b>Retursn the last piece that  was moved in the game
     * <b> Postcoidition</b> The lastpiece is returned
     * @return the last piece that was moved in the game
     */
    public Piece getLastPiecePlayed() {
        return last;
    }
    /**
     * <b>Transformer:</b> Moves the player piece if the move its valid and return true or false
     * <b>Precodition:</b> The move should be valid
     * <b>Postcodition:</b> the move is set or is not set,this depends if its valid or not
     * @param player the player that want to move its piece
     * @param p the piece that is going to be moved
     * @param newpos new position!
     * @return if the move was valid or not
     */
    public boolean movePlayer(Player player, Piece p,int newpos){
    	if(player.IsValidMove(newpos, p)!=true)
    	{
    		return false;
    	}
    	player.MovePiece(p, newpos);
    	return true;
    }
    /**
     * <b>Accessor</b>Sets the last piece moved,played in the round
     * <b>Precodition</b>It should be set the last piece and no other
     * <b>Postcodition</b>The last piece is set
     * @param lastpiecePlayed the last piece
     */
    public void setLastPiecePlayed(Piece lastpiecePlayed) {
    }
}
