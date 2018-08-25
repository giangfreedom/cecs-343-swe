import java.util.Collections;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;


public class Initialize {

	private int[] room0Neighbor = {1,3,4,5};
	private int[] room1Neighbor = {0,2,3};
	private int[] room2Neighbor = {1,3,5,6};
	private int[] room3Neighbor = {0,1,2,5};
	private int[] room4Neighbor = {0,5,7};
	private int[] room5Neighbor = {0,2,3,4,6};
	private int[] room6Neighbor = {2,5,10};
	private int[] room7Neighbor = {4,8};
	private int[] room8Neighbor = {7,9,16};
	private int[] room9Neighbor = {8,10};
	private int[] room10Neighbor = {6,9};
	private int[] room11Neighbor = {12};
	private int[] room12Neighbor = {11,13,14,15,16};
	private int[] room13Neighbor = {12};
	private int[] room14Neighbor = {12,15};
	private int[] room15Neighbor = {12,14,17,18,19,20};
	private int[] room16Neighbor = {12,8};
	private int[] room17Neighbor = {15};
	private int[] room18Neighbor = {15};
	private int[] room19Neighbor = {15};
	private int[] room20Neighbor = {15};
	
	private String[] room0NeighborS = {"JapaneseGarden","ThePyramid","WestWalkway","HealthCenter"};
	private String[] room1NeighborS = {"GeorgeAllenField","StudentParking","ThePyramid"};
	private String[] room2NeighborS = {"JapaneseGarden","ThePyramid","HealthCenter","ForbiddenParking"};
	private String[] room3NeighborS = {"GeorgeAllenField","JapaneseGarden","StudentParking","HealthCenter"};
	private String[] room4NeighborS = {"GeorgeAllenField","HealthCenter","Library"};
	private String[] room5NeighborS = {"GeorgeAllenField","StudentParking","ThePyramid","WestWalkway","ForbiddenParking"};
	private String[] room6NeighborS = {"StudentParking","HealthCenter","EastWalkway"};
	private String[] room7NeighborS = {"WestWalkway","Union"};
	private String[] room8NeighborS = {"Library","BratwurstHall","Elevator"};
	private String[] room9NeighborS = {"Union","EastWalkway"};
	private String[] room10NeighborS = {"ForbiddenParking","BratwurstHall"};
	private String[] room11NeighborS = {"NorthHall"};
	private String[] room12NeighborS = {"Lab","RoomofRetirement","302","SouthHall","Elevator"};
	private String[] room13NeighborS = {"NorthHall"};
	private String[] room14NeighborS = {"NorthHall","SouthHall"};
	private String[] room15NeighborS = {"NorthHall","302","308","Eat","Conference","NoisyRoom"};
	private String[] room16NeighborS = {"NorthHall","Union"};
	private String[] room17NeighborS = {"SouthHall"};
	private String[] room18NeighborS = {"SouthHall"};
	private String[] room19NeighborS = {"SouthHall"};
	private String[] room20NeighborS = {"SouthHall"};
	
	private Room	room0 = new Room(0,room0Neighbor,190,300, "GeorgeAllenField", room0NeighborS);
	private Room	room1 = new Room(1,room1Neighbor,660,114, "JapaneseGarden", room1NeighborS);
	private Room	room2 = new Room(2,room2Neighbor,1270,230, "StudentParking", room2NeighborS);
	private Room	room3 = new Room(3,room3Neighbor,660,400, "ThePyramid", room3NeighborS);
	private Room	room4 = new Room(4,room4Neighbor,100,790, "WestWalkway", room4NeighborS);
	private Room	room5 = new Room(5,room5Neighbor,660,700, "HealthCenter", room5NeighborS);
	private Room	room6 = new Room(6,room6Neighbor,1270,700, "ForbiddenParking", room6NeighborS);
	private Room	room7 = new Room(7,room7Neighbor,100,1880, "Library", room7NeighborS);
	private Room	room8 = new Room(8,room8Neighbor,660,1880, "Union", room8NeighborS);
	private Room	room9 = new Room(9,room9Neighbor,1270,1880, "BratwurstHall", room9NeighborS);
	private Room	room10 = new Room(10,room10Neighbor,1490,1280, "EastWalkway", room10NeighborS);
	private Room	room11 = new Room(11,room11Neighbor,300,1030, "Lab", room11NeighborS);
	private Room	room12 = new Room(12,room12Neighbor,400,1250, "NorthHall", room12NeighborS);
	private Room	room13 = new Room(13,room13Neighbor,350,1450, "RoomofRetirement", room13NeighborS);
	private Room	room14 = new Room(14,room14Neighbor,800,1030, "302", room14NeighborS);
	private Room	room15 = new Room(15,room15Neighbor,1000,1250, "SouthHall", room15NeighborS);
	private Room	room16 = new Room(16,room16Neighbor,630,1450, "Elevator", room16NeighborS);
	private Room	room17 = new Room(17,room17Neighbor,930,1450, "308", room17NeighborS);
	private Room	room18 = new Room(18,room18Neighbor,1080,1030, "Eat", room18NeighborS);
	private Room	room19 = new Room(19,room19Neighbor,1280,1030, "Conference", room19NeighborS);
	private Room	room20 = new Room(20,room20Neighbor,1280,1450, "NoisyRoom", room20NeighborS);
	
