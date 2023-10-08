public class Persona{
	
	private String nombre;
	private String direccion;
	private int telefono;
	
	public Persona(String nombre, String direccion, int telefono){
		this.nombre= nombre;
		this.direccion=direccion;
		this.telefono=telefono;
	}
	
	public String nombre(){
		return nombre;
	}
	
	public String direccion(){
		return direccion;
	}
	
	public int telefono(){
		return telefono;
	}
	
}