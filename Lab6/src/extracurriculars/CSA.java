package extracurriculars;

public class CSA {
	
	private Organization[] orgList;
	private int orgCount;
	private static final int MAX_NO_OF_ORGANIZATIONS = 30;
	
	public CSA() {
		
		orgList = new Organization[MAX_NO_OF_ORGANIZATIONS];
		orgCount = 0;
	}
	
	public boolean createNewOrganization​(Organization o) {
		
		if (orgCount < MAX_NO_OF_ORGANIZATIONS)
		{
			this.orgList[orgCount] = o;
			orgCount++;
			return true;
		}
		return false;
	}
	
	public int allocateBudget() {
		
		int res = 0;
		for (int i=0;i<orgCount;i++)
			res+=orgList[i].calculateBudget();
		return res;
	}
	
	
	

}
