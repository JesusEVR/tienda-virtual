import java.util.Scanner;
import java.util.Random;

/**
 * Clase que define el estado de la tienda cuando el usuario es de nacionalidad española.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see ModoIdioma
 *
 */
public class Espania implements ModoIdioma{
	/**
	 * Objeto tienda virtual que adaptara el idioma español castellano.
	 */
	TiendaVirtual tienda;
	/**
	 * Objeto teclado que servira para que el usuario pueda introducir opciones.
	 */
	private Scanner sc = new Scanner(System.in);
	/**
	 * Objeto random que ayudara a la generacion aletaoria de ofertas.
	 */
	private Random random = new Random();
	/**
	 * Numero entero generado por el objeto random.
	 */
	int oferta;
	
	/**
	 * Constructor por paramatros.
     *
     * @param t La tienda virtual que adopta el idioma español castellano.
	 */
	public Espania(TiendaVirtual t){
		tienda = t;
	}

	/**
	 * Metodo que saluda al usuario cuando se inicia la ejecucion.
	 */
	public void saludar(){
		System.out.println("	¡Bienvenido a la tienda CheemsMart! (España)");
		System.out.println("");
	}

	/**
	 * Metodo que imprime una despedida para el usuario.
	 */
	public void despedir(){
		System.out.println("");
		System.out.println("	¡Gracias por tu preferencia, regresa pronto! (España)");
	}

