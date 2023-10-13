/**
 * Clase que define a una Cuenta Bancaria y extiende la interfaz Cuenta.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public class CuentaBancaria implements Cuenta{
	/**
	 * Persona a quien pertenece la cuenta bancaria
	 */
	private Persona persona;
	/**
	 * Numero de cuenta unico de la cuenta bancaria
	 */
	private int numeroCuenta;
	/**
	 * Saldo disponible en la cuenta bancaria
	 */
	private double saldo;

	/**
	 * Constructor por parametros de la cuenta bancaria.
	 *
	 * @param persona A quien pertenece la cuenta bancaria
         * @param numeroCuenta El numero de cuenta de la cuenta bancaria
	 * @param saldo El saldo disponible en la cuenta bancaria
	 */
	public CuentaBancaria(Persona persona, int numeroCuenta, double saldo){
		this.persona = persona;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	/**
	 * Metodo que devuelve la persona a quien pertenece la cuenta bancaria
	 *
         * @return persona El duenio de la cuenta
	 */
	public Persona cliente(){
		return persona;
	}

	/**
	 * Metodo que devuelve el numero de cuenta de la cuenta bancaria
	 *
         * @return numeroCuenta El numero de cuenta, de dicha cuenta
	 */
	public int numeroCuenta(){
		return numeroCuenta;
	}

	/**
	 * Metodo que devuelve el saldo de la cuenta bancaria
	 *
         * @return saldo Cuanto dinero hay en la cuenta bancaria
	 */
	public double saldo(){
		return saldo;
	}

	/**
	 * Metodo que procede en la compra de productos en la tienda virtual CheemsMart.
	 *
         * @throws SaldoInsuficienteException si el saldo en la cuenta bancaria es insuficiente.
	 */
	public void comprar(double monto) throws SaldoInsuficienteException{
		if(monto>saldo) throw new SaldoInsuficienteException(); //excede lo que tiene en su cuenta
		saldo -= monto;
	}

	/**
	 * Metodo que deposita una cierta cantidad de dinero en la cuenta bancaria
	 *
         * @return monto Cantidad a depositar en la cuenta
	 */
	public void depositar(double monto){
		saldo += monto;
	}

}
