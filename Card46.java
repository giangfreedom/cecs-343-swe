import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card46 extends Card{
	public Card46() {
		c_name = "PHIL 270";
		c_reward = "1 Learning Chip + 3 vp";
		c_RoomName = "Union or Library";
		c_integrity = 7;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity){
			p.SetVP(p.GetVP()+3);
			p.SetLearning(p.GetLearning()+1);
							
			success = true;
		} 
		else {
			p.SetVP(p.GetVP()-3);
			c_penalty = "lose 3 VP";
		}
	}
}
