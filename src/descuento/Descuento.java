package descuento;
import modelo.producto.Articulo;

/**
 * Clase abstracta que permite aplicar descuentos a los productos de la tienda CheemsMart.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public abstract class Descuento implements Articulo{
	/**
	 * Artículo al que se le aplicara el descuento
	 */
	protected Articulo centro;

	/**
         * Constructor por parametros
         *
	 * @param centro El articulo que recibira un descuento en su precio
         */
	public Descuento (Articulo centro){
		this.centro = centro;
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return centro.precio();
	}

	/**
	 * Devuelve una cadena con la información del articulo
	 */
	public String informacion(){
		return centro.informacion();
	}
	
	/**
	 * Devuelve el codigo de barras del articulo
	 */
	public String codigoBarras(){
		return centro.codigoBarras();
	}
	
}
