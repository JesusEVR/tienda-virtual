public class prueba{
	
	public static void main(String[] args){
	//**Prueba de decorator y composite**
		CarritoVirtual carrito = new CarritoVirtual();
		Articulo pan = new Pan();
		carrito.agregarArticulo(pan);
		Articulo d = new DescuentoTreinta(pan);
		carrito.agregarArticulo(d);
		System.out.println(carrito.informacion());
		
		
	}
}