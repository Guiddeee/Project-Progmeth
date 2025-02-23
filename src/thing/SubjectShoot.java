package thing;

public class SubjectShoot extends Shoot{
	private boolean isGrade;
	
	//Con
	public SubjectShoot(int posX,int posY,int dX,int dY,int damage,boolean isGrade) {
		super(posX, posY, dX, dY, damage);
		this.isGrade=isGrade;
		//setImg(img); **************************
	}
}
