package thing;

import javafx.scene.image.Image;

public abstract class Entity {
	protected int health;
	protected int posX;
	protected int posY;
	protected int speed;
	protected String name;
	protected String description;
	protected Image img;
	
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

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
