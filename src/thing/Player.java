package thing;

public class Player extends Entity{
	private int graderAttack;
	private int paperAttack;
	
	//Constructor
	public Player(int health,int speed,int posX,int posY) {
		super(health, posX, posY, speed);
		setGraderAttack(0);
		setPaperAttack(0);
	}

	//Methods

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	public void takeDamage() {
		
	}
	
	public void shoot(boolean isPaper) {
		// new Shooter();
		if(isPaper) setPaperAttack(getPaperAttack()-1);
		else setGraderAttack(getGraderAttack()-1);
	}
	
	
	
	//getter setter
	public int getGraderAttack() {
		return graderAttack;
	}

	public void setGraderAttack(int graderAttack) {
		this.graderAttack = graderAttack;
	}

	public int getPaperAttack() {
		return paperAttack;
	}

	public void setPaperAttack(int paperAttack) {
		this.paperAttack = paperAttack;
	}



	
	
	
}
