package ex4_5.sources.exceptions;


public class InvalidPositionException extends RuntimeException{
	
	private static final long serialVersionUID = -1732052936682050690L;

	public InvalidPositionException(String menssage) {
    	super(menssage);
    }
}
