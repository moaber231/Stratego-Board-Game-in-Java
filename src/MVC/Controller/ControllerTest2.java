package MVC.Controller;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import MVC.model.Player;
import MVC.model.piece.immovable.Bomb;
import MVC.model.piece.moveable.Drake;
import MVC.model.piece.moveable.SpecialPiece.Dwarf;
import MVC.model.piece.moveable.SpecialPiece.Slayer;
import MVC.model.player.GroupPiece;

class ControllerTest2 {

	@Test
	void KillsInGeneral() {
	   Drake d=new Drake("drake",10,0,"");
	   Slayer s=new Slayer("slayer",1,0,"");
	   d.Rank*=-1;
	   s.Rank*=-1;
	   assertEquals(true,s.CanKill(d));
	}
	@Test
	void SlayerKillsDrake() {
	   Drake d=new Drake("drake",10,0,"");
	   Slayer s=new Slayer("slayer",1,0,"");
	   d.Rank*=-1;
	   s.Rank*=-1;
	   assertEquals(true,s.CanKill(d));
	}
	@Test
	void SlayerCantKillsDrakeOnDefense() {
	   Drake d=new Drake("drake",10,0,"");
	   Slayer s=new Slayer("slayer",1,0,"");
	   d.Rank*=-1;
	   s.Rank*=-1;
	   assertEquals(true,d.CanKill(s));
	}
	@Test
	void DwarfVsBomb() {
	   Bomb bomb=new Bomb("Bomb",0,"");
	   Dwarf dwarf=new Dwarf("Dwarf",0,"");
	   bomb.Rank*=-1;
	   dwarf.Rank*=-1;
	   assertEquals(true,dwarf.CanKill(bomb));
	}
	@Test
	void MapLayout() throws IOException {
		GroupPiece Gp1=new GroupPiece("BLUE");
		   GroupPiece Gp2=new GroupPiece("RED");
		   Player p1=new Player("Player1",Gp1,false,false);
		   Player p2=new Player("Player2",Gp2,false,false);
		   Controller c=new Controller(p1,p2,Gp1,Gp2);
		   c.Start();
		   for(int i=0; i<80; i++)
		   {
			   if(i>=0 && i<30)
			   {
				   assertEquals("blue",c.b1.pos[i]);
			   }
			   if(i>=30 && i<50)
			   {
				   if(i==32 || i==33 || i==42 ||i==43 || i==36|| i==37 || i==46 ||i==47)
				   {
					   assertEquals("forbidden",c.b1.pos[i]);
				   }
				   else
				   {
					   assertEquals("blank",c.b1.pos[i]);   
				   }
			   }
			   if(i>=50 && i<80)
			   {
				   assertEquals("red",c.b1.pos[i]);
			   }
		   }
		}
	@Test
	void InGamePiecePosition() throws IOException {
		GroupPiece Gp1=new GroupPiece("BLUE");
		   GroupPiece Gp2=new GroupPiece("RED");
		   Player p1=new Player("Player1",Gp1,false,false);
		   Player p2=new Player("Player2",Gp2,false,false);
		   Controller c=new Controller(p1,p2,Gp1,Gp2);
		   c.Start();
		   for(int i=0; i<80; i++)
		   {
			   if(i>=0 && i<30)
			   {
				   assertEquals(i,c.v1.arrayP[i].GetPosition());
			   }
			   if(i>=50 && i<80)
			   {
				   assertEquals(i,c.v1.arrayP[i].GetPosition());
			   }
		   }
		}
	@Test
	void JButtonAndpieceAssocciation() throws IOException {
		GroupPiece Gp1=new GroupPiece("BLUE");
		   GroupPiece Gp2=new GroupPiece("RED");
		   Player p1=new Player("Player1",Gp1,false,false);
		   Player p2=new Player("Player2",Gp2,false,false);
		   Controller c=new Controller(p1,p2,Gp1,Gp2);
		   c.Start();
		   for(int i=0; i<80; i++)
		   {
			   if(i>=0 && i<30)
			   {
				   System.out.println(i);
				   assertEquals(c.v1.Ppieces[i].getName(),c.v1.arrayP[i].GetName());
			   }
		   }
		}
}
