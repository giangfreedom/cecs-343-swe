import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card42 extends Card{
	public Card42() {
		c_name = "CECS 274";
		c_reward = "5 VP 1 game card";
		c_RoomName = "ECS302 or ECS308 or Lab";
		c_learning = 7;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() >= c_learning){
			p.SetVP(p.GetVP()+5);
			// if human then get 1 game card
			if(p.getIdentifycationNumber() == 0){
				// get 1 card (add card on top of deck to player hand)
				p.getVHumanHand().addElement(VDeck.get(0));
				// remove card on top of deck
				VDeck.remove(0);
			}			
							
			success = true;
		} 
		else {
			p.SetVP(p.GetVP()-3);
			c_penalty = "lose 3 VP";
		}
	}
}
