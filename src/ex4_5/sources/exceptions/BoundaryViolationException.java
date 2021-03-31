package ex4_5.sources.exceptions;


public class BoundaryViolationException extends RuntimeException{
	
	private static final long serialVersionUID = 3116591173615883546L;

	public BoundaryViolationException(String menssage) {
    	super(menssage); 
    }
    
}
