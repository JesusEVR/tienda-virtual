public class Cuenta{
	protected Persona persona;
	
	public Cuenta(Persona persona){
		this.persona=persona;
	}
	
	public String nombre(){
		return persona.nombre();
	}
	
	public String direccion(){
		return persona.direccion();
	}
	
	public int telefono(){
		return persona.telefono();
	}

}