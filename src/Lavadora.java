/**
 * Clase que define la información del articulo Lavadora
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Lavadora implements Articulo{
	
	/**
         * Constructor por omision del articulo Lavadora
         *
         */
	public Lavadora(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 5999;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Lavadora con secado express integrado"+"\n"+ "	Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ED300";
	}
}
