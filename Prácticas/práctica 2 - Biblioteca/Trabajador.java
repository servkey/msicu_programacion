public class Trabajador extends Persona{
	private int numeroPersonal;


	public Trabajador(String nombre, String fechaNacimiento, String correo, String enfermedades, int numeroPersonal){

		super(nombre, fechaNacimiento, correo, enfermedades);
		this.numeroPersonal = numeroPersonal;
	}


	public boolean equals(Trabajador t){
		boolean resultado = false;

		if (this.getNombre().equals(t.getNombre())  && this.getFechaNacimiento().equals(t.getFechaNacimiento())){
			resultado = true;
		}else{
			resultado = false;
		}

		return resultado;
	}


	public int getNumeroPersonal(){
		return numeroPersonal;
	}

	public void setNumeroPersonal(int numeroPersonal){
		this.numeroPersonal = numeroPersonal;
	}

	public String toString(){
		String resultado = super.toString();
		return resultado + "\nNúmero personal: " + numeroPersonal;
	}

	public void mostrar(){
		super.mostrar();
		System.out.println("Número personal: " + numeroPersonal);
		System.out.println("***********************");
	}
}