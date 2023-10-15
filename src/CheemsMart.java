import java.util.LinkedList;
import java.util.Scanner;

public class CheemsMart{
	
	private LinkedList<CuentaCheemsMart> listaUsuarios = new LinkedList<>();
	private Scanner sc = new Scanner(System.in);
	private CuentaCheemsMart usuarioActual;
	private boolean existeUsuario=false;
	private TiendaVirtual tienda;
	
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
					tienda = new TiendaVirtual(usuarioActual);
					existeUsuario=true;
				}
			}
			if(!existeUsuario) System.out.println("\n		Los datos ingresados son incorrectos o el usuario no existe \n"); 
		
	}
	
	public void asignarIdioma(){
		if(usuarioActual.pais().toLowerCase().equals("mexico")){
			tienda.asignarIdioma(tienda.espaniolLatino());
		
		}/*else if(usuarioActual.pais().toLowerCase().equals("españa")){
			tienda.asignarIdioma(tienda.espaniol());
		
		}else if(usuarioActual.pais().toLowerCase().equals("eeuu")){
			tienda.asignarIdioma(tienda.ingles());
		}*/
	
	}
	
	public void entrarAlaTienda(){
		tienda.saludar();
		tienda.ofertas();
		tienda.entrarTienda();
		tienda.ticket();
		tienda.despedir();	
		existeUsuario=false;
	}

}
