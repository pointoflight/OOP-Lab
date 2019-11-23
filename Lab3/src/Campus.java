
public class Campus {

	private static java.lang.String name;
	private int hostelCount;
	private Hostel[] hostels;
	private AcadBlock acadBlock;
	static int MAX_NUMBER_OF_HOSTELS = 10;
	
	public Campus(java.lang.String name, AcadBlock acadBlock) {
		
		this.name = name;
		this.acadBlock = acadBlock;
		hostelCount = 0;
		hostels = new Hostel[MAX_NUMBER_OF_HOSTELS];
	}
	
	public static java.lang.String getName​(){
		
		return name;
	}
	
	public boolean addHostel​(java.lang.String hostelName) {
		
		if (hostelCount < MAX_NUMBER_OF_HOSTELS)
		{
			Hostel r = new Hostel(name);
			hostels[hostelCount] = r;
			hostelCount++;
			return true;
		}
		return false;
	}
	
	public int calculateCampusMaintenance​() {
		
		int res = 0;
		for (int i=0;i<hostelCount;i++)
			res += hostels[i].calculateMaintenanceCost​();
		res += acadBlock.calculateMaintenanceCost​();
		return res;
	}


}
