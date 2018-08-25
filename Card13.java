import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card13 extends Card{

	Room m_teleportRoom;
	
	public Card13(Room teleportRoom) {
		c_name = "Late for Class";
		c_reward = "Get 1 Craft Chip and Teleport to the Lactation Lounge";
		c_RoomName = "ForbiddenParking";
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (!c_RoomName.contains(p.GetLocation().getroom_name())) {
			p.SetCraft(p.GetCraft() + 1);
			p.SetLocation(m_teleportRoom);
			
			success = true;
		}
	}

}