package entity;

import allEnum.SubjectName;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class ComProg extends Subject{
	
	//constructor
	public ComProg(double posX,double posY) {
		// TODO : change circle to image
		super(SubjectName.COMPROG, 1, posX, posY, "res/ComProg.png");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(GraphicsContext gc) {
		// TODO : adjust sizes
		gc.drawImage(this.img,getPosX(),getPosY(),4,4); //4 are sizes
		
		
	}

	@Override
	public Shoot shoot() {
		// TODO Auto-generated method stub
		return null;
	}



}
