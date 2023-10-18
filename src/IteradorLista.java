import java.util.LinkedList;
import java.util.Iterator;
/**
 * Clase que implementa un iterador para lista de artículos del catálogo.
 * 
 * @author Supr-Lilito
 * @author paolasanv
 * @author JesusEVR
 * @version septiembre 2023
 *
 */

public class IteradorLista implements Iterator{
	public LinkedList<Object> lista;

	Iterator it;

	/**
         * Constructor de la clase IteradorLista.
         * 
         * @param lista Lista de artículos del catálogo
         */
	public IteradorLista(LinkedList<Object> lista){
		this.lista = lista;
		it = lista.iterator();
	}

	@Override
	public boolean hasNext(){
		return it.hasNext();
	}

	@Override 
	public Object next(){
		return it.next();
	}

	@Override
	public void remove(){
		it.remove();
	}
}
