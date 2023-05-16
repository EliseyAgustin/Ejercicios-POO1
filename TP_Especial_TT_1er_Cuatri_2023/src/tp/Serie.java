package tp;

public class Serie extends Articulo implements Entregable{
	
	//private String titulo;
	private int NumTemp;
	private boolean entregado;
	//private String genero;
	private String creador;
	
	public Serie() {
		super();
		NumTemp = 3;
		entregado = false;
		//titulo = "";
		//genero = "";
	}
	
	public Serie(String titulo, String creador) {
		//this.titulo = titulo;
		super(titulo);
		this.creador = creador;
		this.entregado = false;
	}
	
	public Serie(String titulo, int NumTemp, String genero, String creador) {
		//this.titulo = titulo;
		super(titulo,genero);
		this.NumTemp = NumTemp;
		//this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemp() {
		return NumTemp;
	}

	public void setNumTemp(int numTemp) {
		NumTemp = numTemp;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Nombre de la Serie: " + getTitulo() + ", Numero de temporadas: " + getNumTemp() + ", Genero: " + getGenero()
				+ ", Creador: " + getCreador();
	}

	public void entregar() {
	   entregado = true;
	}

	public void devolver() {
		entregado = false;
	}

	public boolean isEntregado() {
		return entregado;
	}
	
	public int compareTo(Serie serie) {
		 return this.getNumTemp() - serie.getNumTemp();
	}
	
}
