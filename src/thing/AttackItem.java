package thing;

public abstract class AttackItem extends Item{
	protected int damage;
	protected boolean isPaper;

	//Constructor
	public AttackItem(String name,String description,int damage,boolean isPaper) {
	super(name,description);
	this.damage=damage;
	this.isPaper=isPaper;
	}

}
