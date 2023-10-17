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
public class CatalogoAlimento implements Catalogo{
	
	protected LinkedList<Articulo> listaAlimento;

	/**
	* Constructor por omisión que inicializa el catálogo 
	*/
	public CatalogoAlimento(){
		listaAlimento = new LinkedList<Articulo>();
		Articulo a1 = new Pan();
		agregarArticulo(a1);
		Articulo a2 = new Cereal();
		agregarArticulo(a2);
		Articulo a3 = new CajaDeGalletas();
		agregarArticulo(a3);
		Articulo a4 = new Queso();
		agregarArticulo(a4);
		Articulo a5 = new Gelatina();
		agregarArticulo(a5);
		Articulo a6 = new Arroz();
		agregarArticulo(a6);
		Articulo a7 = new Helado();
		agregarArticulo(a7);
	}

	/**
	 * Método que agrega un artículo a la lista
	 */
	public void agregarArticulo(Articulo a){
		listaAlimento.add(a);
	}

	/**
	* Metodo que crea un iterador para recorrer los elementos del catálogo
	*
	* @return iterador
	*/
	public Iterator creaIterador(){
		return new IteradorLista(listaAlimento);
	}


}