import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card36 extends Card{
	private int qualityPoint;
	public Card36() {
		c_name = "Learning Linux";
		c_craft = 2;
		c_integrity = 3;
		qualityPoint = 3;
		c_reward = "3 quality points chip of choice";
		c_RoomName = "Lab";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name()) && p.GetCraft()>=c_craft
				&&p.GetIntegrity()>=c_integrity) {

			p.SetVP(p.GetVP()+qualityPoint);
			
			if (p.getIdentifycationNumber() == 0) {
				Dialog popup = new Dialog(true,true,true,p,discardDeck);
				popup.setVisible(true);
			}else {
				p.SetCraft(p.GetCraft() + 1);
			}

			success = true;
		} else {
			
			fail(p);
		}
		
	}

	private void fail(Player p) {
		p.SetVP(p.GetVP() - 1);
		c_penalty = "Lose 1 quality point";
		
	}


}