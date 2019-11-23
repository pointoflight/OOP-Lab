public class ClassRoom extends Room {

	private boolean isAcOn;
	private boolean areLightsOn;

	public ClassRoom(int length, int breadth, int height, int broken_lights, int broken_fans, int broken_tables) throws InvalidDimensionException, InvalidBrokenAppliances {
		/*
		Complete the constructor. By default bot AC and Lights are off. 
		In case negative number/ zero is passed as an argument 
		throw the relevant exception i.e InvalidDimensionException or InvalidBrokenAppliances
		*/
		super(length, breadth, height, broken_lights, broken_fans, broken_tables);
		isAcOn = false;
		areLightsOn = false;
	}

	public void flipApplianceState(String appliance)  throws invalidDeviceException{

		/*
		Complete the function to flip the state of appliance. If given appliance is not known
		then throw InvalidDeviceException
		*/
		if (!appliance.equals("AC") && !appliance.equals("Lights"))
			throw new invalidDeviceException("ClassRoom", appliance);
		else
		{
			if (appliance.equals("AC"))
				isAcOn = !isAcOn;
			else if (appliance.equals("Lights"))
				areLightsOn = !areLightsOn;
		}
		
	}

}