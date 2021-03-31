package ex2_3.sources.exceptions;


public class EmptyListException extends RuntimeException{
	
	private static final long serialVersionUID = -1476342781673574051L;

	public EmptyListException(String message) { 
    	super(message); 
    }
}
