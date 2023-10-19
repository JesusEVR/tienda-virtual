/**
 * Clase que define la información del articulo Pan
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Pan implements Articulo{

	/**
         * Constructor por omision del articulo Pan
         *
         */
	public Pan(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 25;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Pan de caja integral"+"\n"+ "        Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL100";
	}
}
