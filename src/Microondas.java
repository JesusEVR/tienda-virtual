/**
 * Clase que define la información del articulo Microondas
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Microondas implements Articulo{
	
	/**
   * Constructor por omision del articulo Microondas
   *
   */
	public Microondas(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 3699;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Microondas Premium con calentador veloz"+"\n"+ "	Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ED301";
	}
}
