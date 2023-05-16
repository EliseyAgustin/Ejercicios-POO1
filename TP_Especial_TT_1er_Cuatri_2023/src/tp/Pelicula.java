package tp;

public class Pelicula extends Articulo implements Entregable{
	
	//private String titulo;
	private int anio;
	private boolean entregado;
	//private String genero;
	private String director;
	
	public Pelicula() { //Constructor default
		//this.genero = "no definido";
		super();
	    this.entregado = false;
	}
	
	public Pelicula(String titulo, String director) { 
		 //this.titulo = titulo;
		super(titulo);
	     this.director = director;
	    // this.genero = "no definido";
	     this.entregado = false;
	}
	
	public Pelicula(String titulo, int anio, String genero, String director) {
		//this.titulo = titulo;
		super(titulo,genero);
        this.anio = anio;
        //this.genero = genero;
        this.director = director;
        this.entregado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Nombre de la pelicula: " + getTitulo() + ", Anio: " + getAnio() + ", Genero: " + getGenero()
				+ ", Director: " + getDirector();
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

	public int compareTo(Pelicula pelicula) {
		 return this.getAnio() - pelicula.getAnio();
    }

}
