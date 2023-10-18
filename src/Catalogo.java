import java.util.Iterator;
/**
 * Interfaz que define la característica común de los catálogos
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 */
public interface Catalogo{
	
	/**
	 * Crea un iterador sobre el catálogo
	 *
	 */
	public Iterator creaIterador();
}
