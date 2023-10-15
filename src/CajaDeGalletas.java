/**
 * Clase que define la información del articulo Caja de Galletas
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class CajaDeGalletas implements Articulo{

	/**
         * Constructor por omision del articulo CajaDeGalletas
         *
         */
	public CajaDeGalletas(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 67;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Caja de galletas de chocolate"+"\n"+ "	Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL102";
	}
}
