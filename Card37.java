import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card37 extends Card{
	private int qualityPoint;
	public Card37() {
		c_name = "Make a Friend";
		c_integrity = 2;
		qualityPoint = 3;
		c_reward = "3 quality points chip of choice";
		c_RoomName = "NorthHall or SouthHall";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&&p.GetIntegrity()>=c_integrity) {	
			p.SetVP(p.GetVP()+qualityPoint);
			
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