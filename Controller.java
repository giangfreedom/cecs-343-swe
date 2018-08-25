import java.util.Collections;
import java.util.Random;


public class Controller {
	// run the game until 1 player has 150 vp or human quit
	// each player get 3 turn per while loop
	// public static void Game(Initialize gameinstant, Room[] campus)
	public Controller()	{
		
	}
	public void Game(Initialize gameinstant, Room[] campus) {
		int counterForSearchingCard = 0;
		int indexForSearchCard = 0;
		Room newroom = new Room(0,campus[0].GetNeighbor(),0,0,"room0", campus[0].getneighborString());
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
		
		//===================================================================================================
		
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
			// set the card success status back to false
			for(int j2 = 0; j2 < gameinstant.getVDeck().size(); j2++){
				gameinstant.getVDeck().get(j2).setSuccess(false);
			}
			// shuffle the VDeck
			Collections.shuffle(gameinstant.getVDeck());
			// once finish adding VDeck then wipe the discardDeck
			gameinstant.getDiscardDeck().clear();
			// AI1 play
			for(int i12 = 0 ; i12 < gameinstant.getVDeck().size(); i12++){
				// if the AI1 room value match a card in the deck room value
				if(AI1roomValue == gameinstant.getVDeck().get(i12).getRoomofcard()){
					counterForSearchingCard = 1;
					indexForSearchCard = i12;
					break;
				}		
			}
			if(counterForSearchingCard == 1){
				// play the card
				gameinstant.getVDeck().get(indexForSearchCard).play(gameinstant.getAI1(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(indexForSearchCard));
				// update played card for AI1 to display at text area 2
				gameinstant.getAI1().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(indexForSearchCard);
			}
			else{
				// play the card on top
				gameinstant.getVDeck().get(0).play(gameinstant.getAI1(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
				// update played card for AI1 to display at text area 2
				gameinstant.getAI1().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(0);
			}
			counterForSearchingCard = 0;
			indexForSearchCard = 0;			
		}
		// else the deck is not empty let AI1 search and play
		else{
			for(int i12 = 0 ; i12 < gameinstant.getVDeck().size(); i12++){
				// if the AI1 room value match a card in the deck room value
				if(AI1roomValue == gameinstant.getVDeck().get(i12).getRoomofcard()){
					counterForSearchingCard = 1;
					indexForSearchCard = i12;
					break;
				}			
			}
			if(counterForSearchingCard == 1){
				// play the card
				gameinstant.getVDeck().get(indexForSearchCard).play(gameinstant.getAI1(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(indexForSearchCard));
				// update played card for AI1 to display at text area 2
				gameinstant.getAI1().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(indexForSearchCard);
			}
			else{
				// play the card on top
				gameinstant.getVDeck().get(0).play(gameinstant.getAI1(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
				// update played card for AI1 to display at text area 2
				gameinstant.getAI1().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(0);
			}
			counterForSearchingCard = 0;
			indexForSearchCard = 0;
		}
		
		// AI2 playing turn
		// check is the deck empty if it is then copy discard deck to VDeck
		// the deck is empty after player draw and play
		if(gameinstant.getVDeck().isEmpty() == true){
			// copy the discarddeck over to VDeck then wipe discard deck
			for(int j2 = 0; j2 < gameinstant.getDiscardDeck().size(); j2++){
				gameinstant.getVDeck().addElement(gameinstant.getDiscardDeck().get(j2));
			}
			// set the card success status back to false
			for(int j3 = 0; j3 < gameinstant.getVDeck().size(); j3++){
				gameinstant.getVDeck().get(j3).setSuccess(false);
			}		
			// shuffle the VDeck
			Collections.shuffle(gameinstant.getVDeck());
			// once finish adding VDeck then wipe the discardDeck
			gameinstant.getDiscardDeck().clear();
			// AI2 play
			for(int i21 = 0 ; i21 < gameinstant.getVDeck().size(); i21++){
				if(AI2roomValue == gameinstant.getVDeck().get(i21).getRoomofcard()){
					counterForSearchingCard = 1;
					indexForSearchCard = i21;
					break;
				}		
			}
			if(counterForSearchingCard == 1){
				// play the card
				gameinstant.getVDeck().get(indexForSearchCard).play(gameinstant.getAI2(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(indexForSearchCard));
				// update played card for AI2 to display at text area 2
				gameinstant.getAI2().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(indexForSearchCard);
			}
			else{
				// play the card on top
				gameinstant.getVDeck().get(0).play(gameinstant.getAI2(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
				// update played card for AI2 to display at text area 2
				gameinstant.getAI2().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(0);
			}
			counterForSearchingCard = 0;
			indexForSearchCard = 0;			
		}
		// else the deck is not empty let AI1 search and play
		else{
			for(int i21 = 0 ; i21 < gameinstant.getVDeck().size(); i21++){
				if(AI2roomValue == gameinstant.getVDeck().get(i21).getRoomofcard()){
					counterForSearchingCard = 1;
					indexForSearchCard = i21;
					break;
				}		
			}
			if(counterForSearchingCard == 1){
				// play the card
				gameinstant.getVDeck().get(indexForSearchCard).play(gameinstant.getAI2(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(indexForSearchCard));
				// update played card for AI2 to display at text area 2
				gameinstant.getAI2().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(indexForSearchCard);
			}
			else{
				// play the card on top
				gameinstant.getVDeck().get(0).play(gameinstant.getAI2(),gameinstant.getDiscardDeck(), gameinstant.getVDeck());
				// add it to discard deck
				gameinstant.getDiscardDeck().addElement(gameinstant.getVDeck().get(0));
				// update played card for AI2 to display at text area 2
				gameinstant.getAI2().setM_playedcard(gameinstant.getVDeck().get(indexForSearchCard));
				// remove it from the deck
				gameinstant.getVDeck().remove(0);
			}
			counterForSearchingCard = 0;
			indexForSearchCard = 0;						
		}				
	}
}
