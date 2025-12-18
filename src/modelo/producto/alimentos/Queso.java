package modelo.producto.alimentos;
import modelo.producto.Articulo;

/**
 * Clase que define la información del articulo Queso
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Queso implements Articulo{

	/**
         * Constructor por omision del articulo queso
         *
         */
	public Queso(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 35;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Queso Panela de los Volcanes (700 gramos)"+"\n"+ "        Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL103";
	}
}
