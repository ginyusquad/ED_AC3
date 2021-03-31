package ex2_3.sources.exceptions;


public class BoundaryViolationException extends RuntimeException{

	private static final long serialVersionUID = -4875697273586928551L;

	public BoundaryViolationException(String message) { 
    	super(message);
    }
    
}
