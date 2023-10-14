/**
 * Interfaz que define los metodos que se veran afectados segun la nacionalidad del usuario.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 *
 */
public interface ModoIdioma{

	/**
	 * Metodo que saluda al usuario cuando se inicia la ejecucion.
	 */
	public void saludar();

	/**
	 * Metodo que imprime una despedida para el usuario cuando se inicia la ejecucion.
	 */
	public void despedir();

	/**
	 * Metodo que despliega todo el proceso principal de la tienda CheemsMart.
	 */
	public void entrarTienda();

	/**
	 * Metodo que genera al azar la cantidad de descuento que tendra un departamento de productos.
	 */
	public void ofertas();

	/**
	 * Metodo que lleva a cabo el proceso de compra segura, y despues genera el ticket del cliente.
	 *
	 */
	public void ticket();
}
