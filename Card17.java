import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card17 extends Card{
	private int qualityPoint = 5;
	public Card17() {
		c_name = "Math 123";
		c_learning = 5;
		c_reward = "5 quality points";
		c_RoomName = "ECS302 or ECS308";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name()) && p.GetLearning() >= c_learning) {
			// if human then get to choose
			p.SetVP(p.GetVP()+qualityPoint);
			success = true;		
		}
		else {
			p.SetVP(p.GetVP()-3);
			c_penalty = "Lose 3 Quality Points and lose 1 game card";
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
		}
	}
	
}