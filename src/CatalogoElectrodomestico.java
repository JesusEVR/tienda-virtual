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
public class CatalogoElectrodomestico implements Catalogo{
	
	protected LinkedList<Articulo> listaElectrodomesticos;

	/**
	* Constructor por omisión que inicializa el catálogo 
	*/
	public CatalogoElectrodomestico(){
		listaElectrodomesticos = new LinkedList<Articulo>();
		Articulo a1 = new Aspiradora();
		agregarArticulo(a1);
		Articulo a2 = new Refrigerador();
		agregarArticulo(a2);
		Articulo a3 = new Ventilador();
		agregarArticulo(a3);
		Articulo a4 = new Microondas();
		agregarArticulo(a4);
		Articulo a5 = new Lavadora();
		agregarArticulo(a5);
		Articulo a6 = new Television();
		agregarArticulo(a6);
	}

	/**
	 * Método que agrega un artículo a la lista
	 */
	public void agregarArticulo(Articulo a){
		listaElectrodomesticos.add(a);
	}

	/**
	* Metodo que crea un iterador para recorrer los elementos del catálogo
	*
	* @return iterador
	*/
	public Iterator creaIterador(){
		return new IteradorLista(listaElectrodomesticos);
	}


}