package modelo.producto.electronica;
import modelo.producto.Articulo;

/**
 * Clase que define la información del articulo Celular
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see Articulo
 *
 */
public class Celular implements Articulo{
	
	/**
         * Constructor por omision del articulo Celular
         *
         */
	public Celular(){
	}

	/**
	 * Devuelve el precio del artículo
	 */
	public double precio(){
		return 26999;
	}
	
	/**
	 * Devuelve una cadena con la información del artículo
	 */
	public String informacion(){
		return "Código: " +codigoBarras()+ " - Artículo: Celular AyFound 18, 252 GB de almacenamiento y 3 horas de bateria"+"\n"+ "        Precio: $" +precio() +" MXN";
	}

	/**
	 * Devuelve el codigo de barras del artículo
	 */
	public String codigoBarras(){
		return "ET204";
	}
}
