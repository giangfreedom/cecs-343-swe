import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card12 extends Card{

	public Card12() {
		c_name = "Buddy Up";
		c_reward = "1 Learning Chip or 1 Craft Chip";
		c_RoomName = "EAT or GeorgeAllenField";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				Dialog popup = new Dialog(true,true,false,p,discardDeck);
				popup.setVisible(true);
			}			
			// else it is AI give them anything
			else{
				p.SetLearning(p.GetLearning()+1);
			}	
			success = true;
		}
	}
}