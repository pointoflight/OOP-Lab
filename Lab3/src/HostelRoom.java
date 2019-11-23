
public class HostelRoom extends Room{
	
	private boolean[] workingAppliances;
	static int NUMBER_OF_APPLIANCES = 3;
	
	public HostelRoom(int length, int breadth, int height) {
		
		super(length,breadth,height);
		workingAppliances = new boolean[NUMBER_OF_APPLIANCES];
		for (int i=0;i<3;i++)
			workingAppliances[i] = false;
	}
	
	public void setStateOfAppliances​(java.lang.String state) {
		
		String s = state.toLowerCase();
		if (s.equals("true,true,true"))
		{
			workingAppliances[0] = true;
			workingAppliances[1] = true;
			workingAppliances[2] = true;
		}
		if (s.equals("true,true,false"))
		{
			workingAppliances[0] = true;
			workingAppliances[1] = true;
			workingAppliances[2] = false;
		}
		if (s.equals("true,false,true"))
		{
			workingAppliances[0] = true;
			workingAppliances[1] = false;
			workingAppliances[2] = true;
		}
		if (s.equals("false,true,true"))
		{
			workingAppliances[0] = false;
			workingAppliances[1] = true;
			workingAppliances[2] = true;
		}
		if (s.equals("true,false,false"))
		{
			workingAppliances[0] = true;
			workingAppliances[1] = false;
			workingAppliances[2] = false;
		}
		if (s.equals("false,true,false"))
		{
			workingAppliances[0] = false;
			workingAppliances[1] = true;
			workingAppliances[2] = false;
		}
		if (s.equals("false,false,true"))
		{
			workingAppliances[0] = false;
			workingAppliances[1] = false;
			workingAppliances[2] = true;
		}
		if (s.equals("false,false,false"))
		{
			workingAppliances[0] = false;
			workingAppliances[1] = false;
			workingAppliances[2] = false;
		}
	}
	
	public int calculateMaintenanceCost​() {
		
		int res = super.calculateMaintenanceCost​();
		if (workingAppliances[0] == false)
			res += 5;
		if (workingAppliances[1] == false)
			res += 3;
		if (workingAppliances[2] == false)
			res += 2;
		return res;
	}
	

}
