/**
 * Clase que define la información del articulo Television
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Television implements Articulo{
	
	/**
         * Constructor por omision del articulo Television
         *
         */
	public Television(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 7999;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Television de 55 pulgadas"+"\n"+ "   Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ET200";
	}
}
