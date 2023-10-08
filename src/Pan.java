/**
* Clase que define la información del artículo pan
*
* @author paolasanv
* @author Supr-Lilito
* @author JesusEVR
* @version octubre 2023
* @see Articulo
*
*/
public class Pan implements Articulo{
	
	public Pan(){
	}
	
	public double precio(){
		return 25;
	}
	public String informacion(){
		return "Código: " +codigoBarras()+ " Artículo: Pan de caja integral"+"\n"+ "	Precio: " +precio();
	}
	public int codigoBarras(){
		return 1000;
	}
}