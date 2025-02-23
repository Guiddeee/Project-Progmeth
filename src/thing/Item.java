package thing;

public abstract class Item {
	protected String name;
	protected String description;
	
	//Constructor
	public Item(String name,String description) {
		setDescription(description);
		setName(name);
	}

	//Methods
	public abstract void pickUp(Player p);
	
	
	
	
	
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
