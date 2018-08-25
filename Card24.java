import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card24 extends Card{
	private int qualityPoint;
	public Card24() {
		qualityPoint = 3;
		c_integrity = 4;
		c_name = "A New Laptop";
		c_reward = "3 Quality points and a chip of your choice";
		c_RoomName = "Lab";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name()) && p.GetIntegrity() >= c_integrity) {				
			// if human then get to choose
			if (p.getIdentifycationNumber() == 0) {
				p.SetVP(p.GetVP()+3);
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}
			// else it is AI give them anything
			else {
				p.SetVP(p.GetVP()+3);
				p.SetLearning(p.GetLearning() + 1);
			}
			// this is to display the text area 2 correctly
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