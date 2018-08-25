import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Card33 extends Card{
	private int qualityPoint;
	Room m_teleportRoom;

	public Card33(Room teleportRoom) {
		c_name = "Professor Hoffman";
		c_learning = 3;
		c_reward = "5 quality points and 2 game cards";
		c_RoomName = "Lab, RoomofRetirement, 302, Elevator, 308,"
				+ "Eat, or Conference";
		qualityPoint = 5;
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())
				&& p.GetLearning() > c_learning) {
					
			p.SetVP(p.GetVP() + qualityPoint);
			// if human then get to choose
			if(p.getIdentifycationNumber() == 0){
				// get 1 card (add card on top of deck to player hand)
				p.getVHumanHand().addElement(VDeck.get(0));
				// remove card on top of deck
				VDeck.remove(0);
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
		p.SetVP(p.GetVP() - 5);
		c_penalty = "lose 5 quality point and go to lactation house";
		p.SetLocation(m_teleportRoom);
	}


}