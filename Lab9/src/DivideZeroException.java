
public class DivideZeroException extends java.lang.Exception{

	public DivideZeroException(java.lang.String type) {
		
		super("Cannot calculate average cost because number of " + type + " are insufficient");
	}
}
