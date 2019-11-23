package extracurriculars;

public class Club extends java.lang.Object implements Organization {
	
	private static java.lang.String name;
	private int eventCount;
	private int budget;
	private int memberCount;
	private static final int MAX_NO_OF_MEMBERS = 40;
	
	public Club(java.lang.String name, int eventCount, int memberCount) {
		
		Club.name = name;
		this.eventCount = eventCount;
		this.memberCount = memberCount;
		this.budget = 0;
	}
	
	public static java.lang.String getName(){
		return name;
	}
	
	public int getEventCount() {
		return eventCount;
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public int calculateBudget() {
		
		budget=3000*eventCount*memberCount;
		return budget;
	}
	
	public boolean addNewMember() {
		
		if (memberCount < MAX_NO_OF_MEMBERS)
		{
			memberCount++;
			return true;
		}
		return false;
	}
	
	
	
	
}
