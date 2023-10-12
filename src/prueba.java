import java.util.Scanner;
public class prueba{
	
	public static void main(String[] args){
		boolean seguir=false;
		int opcion=0;
		int contador =0;
		Scanner sc = new Scanner(System.in);
	
		//Prueba de decorator y composite**
		CarritoVirtual carrito = new CarritoVirtual();
		Articulo pan = new Pan();
		carrito.agregarArticulo(pan);
		Articulo d = new DescuentoTreinta(pan);
		carrito.agregarArticulo(d);
		System.out.println(carrito.informacion());

		//Prueba de crear una cuenta cheemsmart y acceder a los datos*
		Persona p = new Persona("Persona1", "direccion", 55742587);
		CuentaBancaria banco = new CuentaBancaria(p, 123456, 12.0);
		CuentaCheemsMart c = new CuentaCheemsMart(banco, "user00", "contra123", "mexico");
		
		//Prueba de comprar 
		System.out.println("Ingresando numero de cuenta: 123456");
		try{
			c.verificarCompra(123456);
			c.comprar(100);
		}catch(IllegalArgumentException e){
			System.out.println("Numero de cuenta invalido");
		}catch(SaldoInsuficienteException i){
			System.out.println("Saldo insuficiente");
		}
		
		
		
		
		
		CheemsMart tienda = new CheemsMart();
		tienda.agregarCliente(c);
		
		do{
		System.out.println("");
		System.out.println("-*-*-*-*-* T I E N D A  C H E E M S M A R T -*-*-*-*-* ");
		System.out.println("");
		System.out.println("		1. Iniciar Sesion");
		System.out.println("		0. Salir de la tienda");
		System.out.println("");
		System.out.print("Seleccione la opción que desee ejecutar: ");
			while(true){
				try {
					String opcionUsuario = sc.nextLine();
					opcion =  Integer.parseInt(opcionUsuario);
					if(opcion >-1 && opcion < 2){ 
						break;
					}else{ System.out.println("		Por favor, elige una opción válida");
					}
				}catch (NumberFormatException ex){
					System.out.println("		Por favor, elige una opción válida");
				}
			}
				switch(opcion){
					case 1:
						System.out.println("");
						System.out.println("---- I N I C I A R   S E S I Ó N -----");
						System.out.println("");
						while(!tienda.existeUsuario()){
								try{
								tienda.iniciarSesion();
								}catch(UnsupportedOperationException ex){
									System.out.println("	¡Aún no hay usuarios registrados en el sistema!");
									seguir=true;
									break;
								}
							contador++;
							if(contador>3){
								System.out.println("");
								System.out.println("¡Se ha activado el sistema de inicio de sesión seguro!");
								System.out.println("	Excedió la cantidad de intentos permitidos para iniciar sesión");
								System.out.println("		Por seguridad, será redirigido a la pantalla principal");
								System.out.println("");
								seguir=true;
								break;
							}
						}
						
						
						
						if(tienda.existeUsuario()){
							tienda.asignarIdioma();
							tienda.entrarAlaTienda();
							seguir = true;
						}
						
						
						break;
					case 0:
						System.exit(0);	
				}
		}while(seguir);
	}
}