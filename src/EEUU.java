import java.util.Scanner;
import java.util.Random;

/**
 * Clase que define el estado de la tienda cuando el usuario es de nacionalidad estadounidense.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * @see ModoIdioma
 *
 */
public class EEUU implements ModoIdioma{
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
	public EEUU(TiendaVirtual t){
		tienda = t;
	}

	/**
	 * Metodo que saluda al usuario cuando se inicia la ejecucion.
	 */
	public void saludar(){
		System.out.println("	Welcome to CheemsMart store");
		System.out.println("");
	}

	/**
	 * Metodo que imprime una despedida para el usuario.
	 */
	public void despedir(){
		System.out.println("");
		System.out.println("	Thanks 4 ur preference, be back soon!");
	}

	/**
	 * Metodo que despliega todo el proceso principal de la tienda CheemsMart, en idioma español (latinoamericano).
	 */
	public void entrarTienda(){
		int opcion = 0;
		boolean seguir = false;
		
		do{
			System.out.println("");
			System.out.println("		1. See catalogue");
			System.out.println("		2. Buy");
			System.out.println("		0. Exit");
			System.out.println("");
			System.out.print("Select the opcion u want to execute: ");
			while(true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion =  Integer.parseInt(opcionUsuario);
						if(opcion >-1 && opcion < 3){ 
							break;
						}else{ System.out.print("		Please, select a valid opcion: ");
						}
					}catch (NumberFormatException ex){
						System.out.print("		Please, select a valid opcion: ");
					}
			}

			switch(opcion){
				case 0:
					seguir = false;
					break;
				case 1:
					System.out.println("");
					System.out.println("---------- C A T A L O G U E ----------- ");
					tienda.verCatalogo();
					seguir = true;
					break;
				case 2:
					System.out.println("");
					System.out.println("---------- P L A C E   O R D E R ----------- ");
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
		System.out.println("		1. Add to cart");
		System.out.println("		2. Chekout");
		System.out.println("		0. Exit");	
		System.out.print("Select the opcion u want to execute: ");
			while(true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion =  Integer.parseInt(opcionUsuario);
						if(opcion >-1 && opcion < 3){ 
							break;
						}else{ System.out.print("		Please, select a valid opcion: ");
						}
					}catch (NumberFormatException ex){
						System.out.print("		Please, select a valid opcion: ");
					}
			}

			switch(opcion){
				case 0:
					if(!tienda.carritoVacio()) tienda.cancelarCompra();
					seguir = false;
					break;
				case 1:
					System.out.print("\n"+"Write the product's barcode: ");
					codigoBarras = sc.nextLine();
						if(codigoBarras.length()==5){
							if(codigoBarras.toUpperCase().contains("AL")){ 
								articulo = tienda.buscarAlimento(codigoBarras.toUpperCase());
								if(articulo == null) System.out.println("\n		Invalid barcode \n");
								tienda.agregarAlCarrito(articulo);
								
							}else if(codigoBarras.toUpperCase().contains("ET")){ 
								articulo = tienda.buscarElectronico(codigoBarras.toUpperCase());
								if(articulo == null) System.out.println("\n		Invalid barcode \n");
								this.electronicoConDescuento(articulo);
								
							}else if(codigoBarras.toUpperCase().contains("ED")){ 
								articulo = tienda.buscarElectrodomestico(codigoBarras.toUpperCase());
								if(articulo == null) System.out.println("\n		Invalid barcode \n");
								tienda.agregarAlCarrito(articulo);
								
							}else{ System.out.println("\n		Invalid barcode \n");}
							
						} else{ System.out.println("\n		Invalid barcode \n");}
					
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
	private void electronicoConDescuento(Articulo a){ 
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
				System.out.println("Today we have 10% off at the electronic department!");
				break;
			case 2:
				System.out.println("Today we have 20% off at the electronic department!");
				break;
			case 3:
				System.out.println("Today we have 30% off at the electronic department!");
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
			System.out.println("---------- S E C U R E    S H O P P I N G  ----------- ");
			System.out.println("");
			System.out.println("Your shopping list is shown below: ");
			System.out.println("");
			tienda.listaCompras();
			do{
			System.out.print("\n"+"Write your bank account to pay: ");
			String cuentaUsuario = sc.nextLine();
				try{
					contador++;
					tienda.compraSegura(cuentaUsuario);
					cuentaExitosa=true;
					continuar=false;
				}catch(IllegalArgumentException e){
					System.out.println("\n	The account number is incorrect o.O");
					if(contador>2){
						System.out.println("\n		You have exceeded the numbers of attempts allowed!");
						System.out.println("	For security, we must logging out from your account");
						continuar=false;
					}
				}catch(SaldoInsuficienteException ex){
					System.out.println("\n		Your balance is not enough");
					System.out.println("	We have to cancel your shopping :(");
					continuar=false;
				}	
			}while(continuar);
			
			if(cuentaExitosa){
				System.out.println("		¡Your purchase was successfully completed!");
				System.out.println("Your products will be delivered at " + tienda.lugarDeEntrega()+ " within 5 working days");
			}
		}
		tienda.generarTicket(false);
	}
}
