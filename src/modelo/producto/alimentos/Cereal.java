package modelo.producto.alimentos;
import modelo.producto.Articulo;

/**
 * Clase que define la información del articulo Cereal
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Cereal implements Articulo{

	/**
         * Constructor por omision del articulo cereal
         *
         */
	public Cereal(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 57;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Caja de cereal CochoPiscris"+"\n"+ "        Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL101";
	}
}
