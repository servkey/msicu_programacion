public class Libro{
	private String titulo;
	private String autor;
	private String anio;
	private String isbn;

	private Copia[] copias = new Copia[10];
	private int indice = 0;

	public Libro(String titulo, String autor, String anio, String isbn){
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.isbn = isbn;	
	}

	public void agregarCopia(String identificador){
		Copia c = new Copia(this, identificador);
		copias[indice++] = c;		
	}

	public Copia[] getCopias(){
		return copias;
	}

	public String getTitulo(){
		return titulo;
	}

	public String getAutor(){
		return autor;
	}

	public String getAnio(){
		return anio;
	}

	public String getISBN(){
		return isbn;
	}
}