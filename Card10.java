import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card10 extends Card{

	public Card10() {
		c_name = "Goodbye, Professor";
		c_reward = "10 Quality Points";
		c_RoomName = "RoomofRetirement";
		c_learning = 6;
		c_craft = 6;
		c_integrity = 6;

	}

	@Override
	public void play(Player p, Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity && p.GetLearning() >= c_learning
				&& p.GetCraft() >= c_craft) {
			p.SetVP(p.GetVP()+10);
			success = true;
		}
		else{
			c_penalty = "Discard 1 game card";
			if(p.getIdentifycationNumber() == 0){
				if(p.getVHumanHand().isEmpty() == false){
					// lose 1 game card
					Dialog popup = new Dialog(false,false,false,p,discardDeck);
					popup.setVisible(true);
				}
				else{
					p.SetVP(p.GetVP()-1);
				}
			}
		}
	}
}