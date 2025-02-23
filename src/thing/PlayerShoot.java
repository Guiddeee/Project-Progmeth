package thing;

public class PlayerShoot extends Shoot{
	private boolean isPaper;
	
	//Con
		public PlayerShoot(int posX,int posY,int dX,int dY,int damage,boolean isPaper) {
			super(posX, posY, dX, dY, damage);
			this.isPaper=isPaper;
			//setImg(img); **************************
		}
}
