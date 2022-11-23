package parcial;

import java.util.LinkedList;
import java.util.List;

/*
 * Escribir un m�todo que reciba dos listas como par�metros  y devuelva una tercera lista que sea la diferencia sim�trica entre la primera y la segunda. 
 * La diferencia sim�trica entre dos listas son los objetos que est�n en la primera lista pero no en la segunda y los de la segunda que no est�n en la primera. Considere que los objetos que est�n contenidos en las listas tienen �rden total (Implementan Comparable y tienen implementado su propio equals y hashCode). 

    public List<T> diferenciaSimetrica(List<T> l1, List<T> l2){
        //TODO
    }
 */

public class Listas <T>{
	
	public List<T> diferenciaSimetrica(List<T> l1, List<T> l2){
		List<T> diferenciaSimetrica = new LinkedList<T>();
		//Recorro l1
		for (T cadaElementoEnL1 : diferenciaSimetrica) {
			if(!l2.contains(cadaElementoEnL1))
				diferenciaSimetrica.add(cadaElementoEnL1);
		}
		//Recorro l2
		for (T cadaElementoEnL2 : diferenciaSimetrica) {
			if(!l1.contains(cadaElementoEnL2))
				diferenciaSimetrica.add(cadaElementoEnL2);
		}
		
		return diferenciaSimetrica;
	}

}
