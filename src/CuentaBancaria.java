public class CuentaBancaria extends Cuenta{
	
	private int numeroCuenta;
	private double saldo;
	
	public CuentaBancaria(Persona persona, int numeroCuenta, double saldo){
		super(persona);
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

	public void retirar(double monto){
		if(monto>saldo) throw new IllegalArgumentException(); //excede lo que tiene en su cuenta
		saldo -= monto;
	}
	
	public void depositar(double monto){
		saldo += monto;
	}
}
