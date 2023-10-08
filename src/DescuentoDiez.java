/**
* Clase abstracta que permite aplicar un diez porciento 
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
	
	public DescuentoDiez(Articulo centro){
		super(centro);
	}
	
	public double precio(){
		double nuevoPrecio = 0.9 * centro.precio();
		return nuevoPrecio;
	}
	public String informacion(){
		return centro.informacion() + " Precio con 10% de descuento: " +precio();
	}
	public int codigoBarras(){
		return centro.codigoBarras();
	}
	
}