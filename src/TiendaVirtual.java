/**
 * Clase que define las carateristicas de una Tienda Virtual.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public class TiendaVirtual{
	/**
	 * Modo de tipo espaniol latinoamericano
	 */
	private ModoIdioma modoEspaniolLatino;
	/**
	 * Modo de tipo espaniol castellano
	 */
	//private ModoIdioma modoEspaniol;
	/**
	 * Modo de tipo ingles
	 */
	//private ModoIdioma modoIngles;
	/**
	 * Modo actual de la tienda virtual
	 */
	private ModoIdioma idiomaActual;
	/**
	 * Usuario que esta usando la Tienda Virtual
	 */
	private CuentaCheemsMart usuarioActual;
	/**
	 * Carrito virtual donde agregan los articulos a comprar
	 */
	private CarritoVirtual carrito;
	/**
	 * Booleano que determina si se cancelo una compra, ono
	 */
	private boolean canceloCompra;
	/**
	 * Booleano que indica si es posible generar un ticket de compra, o no
	 */
	private boolean puedeGenerarTicket;

	/**
	 * Constructor por paramatros.
         *
         * @param cuenta La cuenta de tipo CheemsMart con la que se accede a la tienda.
	 */
	public TiendaVirtual(CuentaCheemsMart cuenta){
		modoEspaniolLatino = new Mexico(this);
		//modoEspaniol = new Espania(this);
		//modoIngles = new EEUU(this);
		usuarioActual = cuenta;
		carrito = new CarritoVirtual();
		canceloCompra = false;
		puedeGenerarTicket = false;
	}

	/**
	 * Metodo que saluda al usuario cuando se inicia la ejecucion.
	 */
	public void saludar(){
		idiomaActual.saludar();
	}

	/**
	 * Metodo que imprime una despedida para el usuario.
	 */
	public void despedir(){
		idiomaActual.despedir();
	}
	
	/**
	 * Metodo que despliega todo el proceso principal de la tienda CheemsMart, donde el idioma depende de la cuenta CheemsMart.
	 */
	public void entrarTienda(){
		idiomaActual.entrarTienda();
	}

	/**
	 * Metodo que genera al azar la cantidad de descuento que tendra un departamento de productos.
	 */
	public void ofertas(){
		idiomaActual.ofertas();
	}
	
	/**
	 * Metodo que lleva a cabo el proceso de compra segura, y asi generar el ticket del cliente.
	 */
	public void ticket(){
		idiomaActual.ticket();
	}

	/**
	 * Metodo que devuelve el modo espaniol latino.
         *
	 * @return modoEspaniolLatino El atributo correspondiente al idioma espaniol latinoamericano.
	 */
	public ModoIdioma espaniolLatino(){
		return modoEspaniolLatino;
	}

 	/**
	 * Metodo que devuelve el modo espaniol castellano.
         *
	 * @return modoEspaniol El atributo correspondiente al idioma espaniol castellano.
	 *
	public ModoIdioma espaniol(){
		return modoEspaniol;
	}
 
	/**
	 * Metodo que devuelve el modo ingles.
         *
	 * @return modoIngles El atributo correspondiente al idioma ingles.
	 *
	public ModoIdioma ingles(){
		return modoIngles;
	}
 
	*/

	/**
	 * Metodo que asigna un idioma a la tienda.
	 */
	public void asignarIdioma(ModoIdioma idioma){
		idiomaActual = idioma;
	}

	/**
	 * Metodo que permite al usuario ver el catalogo completo de la tienda.
	 */
	public void verCatalogo(){
		catalogoAlimentos();
		catalogoElectrodomesticos();
		catalogoElectronica();
	}

	/**
	 * Metodo que permite al usuario ver el catalogo de electronica.
	 */
	public void catalogoElectronica(){
		System.out.println("***** CATALOGO ELECTRONICA *******");
		System.out.println("");
	}

	/**
	 * Metodo que permite al usuario ver el catalogo de electrodomesticos.
	 */
	public void catalogoElectrodomesticos(){
		System.out.println("***** CATALOGO ELECTRODOMESTICOS *******");
		System.out.println("");
	}
	
	/**
	 * Metodo que permite al usuario ver el catalogo de alimentos.
	 */
	public void catalogoAlimentos(){
		System.out.println("***** CATALOGO ALIMENTOS *******");
		System.out.println("");
	}

	/**
	 * Metodo que busca un articulo alimenticio en el catalogo de alimentos.
         *
	 * @param codigoBarras El codigo de barras correspondiente a un articulo del catalogo
	 * @return articulo El articulo correspondiente al codigo ingresado
	 */
	public Articulo buscarAlimento(String codigoBarras){
		System.out.println("buscando el articulo en el catalogo de alimentos..");
		
		/*
		Catalogo catalogoAlimento = new CatalogoAlimento();
		Iterador iteradorAlimentos =  catalogoAlimentos.creaIterador();
		Articulo articulo;
		
		while(iteradorAlimentos.hasNext()){
			articulo = iteradorAlimentos.next();
				if(codigoBarras.equals(articulo.codigoBarras())) return articulo;
		}*/	
		
		
		return null;
	}
	
	/**
	 * Metodo que busca un articulo electrodomestico en el catalogo de eleectrodomesticos.
         *
	 * @param codigoBarras El codigo de barras correspondiente a un articulo del catalogo
	 * @return articulo El articulo correspondiente al codigo ingresado
	 */
	public Articulo buscarElectrodomestico(String codigoBarras){
		System.out.println("buscando el articulo en el catalogo de electrodomesticos...");
		return null;
	}

	/**
	 * Metodo que busca un articulo electronico en el catalogo de electrocnica.
         *
	 * @param codigoBarras El codigo de barras correspondiente a un articulo del catalogo
	 * @return articulo El articulo correspondiente al codigo ingresado
	 */
	public Articulo buscarElectronico(String codigoBarras){
		System.out.println("buscando el articulo en el catalogo de electronica...");
		return null;
	}

	/**
	 * Agrega un articulo al carrito de compra.
	 */
	public void agregarAlCarrito(Articulo articulo){
		carrito.agregarArticulo(articulo);
	}

	/**
	 * Cancela la compra del usuario.
	 */
	public void cancelarCompra(){
		carrito.vaciarCarrito();
		canceloCompra = true;
	}

	/**
	 * Devuelve el atributo canceloCompra.
         *
	 * @return 'true' si la compra ha sido cancelada, 'false' en el caso contrario.
	 */
	public boolean canceloCompra(){
		return canceloCompra;
	}

	/**
	 * Metodo que verifica si el carrito virtual esta vacio.
         * 
         * @return 'true' si el carrito virtual tiene un artículo dentro, 'false' en el caso contrario
	 */
	public boolean carritoVacio(){
		return !carrito.tieneArticulo();
	}

	/**
	 * Asigna un nuevo valor booleano al atributo puedeGenerarTicket.
         *
	 * @param b El nuevo valor booleano del atributo
	 */
	public void generarTicket(boolean b){
		puedeGenerarTicket = b;
	}

	/**
	 * Devuelve el atributo puedeGenerarTicket.
         *
	 * @return 'true' si es posible generar el ticket de compra, 'false' en el caso contrario.
	 */
	public boolean puedeGenerarTicket(){
		return puedeGenerarTicket;
	}
	
	/**
	 * Metodo que imprime la informacion de cada uno de los productos dentro del carrito virtual y el total a pagar.
	 */
	public void listaCompras(){
		System.out.println(carrito.informacion());
		System.out.println("	Total: $"+ carrito.precio()+ " MXN");
	}
	
	/**
	 * Metodo que se asegura de que el numero de cuenta ingresado por el usuario sea correcto.
	 *
         * @param numero El numero de cuenta ingresado por el cliente
	 * @throws SaldoInsuficienteException si el saldo en la cuenta bancaria es insuficiente.
	 * @throws IllegalArgumentException si el numero de cuenta bancaria ingresado por el cliente no corresponde al que esta registrado en el sistema.
	 */
	public void compraSegura(String numeroCuenta) throws SaldoInsuficienteException{
		usuarioActual.verificarCompra(numeroCuenta);
		usuarioActual.comprar(carrito.precio());
	}
	
}
