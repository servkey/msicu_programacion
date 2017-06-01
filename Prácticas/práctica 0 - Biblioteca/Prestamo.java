public class Prestamo{
	private String fechaPrestamo;
	private String fechaDevolucion;
	
	//Relaciones
	private Copia[] copias = new Copia[10];
	private Trabajador trabajador;
	private Socio socio;

	public Prestamo(Trabajador trabajador, Socio socio, Copia[] copias){
		this.fechaPrestamo = "10/10/2017";
		this.fechaDevolucion = "Calculada..";
		this.copias = copias;
		this.trabajador = trabajador;
		this.socio = socio;
	}	

	public void asignarTrabajador(Trabajador trabajador){
		this.trabajador = trabajador;
	}

	public void asignarSocio(Socio socio){
		this.socio = socio;
	}

	public Copia[] getCopia(){
		return copias;
	}	 

	public Trabajador getTrabajador(){
		return trabajador;
	}

	public Socio getSocio(){
		return socio;
	}

}