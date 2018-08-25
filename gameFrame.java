import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JScrollBar;
import javax.swing.JSeparator;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.ListSelectionModel;

import java.awt.CardLayout;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import java.awt.Panel;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Collections;
import java.util.Random;

import javax.swing.JList;


public class gameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gameFrame frame = new gameFrame();
					//Controller gamecontrol = new Controller();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public gameFrame() {
		Initialize gameinstant = new Initialize();
		Controller controlOjb = new Controller();
		// randomly select 1 of 3 player for human
		Random rand = new Random();
		int  n = rand.nextInt(3) + 1;
		if(n == 1){
			gameinstant.setHuman(gameinstant.getPlayer1());
			gameinstant.getHuman().SetName(gameinstant.getHuman().GetName() + " human ");
			// this is the number for the card to tell who is invoking it
			// human is 0
			gameinstant.getHuman().setIdentifycationNumber(0);
			
			gameinstant.setAI1(gameinstant.getPlayer2());
			gameinstant.getAI1().SetName(gameinstant.getAI1().GetName() + " AI1 ");
			//AI1 = 1
			gameinstant.getAI1().setIdentifycationNumber(1);
			
			gameinstant.setAI2(gameinstant.getPlayer3());
			gameinstant.getAI2().SetName(gameinstant.getAI2().GetName() + " AI2 ");
			//AI2 = 2
			gameinstant.getAI2().setIdentifycationNumber(2);
			
			// wipe off the deck of ai1 and ai2
			gameinstant.getAI1().getVHumanHand().clear();
			gameinstant.getAI2().getVHumanHand().clear();
		}
		else if(n == 2){
			gameinstant.setHuman(gameinstant.getPlayer2());
			gameinstant.getHuman().SetName(gameinstant.getHuman().GetName() + " human ");
			// this is the number for the card to tell who is invoking it
			// human is 0
			gameinstant.getHuman().setIdentifycationNumber(0);
			
			gameinstant.setAI1(gameinstant.getPlayer1());
			gameinstant.getAI1().SetName(gameinstant.getAI1().GetName() + " AI1 ");
			//AI1 = 1
			gameinstant.getAI1().setIdentifycationNumber(1);
			
			gameinstant.setAI2(gameinstant.getPlayer3());
			gameinstant.getAI2().SetName(gameinstant.getAI2().GetName() + " AI2 ");
			//AI2 = 2
			gameinstant.getAI2().setIdentifycationNumber(2);
			
			// wipe off the deck of ai1 and ai2
			gameinstant.getAI1().getVHumanHand().clear();
			gameinstant.getAI2().getVHumanHand().clear();
		}
		else{
			gameinstant.setHuman(gameinstant.getPlayer3());
			gameinstant.getHuman().SetName(gameinstant.getHuman().GetName() + " human ");
			// this is the number for the card to tell who is invoking it
			// human is 0
			gameinstant.getHuman().setIdentifycationNumber(0);
			
			gameinstant.setAI1(gameinstant.getPlayer1());
			gameinstant.getAI1().SetName(gameinstant.getAI1().GetName() + " AI1 ");
			//AI1 = 1
			gameinstant.getAI1().setIdentifycationNumber(1);
			
			gameinstant.setAI2(gameinstant.getPlayer2());
			gameinstant.getAI2().SetName(gameinstant.getAI2().GetName() + " AI2 ");
			//AI2 = 2
			gameinstant.getAI2().setIdentifycationNumber(2);

			// wipe off the deck of ai1 and ai2
			gameinstant.getAI1().getVHumanHand().clear();
			gameinstant.getAI2().getVHumanHand().clear();
		}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1219, 833);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 11, 1201, 482);
		contentPane.add(scrollPane);
		
		JLabel label = new ImageLabel(gameinstant);
		//JLabel label = new JLabel("New label");
		//label.setIcon(new ImageIcon(gameFrame.class.getResource("/image/CSULBMap3.png")));
		scrollPane.setViewportView(label);
		//label.getGraphics().drawString("natsu", 500, 500);
		
		JButton moveButton = new JButton("Move");
		moveButton.setBounds(10, 500, 91, 23);
		contentPane.add(moveButton);
		moveButton.setEnabled(false);
		
		JButton DrawCardButton = new JButton("Draw Card");
		DrawCardButton.setBounds(10, 580, 91, 23);
		contentPane.add(DrawCardButton);
		
		JButton PlayCardButton = new JButton("Play Card");
		PlayCardButton.setBounds(10, 540, 91, 23);
		contentPane.add(PlayCardButton);
		PlayCardButton.setEnabled(false);
		
		/**
		 * @wbp.nonvisual location=23,371
		 */
		JTextArea textArea1 = new JTextArea();
		textArea1.setBounds(485, 520, 716, 150);
		contentPane.add(textArea1);
		textArea1.setColumns(10);
		
		JTextArea textArea2 = new JTextArea();
		textArea2.setBounds(485, 700, 716, 75);
		contentPane.add(textArea2);
		textArea2.setColumns(10);
		// text area 1
		String topstring = "Player		craft		learning		integrity	VP\n";
		String ai1info = gameinstant.getAI1().GetName() + "		" + gameinstant.getAI1().GetCraft()
				+ "		" + gameinstant.getAI1().GetLearning() 
				+ "		" + gameinstant.getAI1().GetIntegrity() + "	" + gameinstant.getAI1().GetVP()+"\n";
		String humaninfo = gameinstant.getHuman().GetName() + "		" + gameinstant.getHuman().GetCraft()
							+ "		" + gameinstant.getHuman().GetLearning() 
							+ "		" + gameinstant.getHuman().GetIntegrity()+"	"+gameinstant.getHuman().GetVP()+"\n";
		String ai2info = gameinstant.getAI2().GetName() + "		" + gameinstant.getAI2().GetCraft()
				+ "		" + gameinstant.getAI2().GetLearning() 
				+ "\t\t" + gameinstant.getAI2().GetIntegrity()+"\t"+ gameinstant.getAI2().GetVP()+"\n";
		
		String cardinVDeck = "Cards in Deck: " + gameinstant.getVDeck().size()+"\n";
		String Discarded = "Discards out of play: " + gameinstant.getDiscardDeck().size()+"\n";
		String HumanPlayerLocation = "Human player is at " + gameinstant.getHuman().GetLocation().getroom_name() +"\n";
		String AI1PlayerLocation = "Human player is at " + gameinstant.getAI1().GetLocation().getroom_name() +"\n";
		String AI2PlayerLocation = "Human player is at " + gameinstant.getAI2().GetLocation().getroom_name() +"\n";
		textArea1.setText(topstring+humaninfo+ai1info+ai2info+cardinVDeck+Discarded+HumanPlayerLocation
							+AI1PlayerLocation+AI2PlayerLocation);

		/*
		textField = new JTextField();
		textField.setBounds(485, 520, 716, 99);
		contentPane.add(textField);
		textField.setColumns(10);
		*/
		
		// the icon that represent the human player hand
		JLabel playerhand = new JLabel("card");
		// go to card1 and grab the img string
		playerhand.setIcon(new ImageIcon(gameinstant.getHuman().getVHumanHand().get(0).getImage()));
		playerhand.setBounds(142, 519, 200, 270);
		contentPane.add(playerhand);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 623, 79, 153);
		contentPane.add(scrollPane_1);
		
		JList<String> list = new JList<String>(gameinstant.getHuman().GetLocation().getneighborString());
		scrollPane_1.setViewportView(list);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


		DrawCardButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						// check is the deck empty 
						// if the deck is empty copy the discard deck to VDeck
						if(gameinstant.getVDeck().isEmpty() == true){
							// copy the discard deck to VDeck
							for(int j3 = 0; j3 < gameinstant.getDiscardDeck().size(); j3++){
								gameinstant.getVDeck().addElement(gameinstant.getDiscardDeck().get(j3));
							}
							// set the card success status back to false
							for(int j2 = 0; j2 < gameinstant.getVDeck().size(); j2++){
								gameinstant.getVDeck().get(j2).setSuccess(false);
							}
							// once finish adding VDeck then wipe the discardDeck
							gameinstant.getDiscardDeck().clear();
							// shuffle the VDeck
							Collections.shuffle(gameinstant.getVDeck());
							// check player hand if their hand < 7 draw a card and add to hand
							if(gameinstant.getHuman().getVHumanHand().size() < 7){
								// add a card from VDeck[0] to player hand
								gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(0));
								// remove the card from vdeck[0]
								gameinstant.getVDeck().remove(0);
							}
							// if >=7 discard the top card to discard deck and draw
							else{
								// first add the card to discard deck
								gameinstant.getDiscardDeck().addElement(gameinstant.getHuman().getVHumanHand().get(0));
								// discard the top card of player
								gameinstant.getHuman().getVHumanHand().remove(0);
								// add a card from VDeck[0] to player hand
								gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(0));
								// remove the card from vdeck[0]
								gameinstant.getVDeck().remove(0);
							}							
						}						
						// else draw normally
						else{
							// check player hand if their hand < 7 draw a card and add to hand
							if(gameinstant.getHuman().getVHumanHand().size() < 7){
								// add a card from VDeck[0] to player hand
								gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().firstElement());
								// remove the card from vdeck[0]
								gameinstant.getVDeck().removeElementAt(0);
							}
							// if >=7 discard the top card to discard deck and draw
							else{
								// first add the card to discard deck
								gameinstant.getDiscardDeck().addElement(gameinstant.getHuman().getVHumanHand().get(0));
								// discard the top card of player
								gameinstant.getHuman().getVHumanHand().remove(0);
								// add a card from VDeck[0] to player hand
								gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(0));
								// remove the card from vdeck[0]
								gameinstant.getVDeck().remove(0);
							}							
						}						
						// reset move value
						gameinstant.getHuman().SetMoveValue(3);
						// enable move and play card button
						moveButton.setEnabled(true);
						PlayCardButton.setEnabled(true);
						// disable drawcardbutton
						DrawCardButton.setEnabled(false);
					}
		});
		PlayCardButton.addActionListener(
				new ActionListener(){
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent event){						
						// play the card and disable the move + play button itself
						// save the card to temp and play it so the card will not be count in discard
						// create a temp card
						Card temporaryCard1;
						// copy the card at 0 location of player hand to temp card bc
						// we alway play card at human hand 0
						temporaryCard1 = gameinstant.getHuman().getVHumanHand().get(0);	
						// now remove the card from human hand before play execute
						gameinstant.getHuman().getVHumanHand().remove(0);
						// play human card at human hand [0]
						temporaryCard1.play(gameinstant.getHuman(), gameinstant.getDiscardDeck(), gameinstant.getVDeck());
						// add the card to discard deck
						gameinstant.getDiscardDeck().addElement(temporaryCard1);
						// update played card for text area display
						gameinstant.getHuman().setM_playedcard(temporaryCard1);

						// update list of choice
						list.setListData(gameinstant.getHuman().GetLocation().getneighborString());
						// update player hand
						// display the card at location 0 of human hand						
						playerhand.setIcon(new ImageIcon(gameinstant.getHuman().getVHumanHand().get(0).getImage()));
						// disable play and move
						PlayCardButton.setEnabled(false);
						moveButton.setEnabled(false);
						// update ai on screen
						label.repaint();
						// have AI play the card
						controlOjb.Game(gameinstant,gameinstant.getCampus());
						// enable draw
						DrawCardButton.setEnabled(true);
						// update the info panel every time we play a card
						String topstring = "Player		craft		learning		integrity	VP\n";
						String ai1info = gameinstant.getAI1().GetName() + "		" +gameinstant.getAI1().GetCraft()
								+ "		" +gameinstant.getAI1().GetLearning() 
								+ "		" +gameinstant.getAI1().GetIntegrity()+ "	" +gameinstant.getAI1().GetVP()+"\n";
						String humaninfo = gameinstant.getHuman().GetName() + "		" +gameinstant.getHuman().GetCraft()
											+ "		" +gameinstant.getHuman().GetLearning() 
											+ "		" +gameinstant.getHuman().GetIntegrity()+"	"+gameinstant.getHuman().GetVP()+"\n";
						String ai2info = gameinstant.getAI2().GetName() + "		" +gameinstant.getAI2().GetCraft()
								+ "		" +gameinstant.getAI2().GetLearning() 
								+ "\t\t" +gameinstant.getAI2().GetIntegrity()+"\t"+gameinstant.getAI2().GetVP()+"\n";
						
						String cardinVDeck = "Cards in Deck: " + gameinstant.getVDeck().size()+"\n";
						String Discarded = "Discards out of play: " + gameinstant.getDiscardDeck().size()+"\n";
						String HumanPlayerLocation = "Human player is at " + gameinstant.getHuman().GetLocation().getroom_name() +"\n";
						String AI1PlayerLocation = "AI1 player is at " + gameinstant.getAI1().GetLocation().getroom_name() +"\n";
						String AI2PlayerLocation = "AI2 player is at " + gameinstant.getAI2().GetLocation().getroom_name() +"\n";
						textArea1.setText(topstring+humaninfo+ai1info+ai2info+cardinVDeck+Discarded+HumanPlayerLocation
								+AI1PlayerLocation+AI2PlayerLocation);
						String HumanPlayed ="";
						String AI1Played ="";
						String AI2Played ="";
						// check to see if human successfully played the card (using the card boolean attribute)
						if(gameinstant.getHuman().getM_playedcard().isSuccess()){
							HumanPlayed = " Human Played " + gameinstant.getHuman().getM_playedcard().getC_name()
												+ "For " + gameinstant.getHuman().getM_playedcard().getC_reward() + "\n";
						}
						// fail to play the card
						else{
							HumanPlayed = " Human Played " + gameinstant.getHuman().getM_playedcard().getC_name()
									+ " Fail and penalty is " + gameinstant.getHuman().getM_playedcard().getC_penalty() + "\n";
						}
						// AI1 msg
						if(gameinstant.getAI1().getM_playedcard().isSuccess()){
							AI1Played = " AI1 Played " + gameinstant.getAI1().getM_playedcard().getC_name()
												+ "For " + gameinstant.getAI1().getM_playedcard().getC_reward() + "\n";
						}
						// fail to play the card
						else{
							AI1Played = " AI1 Played " + gameinstant.getAI1().getM_playedcard().getC_name()
									+ " Fail and penalty is " + gameinstant.getAI1().getM_playedcard().getC_penalty() + "\n";
						}
						// AI2 msg
						if(gameinstant.getAI2().getM_playedcard().isSuccess()){
							AI2Played = " AI2 Played " + gameinstant.getAI2().getM_playedcard().getC_name()
												+ "For " + gameinstant.getAI2().getM_playedcard().getC_reward() + "\n";
						}
						// fail to play the card
						else{
							AI2Played = " AI2 Played " + gameinstant.getAI2().getM_playedcard().getC_name()
									+ " Fail and penalty is " + gameinstant.getAI2().getM_playedcard().getC_penalty() + "\n";
						}
						textArea2.setText(HumanPlayed+AI1Played+AI2Played);	
						// check for player VP point if it is >= 60 then change deck
						if(gameinstant.getHuman().GetVP() >= 1 && gameinstant.getHuman().isIshighlv() == false){
							// fix ishighlv to true so this condition will be ignore later on
							gameinstant.getHuman().setIshighlv(true);
							// now remove all the discard deck
							gameinstant.getDiscardDeck().removeAllElements();
							// now wipe off the VDeck
							gameinstant.getVDeck().removeAllElements();
							// now copy the high lv deck over to VDeck in a loop
							for(int ix = 0; ix < gameinstant.getHighlvDeck().size(); ix++){
								gameinstant.getVDeck().addElement(gameinstant.getHighlvDeck().get(ix));
							}
							// now wipe off the player hand
							gameinstant.getHuman().getVHumanHand().removeAllElements();
							gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(0));
							gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(1));
							gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(2));
							gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(3));
							gameinstant.getHuman().getVHumanHand().addElement(gameinstant.getVDeck().get(4));
							
							for(int i = 0; i < 5; i++){
								// remove 5 time at location 0 (remove the first one 5 time since vector will auto shift left
								gameinstant.getVDeck().removeElementAt(0);
							}							
						}
					}
		});
		playerhand.addMouseListener(
				new MouseListener(){
					@Override
					public void mouseClicked(MouseEvent arg0) {
						// TODO Auto-generated method stub						
						// shift left the entire hand
						// create a temp card
						Card temporaryCard;
						// copy the card at 0 location of player hand to temp card
						temporaryCard = gameinstant.getHuman().getVHumanHand().get(0);
						// remove the card at 0
						gameinstant.getHuman().getVHumanHand().remove(0);						
						// add it back to the end of the player hand
						gameinstant.getHuman().getVHumanHand().addElement(temporaryCard);
						// display the card at location 0 of human hand						
						playerhand.setIcon(new ImageIcon(gameinstant.getHuman().getVHumanHand().get(0).getImage()));
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
		
		moveButton.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent event){
						String selected = list.getSelectedValue().toString();
						// run out of move (3 limit / turn
						// disable the move button 
						if(gameinstant.getHuman().Getmovevalue() <= 1){
							//moveButton.enable(false);
							moveButton.setEnabled(false);
							//gameinstant.Game(gameinstant,gameinstant.getCampus());
						}
						for(int j = 0; j < gameinstant.getHuman().GetLocation().GetNeighbor().length; j++){
							// if the selected item from the list = the room name
							// in campus then we found the next spot
							if(selected.equalsIgnoreCase(gameinstant.getHuman().GetLocation().getneighborString()[j])){
								gameinstant.getHuman().SetLocation(gameinstant.getCampus()[gameinstant.getHuman().GetLocation().GetNeighbor()[j]]);
								break;
							}
						}
						
						// subtract move value everyloop
						gameinstant.getHuman().SetMoveValue(gameinstant.getHuman().Getmovevalue()-1);
						// run out of move (3 limit / turn
						// disable the move button and call AI function
						label.repaint();
						list.setListData(gameinstant.getHuman().GetLocation().getneighborString());
					}
				}		
		);
		
	}
}
