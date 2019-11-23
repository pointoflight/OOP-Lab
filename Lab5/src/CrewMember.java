
public class CrewMember extends RacePerson {
	
	private int experience;
	public static int MIN_AGE = 20;
	public static int MIN_EXPERIENCE = 2;
	
	public CrewMember(java.lang.String name, int age, int ID, int experience) {
		
		super(name, age, ID);
		this.experience = experience;
		calculateSkill();
	}
	
	public boolean verifyValidity() {
		
		if (this.age >= MIN_AGE && this.experience >= MIN_EXPERIENCE)
			return true;
		return false;
	}
	
	public void calculateSkill() {
		
		this.skill = (experience*100/age);
	}
	
	public java.lang.String getInfo(){
		
		String s = super.toString() + "\n" + "Experience : " + experience;
		return s;
	}
	
	
	
}
