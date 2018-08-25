import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card26 extends Card{

	public Card26() {
		c_name = "Loud Buzzing";
		c_craft = 3;
		c_reward = "1 chip of your choice";
		c_RoomName = "Eat";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetCraft() >= c_craft) {

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
			fail(p);
		}		
	}
	
	private void fail(Player p) {
		p.SetVP(p.GetVP()-2);
		c_penalty = "lose 2 quality points";
		
	}


}