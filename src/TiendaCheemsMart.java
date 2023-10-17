import java.util.Scanner;
public class TiendaCheemsMart{
	
	public static void main(String[] args){
		boolean seguir=false;
		int opcion=0;
		int contador =0;
		Scanner sc = new Scanner(System.in);

		Persona arturo = new Persona("Arturo", "Av. de la Constitucion, 17, 45530 Santa Olalla, Toledo", 55258725);
		CuentaBancaria cuentaB1 = new CuentaBancaria(arturo, "ES1234", 12000.0);
		CuentaCheemsMart cuentaUno = new CuentaCheemsMart(cuentaB1, "ArturoLemus", "paella", "España");
				
		Persona rodrigo = new Persona("Rodrigo", "125 Cave Dr, Eldon, MO 65026", 55821197);
		CuentaBancaria cuentaB2 = new CuentaBancaria(rodrigo, "EU1234", 13000.0);
		CuentaCheemsMart cuentaDos = new CuentaCheemsMart(cuentaB2, "RodrigoTA", "pizza", "EEUU");
		
		Persona rosa = new Persona("Rosa Victoria", "Felipe Carrillo Puerto 32, Coyoacan 04000 ", 55301187);
		CuentaBancaria cuentaB3 = new CuentaBancaria(rosa, "ME1234", 9000.0);
		CuentaCheemsMart cuentaTres = new CuentaCheemsMart(cuentaB3, "RosaUwU", "cheems", "Mexico");
		
		CheemsMart tienda = new CheemsMart();
		tienda.agregarCliente(cuentaUno);
		tienda.agregarCliente(cuentaDos);
		tienda.agregarCliente(cuentaTres);
		
		do{
		System.out.println("");
		System.out.println("-*-*-*-*-*-* T I E N D A  C H E E M S M A R T -*-*-*-*-*-* ");
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
					}else{ System.out.print("		Por favor, elige una opción válida: ");
					}
				}catch (NumberFormatException ex){
					System.out.print("		Por favor, elige una opción válida: ");
				}
			}
				switch(opcion){
					case 1:
						System.out.println("");
						System.out.println("---- I N I C I A R   S E S I O N -----");
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