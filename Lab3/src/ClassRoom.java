
public class ClassRoom extends Room{
	
	private boolean isAcOn;
	private boolean areLightsOn;
	
	public ClassRoom(int length, int breadth, int height) {
		
		super(length,breadth,height);
		isAcOn = false;
		areLightsOn = false;
	}
	
	public void flipApplianceState​(java.lang.String appliance) {
		
		if(appliance.equals("AC"))
		{
			if (isAcOn == true)
				isAcOn = false;
			else
				isAcOn = true;
		}
		if (appliance.equals("Lights"))
		{
			if (areLightsOn == true)
				areLightsOn = false;
			else
				areLightsOn = true;
		}
	}
	
	public int calculateMaintenanceCost​() {
		
		int res = super.calculateMaintenanceCost​();
		if (isAcOn == true)
			res += 10;
		if (areLightsOn == true)
			res +=5;
		return res;
	}
	// methods = getsurfacearea, getvolume
	
}
