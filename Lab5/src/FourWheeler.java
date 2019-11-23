
public class FourWheeler extends Vehicle {
	
	public static final int FOUR_WHEELER_MAX_LENGTH = 20;
	public static final int FOUR_WHEELER_MAX_WIDTH = 10;
	public static final int FOUR_WHEELER_MAX_COST = 45;
	
	public FourWheeler(java.lang.String name, int length, int width, int cost) {
		
		super(name, length, width, cost);
		numWheels = 4;
	}

	public boolean verifyValidity() {
		
		if (this.length <= FOUR_WHEELER_MAX_LENGTH && this.width <= FOUR_WHEELER_MAX_WIDTH && this.cost <= FOUR_WHEELER_MAX_COST)
			return true;
		return false;
	}
	
	public java.lang.String getInfo(){
		
		String s = super.toString() + "\n" + "Wheels : " + this.numWheels;
		return s;
	}
	
}
