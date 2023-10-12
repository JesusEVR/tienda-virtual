public class CuentaCheemsMart implements Cuenta{
	
	private CuentaBancaria cuenta;
	private String usuario;
	private String contrasenia;
	private String paisOrigen;
	private boolean cuentaValida;
	
	public CuentaCheemsMart(CuentaBancaria cuenta, String usuario, String contrasenia, String paisOrigen){
		this.cuenta = cuenta;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.paisOrigen = paisOrigen;
		cuentaValida  =false;
	}
	
	public String nombre(){
		return cuenta.cliente().nombre();
	}
	
	public String direccion(){
		return cuenta.cliente().direccion();
	}
	
	public int telefono(){
		return cuenta.cliente().telefono();
	}
	
	public String usuario(){
		return usuario;
	}
	
	public String contrasenia(){
		return contrasenia;
	}
	
	public String pais(){
		return paisOrigen;
	}
	
	public void verificarCompra(int numero){ //numero cuenta
		if(cuenta.numeroCuenta() == numero){
			cuentaValida = true;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public void comprar(double valorCompra) throws SaldoInsuficienteException{ //valor de lo que compró 
		if(cuentaValida){
			cuenta.comprar(valorCompra);
		}
	}

}
