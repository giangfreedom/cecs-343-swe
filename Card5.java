import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card5 extends Card{

	public Card5() {
		c_name = "Lunch at Bratwurst Hall";
		c_reward = "1 Craft Chip";
		c_RoomName = "BratwurstHall";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			p.SetCraft(p.GetCraft()+1);
			// this is to display the text area 2 correctly
			success = true;
		}
	}

}
