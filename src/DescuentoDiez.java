/**
 * Clase que permite aplicar un diez porciento 
 * de descuento a un artículo
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 * @see Descuento
 *
 */
public class DescuentoDiez extends Descuento{

	/**
         * Constructor por parametros
         *
	 * @param centro El articulo que recibira un descuento en su precio
         */
	public DescuentoDiez(Articulo centro){
		super(centro);
	}

	/**
	 * Devuelve el precio del artículo con el descuento aplicado
	 */
	public double precio(){
		double nuevoPrecio = 0.9 * centro.precio();
		return nuevoPrecio;
	}

	/**
	 * Devuelve una cadena con la información del articulo
	 */
	public String informacion(){
		return centro.informacion() + " -- Precio con 10% de descuento: $" +precio() + " MXN";
	}

	/**
	 * Devuelve el codigo de barras del articulo
	 */
	public String codigoBarras(){
		return centro.codigoBarras();
	}
	
}
