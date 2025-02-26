package thing;

import javafx.scene.image.Image;
import gameLogic.*;
public abstract class Entity {
	protected int health;
	protected double posX;
	protected double posY;
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
	public void move(double moveX,double moveY) {
		double dx = (Game.getWIDTH() / 2) - moveX;
        double dy = (Game.getHEIGHT() / 2) - moveY;
        double length = Math.sqrt(dx * dx + dy * dy);
        dx=dx/length;
        dy=dy/length;
        this.posX=(posX+dx*this.speed);
        this.posY=(posY+dy*this.speed);
        
	}
	
	public abstract void die();
	public abstract void render();

	//getter setter
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health>=0) this.health = health;
		else 		  this.health=0;
	}
	
	public double getPosX() {
		return posX;
	}
	public void setPosX(double d) {
		this.posX = d;
	}

	public double getPosY() {
		return posY;
	}
	public void setPosY(double posY) {
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
	public Image getImg() {
		return img;
	}

	
	
}
