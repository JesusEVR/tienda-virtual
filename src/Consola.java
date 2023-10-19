/**
 * Clase que define la información del articulo Consola
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Consola implements Articulo{
	
	/**
         * Constructor por omision del articulo Consola
         *
         */
	public Consola(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 14999;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: PlayStiercol 6"+"\n"+ "   Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ET202";
	}
}