	private Room[] campus = {room0,room1,room2,room3,room4,room5,
					room6,room7,room8,room9,room10,room11,
					room12,room13,room14,room15,room16,room17,
					room18,room19,room20};
	
	
	private Card card1 = new Card1();
	private Card card2 = new Card2();
	private Card card3 = new Card3();
	private Card card4 = new Card4();
	private Card card5 = new Card5();
	private Card card6 = new Card6();
	private Card card7 = new Card7();
	private Card card8 = new Card8();
	private Card card9 = new Card9();
	private Card card10 = new Card10();
	private Card card11 = new Card11();
	private Card card12 = new Card12();
	private Card card13 = new Card13(room20);
	private Card card14 = new Card14();
	private Card card15 = new Card15(room20);
	private Card card16 = new Card16(room13);
	private Card card17 = new Card17();
	private Card card18 = new Card18();
	private Card card19 = new Card19();
	private Card card20 = new Card20();
	private Card card21 = new Card21(room2);
	private Card card22 = new Card22(room20);
	private Card card23 = new Card23(room2);
	private Card card24 = new Card24();
	private Card card25 = new Card25();
	private Card card26 = new Card26();
	private Card card27 = new Card27();
	private Card card28 = new Card28();
	private Card card29 = new Card29();
	private Card card30 = new Card30(room2);
	private Card card31 = new Card31();
	private Card card32 = new Card32();
	private Card card33 = new Card33(room20);
	private Card card34 = new Card34(room2);
	private Card card35 = new Card35();
	private Card card36 = new Card36();
	private Card card37 = new Card37();
	private Card card38 = new Card38(room20);
	private Card card39 = new Card39(room20);
	private Card card40 = new Card40();
	private Card card41 = new Card41();
	private Card card42 = new Card42();
	private Card card43 = new Card43();
	private Card card44 = new Card44(room2);
	private Card card45 = new Card45();
	private Card card46 = new Card46();
	private Card card47 = new Card47();
	private Card card48 = new Card48();
	private Card card49 = new Card49();
	private Card card50 = new Card50();
	private Card card51 = new Card51();
	/*
	private Card[] deck = {card1,card2,card3,card4,card5,card6,
			card7,card8,card9,card10,card11,card12,
			card13,card14,card15,card16,card17,card18,
			card19,card20,card21,card22,card23,card24,
			card25,card26,card27,card28,card29,card30,
			card31,card32,card33,card34,card35,card36,
			card37,card38,card39};
	*/
	private Vector<Card> VDeck = new Vector<Card>();
	private Vector<Card> DiscardDeck = new Vector<Card>();
	private Vector<Card> HighlvDeck = new Vector<Card>();

	private Player player1 = new Player("Natsu",room17,0,2,2,2,3);
	private Player player2 = new Player("Gray",room17,0,3,1,2,3);
	private Player player3 = new Player("Erza",room17,0,0,3,3,3);
	private Player human;
	private Player AI1;
	private Player AI2;
	
