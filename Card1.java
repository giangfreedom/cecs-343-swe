import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card1 extends Card{
	public Card1() {
		c_name = "CECS 105";
		c_reward = "1 Learning Chip";
		c_RoomName = "ECS302 or ECS308";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			p.SetLearning(p.GetLearning()+1);
			// this is to display the text area 2 correctly
			success = true;
		}
	}
}
