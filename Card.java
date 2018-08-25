import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public abstract class Card {
	// value that represent the room that the card need to be play in
	protected int roomofcard;
	protected String c_name;
	protected String c_reward;
	protected String c_RoomName;
	protected String c_penalty;
	
	ArrayList<Integer>	locations = new ArrayList();
	
	boolean activationStatus;
	protected boolean success;
	Image	img;
	
	protected int c_learning;
	protected int c_craft;
	protected int c_integrity;
	
	public Card(){
		setC_name("");
		setC_reward("");
		setC_RoomName("");
		setC_penalty("no penalty");
		
		img = null;
		c_learning = 0;
		c_craft = 0;
		c_integrity = 0;
		success = false;
		activationStatus = false;	
	}
	
	public abstract void play(Player p, Vector<Card> discardDeck, Vector<Card> VDeck);
	
	public void setImage(String image){
		try{
			//img = ImageIO.read(new File(image));
			img = new ImageIcon(this.getClass().getResource(image)).getImage();
		}catch(Exception e){
			
		}
	}
	public Image getImage(){
		return img;
	}

	String getC_name() {
		return c_name;
	}

	void setC_name(String c_name) {
		this.c_name = c_name;
	}

	String getC_reward() {
		return c_reward;
	}

	void setC_reward(String c_reward) {
		this.c_reward = c_reward;
	}

	String getC_RoomName() {
		return c_RoomName;
	}

	void setC_RoomName(String c_RoomName) {
		this.c_RoomName = c_RoomName;
	}

	String getC_penalty() {
		return c_penalty;
	}

	void setC_penalty(String c_penalty) {
		this.c_penalty = c_penalty;
	}

	int getC_integrity() {
		return c_integrity;
	}

	void setC_integrity(int c_integrity) {
		this.c_integrity = c_integrity;
	}

	int getC_craft() {
		return c_craft;
	}

	void setC_craft(int c_craft) {
		this.c_craft = c_craft;
	}

	int getC_learning() {
		return c_learning;
	}

	void setC_learning(int c_learning) {
		this.c_learning = c_learning;
	}

	int getRoomofcard() {
		return roomofcard;
	}

	void setRoomofcard(int roomofcard) {
		this.roomofcard = roomofcard;
	}

	boolean isSuccess() {
		return success;
	}

	void setSuccess(boolean success) {
		this.success = success;
	}

}
