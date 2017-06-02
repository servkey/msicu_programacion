/*
Clase Persona: Primer programa en JAVA
Fecha: Abril 2016
*/
public class Persona{
	//Propiedades
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private int edad;

	//Operaciones
	public void caminar(){
		System.out.println(nombre + " está caminando....!");
	}

	public void correr(){
		System.out.println(nombre + " está corriendo....!");
	}

	public static void main(String[] args){
		System.out.println("Hola desde el método main");			//Construir una persona
		Persona p = new Persona();	
	
		p.nombre = "Luis";
		p.apellidoPaterno = "Montané";

		p.caminar();
	}
}