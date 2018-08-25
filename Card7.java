import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card7 extends Card{

	public Card7() {
		c_name = "Excercising Mind and Body";
		c_reward = "1 Integrity Chip";
		c_RoomName = "StudenRecreation";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			p.SetIntegrity(p.GetIntegrity()+1);
			// this is to display the text area 2 correctly
			success = true;
		}
	}

}
