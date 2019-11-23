public class Room {

	private int length;
	private int breadth;
	private int height;
	private int no_of_broken_lights;
	private int no_of_broken_fans;
	private int no_of_broken_tables;
	
	public Room(int length, int breadth, int height, int broken_lights, int broken_fans, int broken_tables) {
		/*
		Set the relevant fields and in case of invalid (negative) input, 
		throw relevant exceptions i.e InvalidDimensionException and InvalidBrokenAppliances 
		*/
	}

	public int calculateRepairingCost(){
		return (1*no_of_broken_lights + 2*no_of_broken_fans + 3*no_of_broken_tables);
	}
}