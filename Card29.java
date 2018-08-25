import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card29 extends Card{

	public Card29() {
		c_name = "Press the Right Floor";
		c_learning = 4;
		c_reward = "2 craft chips";
		c_RoomName = "Elevator";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() >= c_learning) {

			p.SetCraft(p.GetCraft()+2);
			success = true;
		} else {

			fail(p);

		}
		
	}
	
	private void fail(Player p) {
		p.SetVP(p.GetVP()-2);
		c_penalty = "Lose 2 quality points";
		
	}


}