import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card8 extends Card{

	public Card8() {
		c_name = "Parking Violation";
		c_reward = "1 learning chip; you discard 1 game card"
				+ "from your hand to get another learning chip";
		c_RoomName = "ForbiddenParking";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {			
			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				p.SetLearning(p.GetLearning()+1);
				// if the player hand is not empty
				if(p.getVHumanHand().isEmpty() == false){
					// discard 1 card and get 1 more chip
					Dialog popup = new Dialog(false,false,false,p,discardDeck);
					popup.setVisible(true);
					// give player 1 more learning chip
					p.SetLearning(p.GetLearning()+1);
				}
			}			
			// else it is AI give them anything
			else{
				p.SetLearning(p.GetLearning()+2);
			}		
			// this is to display the text area 2 correctly
			success = true;
		}
	}
}
