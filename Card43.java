import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card43 extends Card{
	public Card43() {
		c_name = "CECS 201";
		c_reward = "1 Learning Chip 1 craft 1 integrity";
		c_RoomName = "ECS302 or ECS308 or Lab";
		c_craft = 8;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetCraft() >= c_craft) {
			p.SetLearning(p.GetLearning()+1);
			p.SetIntegrity(p.GetIntegrity()+1);
			p.SetCraft(p.GetCraft()+1);;
			// this is to display the text area 2 correctly
			success = true;
		}
		else{
			if(p.getIdentifycationNumber() == 0){
				if(p.getVHumanHand().isEmpty() == false){
					Dialog popup = new Dialog(false,false,false,p,discardDeck);
					popup.setVisible(true);
				}
				else{
					p.SetVP(p.GetVP()-3);
				}
			}
			c_penalty = "Discard 1 game card and lose 3 VP";
		}
	}
}
