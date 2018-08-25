import java.util.Vector;


public class Player {
	private	String m_Name;
	private	Room	m_Location;
	private int m_VP;
	private int m_Learning;
	private int m_Craft;
	private int m_Integrity;
	private int m_movevalue;
	private Card m_playedcard;
	private boolean ishighlv;
	
	// this is the number for the card to tell who is invoking it
	// human = 0, AI1 = 1, AI2 = 2
	private int IdentifycationNumber;
	//private Card[] humanHand = {};
	private Vector<Card> VHumanHand = new Vector<Card>();
	
	public Player(String name, Room location, int vp,
			int learning, int craft, int integrity, int step){
		m_Name = name;
		m_Location = location;
		m_VP = vp;
		m_Learning = learning;
		m_Craft = craft;
		m_Integrity = integrity;
		m_movevalue = step;
		ishighlv = false;
	}
	// get function
	public String GetName(){
		return m_Name;
	}
	
	public Room GetLocation(){
		return m_Location;
	}
	
	public int GetVP(){
		return m_VP;
	}
	
	public int GetLearning(){
		return m_Learning;
	}
	
	public int GetCraft(){
		return m_Craft;
	}
	
	public int GetIntegrity(){
		return m_Integrity;
	}
	public int Getmovevalue(){
		return m_movevalue;
	}
	
	// set function
	public void SetMoveValue(int value){
		m_movevalue = value;
	}
	
	public void SetName(String newName){
		m_Name = newName;
	}
	
	public void SetLocation(Room currentLoc){
		m_Location = currentLoc;
	}
	
	public void SetVP(int value){
		m_VP = value;
	}
	
	public void SetLearning(int value){
		m_Learning = value;
	}
	
	public void SetCraft(int value){
		m_Craft = value;
	}
	
	public void SetIntegrity(int value){
		m_Integrity = value;
	}
	
	// move
	public void Move(int numberOfStep, Room newLoc){
		if(numberOfStep > 3 || numberOfStep < 0){
			System.out.println("wrong movement");
		}
		else{
			m_Location = newLoc;
		}
	}
	/*
	Card[] getHumanHand() {
		return humanHand;
	}
	void setHumanHand(Card[] humanHand) {
		this.humanHand = humanHand;
	}
	*/
	Vector<Card> getVHumanHand() {
		return VHumanHand;
	}
	void setVHumanHand(Vector<Card> vHumanHand) {
		VHumanHand = vHumanHand;
	}
	Card getM_playedcard() {
		return m_playedcard;
	}
	void setM_playedcard(Card m_playedcard) {
		this.m_playedcard = m_playedcard;
	}
	int getIdentifycationNumber() {
		return IdentifycationNumber;
	}
	void setIdentifycationNumber(int identifycationNumber) {
		IdentifycationNumber = identifycationNumber;
	}
	boolean isIshighlv() {
		return ishighlv;
	}
	void setIshighlv(boolean ishighlv) {
		this.ishighlv = ishighlv;
	}
}
