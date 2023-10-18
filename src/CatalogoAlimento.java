import java.util.LinkedList;
import java.util.Iterator;

/**
 * Clase que define la característica del catálogo Electrodoméstico
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public class CatalogoAlimento implements Catalogo{
	protected LinkedList<Object> listaAlimento;

	/**
	 * Constructor por omisión que inicializa el catálogo 
	 */
	public CatalogoAlimento(){
		listaAlimento = new LinkedList<>();
		Articulo a1 = new Pan();
		agregarArticulo((Object) a1);
		Articulo a2 = new Cereal();
		agregarArticulo((Object)a2);
		Articulo a3 = new CajaDeGalletas();
		agregarArticulo((Object)a3);
		Articulo a4 = new Queso();
		agregarArticulo((Object)a4);
		Articulo a5 = new Gelatina();
		agregarArticulo((Object)a5);
		Articulo a6 = new Arroz();
		agregarArticulo((Object)a6);
		Articulo a7 = new Helado();
		agregarArticulo((Object)a7);
	}

	/**
	 * Método que agrega un artículo a la lista
	 */
	public void agregarArticulo(Object a){
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
