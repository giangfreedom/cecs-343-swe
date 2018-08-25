import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card30 extends Card{
	private int qualityPoint;
	Room m_teleportRoom;

	public Card30(Room teleportRoom) {
		c_name = "Soccer Goalie";
		c_learning = 3;
		c_craft = 3;
		c_reward = "1 learning chip and 1 game card";
		c_RoomName = "Elevator";
		qualityPoint = 5;
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() >= c_learning && p.GetCraft() >= c_craft) {
			p.SetVP(p.GetVP() + qualityPoint);

			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				// 1 game card 
				// get 1 card (add card on top of deck to player hand)
				p.getVHumanHand().addElement(VDeck.get(0));
				// remove card on top of deck
				VDeck.remove(0);				
			}
			success = true;
		}
		else {

			fail(p);

		}

	}

	private void fail(Player p) {
		p.SetLocation(m_teleportRoom);
		c_penalty = "Go to student parking";

	}

}