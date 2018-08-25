import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card11 extends Card{

	public Card11() {
		c_name = "Enjoying the Peace";
		c_reward = "1 Learning Chip or 1 Integrity Chip";
		c_RoomName = "JapaneseGarden";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				Dialog popup = new Dialog(true,false,true,p, discardDeck);
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