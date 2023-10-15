import java.util.Scanner;
import java.util.Random;

/**
 * Clase que define el estado de la tienda cuando el usuario es de nacionalidad mexicana.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see ModoIdioma
 *
 */
public class Mexico implements ModoIdioma{
	/**
	 * Objeto tienda virtual que adaptara el idioma español latino.
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
         * @param t La tienda virtual que adopta el idioma español latinoamericano.
	 */
	public Mexico(TiendaVirtual t){
		tienda = t;
	}

	/**
	 * Metodo que saluda al usuario cuando se inicia la ejecucion.
	 */
	public void saludar(){
		System.out.println("");
		System.out.println("	Bienvenido a la tienda CheemsMart");
		System.out.println("");
	}

	/**
	 * Metodo que imprime una despedida para el usuario.
	 */
	public void despedir(){
		System.out.println("");
		System.out.println("	¡Gracias por tu preferencia, regresa pronto!");
	}

	/**
	 * Metodo que despliega todo el proceso principal de la tienda CheemsMart, en idioma español (latinoamericano).
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
					seguir = false; //solo puede comprar una vez cada inicio de sesion
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
						}else{ System.out.println("		Por favor, elige una opcion valida");
						}
					}catch (NumberFormatException ex){
						System.out.println("		Por favor, elige una opcion valida");
					}
			}

			switch(opcion){
				case 0:
					if(!tienda.carritoVacio()) tienda.cancelarCompra();
					seguir = false;
					break;
				case 1:
					System.out.print("Escribe el codigo de barras del articulo: ");
					
						codigoBarras = sc.nextLine();
					
						if(codigoBarras.length()==5){ //el codigo tiene 5 caracteres
							
							if(codigoBarras.toUpperCase().contains("AL")){ //pertenece al depto de alimentos
								System.out.println("Codigo correcto");
								//articulo = tienda.buscarAlimento(codigoBarras);
								//if(articulo == null) System.out.println("\n		Codigo de barras inválido \n");
								//this.alimentoConDescuento(articulo);
				
								
							}else if(codigoBarras.toUpperCase().contains("ET")){ //pertenece al depto de electronica
								System.out.println("Codigo correcto");
								//articulo = tienda.buscarElectronico(codigoBarras);
								//if(articulo == null) System.out.println("\n		Codigo de barras inválido \n");
								//tienda.agregarAlCarrito(articulo);
								
							}else if(codigoBarras.toUpperCase().contains("ED")){ //pertenece al depto de electrodomesticos
								System.out.println("Codigo correcto");
								//articulo = tienda.buscarElectrodomestico(codigoBarras);
								//if(articulo == null) System.out.println("\n		Codigo de barras inválido \n");
								//tienda.agregarAlCarrito(articulo);
								
								
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
	
	// aplica su respectivo descuento 
	/**
	 * Metodo que aplica el descuento correspondiente a un articulo elegido,
         * en caso de haber una oferta en el departamento donde pertenece.
	 */
	private void alimentoConDescuento(Articulo a){ 
		
		Articulo articulo;
		
		switch(oferta){
			case 0: //Los alimentos no tienen descuento
				tienda.agregarAlCarrito(a);
				break;
			case 1:  //Los alimentos tienen 10% descuento
				articulo = new DescuentoDiez(a); 
				tienda.agregarAlCarrito(articulo);
				break;
			case 2:  //Los alimentos tienen 20% descuento
				articulo = new DescuentoVeinte(a); 
				tienda.agregarAlCarrito(articulo);
				break;
			case 3:  //Los alimentos tienen 30% descuento
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
				System.out.println("¡El dia de hoy contamos con 10% de descuento en el departamento de alimentos!");
				break;
			case 2:
				System.out.println("¡El dia de hoy contamos con 20% de descuento en el departamento de alimentos!");
				break;
			case 3:
				System.out.println("¡El dia de hoy contamos con 30% de descuento en el departamento de alimentos!");
				break;
		}
	}

	/**
	 * Metodo que lleva a cabo el proceso de compra segura, y asi generar el ticket del cliente.
	 */
	public void ticket(){ //aqui sucede la compra segura y se genera el ticket **falta probar
		if(tienda.puedeGenerarTicket()){
			System.out.println("");
			System.out.println("---------- C O M P R A    S E G U R A ----------- ");
			System.out.println("");
			System.out.println("Su lista de compras se muestra a continuacion: ");
			System.out.println("");
			//tienda.listaCompras();
			System.out.println("Ingrese su numero de cuenta para completar la transaccion: ");
			String cuentaUsuario = sc.nextLine();
				try{
					tienda.compraSegura(cuentaUsuario);
				}catch(IllegalArgumentException e){
					System.out.println("	El numero de cuenta ingresado es incorrecto o.O");
				}catch(SaldoInsuficienteException ex){
					System.out.println("	Su saldo es insuficiente");
					System.out.println("	Tendremos que cancelar su compra :(");
				}
		
		}
		
		tienda.generarTicket(false);
	}
}
