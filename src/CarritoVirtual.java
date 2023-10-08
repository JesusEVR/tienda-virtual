import java.util.LinkedList;
/**
* Clase que define el comportamiento del carrito de compras virtual
*
* @author paolasanv
* @author Supr-Lilito
* @author JesusEVR
* @version octubre 2023
* @see Articulo
*
*/
public class CarritoVirtual implements Articulo{
	
	/**
	* Lista de artículos que el usuario desea comprar
	*/
	private LinkedList<Articulo> listaDeCompras = new LinkedList<>();
	
	public double precio(){
		double precio=0;
		for(Articulo a : listaDeCompras){
			precio += a.precio();
		}
		return precio;
	}
	
	public String informacion(){
		String articulos="";
		for(Articulo a : listaDeCompras){
			articulos += a.informacion()+ "\n";
		}
		return articulos;
	}
	
	public int codigoBarras(){ 
		return 0;
	}
	
	public void agregarArticulo(Articulo a){
		listaDeCompras.add(a);
	}
	
}