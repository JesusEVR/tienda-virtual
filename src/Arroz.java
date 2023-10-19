/**
 * Clase que define la información del articulo Arroz
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Arroz implements Articulo{

	/**
         * Constructor por omision del articulo arroz
         *
         */
	public Arroz(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 27;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Paquete de Arroz SoS (1 kg)"+"\n"+ "        Precio: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "AL105";
	}
}
