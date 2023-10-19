/**
 * Clase que define la información del articulo Gelatina
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Gelatina implements Articulo{

	/**
         * Constructor por omision del articulo gelatina
         *
         */
	public Gelatina(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 29;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Paquete de 4 gelatinas"+"\n"+ "        Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL104";
	}
}
