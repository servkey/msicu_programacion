public class Copia{
	private String identificadorLocal;	
	private Libro libro;

	public Copia(Libro libro, String identificadorLocal){
		this.identificadorLocal = identificadorLocal;
		this.libro = libro;
	}
	
	public Libro getLibro(){
		return libro;
	}

	public String getIdentificadorLocal() throws CampoVacioCopiaException{
		if (identificadorLocal.equals("")){
			throw new CampoVacioCopiaException();
		}
		return identificadorLocal;
	}
}