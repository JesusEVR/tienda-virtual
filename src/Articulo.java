/**
 * Interfaz que define las caracteristicas comunes de los artículo que
 * ofrece la tienda CheemsMart
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 *
 */
public interface Articulo{
	
	/**
	 * Devuelve el precio del artículo
	 */
	public double precio();
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion();
	
	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public int codigoBarras();
}
