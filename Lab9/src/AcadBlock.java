public   class   AcadBlock   extends   CampusBuilding  { 
	private  ClassRoom[] classRooms;
	static   int  MAX_NUMBER_OF_CLASS_ROOMS =  200 ;
	
	public   AcadBlock (String name) { 
		super (name);
		classRooms =  new ClassRoom[MAX_NUMBER_OF_CLASS_ROOMS];
	}
	
	public   void   addClassRoom (ClassRoom classRoom) throws MaximumCapacityException{ 
		/*
		Add class room to AcadBlock and throw MaximumCapacityException
		when number of class rooms exceed the maximum limit
		*/
		if (numberOfRooms >= MAX_NUMBER_OF_CLASS_ROOMS)
		{
			throw new MaximumCapacityException("ClassRoom", super.getName());
		}
		else
		{
			classRooms[numberOfRooms] = classRoom;
			numberOfRooms++;
		}
	}

	public   int   calculateRepairingCost () { 
		int  cost =  0 ;
		for (ClassRoom classRoom: classRooms) 
			if (classRoom !=  null )
                    cost +=classRoom.calculateRepairingCost();
		return  cost; 
	}
	
	public   float   calculateAverageRepairingCost ()  throws DivideZeroException{ 
		float avgCost = 0;
		/*
		Complete the function to calculate the average cost and throw DivideZeroException
		when divided by 0
		*/
//		for (int i=0;i<classRooms.length;i++)
//			avgCost += (float)(classRooms[i].calculateRepairingCost());
		if (numberOfRooms == 0)
			throw new DivideZeroException("ClassRoom");
		else
		{
			avgCost = (float)calculateRepairingCost();
			avgCost /= numberOfRooms;
			return avgCost;
		}
	}
}