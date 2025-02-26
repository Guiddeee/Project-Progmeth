package gameLogic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.event.*;
import javafx.scene.Cursor;
import resourceUtil.SubjectType;
import resourceUtil.getImage;
import thing.*;
public class Game extends Application {
	 //background
	 final static long bgWidth=5000;
	 final static long bgHeight=5000;
	 
	 //real display
	 private final static long WIDTH = 1280;
	 private final static long HEIGHT= 820;
	 //initiate display position
	 private double nowX = 0;
     private double nowY = 0;
	 
	//player set-up
    Player player=new Player(100, 3, 0, 0);
	final long playerX = (WIDTH - bgWidth) / 2;
    final long playerY = (HEIGHT - bgHeight) / 2;
    final Image playerImg=player.getImg();
    private final int playerSize = 30;
	
    //initiate entities
    ArrayList<Entity> entities = new ArrayList<>();
    ArrayList<Shoot> shoots = new ArrayList<>();
	
	
	 public void start(Stage primaryStage) {   
	     
		//pane for displaying things
		Pane root = new Pane();
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        canvas.setOnMouseEntered(e -> {
            canvas.setCursor(Cursor.CROSSHAIR);
        });
        root.getChildren().add(canvas);
	     
        //for rendering
        GraphicsContext gc = canvas.getGraphicsContext2D();
        
        //might have to modify if we create another scene
        Scene scene = new Scene(root, WIDTH, HEIGHT);
        
        
        
        // Game loop
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                update(canvas);
                render(gc);
            }
        };
        
        gameLoop.start();
        
        primaryStage.setTitle("CEDT Survival");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
	     
	 }
	 
	 private void update(Canvas canvas) {
		 
		 
		 //listen to user's WASD movement
		canvas.setOnKeyPressed(new EventHandler<KeyEvent>() {
			double dX = 0, dY = 0;
			@Override
			public void handle(KeyEvent e) {
				if(e.getCode()==KeyCode.W) {
					System.out.println("w");//
					dY=player.getSpeed();
				}
				if(e.getCode()==KeyCode.S){
					dY= -1*player.getSpeed();
					System.out.println("s");//
				}
				if(e.getCode()==KeyCode.A){
					dX = -1* player.getSpeed();
					System.out.println("a");//
				}
				if(e.getCode()==KeyCode.D){
					dX = player.getSpeed();
					System.out.println("d");//
				}
				for (Entity entity : entities) {
					((Entity)entity).move(dX, dY);
		        }
			}
			
		});
		
		
		 
	 }
	 private void render(GraphicsContext gc) {
		 
		 //fill display
		 gc.setFill(Color.BEIGE);
	     gc.fillRect(0, 0, WIDTH, HEIGHT);
		 
		 //draw player
		 gc.drawImage(playerImg, playerX - playerSize/2, playerY - playerSize/2, playerSize, playerSize);
		 
	 }
	 
	 //MAIN*******************************************
	 public static void main(String[] args) {
	        launch(args);
	    }

	
	 //***********************************************
	 //Getter----------------------------------------------------------------------------------------------------------
	 public double getNowX() {
			return nowX;
		}


	public double getNowY() {
		return nowY;
	}

	public static long getBgWidth() {
		return bgWidth;
	}

	public static long getBgHeight() {
		return bgHeight;
	}

	public static long getWIDTH() {
		return WIDTH;
	}

	public static long getHEIGHT() {
		return HEIGHT;
	}
	 
}
