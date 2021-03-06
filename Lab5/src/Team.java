
public class Team {
	
	private Driver driver;
	private CrewMember crewMember;
	private Vehicle vehicle;
	private int teamSkill;
	
	public Team(Driver driver, CrewMember crewMember, FourWheeler fourWheeler) {
		
		this.driver = driver;
		this.crewMember = crewMember;
		this.vehicle = fourWheeler;
		calculateTeamSkill();
	}
	
	Team(Driver driver, CrewMember crewMember, TwoWheeler twoWheeler){
		
		this.driver = driver;
		this.crewMember = crewMember;
		this.vehicle = twoWheeler;
		// assign skill?
	}
	
	public Driver getDriver() {
		return this.driver;
	}
	
	public int getTeamSkill() {
		
		return teamSkill;
	}
	
	public boolean verifyValidity(java.lang.String raceType) {
		
		if (raceType.equals("TwoWheeler"))
		{
			if (driver.verifyValidity() && crewMember.verifyValidity() && vehicle.verifyValidity())
			{
				if (vehicle.numWheels == 2)
					return true;
				else
					return false;
			}
			
		}
		else //if (raceType.equals("FourWheeler"))
		{
			if (driver.verifyValidity() && crewMember.verifyValidity() && vehicle.verifyValidity())
			{
				if (vehicle.numWheels == 4)
					return true;
				else
					return false;
			}
		}
		return false;
	}
	
	public void calculateTeamSkill() {
		
		teamSkill = 5*driver.getSkill() + 2*crewMember.getSkill();
	}
}
