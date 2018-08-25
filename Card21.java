import java.io.File;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Card21 extends Card{
	
	Room m_teleportRoom;
	private int qualityPoint;
	public Card21(Room teleportRoom) {
		c_name = "Score a Goal";
		c_craft = 3;
		c_reward = "5 quality points";
		c_RoomName = "GeorgeAllenField";
		qualityPoint = 5;
		m_teleportRoom = teleportRoom;
	}

	@Override
	public void play(Player p,Vector<Card> discardDeck,Vector<Card> VDeck) {
		if (c_RoomName.contains(p.GetLocation().getroom_name())) {
			if(p.GetCraft() >= c_craft) {
				p.SetVP(p.GetVP()+qualityPoint);
				p.SetIntegrity(p.GetIntegrity() + 1);
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
		p.SetLocation(m_teleportRoom);
		c_penalty = "Teleport to Student Parking";		
	}
}