import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card14 extends Card{

	public Card14() {
		c_name = "Physics 151";
		c_craft = 3;
		c_reward = "5 quality points";
		c_RoomName = "ECS308";
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			if(p.GetCraft() >= c_craft) {
				p.SetVP(p.GetVP()+5);
				success = true;
			}
			else {
				fail(p);
			}
			
		}
		else {
			fail(p);
		}
	}
	
	private void fail(Player p) {
		p.SetVP(p.GetVP()-3);
		c_penalty = "Lose 3 Quality Points";
	}


}