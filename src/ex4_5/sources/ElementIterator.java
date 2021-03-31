package ex4_5.sources;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ElementIterator<E> implements Iterator<E> {
	
    private PositionList<E> lista;
    private Position<E> ponteiro;
    
    public ElementIterator(PositionList<E> list) {
    	
        lista = list;
        if((lista.isEmpty()))ponteiro = null;
        else ponteiro = lista.first();
    }

    public boolean hasNext() {
        return (ponteiro != null);
    }

    public E next() throws NoSuchElementException {
    	E retorno = null;
        if (ponteiro == null) {
            throw new NoSuchElementException("No next element");
        }
        retorno = ponteiro.element();
        
        if((ponteiro == lista.last()))ponteiro = null; 
        else ponteiro =  lista.next(ponteiro);
        
        return retorno;
    }

}
