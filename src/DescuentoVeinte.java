/**
* Clase abstracta que permite aplicar un veinte porciento 
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
public class DescuentoVeinte extends Descuento{
	
	public DescuentoVeinte(Articulo centro){
		super(centro);
	}
	
	public double precio(){
		double nuevoPrecio = 0.8 * centro.precio();
		return nuevoPrecio;
	}
	public String informacion(){
		return centro.informacion() + " -- Precio con 20% de descuento: $" +precio()+ " MXN";
	}
	public String codigoBarras(){
		return centro.codigoBarras();
	}
	
}