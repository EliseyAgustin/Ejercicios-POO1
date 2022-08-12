package unidades;

public abstract class Unidades {
	
	protected double salud;
	protected Punto posicion;
	protected int danio;
	
	public Unidades(double salud2, Punto posicion2) {
		this.salud = salud2;
		this.posicion = posicion2;
	}
	

	public abstract void atacar(Unidades u);

	public abstract boolean puedeAtacar(Unidades u);

	public boolean estaMuerta() {
		return this.salud == 0;
	}
	
	public double distancia(Unidades u) {
		return this.posicion.distancia(u.posicion);
	}
	
	public void recibirDanio(int danio) {
		this.salud -= danio;
	}
	
	public double getSalud() {
		return salud;
	}

	public int getFlechas(int flechas) {
		return flechas;
	}

	public Punto getPosicion() {
		return this.posicion;
	}
	
	public int setDanio(int i) {
		return danio;
	}
	
	public abstract Integer getDanio(); 

	public abstract void recibirDanio(double d);


	public void setSalud(double d) {
		// TODO Auto-generated method stub
		
	}

}