
public class AcadBlock extends CampusBuilding{
	
	private ClassRoom[] classRooms;
	static int MAX_NUMBER_OF_CLASS_ROOMS = 200;
	// numberOOfRooms
	// name
	public AcadBlock(java.lang.String name) {
		
		super(name);
		classRooms = new ClassRoom[MAX_NUMBER_OF_CLASS_ROOMS];
	}
	
	public boolean addClassRoom​(ClassRoom classRoom) {
		
		if (numberOfRooms < MAX_NUMBER_OF_CLASS_ROOMS)
		{
			classRooms[numberOfRooms] = classRoom;
			numberOfRooms++;
			return true;
		}
		return false;
	}
	
	public int calculateMaintenanceCost​() {
		
		int res = 0;
		for (int i=0;i<numberOfRooms;i++)
			res += classRooms[i].calculateMaintenanceCost​();
		return res;
	}
}
