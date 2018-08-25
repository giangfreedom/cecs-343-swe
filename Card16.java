import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card16 extends Card{

	Room m_teleportRoom;

	public Card16(Room teleportRoom) {
		c_name = "KIN 253 Learning the Rules of Soccer";
		c_reward = "2 Craft Chips";
		c_RoomName = "GeorgeAllenField";
		c_integrity = 4;
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			if(p.GetIntegrity() >= c_integrity) {
				p.SetCraft(p.GetCraft() + 2);
				success = true;
			}
			else {
				p.SetLocation(m_teleportRoom);	
				c_penalty = "go to retirement";
			}
		}
		else {
			p.SetLocation(m_teleportRoom);
			c_penalty = "go to retirement";
		}
	}
}