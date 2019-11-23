
public class MaximumCapacityException extends Exception{

	public MaximumCapacityException(java.lang.String type, java.lang.String name) {
		
		super(type + " capacity limit reached in " + name);
	}
}
