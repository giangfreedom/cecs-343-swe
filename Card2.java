import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card2 extends Card{
	public Card2() {
		c_name = " Research Compilers";
		c_reward = "1 Learning Chip";
		c_RoomName = "Library";

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
