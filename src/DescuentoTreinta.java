/**
* Clase abstracta que permite aplicar un treinta porciento 
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
public class DescuentoTreinta extends Descuento{
	
	public DescuentoTreinta(Articulo centro){
		super(centro);
	}
	
	public double precio(){
		double nuevoPrecio = 0.7 * centro.precio();
		return nuevoPrecio;
	}
	public String informacion(){
		return centro.informacion() + " Precio con 30% de descuento: " +precio();
	}
	public int codigoBarras(){
		return centro.codigoBarras();
	}
	
}