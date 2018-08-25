import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card40 extends Card{
	public Card40() {
		c_name = "LBSUvsUCI";
		c_reward = "1 Chip";
		c_RoomName = "ThePyramid";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			if (p.getIdentifycationNumber() == 0) {
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}
			else {
				p.SetCraft(p.GetCraft() + 1);
			}
			success = true;
		}
	}
}
