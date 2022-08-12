package item;

import unidades.Unidades;

public class Punial extends Item {

	public Punial(Unidades unidad) {
		super(unidad);
	}

	@Override
	public void atacar(Unidades u) {
		this.unidad.atacar(u);
	}

	@Override
	public boolean puedeAtacar(Unidades u) {
		return this.unidad.puedeAtacar(u);
	}
	
	@Override
	public void recibirDanio(double danio) {
		this.unidad.setSalud(this.unidad.getSalud()- danio - 3);
	}
	
	@Override
	public void infringirDanio(Unidades u) {
		u.recibirDanio(this.getDanio() + 3);
	}
	
	@Override
	public String toString() {
		return "Escudo [ " + unidad.toString() + " ] "; 
	}

	@Override
	public Integer getDanio() {
		return null;
	}

}