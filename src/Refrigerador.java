/**
 * Clase que define la información del articulo Refrigerador
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Refrigerador implements Articulo{
	
	/**
   * Constructor por omision del articulo Refrigerador
   *
   */
	public Refrigerador(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 7990;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Refrigerador automatico de 10 pies cubicos"+"\n"+ "	Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ED303";
	}
}
