import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card18 extends Card{
	private int qualityPoint;
	public Card18() {
		c_name = "Learning Netbeans";
		c_learning = 3;
		c_reward = "5 quality points";
		c_RoomName = "NoisyRoom";
		qualityPoint = 5;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			if(p.GetLearning() >= c_learning) {
				p.SetVP(p.GetVP()+qualityPoint);
				success = true;
			}
			else {
				fail(p);
			}
			
		}
		else {
			fail(p);
		}
	}
	
	private void fail(Player p) {
		p.SetVP(p.GetVP()-3);
		c_penalty = "Lose 3 Quality Points";
		
	}

}