/**
 * Clase que define a una cuenta de la tienda CheemsMart y extiende la interfaz Cuenta.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 * see Cuenta
 *
 */
public class CuentaCheemsMart implements Cuenta{
	/**
	 * Cuenta bancaria guardada en la cuenta del sitio web.
	 */
	private CuentaBancaria cuenta;
	/**
	 * Nombre de usuario de la cuenta del sitio web.
	 */
	private String usuario;
	/**
	 * Contrasenia de la cuenta del sitio web. Favor de no olvidarla
	 */
	private String contrasenia;
	/**
	 * Pais donde pertenece el duenio de la cuenta
	 */
	private String paisOrigen;
	/**
	 * Valor booleano que indica si la cuenta es valida o no
	 */
	private boolean cuentaValida;

	/**
	 * Constructor por parametros de la Cuenta de CheemsMart.
	 *
	 * @param cuenta La cuenta bancaria guardada en la cuenta del sitio web
         * @param usuario El nombre de usuario de la cuenta
	 * @param contrasenia La contrasenia de la cuenta
         * @param paisOrigen El pais donde pertenece el duenio de la cuenta
	 */
	public CuentaCheemsMart(CuentaBancaria cuenta, String usuario, String contrasenia, String paisOrigen){
		this.cuenta = cuenta;
		this.usuario = usuario;
		this.contrasenia = contrasenia;
		this.paisOrigen = paisOrigen;
		cuentaValida = false;
	}

	/**
	 * Metodo que devuelve el nombre de la persona a quien pertenece la cuenta
	 *
         * @return nombre El nombre del duenio de la cuenta
	 */
	public String nombre(){
		return cuenta.cliente().nombre();
	}

	/**
	 * Metodo que devuelve la direccion de la persona a quien pertenece la cuenta
	 *
         * @return direccion Su direccion del duenio
	 */
	public String direccion(){
		return cuenta.cliente().direccion();
	}

	/**
	 * Metodo que devuelve el telefono de la persona a quien pertenece la cuenta
	 *
	 * @return telefono El numero telefonico de la persona
	 */
	public int telefono(){
		return cuenta.cliente().telefono();
	}

	/**
	 * Metodo que devuelve el nombre de usuario de la cuenta CheemsMart
	 *
	 * @return usuario El nombre de usuario de la cuenta
	 */
	public String usuario(){
		return usuario;
	}

	/**
	 * Metodo que devuelve la contrasenia de la cuenta CheemsMart
	 *
	 * @return contrasenia La contrasenia de la cuenta
	 */
	public String contrasenia(){
		return contrasenia;
	}

	/**
	 * Metodo que devuelve el pais de origen del duenio de la cuenta CheemsMart
	 *
	 * @return paisOrigen El pais donde vive el cliente
	 */
	public String pais(){
		return paisOrigen;
	}

	/**
	 * Metodo que se asegura de que el numero de cuenta que ingrese el usuario sea correcto.
	 *
         * @param numero El numero de cuenta ingresado por el cliente
	 * @throws IllegalArgumentException si el numero de cuenta bancaria ingresado por el cliente no corresponde al que esta registrado en el sistema.
	 */
	public void verificarCompra(String numero){
		if(cuenta.numeroCuenta().equals(numero)){
			cuentaValida = true;
		}else{
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Metodo que procede en la compra de productos en la tienda virtual CheemsMart.
	 *
         * @param valorCompra El total a pagar por los productos que desea comprar.
         * @throws SaldoInsuficienteException si el saldo en la cuenta bancaria es insuficiente.
	 */
	public void comprar(double valorCompra) throws SaldoInsuficienteException{
		if(cuentaValida){
			cuenta.comprar(valorCompra);
		}
	}

}
