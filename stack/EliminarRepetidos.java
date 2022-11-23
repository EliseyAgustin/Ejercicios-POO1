package stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class EliminarRepetidos {
	
	public static List<Integer> eliminarRepetidos(List<Integer> listaConRepetidos){
	
		Set<Integer> setAux = new TreeSet<Integer>();
		List<Integer> listaAux = new ArrayList<Integer>();
		
		for (Integer cadaUno : listaConRepetidos) 
			setAux.add(cadaUno);
		
		for (Integer cadaUno : setAux) 
			setAux.add(cadaUno);
		
		return listaAux;
	}
	
	public static List<Integer> invertirLista(List<Integer> lista) {
		List<Integer> aux = new ArrayList<Integer>();
		Stack<Integer> pila = new Stack<Integer>();
				
		for(Integer cadaUno : lista) {
			pila.push(cadaUno);	
		}
		
		while(!pila.isEmpty()) {
			aux.add(pila.pop());
		}
		return aux;
	}


	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		a.add(1);
		a.add(4);
		a.add(4);
		a.add(3);
		a.add(-1);
		a.add(1);
		a.add(3);
		b.add(4);
		
		List<Integer> invertirLista = new LinkedList<Integer>();
		
		invertirLista.add(1);
		invertirLista.add(2);
		invertirLista.add(3);
		invertirLista.add(4);
		invertirLista.add(5);
		
		Collections.reverse(invertirLista);
		
		System.out.println(invertirLista);
	}
}
