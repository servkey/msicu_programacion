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
		System.out.println(nombre + " est� caminando....!");
	}

	public void correr(){
		System.out.println(nombre + " est� corriendo....!");
	}

	public static void main(String[] args){
		System.out.println("Hola desde el m�todo main");			//Construir una persona
		Persona p = new Persona();	
	
		p.nombre = "Luis";
		p.apellidoPaterno = "Montan�";

		p.caminar();
	}
}