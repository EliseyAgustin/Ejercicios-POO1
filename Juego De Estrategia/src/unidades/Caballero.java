package unidades;

//Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto
//rebelde. Infringe un daño de 50 puntos y comienza con 200 de salud. Un caballo se pone rebelde
//luego de 3 ataques, y puede calmarse si recibe una poción de agua.

public class Caballero extends Unidades {
	private Caballo c;
	private final int DANIO = 50;

	public Caballero(double salud, Punto posicion, Caballo c) {
		super(salud, posicion);
		this.setC(c);
	}

	@Override
	public void atacar(Unidades u) {
		if (this.puedeAtacar(u)) {
			u.recibirDanio(DANIO);
			//this.c.incrementarAtaques();
		}

	}

	protected int getDANIO() {
		return DANIO;
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return (!u.estaMuerta() && this.distancia(u) >= 1 && this.distancia(u) <= 2);
	}

	@Override
	public Integer getDanio() {
		return null;
	}

	@Override
	public void recibirDanio(double d) {
		
	}

	public Caballo getC() {
		return c;
	}

	public void setC(Caballo c) {
		this.c = c;
	}

	

}