	public Initialize(){
		card1.setImage("/image/card1.png");
		card2.setImage("/image/card2.png");
		card3.setImage("/image/card3.png");
		card4.setImage("/image/card4.png");
		card5.setImage("/image/card5.png");
		card6.setImage("/image/card6.png");
		card7.setImage("/image/card7.png");
		card8.setImage("/image/card8.png");
		card9.setImage("/image/card9.png");
		card10.setImage("/image/card10.png");
		card11.setImage("/image/card11.png");
		card12.setImage("/image/card12.png");
		card13.setImage("/image/card13.png");
		card14.setImage("/image/card14.png");
		card15.setImage("/image/card15.png");
		card16.setImage("/image/card16.png");
		card17.setImage("/image/card17.png");
		card18.setImage("/image/card18.png");
		card19.setImage("/image/card19.png");
		card20.setImage("/image/card20.png");
		card21.setImage("/image/card21.png");
		card22.setImage("/image/card22.png");
		card23.setImage("/image/card23.png");
		card24.setImage("/image/card24.png");
		card25.setImage("/image/card25.png");
		card26.setImage("/image/card26.png");
		card27.setImage("/image/card27.png");
		card28.setImage("/image/card28.png");
		card29.setImage("/image/card29.png");
		card30.setImage("/image/card30.png");
		card31.setImage("/image/card31.png");
		card32.setImage("/image/card32.png");
		card33.setImage("/image/card33.png");
		card34.setImage("/image/card34.png");
		card35.setImage("/image/card35.png");
		card36.setImage("/image/card36.png");
		card37.setImage("/image/card37.png");
		card38.setImage("/image/card38.png");
		card39.setImage("/image/card39.png");
		
		card40.setImage("/image/card40.png");
		card41.setImage("/image/card41.png");
		card42.setImage("/image/card42.png");
		card43.setImage("/image/card43.png");
		card44.setImage("/image/card44.png");
		card45.setImage("/image/card45.png");
		card46.setImage("/image/card46.png");
		card47.setImage("/image/card47.png");
		card48.setImage("/image/card48.png");
		card49.setImage("/image/card49.png");
		card50.setImage("/image/card50.png");
		card51.setImage("/image/card51.png");
		
		VDeck.addElement(card1);
		VDeck.addElement(card2);
		VDeck.addElement(card3);
		VDeck.addElement(card4);
		VDeck.addElement(card5);
		VDeck.addElement(card6);
		VDeck.addElement(card7);
		VDeck.addElement(card8);
		VDeck.addElement(card9);
		VDeck.addElement(card10);
		VDeck.addElement(card11);
		VDeck.addElement(card12);
		VDeck.addElement(card13);
		VDeck.addElement(card14);
		VDeck.addElement(card15);
		VDeck.addElement(card16);
		VDeck.addElement(card17);
		VDeck.addElement(card18);
		VDeck.addElement(card19);
		VDeck.addElement(card20);
		VDeck.addElement(card21);
		VDeck.addElement(card22);
		VDeck.addElement(card23);
		VDeck.addElement(card24);
		VDeck.addElement(card25);
		VDeck.addElement(card26);
		VDeck.addElement(card27);
		VDeck.addElement(card28);
		VDeck.addElement(card29);
		VDeck.addElement(card30);
		VDeck.addElement(card31);
		VDeck.addElement(card32);
		VDeck.addElement(card33);
		VDeck.addElement(card34);
		VDeck.addElement(card35);
		VDeck.addElement(card36);
		VDeck.addElement(card37);
		VDeck.addElement(card38);
		VDeck.addElement(card39);
		
		getHighlvDeck().addElement(card40);
		getHighlvDeck().addElement(card51);
		getHighlvDeck().addElement(card41);
		getHighlvDeck().addElement(card42);
		getHighlvDeck().addElement(card5);
		getHighlvDeck().addElement(card43);
		getHighlvDeck().addElement(card7);
		getHighlvDeck().addElement(card8);
		getHighlvDeck().addElement(card9);
		getHighlvDeck().addElement(card10);
		getHighlvDeck().addElement(card11);
		getHighlvDeck().addElement(card12);
		getHighlvDeck().addElement(card13);
		getHighlvDeck().addElement(card44);
		getHighlvDeck().addElement(card15);
		getHighlvDeck().addElement(card45);
		getHighlvDeck().addElement(card46);
		getHighlvDeck().addElement(card18);
		getHighlvDeck().addElement(card19);
		getHighlvDeck().addElement(card47);
		getHighlvDeck().addElement(card21);
		getHighlvDeck().addElement(card22);
		getHighlvDeck().addElement(card23);
		getHighlvDeck().addElement(card24);
		getHighlvDeck().addElement(card25);
		getHighlvDeck().addElement(card26);
		getHighlvDeck().addElement(card27);
		getHighlvDeck().addElement(card28);
		getHighlvDeck().addElement(card29);
		getHighlvDeck().addElement(card30);
		getHighlvDeck().addElement(card48);
		getHighlvDeck().addElement(card49);
		getHighlvDeck().addElement(card33);
		getHighlvDeck().addElement(card50);
		getHighlvDeck().addElement(card35);
		getHighlvDeck().addElement(card36);
		getHighlvDeck().addElement(card37);
		getHighlvDeck().addElement(card38);
		getHighlvDeck().addElement(card39);
		
		
		// shuffle the deck
		Collections.shuffle(VDeck);
		Collections.shuffle(getHighlvDeck());
		
		player1.getVHumanHand().add(VDeck.get(0));
		player1.getVHumanHand().add(VDeck.get(1));
		player1.getVHumanHand().add(VDeck.get(2));
		player1.getVHumanHand().add(VDeck.get(3));
		player1.getVHumanHand().add(VDeck.get(4));
		player2.getVHumanHand().add(VDeck.get(0));
		player2.getVHumanHand().add(VDeck.get(1));
		player2.getVHumanHand().add(VDeck.get(2));
		player2.getVHumanHand().add(VDeck.get(3));
		player2.getVHumanHand().add(VDeck.get(4));
		player3.getVHumanHand().add(VDeck.get(0));
		player3.getVHumanHand().add(VDeck.get(1));
		player3.getVHumanHand().add(VDeck.get(2));
		player3.getVHumanHand().add(VDeck.get(3));
		player3.getVHumanHand().add(VDeck.get(4));		
		
		for(int i = 0; i < 5; i++){
			// remove 5 time at location 0 (remove the first one 5 time since vector will auto shift left
			VDeck.removeElementAt(0);
		}
		
	}
	
