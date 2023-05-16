package tp;

public class Videojuego extends Articulo implements Entregable{

	//private String titulo;
	private int horasEst;
	private boolean entregado;
	//private String genero;
	private String compania;
	
	public Videojuego() {
		super();
		horasEst = 10;
		entregado = false;
		//titulo = "";
		//genero = "";
		compania = "";
	}
	
	public Videojuego(String titulo, int HorasEst) {
		//this.titulo = titulo;
		super(titulo);
		this.horasEst = HorasEst;
	}
	
	public Videojuego(String titulo, int HorasEst, String genero, String compania) {
		super(titulo);
		//this.titulo = titulo;
		this.horasEst = HorasEst;
		//this.genero = genero;
		this.compania = compania;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEst() {
		return horasEst;
	}

	public void setHorasEst(int horasEst) {
		this.horasEst = horasEst;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public String toString() {
		/*return "Videojuego [getTitulo()=" + getTitulo() + ", getHorasEst()=" + getHorasEst() + ", getGenero()="
				+ getGenero() + ", getCompania()=" + getCompania() + "]";*/
		return "Nombre del Videojuego: " + getTitulo() + ", Horas estimadas: " + getHorasEst() + ", Genero: " + getGenero()
		+ ", Compania: " + getCompania();
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
	
	public int compareTo(Videojuego videojuego) {
		 return this.getHorasEst() - videojuego.getHorasEst();
	}
	
}
