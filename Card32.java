import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card32 extends Card{
	private int qualityPoint;
	public Card32() {
		c_name = "Oral Communications";
		c_integrity = 4;
		c_reward = "5 quality points and chip of choice";
		c_RoomName = "GeorgeAllenField, JapaneseGarden, StudentParking, ThePyramid, WestWalkway, HealthCenter"
				+ "ForbiddenParking, Library, Union, BratwurstHall, EastWalkway, NorthHall, or SouthHall";

	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetIntegrity() >= c_integrity) {
			
			p.SetVP(p.GetVP() + qualityPoint);

			if (p.getIdentifycationNumber() == 0) {
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}else {
				p.SetIntegrity(p.GetIntegrity() + 1);
			}

			success = true;
		} else {
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