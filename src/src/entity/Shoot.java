package entity;

import interfaces.movable;

public abstract class Shoot implements movable {
	//spawn point
	public double shootX;
	public double shootY;
	
	//direction vector
	public double dX;
	public double dY;
	
	//constructor
	public Shoot(double x,double y,double dx,double dy) {
		this.shootX=x;
		this.shootY=y;
		this.dX=dx;
		this.dY=dy;
	}
	
	//METHOD--------------------------------------------------
	public abstract void move();
	public abstract void render();
	public abstract void hit(); //input: hit who,  output: call the setHealth of the object this hit
	//--------------------------------------------------------
	
	//getter setter
	

}
