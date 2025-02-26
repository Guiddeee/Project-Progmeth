package thing;

public class HR extends Entity {
	private int damage;
	private Player target;
	
	//Constructor
	public HR(int health,int speed,int posX,int posY,int damage) {
		super(health, posX, posY, speed);
		this.setDamage(damage);
		this.setTarget(target);
	}

	//Methods
	public void takeDamage(Shoot shoot) {
		//setHealth(getHealth()-shoot.getDamage());
	}
	public Shoot shoot(Player target) {
		int dX=0;//////*****************************
		int dY=0;//////*****************************
		return new Shoot(posX,posY,dX,dY,getDamage());
	}
	

	@Override
	public void render() {
		// TODO Auto-generated method stub
		
	}
	
	public void die() {
		
	}
	
	
	//getter setter
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Player getTarget() {
		return target;
	}
	public void setTarget(Player target) {
		this.target = target;
	}

	
	
	
	
}
