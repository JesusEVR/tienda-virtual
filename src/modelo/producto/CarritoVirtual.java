package modelo.producto;
import java.util.LinkedList;
/**
 * Clase que define el comportamiento del carrito de compras virtual
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class CarritoVirtual implements Articulo{
	/**
	 * Lista de artículos que el usuario desea comprar
	 */
	private LinkedList<Articulo> listaDeCompras = new LinkedList<>();

	/**
	 * Devuelve el precio del artículo, en este caso, el precio total 
         * de todos los productos dentro del carrito.
         *
	 * @return precio El precio total de los articulos elegidos
	 */
	public double precio(){
		double precio = 0;
		for(Articulo a : listaDeCompras){
			precio += a.precio();
		}
		return precio;
	}
	
	/**
	 * Devuelve la informacion del artículo, en este caso, los datos
         * de cada uno de los productos dentro del carrito.
         *
	 * @return articulos La informacion de todos los articulos elegidos
	 */
	public String informacion(){
		String articulos = "";
		for(Articulo a : listaDeCompras){
			articulos += a.informacion()+ "\n";
		}
		return articulos;
	}
	
	/**
	 * Devuelve el codigo de barras del artículo. Es '0' por defecto para el carrito.
         *
	 */
	public String codigoBarras(){ 
		return "0";
	}

	/**
	 * Agrega un articulo dentro del carrito de compra.
         *
	 */
	public void agregarArticulo(Articulo a){
		listaDeCompras.add(a);
	}

	/**
	 * Remueve todos los productos dentro del carrito virtual.
	 */
	public void vaciarCarrito(){
		listaDeCompras.clear();
	}

	/**
	 * Metodo que verifica si el carrito virtual tiene un producto dentro de él.
         * 
         * @return 'true' si el carrito virtual tiene un artículo dentro, 'false' en el caso contrario
	 */
	public boolean tieneArticulo(){
		return listaDeCompras.size()!=0;
	}
}
