package thing;

public class Paper extends AttackItem{
	public Paper(String description,int damage) {
		super("Paper", description, damage, true);
	}

	@Override
	public void pickUp(Player p) {
		//add + paper to inventory
		
	}
	
}
