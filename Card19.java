import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card19 extends Card{
	private int qualityPoint;
	public Card19() {
		c_name = "Choosing a Major";
		c_integrity = 3;
		c_reward = "5 quality points";
		c_RoomName = "LactationLounge";
		qualityPoint = 3;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			if(p.GetIntegrity() >= c_integrity) {
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