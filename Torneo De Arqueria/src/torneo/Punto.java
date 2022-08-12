package torneo;

public class Punto {

	private Double x;
	private Double y;

	public Punto(Double x, Double y) {
		this.x = x;
		this.y = y;
	}

	public Double distanciaA(Punto p) {
		double diferenciaEnX = this.getX() - p.getX();
		double diferenciaEnY = this.getY() - p.getY();
		return Math.hypot(diferenciaEnX, diferenciaEnY);
	}

	public Double getX() {
		return x;
	}

	public Double getY() {
		return y;
	}

	@Override
	public String toString() {
		return x + ","+ y;
	}
}
