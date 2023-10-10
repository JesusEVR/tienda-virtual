import java.util.LinkedList;
import java.util.Scanner;

public class CheemsMart{
	
	private LinkedList<CuentaCheemsMart> listaUsuarios = new LinkedList<>();
	private Scanner sc = new Scanner(System.in);
	private CuentaCheemsMart usuarioActual;
	private boolean existeUsuario=false;
	
	public CheemsMart(){
	}
	
	public void agregarCliente(CuentaCheemsMart nuevoUsuario){
		listaUsuarios.add(nuevoUsuario);
	}
	
	public boolean existeUsuario(){
		return existeUsuario;
	}
	
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
					existeUsuario=true;
				}
			}
			if(!existeUsuario) System.out.println("\n		Los datos ingresados son incorrecto o el usuario no existe \n"); 
		
	}
	
	public void asignarIdioma(){
		System.out.println("asignando idioma...");
	}
	
	public void entrarAlaTienda(){
		System.out.println("entrando a la tienda....");
	}

}