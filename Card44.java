import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card44 extends Card{
	Room m_teleportRoom;
	public Card44(Room teleportRoom) {
		c_name = "ENGL 317";
		c_reward = "3 VP ";
		c_RoomName = "Union";
		c_craft = 6;
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetCraft() >= c_craft) {
			p.SetVP(p.GetVP()+3);
			// this is to display the text area 2 correctly
			success = true;
		}
		else{
			p.SetLocation(m_teleportRoom);
			c_penalty = "Go to student parking";
		}
	}
}
