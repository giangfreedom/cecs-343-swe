import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card31 extends Card{

	public Card31() {
		c_name = "Elective Class";
		c_learning = 2;
		c_reward = "1 learning chip and 1 game card";
		c_RoomName = "Elevator";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() >= c_learning) {
			p.SetLearning(p.GetLearning()+1);
			
			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				// 1 game card 
				// get 1 card (add card on top of deck to player hand)
				p.getVHumanHand().addElement(VDeck.get(0));
				// remove card on top of deck
				VDeck.remove(0);				
			}
			
			success = true;
		} else {

			fail(p);

		}
		
	}
	
	private void fail(Player p) {
		p.SetVP(p.GetVP()-2);
		c_penalty = "Lose 2 quality points";
		
	}


}