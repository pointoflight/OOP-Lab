package extracurriculars;

public class Department extends java.lang.Object implements Organization {
	
	private static java.lang.String name;
	private int sessionCountPerWeek;
	private int budget;
	private int memberCount;
	private int maxMemberCount;
	
	
	public Department(java.lang.String name, int sessionCountPerWeek, int memberCount) {
		
		this.budget = 0;
		this.sessionCountPerWeek = sessionCountPerWeek;
		this.maxMemberCount = 30*sessionCountPerWeek;
		this.memberCount = memberCount;
		Department.name = name;
	}
	
	public static java.lang.String getName(){
		return name;
	}
	
	public int getSessionCountPerWeek() {
		return sessionCountPerWeek;
	}
	
	public int getMemberCount() {
		
		return memberCount;
	}
	
	public int calculateBudget() {
		
		budget=5000*sessionCountPerWeek*memberCount;
		return budget;
	}
	
	public boolean addNewMember() {
		
		if (memberCount < maxMemberCount)
		{
			memberCount++;
			return true;
		}
		return false;
	}
	
	
	
	
}
