/**
 * Clase que define la información del articulo Helado
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Helado implements Articulo{

	/**
         * Constructor por omision del articulo helado
         *
         */
	public Helado(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 83;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Helado Chocosabroso (1.5 L)"+"\n"+ "   Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL106";
	}
}