	// run the game until 1 player has 150 vp or human quit
	// each player get 3 turn per while loop
	/*
	public void Game(Initialize gameinstant, Room[] campus) {

		Room newroom = new Room(0,campus[0].GetNeighbor(),0,0,"room0", gameinstant.room0NeighborS);
		// game start
		boolean check = true;
		while(check == true){
			// game end when 1 of 3 hit 150 VP
			if(gameinstant.getHuman().GetVP() == 150 || gameinstant.getAI1().GetVP() == 150 || gameinstant.getAI2().GetVP() == 150){
				check = false;
			}		
			// ai1 turn 3 move
			for(int i = 0; i < 3; i++){
				// get array of neighbor
				int[] arrofNeighbor = gameinstant.getAI1().GetLocation().GetNeighbor();
				// if only 1 neighbor exist
				if(arrofNeighbor.length == 1){					
					// loop through the campus(array of room)
					// pick up the room that match the value
					for(int j = 0; j < campus.length; j++){
						if(arrofNeighbor[0] == campus[j].getvalue()){
							newroom = campus[j];
							break;
						}
					}
					// move to new room
					gameinstant.getAI1().Move(gameinstant.getAI1().Getmovevalue(), newroom);
					// decrease move value by 1
					//gameinstant.AI1.SetMoveValue(gameinstant.AI1.Getmovevalue()-1);
				}
				else{
					Random rand1 = new Random();
					int  neighborIndex = rand1.nextInt(arrofNeighbor.length - 1);
					// loop through the campus(array of room)
					// pick up the room that match the value
					for(int j = 0; j < campus.length; j++){
						if(arrofNeighbor[neighborIndex] == campus[j].getvalue()){
							newroom = campus[j];
							break;
						}
					}
					// move to new room
					gameinstant.getAI1().Move(gameinstant.getAI1().Getmovevalue(), newroom);
					// decrease move value by 1
					//gameinstant.AI1.SetMoveValue(gameinstant.AI1.Getmovevalue()-1);
				}
			}
			//reset the AI1 move value
			//gameinstant.AI1.SetMoveValue(3);
					
			// ai2 turn 3 move
			for(int i = 0; i < 3; i++){
				// get array of neighbor
				int[] arrofNeighbor = gameinstant.getAI2().GetLocation().GetNeighbor();
				// if only 1 neighbor exist
				if(arrofNeighbor.length == 1){					
					// loop through the campus(array of room)
					// pick up the room that match the value
					for(int j = 0; j < campus.length; j++){
						if(arrofNeighbor[0] == campus[j].getvalue()){
							newroom = campus[j];
							break;
						}
					}
					// move to new room
					gameinstant.getAI2().Move(gameinstant.getAI2().Getmovevalue(), newroom);
					// decrease move value by 1
					//gameinstant.AI2.SetMoveValue(gameinstant.AI2.Getmovevalue()-1);
				}
				else{
					Random rand1 = new Random();
					int  neighborIndex = rand1.nextInt(arrofNeighbor.length - 1);
					// loop through the campus(array of room)
					// pick up the room that match the value
					for(int j = 0; j < campus.length; j++){
						if(arrofNeighbor[neighborIndex] == campus[j].getvalue()){
							newroom = campus[j];
							break;
						}
					}
					// move to new room
					gameinstant.getAI2().Move(gameinstant.getAI2().Getmovevalue(), newroom);
					// decrease move value by 1
					//gameinstant.AI2.SetMoveValue(gameinstant.AI2.Getmovevalue()-1);
				}
			}
			//reset the AI1 move value
			//gameinstant.AI2.SetMoveValue(3);	
			check = false;
		}
		//gameinstant.human.SetMoveValue(3);
		//moveButton.enable(true);
		
		// once finish move now play card
		// get AI location then loop through the deck 
		// to find the room that match the location 
		// it can't find then play the card on top of the deck
		
		// the room that AI1 currently in after 3 move
		int AI1roomValue = gameinstant.getAI1().GetLocation().getvalue();
		// the room that AI2 currently in after 3 move
		int AI2roomValue = gameinstant.getAI2().GetLocation().getvalue();
		
		// AI1 playing turn
		// check is the deck empty if it is then copy discard deck to VDeck
		// the deck is empty after player draw and play
		if(gameinstant.getVDeck().isEmpty() == true){
			// copy the discarddeck over to VDeck then wipe discard deck
			for(int j1 = 0; j1 < gameinstant.getDiscardDeck().size(); j1++){
				gameinstant.getVDeck().addElement(gameinstant.getDiscardDeck().get(j1));
			}
			// shuffle the VDeck
			Collections.shuffle(gameinstant.getVDeck());
			// once finish adding VDeck then wipe the discardDeck
			gameinstant.getDiscardDeck().clear();
			// AI1 play
			for(int i12 = 0 ; i12 < gameinstant.getVDeck().size(); i12++){
				// if the AI1 room value match a card in the deck room value
				if(AI1roomValue == gameinstant.getVDeck().get(i12).getRoomofcard()){
					// play the card
					gameinstant.getVDeck().get(i12).play(gameinstant.getAI1());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(i12));
					// remove it from the deck
					gameinstant.getVDeck().remove(i12);
				}
				// no card in deck match AI current location
				else{
					// play the card on top
					gameinstant.getVDeck().get(0).play(gameinstant.getAI1());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
					// remove it from the deck
					gameinstant.getVDeck().remove(0);
				}
			}
		}
		// else the deck is not empty let AI1 search and play
		else{
			for(int i12 = 0 ; i12 < gameinstant.getVDeck().size(); i12++){
				// if the AI1 room value match a card in the deck room value
				if(AI1roomValue == gameinstant.getVDeck().get(i12).getRoomofcard()){
					// play the card
					gameinstant.getVDeck().get(i12).play(gameinstant.getAI1());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(i12));
					// remove it from the deck
					gameinstant.getVDeck().remove(i12);
				}
				// no card in deck match AI current location
				else{
					// play the card on top
					gameinstant.getVDeck().get(0).play(gameinstant.getAI1());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
					// remove it from the deck
					gameinstant.getVDeck().remove(0);
				}
			}
		}
		
		// AI2 playing turn
		// check is the deck empty if it is then copy discard deck to VDeck
		// the deck is empty after player draw and play
		if(gameinstant.getVDeck().isEmpty() == true){
			// copy the discarddeck over to VDeck then wipe discard deck
			for(int j2 = 0; j2 < gameinstant.getDiscardDeck().size(); j2++){
				gameinstant.getVDeck().addElement(gameinstant.getDiscardDeck().get(j2));
			}
			// shuffle the VDeck
			Collections.shuffle(gameinstant.getVDeck());
			// once finish adding VDeck then wipe the discardDeck
			gameinstant.getDiscardDeck().clear();
			// AI2 play
			for(int i21 = 0 ; i21 < gameinstant.getVDeck().size(); i21++){
				// if the AI2 room value match a card in the deck room value
				if(AI2roomValue == gameinstant.getVDeck().get(i21).getRoomofcard()){
					// play the card
					gameinstant.getVDeck().get(i21).play(gameinstant.getAI2());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(i21));
					// remove it from the deck
					gameinstant.getVDeck().remove(i21);
				}
				// no card in deck match AI2 current location
				else{
					// play the card on top
					gameinstant.getVDeck().get(0).play(gameinstant.getAI2());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
					// remove it from the deck
					gameinstant.getVDeck().remove(0);
				}
			}
		}
		// else the deck is not empty let AI1 search and play
		else{
			for(int i12 = 0 ; i12 < gameinstant.getVDeck().size(); i12++){
				// if the AI1 room value match a card in the deck room value
				if(AI2roomValue == gameinstant.getVDeck().get(i12).getRoomofcard()){
					// play the card
					gameinstant.getVDeck().get(i12).play(gameinstant.getAI2());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(i12));
					// remove it from the deck
					gameinstant.getVDeck().remove(i12);
				}
				// no card in deck match AI current location
				else{
					// play the card on top
					gameinstant.getVDeck().get(0).play(gameinstant.getAI2());
					// add it to discard deck
					gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
					// remove it from the deck
					gameinstant.getVDeck().remove(0);							
				}
			}
		}
		
		
	}
*/
	int[] getRoom0Neighbor() {
		return room0Neighbor;
	}

