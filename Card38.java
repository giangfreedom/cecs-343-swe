import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card38 extends Card{

	Room m_teleportRoom;

	public Card38(Room teleportRoom) {
		c_name = "Enjoying Nature";
		c_reward = "1 Craft Chip";
		c_RoomName = "GeorgeAllenField, JapaneseGarden, StudentParking, ThePyramid, WestWalkway, HealthCenter"
				+ "ForbiddenParking, Library, Union, BratwurstHall, EastWalkway, NorthHall, or SouthHall";
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			p.SetCraft(p.GetCraft()+1);
			// this is to display the text area 2 correctly
			p.SetLocation(m_teleportRoom);
			success = true;
		}
	}
}