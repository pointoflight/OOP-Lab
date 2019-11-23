
public class Race {
	
	private Team[] teams;
	private java.lang.String raceType;
	private int numTeams;
	public static final int MAX_TEAMS = 10;
	
	public Race(java.lang.String raceType) {
		
		this.raceType = raceType;
		this.teams = new Team[MAX_TEAMS];
		this.numTeams = 0;
	}
	
	public boolean addTeam(Team team) {
		
		if (numTeams < MAX_TEAMS)
		{
			if (team.verifyValidity(raceType))
			{
				this.teams[numTeams] = team;
				numTeams++;
				team.getDriver().participateInNewRace();
				return true;
			}
			else
				return false;
		}
		else
			return false;
			
	}
	
	public Team findWinner() {
		
		Team res = teams[0];
		int skill = teams[0].getTeamSkill();
		
		for (int i=0;i<numTeams;i++)
		{
			if (skill < teams[i].getTeamSkill())
			{
				skill = teams[i].getTeamSkill();
				res = teams[i];
			}
		}
		
		return res;
	}
	
}