	/**
	 * Metodo que despliega todo el proceso principal de la tienda CheemsMart, en idioma español (castellano).
	 */
	public void entrarTienda(){
		int opcion = 0;
		boolean seguir = false;
		
		do{
			System.out.println("");
			System.out.println("		1. Ver catalogo");
			System.out.println("		2. Comprar");
			System.out.println("		0. Salir");
			System.out.println("");
			System.out.print("Seleccione la opcion que desee ejecutar: ");
			while(true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion =  Integer.parseInt(opcionUsuario);
						if(opcion >-1 && opcion < 3){ 
							break;
						}else{ System.out.print("		Por favor, elige una opcion valida: ");
						}
					}catch (NumberFormatException ex){
						System.out.print("		Por favor, elige una opcion valida: ");
					}
			}

			switch(opcion){
				case 0:
					seguir = false;
					break;
				case 1:
					System.out.println("");
					System.out.println("---------- C A T A L O G O ----------- ");
					tienda.verCatalogo();
					seguir = true;
					break;
				case 2:
					System.out.println("");
					System.out.println("---------- R E A L I Z A R     C O M P R A  ----------- ");
					tienda.verCatalogo();
					comprar();
					seguir = false; 
					break;
			}
		}while(seguir);
	}

	/**
	 * Metodo que despliega el proceso a llevar a cabo cuando se decide comprar un articulo.
	 */
	private void comprar(){
		int opcion = 0;
		String codigoBarras = "";
		boolean seguir = false;
		Articulo articulo;
		
		do{
		System.out.println("");
		System.out.println("		1. Agregar al carrito");
		System.out.println("		2. Terminar compra");
		System.out.println("		0. Salir");	
		System.out.print("Seleccione la opcion que desee ejecutar: ");
			while(true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion =  Integer.parseInt(opcionUsuario);
						if(opcion >-1 && opcion < 3){ 
							break;
						}else{ System.out.print("		Por favor, elige una opcion valida: ");
						}
					}catch (NumberFormatException ex){
						System.out.print("		Por favor, elige una opcion valida: ");
					}
			}

			switch(opcion){
				case 0:
					if(!tienda.carritoVacio()) tienda.cancelarCompra();
					seguir = false;
					break;
				case 1:
					System.out.print("\n"+"Escribe el codigo de barras del articulo: ");
					
						codigoBarras = sc.nextLine();
					
						if(codigoBarras.length()==5){ 
							
							if(codigoBarras.toUpperCase().contains("AL")){ //pertenece al depto de alimentos
								
								articulo = tienda.buscarAlimento(codigoBarras.toUpperCase());
								if(articulo == null) System.out.println("\n		Codigo de barras inválido \n");
								tienda.agregarAlCarrito(articulo);
								
							}else if(codigoBarras.toUpperCase().contains("ET")){ //pertenece al depto de electronica
								articulo = tienda.buscarElectronico(codigoBarras.toUpperCase());
								if(articulo == null) System.out.println("\n		Codigo de barras inválido \n");
								tienda.agregarAlCarrito(articulo);
								
							}else if(codigoBarras.toUpperCase().contains("ED")){ //pertenece al depto de electrodomesticos
								articulo = tienda.buscarElectrodomestico(codigoBarras.toUpperCase());
								if(articulo == null) System.out.println("\n		Codigo de barras inválido \n");
								this.electrodomesticoConDescuento(articulo);
							}else{ System.out.println("\n		Codigo de barras invalido \n");}
						} else{ System.out.println("\n		Codigo de barras invalido \n");}
					seguir = true;
					break;
				case 2:
					if(!tienda.carritoVacio()) tienda.generarTicket(true);
					seguir = false;
					break;
			}
		}while(seguir);
	}
	

	/**
	 * Metodo que aplica el descuento correspondiente a un articulo elegido,
         * en caso de haber una oferta en el departamento donde pertenece.
	 */
	private void electrodomesticoConDescuento(Articulo a){ 
		Articulo articulo;
		switch(oferta){
			case 0:
				tienda.agregarAlCarrito(a);
				break;
			case 1: 
				articulo = new DescuentoDiez(a); 
				tienda.agregarAlCarrito(articulo);
				break;
			case 2: 
				articulo = new DescuentoVeinte(a); 
				tienda.agregarAlCarrito(articulo);
				break;
			case 3:  
				articulo = new DescuentoTreinta(a); 
				tienda.agregarAlCarrito(articulo);
				break;
		}
	}
	
	/**
	 * Metodo que genera al azar la cantidad de descuento que tendra un departamento de productos.
	 */
	public void ofertas(){
		oferta = random.nextInt(4);
		switch(oferta){
			case 1:
				System.out.println("¡El dia de hoy contamos con 10% de descuento en el departamento de electrodomesticos!");
				break;
			case 2:
				System.out.println("¡El dia de hoy contamos con 20% de descuento en el departamento de electrodomesticos!");
				break;
			case 3:
				System.out.println("¡El dia de hoy contamos con 30% de descuento en el departamento de electrodomesticos!");
				break;
		}
	}

	/**
	 * Metodo que lleva a cabo el proceso de compra segura, y asi generar el ticket del cliente.
	 */
	public void ticket(){ 
		if(tienda.puedeGenerarTicket()){
		boolean continuar=true;
		boolean cuentaExitosa=false; 
		int contador =0;
			System.out.println("");
			System.out.println("---------- C O M P R A    S E G U R A ----------- ");
			System.out.println("");
			System.out.println("Su lista de compras se muestra a continuacion: ");
			System.out.println("");
			tienda.listaCompras();
			do{
			System.out.print("\n"+"Ingrese su numero de cuenta para completar la transaccion: ");
			String cuentaUsuario = sc.nextLine();
				try{
					contador++;
					tienda.compraSegura(cuentaUsuario);
					cuentaExitosa=true;
					continuar=false;
				}catch(IllegalArgumentException e){
					System.out.println("\n	El numero de cuenta ingresado es incorrecto o.O");
					if(contador>2){
						System.out.println("\n		¡Ha excedido el número de intentos!");
						System.out.println("	Por seguridad, tendremos que cerrar su sesión");
						continuar=false;
					}
				}catch(SaldoInsuficienteException ex){
					System.out.println("\n		Su saldo es insuficiente");
					System.out.println("	Tendremos que cancelar su compra :(");
					continuar=false;
				}
			}while(continuar);
			
			if(cuentaExitosa){
				System.out.println("		¡Su compra se ha realizado con éxito!");
				System.out.println("Sus productos se entregarán en " + tienda.lugarDeEntrega()+ " dentro de 5 días hábiles");
			}
		}
		tienda.generarTicket(false);
	}
}
