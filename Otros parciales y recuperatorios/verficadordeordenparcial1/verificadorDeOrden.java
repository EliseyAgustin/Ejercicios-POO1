package verficadordeordenparcial;

public class verificadorDeOrden {
	
	private boolean esAscendente = true;
	private boolean esDescendente = true;
	
	public boolean estaOrdenadoAscendentemente(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] < vector[i + 1]+ 1) {
				return esAscendente;
			}
		}
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] > vector[i - 1]- 1) {
				return esDescendente;
			}
		}
		return false;
	}
	
	
}
