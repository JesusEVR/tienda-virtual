import java.util.LinkedList;
import java.util.Iterator;

/**
* Clase que define la característica del catálogo Electrodoméstico
*
*@author paolasanv
*@author Supr-Lilito
*@author JesusEVR
*
*/
public class CatalogoElectronica implements Catalogo{
	
	protected LinkedList<Articulo> listaElectronica;

	/**
	* Constructor por omisión que inicializa el catálogo 
	*/
	public CatalogoElectronica(){
		listaElectronica = new LinkedList<Articulo>();
		Articulo a1 = new Laptop();
		agregarArticulo(a1);
		Articulo a2 = new Celular();
		agregarArticulo(a2);
		Articulo a3 = new Consola();
		agregarArticulo(a3);
		Articulo a4 = new Impresora();
		agregarArticulo(a4);
	}

	/**
	 * Método que agrega un artículo a la lista
	 */
	public void agregarArticulo(Articulo a){
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