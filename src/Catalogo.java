import java.util.Iterator;
/**
 * Interfaz que define la característica común de los catálogos
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public interface Catalogo{
	
	/**
	 * Crea un iterador sobre el catálogo
	 *
	 */
	public Iterator creaIterador();
}
