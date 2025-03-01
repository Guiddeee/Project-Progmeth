package gameLogic;

import java.util.ArrayList;

import entity.Player;
import interfaces.*;
import javafx.application.Platform;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class GameUtil {
	public void withdraw(Player player,double startWithdraw,double endWithdraw) {
		//TODO : withdraw logic
		Thread withdraw=new Thread() {
			@Override
			public void run() {
				if(getCurrentTime()>=startWithdraw && getCurrentTime()<endWithdraw) {
					
					player.withdraw();
				}
			}
		};
	}
	
	public double getCurrentTime() {
		double time=0;
		//TODO:assign time as current game time 
		return time;
	};

	
	
	public void moveAll(ArrayList<movable> movingThings) {
		Thread moveThread=new Thread() {
			@Override
			public void run() {
				//TODO: help me
//				while(game not end)
//					for(movable i:movingThings) {
//						i.move();
//					}
//					try {
//						Thread.sleep(30);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
			}
			
		};
		
		moveThread.start();
		
	}
	
	public void renderAll(ArrayList<movable> things,GraphicsContext gc) {
		Thread renderThread=new Thread() {
			@Override
			public void run() {
				//TODO: help me
//				while(game not end)
//				Platform.runLater(new Runnable() {
//					@Override
//					public void run() {
//						for(movable i:things) {
//							i.render(gc);
//						}
//						
//					}
//				});
//				try {
//					Thread.sleep(30);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
			}
		};
		renderThread.start();
	}
	
	public double[] getShootAt(Canvas canvas,Player player) {
		//TODO : get mouse position
		
		Thread getAim=new Thread() {
			@Override
			public void run() {
//				TODO : help
//				while(game not end)
	//				double[] mousePos = new double[2]; //[0] x , [1] y
	//				if(check if the key Q is pressed){
						
//						add the "Shoot" created by "player.attack(true) " to the Shoot
					}
	//				return  mousePos;
			}
		};
		getAim.start();
		
	}

}
