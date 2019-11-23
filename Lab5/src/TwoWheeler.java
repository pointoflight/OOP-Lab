
public class TwoWheeler extends Vehicle {
	
	public static final int TWO_WHEELER_MAX_LENGTH = 10;
	public static final int TWO_WHEELER_MAX_WIDTH = 3;
	public static final int TWO_WHEELER_MAX_COST = 15;
	
	public TwoWheeler(java.lang.String name, int length, int width, int cost) {
		
		super(name, length, width, cost);
		numWheels = 2;
	}
	
	public boolean verifyValidity() {
		
		if (this.length <= TWO_WHEELER_MAX_LENGTH && this.width <= TWO_WHEELER_MAX_WIDTH && this.cost <= TWO_WHEELER_MAX_COST)
			return true;
		return false;
	}
	
	public java.lang.String getInfo(){
		
		String s = super.toString() + "\n" + "Wheels : " + this.numWheels;
		return s;
	}
	
}
