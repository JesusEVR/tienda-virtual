/**
 * Clase que define la información del articulo Impresora
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Impresora implements Articulo{
	
	/**
         * Constructor por omision del articulo Impresora
         *
         */
	public Impresora(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 3499;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Impresora laser PH con 3 cartuchos extra"+"\n"+ "	Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ET203";
	}
}
