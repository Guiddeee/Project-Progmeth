package thing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Shoot {
	protected double posX;
	protected double posY;
	protected double dX;
	protected double dY;
	protected int speed;
	protected int damage;
	protected Image img;
	
	//Constructor
	Shoot(double posX2,double posY2,int dX,int dY,int damage){
		this.posX=posX2;
		this.posY=posY2;
		this.damage=damage;
		this.dX=dX;
		this.dY=dY;
	}
	
	//Methods
	public void move() {
		//////////////////////////////////
	}
	
	public void render(GraphicsContext gc) {
		gc.drawImage(img,posX,posY);
	}

	
	
	
	
	
	//getter setter
	public double getPosX() {
		return posX;
	}

	public void setPosX(double posX) {
		this.posX = posX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double posY) {
		this.posY = posY;
	}

	public double getdX() {
		return dX;
	}

	public void setdX(double dX) {
		this.dX = dX;
	}

	public double getdY() {
		return dY;
	}

	public void setdY(double dY) {
		this.dY = dY;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Image getImg() {
		return img;
	}

	public void setImg(Image img) {
		this.img = img;
	}
	
	
	
	
}
