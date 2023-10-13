/**
* Clase que lanza una excepcion cuando el saldo de la cuenta es insuficiente.
*
* @author paolasanv
* @author Supr-Lilito
* @author JesusEVR
* @version octubre 2023
*/
public class SaldoInsuficienteException extends Exception{
	
	/**
	* Constructor que recibe como parámetro una cadena
        *
	* @param mensaje
	*/
	public SaldoInsuficienteException(String mensaje){
		super(mensaje);
	}
	
	/**
	* Constructor por omisión
	*/
	public SaldoInsuficienteException(){
	}

}
