public class Main{
	final int x = 10;
		
	public static void main(String[] args){
		//Construcción de un objeto Trabajador
		Trabajador t = new Trabajador("Juan","juan@uv.mx");	
		//t.mostrar();
	
		t.setNombre("Luis");
		System.out.println(t.getNombre()); 
	}
}