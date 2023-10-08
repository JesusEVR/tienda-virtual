public class prueba{
	
	public static void main(String[] args){
	//**Prueba de decorator y composite**
		CarritoVirtual carrito = new CarritoVirtual();
		Articulo pan = new Pan();
		carrito.agregarArticulo(pan);
		Articulo d = new DescuentoTreinta(pan);
		carrito.agregarArticulo(d);
		System.out.println(carrito.informacion());

		
	//**Prueba de crear una cuenta cheemsmart y acceder a los datos*
		Persona p = new Persona("Persona1", "direccion", 55742587);
		CuentaBancaria banco = new CuentaBancaria(p, 123456, 12.0);
		CuentaCheemsMart c = new CuentaCheemsMart(p, banco, "user00", "contra123", "mexico");
		
		System.out.println(c.nombre());
		System.out.println(c.direccion());
		System.out.println(c.telefono());
		System.out.println(c.pais());
		System.out.println(c.usuario());
		System.out.println(c.contrasenia());
		System.out.println(c.numeroCuenta());
		System.out.println(c.saldo());
		
		
	}
}
