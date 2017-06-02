public class Estudiante{
	//Características
	private String matricula;	

	//Operaciones
	public void estudiar(){
		Persona p = new Persona();
		p.setNombre("Juan");
		p.caminar();

		System.out.println("Estudiando...");
	}	
}