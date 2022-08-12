package circulo;

public class Cuadrado {

	private double lado;
	private Punto ii;

	public Cuadrado(double lado, Punto ii) {

		this.lado = lado;
		this.ii = ii;
	}

	public void desplazar(double a, double b) {
		ii.desplazar(a, b);
	}

	public String toString() {
		return "Cuadrado [lado=" + lado + ", ii=" + ii + "]";
	}

}
