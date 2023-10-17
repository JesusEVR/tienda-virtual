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
	
	protected LinkedList<Object> listaElectrodomesticos;

	/**
	* Constructor por omisión que inicializa el catálogo 
	*/
	public CatalogoElectrodomestico(){
		listaElectrodomesticos = new LinkedList<>();
		Articulo a1 = new Lavadora();
		agregarArticulo((Object)a1);
		Articulo a2 = new Microondas();
		agregarArticulo((Object)a2);
		Articulo a3 = new Ventilador();
		agregarArticulo((Object)a3);
		Articulo a4 = new Refrigerador();
		agregarArticulo((Object)a4);
		Articulo a5 = new Aspiradora();
		agregarArticulo((Object)a5);
	}

	/**
	 * Método que agrega un artículo a la lista
	 */
	public void agregarArticulo(Object a){
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