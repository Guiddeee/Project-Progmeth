package thing;

public abstract class Entity {
	protected int health;
	protected int posX;
	protected int posY;
	protected int speed;
	
	public Entity(int health,int posX,int posY,int speed) {
		setHealth(health);
		setPosX(posX);
		setPosY(posY);
		setSpeed(speed);
	};
	
	//METHODS
	public abstract void move();
	public abstract void die();
	public abstract void render();

	//getter setter
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
