package ex4_5.sources.exceptions;


public class EmptyTreeException extends RuntimeException{
	
	private static final long serialVersionUID = 8329974479476038402L;

	public EmptyTreeException(String menssage) {
    	super(menssage);
    }
    
}
