package ex4_5.sources.exceptions;


public class NonEmptyTreeException extends RuntimeException{
	
	private static final long serialVersionUID = -9044404123135297730L;

	public NonEmptyTreeException(String menssage) {
    	super(menssage); 
    }
}
