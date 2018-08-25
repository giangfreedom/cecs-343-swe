import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card23 extends Card{

	Room m_teleportRoom;
	private int qualityPoint;
	public Card23(Room teleportRoom) {
		c_name = "Make the Dean's List";
		c_learning = 6;
		qualityPoint = 5;
		c_reward = "1 integrity and 1 craft";
		c_RoomName = "NorthHall or SouthHall";
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name()) && p.GetLearning() >= c_learning) {
			p.SetVP(p.GetVP()+qualityPoint);
			success = true;		
		}
		else {
			fail(p);
		}
	}
	
	private void fail(Player p) {
		p.SetLocation(m_teleportRoom);
		c_penalty = "Teleport to Student Parking";
		
	}


}