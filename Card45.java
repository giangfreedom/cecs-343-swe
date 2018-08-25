import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card45 extends Card{
	public Card45() {
		c_name = "PHYS 152";
		c_reward = "5 VP and 1 chip";
		c_RoomName = "Union or Library";
		c_integrity = 7;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity){
			p.SetVP(p.GetVP()+5);
			// if human then get 1 choice chip
			if(p.getIdentifycationNumber() == 0){
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}			
							
			success = true;
		} 
		else {
			if(p.getIdentifycationNumber() == 0){
				if(p.getVHumanHand().isEmpty() == false){
					Dialog popup = new Dialog(false,false,false,p,discardDeck);
					popup.setVisible(true);
				}				
			}
			c_penalty = "Discard 1 game card";
		}
	}
}
