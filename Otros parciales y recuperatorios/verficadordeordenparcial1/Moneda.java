package verficadordeordenparcial;

public class Moneda {
	
	private String origen;
	private int anio;
	private int valorNominal;
	
	public Moneda(String origen, int anio, int valorNominal) {
		this.origen = origen;
		this.anio = anio;
		this.valorNominal = valorNominal;
	}

	public String getOrigen() {
		return origen;
	}

	public int getAnio() {
		return anio;
	}

	public int getValorNominal() {
		return valorNominal;
	}

	public String getPais() {
		return origen;
	}	

}
