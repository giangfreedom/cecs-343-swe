import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card35 extends Card{

	public Card35() {
		c_name = "The Outpost";
		c_reward = "chip of choice";
		c_RoomName = "ForbiddenParking";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (!c_RoomName.contains(p.GetLocation().getroom_name())) {
			if (p.getIdentifycationNumber() == 0) {
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}else {
				p.SetCraft(p.GetCraft() + 1);
			}
			success = true;
		} 
	}
}