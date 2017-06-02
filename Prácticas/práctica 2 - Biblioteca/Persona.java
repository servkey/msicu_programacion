public class Persona{
	private String nombre;
	private String fechaNacimiento;
	private String correo;
	private String enfermedades;
	
	public Persona(){

	}
		
	public Persona(String nombre, String fechaNacimiento, String correo, String enfermedades){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.correo = correo;
		this.enfermedades = enfermedades;
	}
	
	public String toString(){
		String resultado = "toString: Nombre: " + nombre + "\nFecha de nacimiento: " + fechaNacimiento + "\nCorreo: " + correo + "\nEnfermedades: " + enfermedades;
		return resultado;
	}


	public void mostrar(){
		System.out.println("***********************");
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaNacimiento);
		System.out.println("Correo: " + correo);
		System.out.println("Enfermedades: " + enfermedades);
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getFechaNacimiento(){
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo(){
		return correo;
	}

	public void setCorreo(String correo){
		this.correo = correo;
	}

	public String getEnfermedades(){
		return enfermedades;
	}

	public void setEnfermedades(String enfermedades){
		this.enfermedades = enfermedades;
	}

}