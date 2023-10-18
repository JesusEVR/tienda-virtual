import java.util.LinkedList;
import java.util.Scanner;

/**
 * Clase que define las carateristicas de un CheemsMart.
 *
 * @author paolasanv
 * @author Supr-Lilito
 * @author JesusEVR
 * @version octubre 2023
 */
public class CheemsMart{
	/**
	 * Lista de usuarios que de la tienda virtual.
	 */
	private LinkedList<CuentaCheemsMart> listaUsuarios = new LinkedList<>();
	/**
	 * Objeto teclado que permite al usuario ingresar respuestas.
	 */
	private Scanner sc = new Scanner(System.in);
	/**
	 * Usuario que esta usando la tienda CheemsMart actualmente.
	 */
	private CuentaCheemsMart usuarioActual;
	/**
	 * Booleano que determina si hay usuario o no.
	 */
	private boolean existeUsuario = false;
	/**
	 * Objeto tienda virtual para el CheemsMart.
	 */
	private TiendaVirtual tienda;

	/**
         * Constructor por omision del CheemsMart.
         */
	public CheemsMart(){
	}

	/**
         * Agrega un usuario a la base de datos de la tienda.
	 *
         * @param nuevoUsuario El usuario a agregar.
         */
	public void agregarCliente(CuentaCheemsMart nuevoUsuario){
		listaUsuarios.add(nuevoUsuario);
	}

	/**
         * Devuelve el atributo existeUsuario.
	 *
         * @return 'true' si hay usuario en la tienda, 'false' en el otro caso.
         */
	public boolean existeUsuario(){
		return existeUsuario;
	}

	/**
         * Metodo que permite iniciar sesion a un cliente.
	 *
         */
	public void iniciarSesion(){
		if(listaUsuarios.isEmpty()) throw new UnsupportedOperationException();
		System.out.println("Ingrese sus datos:	");
		System.out.print("        Usuario/Username: ");
		String usuario = sc.nextLine();
		System.out.print("        Contraseña/Password: ");
		String contrasenia = sc.nextLine();

			for(CuentaCheemsMart cuenta: listaUsuarios){
				if(usuario.equals(cuenta.usuario()) && contrasenia.equals(cuenta.contrasenia())){
					usuarioActual = cuenta;
					tienda = new TiendaVirtual(usuarioActual);
					existeUsuario=true;
				}
			}
			if(!existeUsuario) System.out.println("\n		Los datos ingresados son incorrectos o el usuario no existe \n"); 
		
	}

	/**
         * Metodo que asigna el idioma de la tienda dependiendo del pais de origen del usuario.
	 *
         */
	public void asignarIdioma(){
		if(usuarioActual.pais().toLowerCase().equals("mexico")){
			tienda.asignarIdioma(tienda.espaniolLatino());
		
		}else if(usuarioActual.pais().toLowerCase().equals("españa")){
			tienda.asignarIdioma(tienda.espaniol());
		
		}else if(usuarioActual.pais().toLowerCase().equals("eeuu")){
			tienda.asignarIdioma(tienda.ingles());
		}
	
	}

	/**
         * Metodo que despliega el proceso principal/central de la tienda virtual CheemsMart.
	 *
         */
	public void entrarAlaTienda(){
		System.out.println("\n * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		tienda.saludar();
		tienda.ofertas();
		tienda.entrarTienda();
		tienda.ticket();
		tienda.despedir();	
		System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		existeUsuario=false;
	}

}
