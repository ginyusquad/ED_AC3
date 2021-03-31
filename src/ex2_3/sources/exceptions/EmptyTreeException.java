package ex2_3.sources.exceptions;


public class EmptyTreeException extends RuntimeException{
	
	private static final long serialVersionUID = 7326879520376297792L;

	public EmptyTreeException(String message) { 
		super(message); 
	}
}
