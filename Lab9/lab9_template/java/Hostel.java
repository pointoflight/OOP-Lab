public class Hostel extends CampusBuilding  { 
	
	private HostelRoom[] hostelRooms;
	static int  MAX_NUMBER_OF_HOSTEL_ROOMS =  100 ;
	
	public   Hostel (String name) { 
		super (name);
		hostelRooms =  new HostelRoom[MAX_NUMBER_OF_HOSTEL_ROOMS];
	}

	public void addHostelRoom (HostelRoom hostelRoom) { 
		/*
		Add hostel room to Hostel and throw MaximumCapacityException
		when number of hostel rooms exceed the maximum limit
		*/

	}

	public   int   calculateRepairingCost () { 
		int  cost =  0 ;
		for (HostelRoom hostelRoom: hostelRooms) 
			if (hostelRoom !=  null )
                cost +=hostelRoom.calculateRepairingCost();
		return  cost; 
	}

	public   float   calculateAverageRepairingCost () { 
		float avgCost;
		/*
		Complete the function to calculate the average cost and throw DivideZeroException
		when divided by 0
		*/
		return avgCost;
	}
	
}