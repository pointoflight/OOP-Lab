
public class InvalidBrokenAppliances extends java.lang.Exception{

	private int no_of_broken_fans;
	private int no_of_broken_tables;
	private int no_of_broken_lights;
	
	public InvalidBrokenAppliances(int broken_lights, int broken_fans, int broken_tables) {
		
		this.no_of_broken_fans = broken_fans;
		this.no_of_broken_lights = broken_lights;
		this.no_of_broken_tables = broken_tables;
	}
	
	public java.lang.String getMessage(){
		
		if (no_of_broken_fans < 0 || no_of_broken_lights < 0 || no_of_broken_tables < 0)
			return "Number of broken appliances invalid.";
		return "";
	}
}
