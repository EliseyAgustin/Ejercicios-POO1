package torneo;

public class Disparo implements Comparable<Disparo>{
	private int nroParticipante;
	private Punto coordenada;
	
	public Disparo(int nroParticipante, double x, double y) {
		
		this.nroParticipante = nroParticipante;
		this.coordenada = new Punto(x,y);
		if (esDisparoInvalido()) {
			throw new DisparoInvalidoException("Disparo Inválido");
		}
	}
	
	private boolean esDisparoInvalido() {
		return getDistanciaAlCentro() > 50;
	}

	public int getNroParticipante() {
		return nroParticipante;
	}

	public double getDistanciaAlCentro() {
		return this.coordenada.distanciaA(new Punto(0.0,0.0));
	}
	
	public int getPuntaje() {
		double distancia = this.getDistanciaAlCentro();
		
		if (distancia > 40) {
			return 50;
		} else if (distancia > 30) {
			return 100;
		} else if (distancia > 20) {
			return 200;
		} else if (distancia > 10) {
			return 500;
		} else {
			return 1000;
		}
		
	}

	@Override
	public int compareTo(Disparo o) {
		return Integer.compare(o.getPuntaje(), this.getPuntaje());
	}

	@Override
	public String toString() {
		return "Puntaje = "+ this.getPuntaje();
	}
	
	
}
