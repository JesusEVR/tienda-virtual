package modelo.usuario;
/**
 * Clase que define a un objeto Persona.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public class Persona{
	/**
	 * Nombre de la persona
	 */
	private String nombre;
	/**
	 * Direccion de la persona.
	 */
	private String direccion;
	/**
	 * Telefono de la persona
	 */
	private int telefono;

	/**
	 * Constructor por parametros de un objeto Persona.
	 *
	 * @param nombre El cómo se llama la persona
         * @param direccion Su direccion de la persona
	 * @param telefono El numero telefonico de la persona
	 */
	public Persona(String nombre, String direccion, int telefono){
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	/**
	 * Metodo que devuelve el nombre de un individuo
	 *
	 * @return nombre El cómo se llama la persona
	 */
	public String nombre(){
		return nombre;
	}

	/**
	 * Metodo que devuelve la direccion de un individuo
	 *
         * @return direccion Su direccion de la persona
	 */
	public String direccion(){
		return direccion;
	}

	/**
	 * Metodo que devuelve el telefono de un individuo
	 *
	 * @return telefono El numero telefonico de la persona
	 */
	public int telefono(){
		return telefono;
	}
	
}
