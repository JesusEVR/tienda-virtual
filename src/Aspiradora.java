/**
 * Clase que define la información del articulo Aspiradora
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Aspiradora implements Articulo{
	
	/**
         * Constructor por omision del articulo Lavadora
         *
         */
	public Aspiradora(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 1599;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Aspiradora silenciosa de gran potencia"+"\n"+ "	Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ED304";
	}
}
