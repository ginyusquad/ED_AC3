package ex4_5.sources.exceptions;


public class EmptyListException extends RuntimeException{
	
	private static final long serialVersionUID = -1541407367587834467L;

	public EmptyListException(String menssage) {
    	super(menssage); 
    }
}
