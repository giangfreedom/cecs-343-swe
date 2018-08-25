import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card49 extends Card{
	public Card49() {
		c_name = "CECS 285";
		c_reward = "5 VP and 1 chip of choice";
		c_RoomName = "JapaneseGarden or Eat";
		c_learning = 6;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() >= c_learning){
			p.SetVP(p.GetVP()+5);
			// if human then get 1 choice chip
			if(p.getIdentifycationNumber() == 0){
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}			
							
			success = true;
		} 
		else {
			p.SetVP(p.GetVP()-3);
			c_penalty = "lose 3 vp";
		}
	}
}
