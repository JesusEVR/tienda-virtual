package modelo.usuario;

import modelo.excepciones.SaldoInsuficienteException;

/**
 * Interfaz que 'define' a un objeto de tipo Cuenta.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public interface Cuenta{

	/**
	 * Metodo que procede la compra de productos en la tienda virtual CheemsMart.
	 *
         * @throws SaldoInsuficienteException si el saldo en la cuenta bancaria es insuficiente.
	 */
	public void comprar(double valorCompra) throws SaldoInsuficienteException;
}
