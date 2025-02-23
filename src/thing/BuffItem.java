package thing;

public abstract class BuffItem extends Item{
	protected int buffTime;
	protected boolean isMouse;
	
	//Constructor
	public BuffItem(String name,String description,int buffTime,boolean isMouse) {
		super(name, description);
		this.isMouse=isMouse;
	}
	
}
