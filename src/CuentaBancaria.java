public class CuentaBancaria implements Cuenta{
	private Persona persona;
	private int numeroCuenta;
	private double saldo;
	
	public CuentaBancaria(Persona persona, int numeroCuenta, double saldo){
		this.persona = persona;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	public Persona cliente(){
		return persona;
	}
	
	public int numeroCuenta(){
		return numeroCuenta;
	}
	
	public double saldo(){
		return saldo;
	}
	
	public void comprar(double monto) throws SaldoInsuficienteException{
		if(monto>saldo) throw new SaldoInsuficienteException(); //excede lo que tiene en su cuenta
		saldo -= monto;
	}
	
	public void depositar(double monto){
		saldo += monto;
	}

}