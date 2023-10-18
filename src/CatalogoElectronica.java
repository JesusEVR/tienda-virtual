import java.util.LinkedList;
import java.util.Iterator;

/**
 * Clase que define la característica del catálogo Electrodoméstico
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 *
 */
public class CatalogoElectronica implements Catalogo{
	protected LinkedList<Object> listaElectronica;

	/**
	 * Constructor por omisión que inicializa el catálogo 
	 */
	public CatalogoElectronica(){
		listaElectronica = new LinkedList<>();
		Articulo a1 = new Television();
		agregarArticulo((Object)a1);
		Articulo a2 = new Laptop();
		agregarArticulo((Object)a2);
		Articulo a3 = new Consola();
		agregarArticulo((Object)a3);
		Articulo a4 = new Impresora();
		agregarArticulo((Object)a4);
		Articulo a5 = new Celular();
		agregarArticulo((Object)a5);
	}

	/**
	 * Método que agrega un artículo a la lista
	 */
	public void agregarArticulo(Object a){
		listaElectronica.add(a);
	}

	/**
	 * Metodo que crea un iterador para recorrer los elementos del catálogo
	 *
	 * @return iterador
	 */
	public Iterator creaIterador(){
		return new IteradorLista(listaElectronica);
	}

}
