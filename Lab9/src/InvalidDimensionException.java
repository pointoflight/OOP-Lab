
public class InvalidDimensionException extends Exception {
	
	private int length, width, height;
	
	public InvalidDimensionException(int length, int width, int height) {
		this.length=length;
		this.width=width;
		this.height=height;
	}
	@Override
	public String getMessage() {
		return "Invalid dimensions given.";
	}
}
