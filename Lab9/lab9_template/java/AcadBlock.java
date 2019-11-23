public   class   AcadBlock   extends   CampusBuilding  { 
	private  ClassRoom[] classRooms;
	static   int  MAX_NUMBER_OF_CLASS_ROOMS =  200 ;
	
	public   AcadBlock (String name) { 
		super (name);
		classRooms =  new ClassRoom[MAX_NUMBER_OF_CLASS_ROOMS];
	}
	
	public   void   addClassRoom (ClassRoom classRoom) { 
		/*
		Add class room to AcadBlock and throw MaximumCapacityException
		when number of class rooms exceed the maximum limit
		*/
	}

	public   int   calculateRepairingCost () { 
		int  cost =  0 ;
		for (ClassRoom classRoom: classRooms) 
			if (classRoom !=  null )
                    cost +=classRoom.calculateRepairingCost();
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