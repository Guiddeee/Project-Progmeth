package thing;

public class Grader extends AttackItem {
	public Grader(String description,int damage) {
		super("Grader", description, damage, false);
	}

	@Override
	public void pickUp(Player p) {
		//add + 1 grader to inventory
		
	}
}
