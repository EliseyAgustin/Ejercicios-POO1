package mapas;

import java.util.Map;
import java.util.TreeMap;

import libro.ISBN;
import libro.Libro;

public class LibreriaTreeMap {
	
	public static void main(String[] args) {
		Libro libroPrincipito = new Libro ("Principito", "Jack Sparrow");
		Libro libroDeLaSelva = new Libro ("El libro de la Selva", "Juan Disney");
		Libro libroHarryPotter = new Libro ("Harry Potter y la piedra filosofal", "JK Rowling");
		Libro libroHarryPotter2 = new Libro ("Harry Potter y la camara secreta", "JK Rowling");
		
		TreeMap<ISBN, Libro> treeMapLibros =  new TreeMap<ISBN,Libro>();
		
		treeMapLibros.put(new ISBN("1-0-3"), libroPrincipito);
		treeMapLibros.put(new ISBN("6-0-3"), libroHarryPotter2);
		treeMapLibros.put(new ISBN("2-0-3"), libroDeLaSelva);
		treeMapLibros.put(new ISBN("E-0-3"), libroHarryPotter);
		
		
		for(Map.Entry<ISBN, Libro> entry : treeMapLibros.entrySet()) {
			ISBN key = entry.getKey();
			Libro value = entry.getValue();
			System.out.println(key);
			System.out.println(value);
		}
		
//		System.out.println(treeMapLibros);
		
		
	}
	
}