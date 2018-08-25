import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card51 extends Card{
	public Card51() {
		c_name = "Have a Swim";
		c_reward = "1 chip of choice";
		c_RoomName = "HealthCenter";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			// if human then get 1 choice chip
			if(p.getIdentifycationNumber() == 0){
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}		
			success = true;
		}
	}
}
