
public abstract class RacePerson {

	protected java.lang.String name;
	protected int age;
	protected int ID;
	protected int skill;
	
	public RacePerson(java.lang.String name, int age, int ID) {
		
		this.name = name;
		this.age = age;
		this.ID = ID;
	}
	
	public int getSkill() {
		return skill;
	}
	
	public abstract boolean verifyValidity();
	
	public abstract void calculateSkill();
	
	public abstract java.lang.String getInfo();
	
	public java.lang.String toString(){
		
		return ID + " " + name + " " + "(" + age + " yrs)";  
	}
	
		
	
}
