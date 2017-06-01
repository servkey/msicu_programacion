public class Trabajador extends Persona{
	private int numeroPersonal;


	public Trabajador(String nombre, String fechaNacimiento, String correo, String enfermedades, int numeroPersonal){

		super(nombre, fechaNacimiento, correo, enfermedades);
		this.numeroPersonal = numeroPersonal;
	}

	public int getNumeroPersonal(){
		return numeroPersonal;
	}

	public void setNumeroPersonal(int numeroPersonal){
		this.numeroPersonal = numeroPersonal;
	}
}