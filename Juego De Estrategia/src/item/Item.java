package item;

import unidades.Unidades;

public abstract class Item extends Unidades {
	
	protected Unidades unidad;
	
	public Item(Unidades unidad) {
		super(unidad.getSalud(), unidad.getPosicion());
		this.unidad = unidad;
	}

	public void infringirDanio(Unidades u) {
		u.recibirDanio(this.getDanio());
		
	}

}