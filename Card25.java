import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card25 extends Card{
	private int qualityPoint;
	public Card25() {
		c_name = "Meet the Dean";
		qualityPoint = 5;
		c_integrity = 3;
		c_craft = 3;
		c_learning = 3;
		c_reward = "5 Quality points and 1 game card";
		c_RoomName = "Lab";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity && p.GetLearning() >= c_learning
				&& p.GetCraft() >= c_craft){
			p.SetVP(p.GetVP()+5);
			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				// get 1 card (add card on top of deck to player hand)
				p.getVHumanHand().addElement(VDeck.get(0));
				// remove card on top of deck
				VDeck.remove(0);
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