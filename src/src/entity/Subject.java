package entity;

import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import allEnum.SubjectName;
import interfaces.*;

public abstract class Subject implements movable{
	protected double posX;
	protected double posY;
	protected double speed;
	protected SubjectName name;
	protected Image img;

	//constructor
	public Subject(SubjectName name,double speed,double posX,double posY,String img) {
		this.name=name;
		this.posX=posX;
		this.posY=posY;
		this.speed=speed;
		this.img=new Image(ClassLoader.getSystemResource(img).toString());;
	}
	
	//METHODS--------------------------------------------------
	//move() from interface
	//render() from interface
	
	public abstract Shoot shoot(); //return the bullet
	//---------------------------------------------------------
	
	
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

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	

}
