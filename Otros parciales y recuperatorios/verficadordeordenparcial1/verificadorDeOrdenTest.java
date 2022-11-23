package verficadordeordenparcial;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class verificadorDeOrdenTest {

	@Test
	public void estaOrdenadoTest() {
		verificadorDeOrden verificar = new verificadorDeOrden();
		int [] v1 = {54, 25, 86, 12, 65};
		int [] v2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] v3 = {1, 1, 1, 1, 1, 1, 1, 1};
	
	    assertTrue(verificar.estaOrdenadoAscendentemente(v1));
		assertTrue(verificar.estaOrdenadoAscendentemente(v2));
		assertTrue(verificar.estaOrdenadoAscendentemente(v3));
	}

}
