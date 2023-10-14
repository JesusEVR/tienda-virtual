import java.util.Scanner;
import java.util.Random;

public class Mexico implements ModoIdioma{
	
	TiendaVirtual tienda;
	private Scanner sc = new Scanner(System.in);
	private Random random = new Random();
	private int oferta;
	
	public Mexico(TiendaVirtual t){
		tienda = t;
	}
	
	public void saludar(){
		System.out.println("");
		System.out.println("	Bienvenido a la tienda");
		System.out.println("");
	}
	public void despedir(){
		System.out.println("");
		System.out.println("	Gracias por su preferencia, regrese pronto");
	}
	public void entrarTienda(){
		int opcion=0;
		boolean seguir=false;
		
		do{
			System.out.println("");
			System.out.println("		1. Ver catálogo");
			System.out.println("		2. Comprar");
			System.out.println("		0. Salir");
			System.out.println("");
			System.out.print("Seleccione la opción que desee ejecutar: ");
			while(true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion =  Integer.parseInt(opcionUsuario);
						if(opcion >-1 && opcion < 3){ 
							break;
						}else{ System.out.print("		Por favor, elige una opción válida: ");
						}
					}catch (NumberFormatException ex){
						System.out.print("		Por favor, elige una opción válida: ");
					}
			}

			switch(opcion){
				case 0:
					seguir = false;
					break;
				case 1:
					System.out.println("");
					System.out.println("---------- C A T A LO G O ----------- ");
					tienda.verCatalogo();
					seguir = true;
					break;
				case 2:
					System.out.println("");
					System.out.println("---------- R E A L I Z A R    C O M P R A  ----------- ");
					tienda.verCatalogo();
					comprar();
					seguir = false; //solo puede comprar una vez cada inicio de sesion
					break;
			}
		}while(seguir);
	}
	
	private void comprar(){
		int opcion=0;
		String codigoBarras="";
		boolean seguir=false;
		
		
		do{
		System.out.println("");
		System.out.println("		1. Añadir al carrito");
		System.out.println("		2. Terminar compra");
		System.out.println("		0. Salir");	
		System.out.print("Seleccione la opción que desee ejecutar: ");
			while(true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion =  Integer.parseInt(opcionUsuario);
						if(opcion >-1 && opcion < 3){ 
							break;
						}else{ System.out.println("		Por favor, elige una opción válida");
						}
					}catch (NumberFormatException ex){
						System.out.println("		Por favor, elige una opción válida");
					}
			}

			switch(opcion){
				case 0:
					if(!tienda.carritoVacio()){
						tienda.cancelarCompra();
					}

					seguir = false;
					break;
				case 1:
					System.out.print("Escribe el codigo de barras del artículo: ");
						codigoBarras = sc.nextLine();
						if(codigoBarras.length()==5){
							if(codigoBarras.toUpperCase().contains("AL")){
								System.out.println("buscar en catalogo alimentos");
								
							}else if(codigoBarras.toUpperCase().contains("ET")){
								System.out.println("buscar en catalogo electronica");
								
							}else if(codigoBarras.toUpperCase().contains("ED")){
								System.out.println("buscar en catalogo electrodomesticos");
								
							}else{ System.out.println("\n		Codigo de barras inválido \n");}
							
						} else{ System.out.println("\n		Codigo de barras  inválido \n");}
					
					seguir = true;
					break;
				case 2:
					//System.out.println("carrito vacio " + tienda.carritoVacio());
					if(!tienda.carritoVacio()){
						tienda.generarTicket(true);
					}
					seguir = false;
					break;
			}
		}while(seguir);
	}
	
	public void comprarAlimento(String codigoBarras){ //busca el articulo en el catalogo correspondiente y le aplica su respectivo descuento 
	
		/*switch(oferta){
			case 0: //Los alimentos no tienen descuento
				break;
			case 1:  //Los alimentos tienen 10% descuento
				break;
			case 2:  //Los alimentos tienen 20% descuento
				break;
			case 3:  //Los alimentos tienen 30% descuento
				break;
		}*/
		
		
	}
	
	public void ofertas(){
		oferta = random.nextInt(4);
		switch(oferta){
			case 1:
				System.out.println("¡El día de hoy contamos con 10% de descuento en el departamento de alimentos!");
				break;
			case 2:
				System.out.println("¡El día de hoy contamos con 20% de descuento en el departamento de alimentos!");
				break;
			case 3:
				System.out.println("¡El día de hoy contamos con 30% de descuento en el departamento de alimentos!");
				break;
		}
	}
	
	public void ticket(){ //aqui sucede la compra segura y se genera el ticket
		if(tienda.puedeGenerarTicket()){
			System.out.println("generando ticket...");
		}
		
		tienda.generarTicket(false);
	}
}