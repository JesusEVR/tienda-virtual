public class CuentaCheemsMart extends Cuenta{
	
	private CuentaBancaria cuenta;
	private String usuario;
	private String contrasenia;
	private String paisOrigen;
	
	public CuentaCheemsMart(Persona persona, CuentaBancaria cuenta, String usuario, String contrasenia, String paisOrigen){
		super(persona);
		this.cuenta = cuenta;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.paisOrigen = paisOrigen;
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
	
	public int numeroCuenta(){
		return cuenta.numeroCuenta();
	}
	
	public double saldo(){
		return cuenta.saldo();
	}

}