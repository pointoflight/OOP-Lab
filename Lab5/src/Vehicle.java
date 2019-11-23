
public abstract class Vehicle {
	
	protected int numWheels;
	protected java.lang.String name;
	protected int length;
	protected int width;
	protected int cost;
	
	public Vehicle(java.lang.String name, int length, int width, int cost) {
		
		this.name = name;
		this.length = length;
		this.width = width;
		this.cost = cost;
	}
	
	public abstract boolean verifyValidity();
	
	public abstract java.lang.String getInfo();
	
	public java.lang.String toString(){
		
		return name + " [" + length + "x" + width + "] (" + cost + ")";
	}
}
