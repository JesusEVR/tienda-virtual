/**
* Clase que lanza una excepción cuando el saldo es insuficiente
*
* @author paolasanv
* @author Supr-Lilito
* @author JesusEVR
* @version septiembre 2023
*/
 
public class SaldoInsuficienteException extends Exception{
	/**
	* Constructor que recibe como parámetro una cadena
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