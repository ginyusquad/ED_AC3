package ex2_3.sources;


import java.util.NoSuchElementException;
import java.util.Iterator;

public class ElementIterator<E> implements Iterator<E> {
	
	protected PositionList<E> lista;
	
	protected Position<E> ponteiro;
	
	public ElementIterator(PositionList<E> list) {
		lista = list;
		
		if(lista.isEmpty())ponteiro = null;
		else ponteiro = lista.first();
		
	}
	// Verifica se existe um elemento há diante
	public boolean hasNext() { return (ponteiro != null); }
	
	public E next() throws NoSuchElementException {
		E retorno = null;
		
		if (ponteiro == null) throw new NoSuchElementException("No next element");
		retorno = ponteiro.element();
		ponteiro = (ponteiro == lista.last()) ? null : lista.next(ponteiro);
		
		return retorno;
	}
	
}
