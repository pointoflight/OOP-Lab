
public class Hostel extends CampusBuilding{
	
	private HostelRoom[] hostelRooms;
	static int MAX_NUMBER_OF_HOSTEL_ROOMS = 100;
	// name , numberOfrooms
	
	public Hostel(java.lang.String name) {
		
		super(name);
		hostelRooms = new HostelRoom[MAX_NUMBER_OF_HOSTEL_ROOMS];
		numberOfRooms = 0;
	}
	
	public boolean addHostelRoom​(HostelRoom hostelRoom) {
		
		if (numberOfRooms < MAX_NUMBER_OF_HOSTEL_ROOMS)      //// mistake did super.numberOfRoms check other places also
		{
			hostelRooms[numberOfRooms] = hostelRoom;
			numberOfRooms++;
			return true;
		}
		return false;
	}
	
	public int calculateMaintenanceCost​() {
		
		int res = 0;
		for(int i=0;i<numberOfRooms;i++)
			res += hostelRooms[i].calculateMaintenanceCost​();
		return res;
	}
}
