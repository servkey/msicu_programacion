public class BibliotecaApp{
	
	private static void mostrarInformacionPersona(Persona persona){
		if (persona != null){ 
				System.out.println("Nombre: " + persona.getNombre());
				System.out.println("Correo: " + persona.getCorreo());
		}
	}


	public static void main(String[] arg){
		System.out.println("Bienvenido al sistema de biblioteca!");

		Persona p1 = new Persona("Persona1", "11/04/1949", "persona1@uv.mx", "algo");
		p1.mostrar();

		Persona p2 = new Socio("Socio0", "16/01/1978", "socio0@uv.mx", "algo1", "s1678881");

		Socio socio1 = new Socio("Socio1", "10/10/1989", "socio1@uv.mx", "gripa", "s17039381");
		socio1.mostrar();

		Socio socio2 = new Socio("Socio2", "20/10/1999", "socio2@uv.mx", "gastritis", "s1839381");
		Socio socio3 = new Socio("Socio3", "25/06/1999", "socio3@uv.mx", "locura", "s1710301");
		
		Socio socio4 = new Socio("Socio3", "25/06/1999", "socio3@uv.mx", "locura", "s1710301");

		Trabajador trabajador1 = new Trabajador("Trabajador1", "04/09/1959", "trabajador1@uv.mx", "", 4042);
		Trabajador trabajador2 = new Trabajador("Trabajador2", "10/12/1683", "trabajador2@uv.mx", "", 4044);
		Trabajador trabajador3 = new Trabajador("Trabajador2", "10/12/1683", "trabajador2@uv.mx", "", 4044);
				
		if (trabajador2 == trabajador3){
			System.out.println("Son iguales");
		}else{
			System.out.println("No son iguales");
		}


		/*if (socio3.getNombre().equals(socio4.getNombre())  && socio3.getFechaNacimiento().equals(socio4.getFechaNacimiento())){
			System.out.println("El socio4 con socio3 son iguales");
		}else{
			System.out.println("No son iguales s3 y s4");
		}*/

	
		String cad = trabajador1.toString();
		System.out.println(cad);
		
		/*
		Socio[] baseSocios = new Socio[3];
		baseSocios[0] = socio1;
		baseSocios[1] = socio2;
		baseSocios[2] = socio3;


		Trabajador[] baseTrabajadores = new Trabajador[3];
		baseTrabajadores[0] = trabajador1;


		Persona[] personasBase = new Persona[6];
		personasBase[0] = p1;
		personasBase[1] = p2;
		personasBase[2] = socio1;
		personasBase[3] = socio2;
		personasBase[4] = socio3;
		personasBase[5] = trabajador1;
		
		for(int i = 0; i < personasBase.length; i++){
				personasBase[i].mostrar();
		}


		int indice = 0;		

		for (int i = 0;  i < baseSocios.length; i++){
			Socio stmp = baseSocios[i];
			BibliotecaApp.mostrarInformacionPersona(stmp);
		}

		for (int i = 0;  i < baseTrabajadores.length; i++){
			Trabajador ttmp = baseTrabajadores[i];
			BibliotecaApp.mostrarInformacionPersona(ttmp);	
		}

	
		Libro l1 = new Libro("Algoritmos I", "alguien1", "1995","1239481-12");
		Libro l2 = new Libro("Algoritmos II", "alguien2", "2005","349444-11");
		Libro l3 = new Libro("Base de Datos", "alguien3", "1975","814092-14");

		Libro[] libroBase = new Libro[3];
		libroBase[0] = l1;
		libroBase[1] = l2;
		libroBase[2] = l3;
		
		l1.agregarCopia("1239481-12-3111");
		l1.agregarCopia("1239481-12-3112");

		l3.agregarCopia("8442111-33-5111");

		System.out.println("**************Mostrando información de libros ******************");
		for(int i = 0; i < libroBase.length; i++){
			Libro ltmp = libroBase[i];
			//Mostrar información de libro
			System.out.println("Titulo: " + ltmp.getTitulo());
			System.out.println("ISBN: " + ltmp.getISBN());
	
			System.out.println("\t**********Mostrando información de copias **************");
			
			//Motrar copias de libro
			Copia[] copiasL1 = ltmp.getCopias();
			for(int j = 0; j < copiasL1.length; j++){
				try{
					System.out.println("\tID Copia: " + copiasL1[j].getIdentificadorLocal());

				}catch(CampoVacioCopiaException e){
					System.out.println("ID copia no válido...");
				}catch(NullPointerException e){
					//System.out.println("Error en información incompleta");
					//e.printStackTrace();
				}catch(ArithmeticException e){

				}catch(Exception e){


				}finally{
										
				}
			}
		}

		int x = 20;
		int y = 15;
		x += x - y;
		x += 10; // x = x + 10;
		x++; //x = x + 1;
		
		int z = !true ? 20-1: 4+6;


		System.out.println("El resultado es: " + x);
		System.out.println("El resultado z es: " + z);

		int[][] matrix  = new int[3][4];

		matrix[0][0] = 10;
		matrix[0][1] = 5;
		matrix[0][2] = 6;
		matrix[0][3] = 16;

		matrix[1][0] = 13;
		matrix[1][1] = 0;
		matrix[1][2] = 1;
		matrix[1][3] = 31;

		matrix[2][0] = 21;
		matrix[2][1] = 50;
		matrix[2][2] = 69;
		matrix[2][3] = 50;


		for (int  i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[0].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		*/
 	}
}