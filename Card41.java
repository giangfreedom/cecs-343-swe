import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card41 extends Card{
	public Card41() {
		c_name = "Car Pool";
		c_reward = "3 quality point and 1 game card";
		c_RoomName = "StudentParking or ForbiddenParking";
		c_integrity = 5;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity){
			p.SetVP(p.GetVP()+3);
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
			p.SetVP(p.GetVP()-2);
			c_penalty = "Discard 1 game card";
		}
	}
}
