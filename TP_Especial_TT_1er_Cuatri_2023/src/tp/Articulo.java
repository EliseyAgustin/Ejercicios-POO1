package tp;

public class Articulo {
	protected String titulo;
	protected String genero;
	
	
	public Articulo() {
		this.titulo = "no definido";
		this.genero = "no definido";
		
	}
	
	public Articulo(String titulo) {
		this.genero="no definido";
		this.titulo=titulo;
	}
	
	public Articulo (String titulo,String genero) {
		this.titulo=titulo;
		this.genero=genero;
	}
}
