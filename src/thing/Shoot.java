package thing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Shoot {
	protected int posX;
	protected int posY;
	protected int dX;
	protected int dY;
	protected int speed;
	protected int damage;
	protected Image img;
	
	//Constructor
	Shoot(int posX,int posY,int dX,int dY,int damage){
		this.posX=posX;
		this.posY=posY;
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

	public int getdX() {
		return dX;
	}

	public void setdX(int dX) {
		this.dX = dX;
	}

	public int getdY() {
		return dY;
	}

	public void setdY(int dY) {
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
