package ex2_3.sources.exceptions;


public class InvalidPositionException extends RuntimeException {
	
	private static final long serialVersionUID = 8771661693845446194L;

	public InvalidPositionException(String message) { 
		super(message); 
	}
}