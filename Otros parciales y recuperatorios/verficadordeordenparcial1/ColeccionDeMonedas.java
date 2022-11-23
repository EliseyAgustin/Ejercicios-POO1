package verficadordeordenparcial;

public class ColeccionDeMonedas {
	private Moneda [] monedas;
	private int cantMonedas = 0;
	private Moneda agregarMoneda = null;

	public ColeccionDeMonedas(int maxCantMonedas) {
		this.monedas = new Moneda[maxCantMonedas];
	}
	
	public void agregarMoneda(String origen, int anio, int valorNominal) {
		if(cantMonedas >= this.monedas.length)
			throw new Error("No hay mas espacio");
		
		monedas[cantMonedas] = new Moneda(origen, anio, valorNominal);
		if(cantMonedas == 0)
			this.agregarMoneda = monedas[0];
		else if(anio > agregarMoneda.getAnio())
			agregarMoneda = monedas[cantMonedas];
		cantMonedas++;
	}
	
	public int cuentaMonedasDe(String pais) {
		int contarMonedasPais = 0;
		for (int i = 0; i < cantMonedas; i++)
			if(monedas[i].getPais().equals(pais))
				contarMonedasPais++;
			
			return contarMonedasPais;
		
	}
	
	public int anioDeLaMonedaMasAntigua() {
		int monedaMasAntigua = 0;
		for (int i = 0; i < monedas.length; i++) {
			if(monedas[i].getAnio() < monedas[monedaMasAntigua].getAnio())
				monedaMasAntigua++;
		}
		return monedaMasAntigua;
	}

}
