import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card28 extends Card{

	public Card28() {
		c_name = "Professor Englert";
		c_integrity = 3;
		c_reward = "chip of choice";
		c_RoomName = "Conference";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity) {
			if (p.getIdentifycationNumber() == 0) {
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}else {
				p.SetCraft(p.GetCraft() + 1);
			}

			success = true;
		}
		else {
			if(p.getIdentifycationNumber() == 0){
				if(p.getVHumanHand().isEmpty() == false){
					Dialog popup = new Dialog(false,false,false,p,discardDeck);
					popup.setVisible(true);
				}
				else{
					p.SetVP(p.GetVP()-1);
				}
			}
			c_penalty = "Discard 1 game card";
		}
		
	}
}