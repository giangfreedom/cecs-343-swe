import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card4 extends Card{

	public Card4() {
		c_name = "Professor Murgolo's CECS 174 Class";
		c_reward = "1 Learning chip";
		c_RoomName = "ECS302";

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