	void setRoom0Neighbor(int[] room0Neighbor) {
		this.room0Neighbor = room0Neighbor;
	}

	int[] getRoom1Neighbor() {
		return room1Neighbor;
	}

	void setRoom1Neighbor(int[] room1Neighbor) {
		this.room1Neighbor = room1Neighbor;
	}

	int[] getRoom2Neighbor() {
		return room2Neighbor;
	}

	void setRoom2Neighbor(int[] room2Neighbor) {
		this.room2Neighbor = room2Neighbor;
	}

	Player getHuman() {
		return human;
	}

	void setHuman(Player newhuman) {
		human = newhuman;
	}

	Player getAI1() {
		return AI1;
	}

	void setAI1(Player aI1) {
		AI1 = aI1;
	}

	Player getAI2() {
		return AI2;
	}

	void setAI2(Player aI2) {
		AI2 = aI2;
	}

	Player getPlayer1() {
		return player1;
	}

	void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	Player getPlayer2() {
		return player2;
	}

	void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	Player getPlayer3() {
		return player3;
	}

	void setPlayer3(Player player3) {
		this.player3 = player3;
	}

	Room[] getCampus() {
		return campus;
	}

	void setCampus(Room[] campus) {
		this.campus = campus;
	}

	//Card[] getDeck() {
	//	return deck;
	//}

	Vector<Card> getVDeck() {
		return VDeck;
	}

	void setVDeck(Vector<Card> vDeck) {
		VDeck = vDeck;
	}

	Vector<Card> getDiscardDeck() {
		return DiscardDeck;
	}

	void setDiscardDeck(Vector<Card> discardDeck) {
		DiscardDeck = discardDeck;
	}

	Vector<Card> getHighlvDeck() {
		return HighlvDeck;
	}

	void setHighlvDeck(Vector<Card> highlvDeck) {
		HighlvDeck = highlvDeck;
	}

}
