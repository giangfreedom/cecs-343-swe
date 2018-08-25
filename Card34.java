import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card34 extends Card{
	private int qualityPoint;
	Room m_teleportRoom;

	public Card34(Room teleportRoom) {
		c_name = "Chem111";
		c_craft = 6;
		c_reward = "Get 5 quality points";
		c_RoomName = "GeorgeAllenField, JapaneseGarden, StudentParking, ThePyramid, WestWalkway, HealthCenter"
				+ "ForbiddenParking, Library, Union, BratwurstHall, EastWalkway, NorthHall, or SouthHall";
		qualityPoint = 5;
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetCraft() >= c_craft) {
			p.SetVP(p.GetVP() + qualityPoint);

			success = true;
		} else {

			fail(p);

		}

	}

	private void fail(Player p) {
		p.SetLocation(m_teleportRoom);
		c_penalty = "Go to student parking";

	}


}