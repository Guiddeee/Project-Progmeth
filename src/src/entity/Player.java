package entity;

public class Player {
	//stats
	private double health;
	private double speed;
	
	//items
	private int paper;
	private int grader;
	private int mouse;
	private int keyboard;
	private int withdraw;
	
	//------------------------------------------------------------
	
	//constructor
	public Player(double health,double speed,int withdraw) {
		// TODO Auto-generated constructor stub
		this.health=health;
		this.speed=speed;
		this.grader=0;
		this.paper=0;
		this.mouse=0;
		this.keyboard=0;
		this.withdraw=withdraw; //from last term
		
		
	}
	
	//Method------------------------------------------------------
	public Shoot attack(boolean ispaper) {
		//TODO : do something to find player position to use it as starting point for the bullet
		double playerX;
		double playerY;
		//TODO : set toX,Y using GameUtil.getShootAt()
		double toX; 
		double toY;
		
		
		double dX;
		double dY;
		dX=toX- (playerX); 
		dY=toY- (playerY);
		double vectorsize=Math.sqrt(dX*dX + dY*dY);
		dX=dX/vectorsize;
		dY=dY/vectorsize;
		if(ispaper) {
			//TODO: change shoot to PaperShoot or GraderShoot (havent implemented)
			return new Shoot(playerX,playerY,dX,dY);
		}
		else {
			return new Shoot(playerX,playerY,dX,dY);
		}
	}
	
	public void withdraw() {
		//TODO : withdraw logic. decrease withdraw of the player
		//will be called when GameUtil.withdraw() is called
	}

	
	//-------------------------------------------------------------
	
	//getter setter
	//TODO : give some domain values to the setters
	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}

	public int getGrader() {
		return grader;
	}

	public void setGrader(int grader) {
		this.grader = grader;
	}

	public int getMouse() {
		return mouse;
	}

	public void setMouse(int mouse) {
		this.mouse = mouse;
	}

	public int getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(int keyboard) {
		this.keyboard = keyboard;
	}

	public int getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	
	

}
