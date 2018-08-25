import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card27 extends Card{
	private int qualityPoint;
	public Card27() {
		c_name = "Program Crashes";
		c_learning = 2;
		c_reward = "5 quality points and chip of choice";
		c_RoomName = "NoisyRoom";
		qualityPoint = 5;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() >= c_learning) {			
			p.SetVP(p.GetVP() + qualityPoint);

			if (p.getIdentifycationNumber() == 0) {
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}
			else {
				p.SetCraft(p.GetCraft() + 1);
			}
			success = true;
		}
		else {
			if(p.getIdentifycationNumber() == 0){
				if(p.getVHumanHand().isEmpty() == false){
					// lose 1 game card
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