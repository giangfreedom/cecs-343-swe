import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class Dialog extends JDialog{
	private boolean isComplete = false;
	boolean m_learning;
	boolean m_craft;
	boolean m_integrity;
	public Dialog(boolean learning, boolean craft, boolean integrity, Player p, Vector<Card> discardDeck){
		m_learning = learning;
		m_craft = craft;
		m_integrity = integrity;
		
		JPanel newp = new JPanel();
		setTitle("dialog");
		setResizable(false);
		setModal(true);
		
		setSize(400, 400);
		setLocation(500, 500);
		
		newp.setBounds(500, 500, 360, 360);
		add(newp);
		
		JTextArea s = new JTextArea();
		s.setText("Please choose one chip");

		JButton learningButton = new JButton("learning");
		
		JButton craftButton = new JButton("craft");
	
		JButton integrityButton = new JButton("integrity");
		
		JButton discard = new JButton("discard");
		
		// the icon that represent the human player hand
		JLabel playerhanddiscard = new JLabel("card");
		// go to card1 and grab the img string
		playerhanddiscard.setIcon(new ImageIcon(p.getVHumanHand().get(0).getImage()));
	
		
		if(m_learning == true && m_craft == true && m_integrity == true){
			newp.add(s);
			newp.add(learningButton);
			newp.add(craftButton);
			newp.add(integrityButton);
		}
		else if (m_learning == true && m_craft == true){
			newp.add(s);
			newp.add(learningButton);
			newp.add(craftButton);
		}
		else if (m_learning == true && m_integrity == true){
			newp.add(s);
			newp.add(learningButton);
			newp.add(integrityButton);
		}
		else if(m_craft == true && m_integrity == true){
			newp.add(s);
			newp.add(craftButton);
			newp.add(integrityButton);
		}
		else if(m_learning == false && m_craft == false && m_integrity == false){
			newp.add(discard);
			newp.add(playerhanddiscard);
		}
		
		learningButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						p.SetLearning(p.GetLearning()+1);
						setVisible(false);
					}
				}		
		);
		
		craftButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						p.SetCraft(p.GetCraft()+1);
						setVisible(false);
					}
				}		
		);
		
		integrityButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						p.SetIntegrity(p.GetIntegrity()+1);
						setVisible(false);
					}
				}		
		);	
		
		discard.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						// is human?
						if(p.getIdentifycationNumber() == 0){
							// is human hand empty?
							if(p.getVHumanHand().isEmpty() == false){
								// lose 1 game card
								// add the card to discard deck
								discardDeck.addElement(p.getVHumanHand().get(0));
								// remove it from player hand
								p.getVHumanHand().remove(0);
							}
							else{
								p.SetVP(p.GetVP()-1);
							}
						}
						setVisible(false);
					}
				}		
		);
		
		playerhanddiscard.addMouseListener(
				new MouseListener(){
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub						
						// shift left the entire hand
						// create a temp card
						Card temporaryCard;
						// copy the card at 0 location of player hand to temp card
						temporaryCard = p.getVHumanHand().get(0);
						// remove the card at 0
						p.getVHumanHand().remove(0);						
						// add it back to the end of the player hand
						p.getVHumanHand().addElement(temporaryCard);
						// display the card at location 0 of human hand						
						playerhanddiscard.setIcon(new ImageIcon(p.getVHumanHand().get(0).getImage()));
					}

					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}

					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
		});
	}

}
