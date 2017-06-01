public class BibliotecaApp{
	private static void mostrarInformacionPersona(Persona persona){
		if (persona != null){ 
				System.out.println("Nombre: " + persona.getNombre());
				System.out.println("Correo: " + persona.getCorreo());
		}
	}


	public static void main(String[] arg){
		System.out.println("Bienvenido al sistema de biblioteca!");

		Socio socio1 = new Socio("Socio1", "10/10/1989", "socio1@uv.mx", "gripa", "s17039381");
		Socio socio2 = new Socio("Socio2", "20/10/1999", "socio2@uv.mx", "gastritis", "s1839381");
		Socio socio3 = new Socio("Socio3", "25/06/1999", "socio3@uv.mx", "locura", "s1710301");


		Trabajador trabajador1 = new Trabajador("Trabajador1", "04/09/1959", "trabajador1@uv.mx", "", 4042);
	

			
		Socio[] baseSocios = new Socio[3];
		baseSocios[0] = socio1;
		baseSocios[1] = socio2;
		baseSocios[2] = socio3;


		Trabajador[] baseTrabajadores = new Trabajador[3];
		baseTrabajadores[0] = trabajador1;

		int indice = 0;		

		for (int i = 0;  i < baseSocios.length; i++){
			Socio stmp = baseSocios[i];
			BibliotecaApp.mostrarInformacionPersona(stmp);
		}

		for (int i = 0;  i < baseTrabajadores.length; i++){
			Trabajador ttmp = baseTrabajadores[i];
			BibliotecaApp.mostrarInformacionPersona(ttmp);	
		}

		


	}
}