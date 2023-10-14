public class TiendaVirtual{
	
	private ModoIdioma modoEspaniolLatino;
	//private ModoIdioma modoEspaniol;
	//private ModoIdioma modoIngles;
	private ModoIdioma idiomaActual;
	private CuentaCheemsMart usuarioActual;
	private CarritoVirtual carrito;
	private boolean canceloCompra;
	private boolean puedeGenerarTicket;
	
	public TiendaVirtual(CuentaCheemsMart cuenta){
		modoEspaniolLatino = new Mexico(this);
		//modoEspaniol = new Espania(this);
		//modoIngles = new EEUU(this);
		usuarioActual = cuenta;
		carrito = new CarritoVirtual();
		canceloCompra=false;
		puedeGenerarTicket = false;
	}
		
	public void saludar(){
		idiomaActual.saludar();
	}
	public void despedir(){
		idiomaActual.despedir();
	}
	public void entrarTienda(){
		idiomaActual.entrarTienda();
	}
	public void ofertas(){
		idiomaActual.ofertas();
	}
	public void ticket(){
		idiomaActual.ticket();
	}
	
	public ModoIdioma espaniolLatino(){
		return modoEspaniolLatino;
	}
	
	/*public ModoIdioma espaniol(){
		return modoEspaniol;
	}
	
	public ModoIdioma ingles(){
		return modoIngles;
	}*/
	
	public void asignarIdioma(ModoIdioma idioma){
		idiomaActual = idioma;
	}
	
	public void verCatalogo(){
		catalogoAlimentos();
		catalogoElectrodomesticos();
		catalogoElectronica();
	}
	
	public void catalogoElectronica(){
		System.out.println("***** CATALOGO ELECTRÓNICA *******");
		System.out.println("");
	}
	public void catalogoElectrodomesticos(){
		System.out.println("***** CATALOGO ELECTRODOMESTICOS *******");
		System.out.println("");
	}
	public void catalogoAlimentos(){
		System.out.println("***** CATALOGO ALIMENTOS *******");
		System.out.println("");
	}
	
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
	
	
	
	public Articulo buscarElectrodomestico(String codigoBarras){
		System.out.println("buscando el articulo en el catalogo de electrodomesticos...");
		return null;
	}
	
	public Articulo buscarElectronico(String codigoBarras){
		System.out.println("buscando el articulo en el catalogo de electronica...");
		return null;
	}
		
	public void agregarAlCarrito(Articulo articulo){
		carrito.agregarArticulo(articulo);
	}
	
	public void cancelarCompra(){
		carrito.vaciarCarrito();
		canceloCompra = true;
	}
	
	public boolean canceloCompra(){
		return canceloCompra;
	}
	
	public boolean carritoVacio(){
		return !carrito.tieneArticulo();
	}
	
	public void generarTicket(boolean b){
		puedeGenerarTicket = b;
	}
	
	public boolean puedeGenerarTicket(){
		return puedeGenerarTicket;
	}
	
	public void listaCompras(){
		System.out.println(carrito.informacion());
		System.out.println("	Total: $"+ carrito.precio()+ " MXM");
	}
	
	
	public void compraSegura(String numeroCuenta) throws SaldoInsuficienteException{
		usuarioActual.verificarCompra(numeroCuenta);
		usuarioActual.comprar(carrito.precio());
	}
	
}
