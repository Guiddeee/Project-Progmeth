package thing;

import resourceUtil.SubjectType;

public class Subject extends Entity{
	private SubjectType Subjectname;
	private Player target;
	private DropItem dropItem;
	private int term;
	private boolean isGrade;
	private boolean isPaperAttack;
	private boolean isGraderAttack;
	
	
	//Constructor
	public Subject(int health,int speed,int posX,int posY,SubjectType name,String description,int term,
            	   boolean isGrade,boolean isPaperAttack,boolean isGraderAttack) {
		
		super(health,speed,posX,posY);
		setName("Subject");
		setSubject(name);
		setDescription(description);
		setTerm(term);
		setGrade(isGrade);
		setPaperAttack(isPaperAttack);
		setGraderAttack(isGraderAttack);
		//setDropItem(new DropItem(isGrade));
		//this.img=
	}

	//Methods
	@Override
	public void move() {
		
	}

	@Override
	public void die() {
		
		
	}

	@Override
	public void render() {
		
		
	}
	
	public void takeDamage(Shoot shoot) {
		//setHealth(getHealth()-shoot.getDamage());
	}
	
	public Shoot shoot(Player target) {
		
	}
	
	
	
	
	//Getter setter
	@Override
	public String getName() {
		return getName()+" "+this.Subjectname.toString()  ;
	}
	
	public void setSubject(SubjectType name) {
		this.Subjectname = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public DropItem getDropItem() {
		return dropItem;
	}
	public void setDropItem(DropItem dropItem) {
		this.dropItem = dropItem;
	}

	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}

	public boolean isGrade() {
		return isGrade;
	}
	public void setGrade(boolean isGrade) {
		this.isGrade = isGrade;
	}

	public boolean isPaperAttack() {
		return isPaperAttack;
	}
	public void setPaperAttack(boolean isPaperAttack) {
		this.isPaperAttack = isPaperAttack;
	}

	public boolean isGraderAttack() {
		return isGraderAttack;
	}
	public void setGraderAttack(boolean isGraderAttack) {
		this.isGraderAttack = isGraderAttack;
	}

	
}
