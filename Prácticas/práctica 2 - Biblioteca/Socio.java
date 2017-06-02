public class Socio extends Persona{
	private String matricula;

	public Socio(String nombre, String fechaNacimiento, String correo, String enfermedades, String matricula){

		super(nombre, fechaNacimiento, correo, enfermedades);
		this.matricula = matricula;
	}

	public String getMatricula(){
		return matricula;
	}

	public void setMatricula(String matricula){
		this.matricula = matricula;
	}

	public void mostrar(){
		super.mostrar();
		System.out.println("Matrícula: " + matricula);
		System.out.println("***********************");
	}
}