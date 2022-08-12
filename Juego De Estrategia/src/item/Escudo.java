package item;

import unidades.Unidades;

public class Escudo extends Item {

	public Escudo(Unidades unidad) {
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
		this.unidad.recibirDanio(danio * 0.4);
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