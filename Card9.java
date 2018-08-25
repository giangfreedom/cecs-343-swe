import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card9 extends Card{

	public Card9() {
		c_name = "Finding the Lab";
		c_reward = "1 Integrity Chip";
		c_RoomName = "Elevators";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			p.SetIntegrity(p.GetIntegrity()+1);
			success = true;
		}
	}
}
