import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card6 extends Card{

	public Card6() {
		c_name = "CECS 100";
		c_reward = "1 Craft Token";
		c_RoomName = "ECS308";

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
