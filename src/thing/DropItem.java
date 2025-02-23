package thing;

public class DropItem extends Item {
	private boolean isGrade;
	
	//Constructor
	public DropItem(String description,boolean isGrade) {
		super("Dropped Item", description);
		this.isGrade=isGrade;
		
	}
	
	//Methods
	
	public void pickUp(Player p) {
		//////////////
	}

}
