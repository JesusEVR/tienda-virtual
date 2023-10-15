/**
 * Clase que define la información del articulo Ventilador
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Ventilador implements Articulo{
	
	/**
         * Constructor por omision del articulo Ventilador
         *
         */
	public Lavadora(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 2400;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Ventilador con 4 niveles de intensidad"+"\n"+ "	Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ED302";
	}
}
