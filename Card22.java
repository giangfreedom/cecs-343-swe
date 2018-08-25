import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card22 extends Card{

Room m_teleportRoom;
	
	public Card22(Room teleportRoom) {
		c_name = "Fall in the Pond";
		c_learning = 3;
		c_reward = "1 integrity and 1 craft";
		c_RoomName = "JapaneseGarden";
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name()) && p.GetLearning() >= c_learning) {
			p.SetIntegrity(p.GetIntegrity() + 1);
			p.SetCraft(p.GetCraft() + 1);
			success = true;
		}
		else {
			fail(p);
		}
	}
	
	private void fail(Player p) {
		p.SetLocation(m_teleportRoom);
		c_penalty = "Teleport to Lactation lounge";
		
	}

}