/**
* Clase abstracta que permite aplicar descuentos
*
* @author paolasanv
* @author Supr-Lilito
* @author JesusEVR
* @version octubre 2023
* @see Articulo
*
*/
public abstract class Descuento implements Articulo{
	/**
	* Artículo al que se le aplicará el descuento
	*/
	protected Articulo centro;
	
	public Descuento(Articulo centro){
		this.centro = centro;
	}
	
	public double precio(){
		return centro.precio();
	}
	public String informacion(){
		return centro.informacion();
	}
	public int codigoBarras(){
		return centro.codigoBarras();
	}
	
}