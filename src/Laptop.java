/**
 * Clase que define la información del articulo Laptop
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Laptop implements Articulo{
	
	/**
         * Constructor por omision del articulo Laptop
         *
         */
	public Laptop(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 17999;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Laptop Gaming Terobo 3i 6ta"+"\n"+ "   Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ET201";
	}
}
