import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card48 extends Card{
	public Card48() {
		c_name = "CECS 277";
		c_reward = "earn 5 VP";
		c_RoomName = "ECS";
		c_integrity = 8;
		c_craft = 8;
		c_learning = 8;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity && p.GetLearning() >= c_learning
				&& p.GetCraft() >= c_craft){
			p.SetVP(p.GetVP()+5);
										
			success = true;
		} 
		else {
			p.SetVP(p.GetVP()-2);
			if(p.getIdentifycationNumber() == 0){
				if(p.getVHumanHand().isEmpty() == false){
					Dialog popup = new Dialog(false,false,false,p,discardDeck);
					popup.setVisible(true);
				}				
			}
			c_penalty = "Discard 1 game card and 2 VP";
		}
	}
}
