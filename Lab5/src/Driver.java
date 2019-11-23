
public class Driver extends RacePerson {

	private int points;
	private int numRacesParticipated;
	public static final int MAX_RACES = 20;
	public static final int MIN_AGE = 20;
	public static final int MIN_POINTS = 5;
	
	public Driver(java.lang.String name, int age, int ID, int points, int numRacesParticipated) {
		
		super(name, age, ID);
		this.points = points;
		this.numRacesParticipated = numRacesParticipated;
		int skill = (points*100)/numRacesParticipated;
		this.skill = skill;
	}
	
	public void participateInNewRace() {
		
		numRacesParticipated++;
		this.skill = (points*100)/numRacesParticipated;
	}
	
	public boolean verifyValidity() {
		
		if (this.age >= MIN_AGE && this.points >= MIN_POINTS && numRacesParticipated < MAX_RACES)
			return true;
		return false;
	}
	
	public void calculateSkill() {
		
		this.skill = (points*100)/numRacesParticipated;
	}
	
	public java.lang.String getInfo(){
		
		String s = super.toString() + "\n" + "Points : " + points + "\n" + "No. of races attempted : " + numRacesParticipated;
		return s;
	}
	
	
	
}
