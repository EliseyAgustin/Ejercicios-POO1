package mapas;

import java.util.LinkedHashMap;

import libro.ISBN;
import libro.Libro;

public class LibreriaLinkedHashMap {

	
	public static void main(String[] args) {
		Libro libroPrincipito =  new Libro ("Principito", "Jack Sparrow");
		Libro libroDeLaSelva =  new Libro ("El libro de la Selva", "Juan Disney");
		Libro libroHarryPotter =  new Libro ("Harry Potter y la piedra filosofal", "JK Rowling");
		Libro libroHarryPotter2 =  new Libro ("Harry Potter y la camara secreta", "JK Rowling");
		
		LinkedHashMap<ISBN, Libro> linkedHashMapLibros =  new LinkedHashMap<ISBN,Libro>();
		linkedHashMapLibros.put(new ISBN("1-0-3"), libroPrincipito);
		linkedHashMapLibros.put(new ISBN("6-0-3"), libroHarryPotter2);
		linkedHashMapLibros.put(new ISBN("2-0-3"), libroDeLaSelva);
		linkedHashMapLibros.put(new ISBN("E-0-3"), libroHarryPotter);
		
		System.out.println(linkedHashMapLibros.values());

	}
}
