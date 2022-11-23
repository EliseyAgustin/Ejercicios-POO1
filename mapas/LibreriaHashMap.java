package mapas;

import java.util.HashMap;
import java.util.Map;

import libro.ISBN;
import libro.Libro;


public class LibreriaHashMap {

	    public static void main(String[] args) {
			Libro libroPrincipito = new Libro("Principito", "Jack Sparrow");
			Libro libroDeLaSelva = new Libro("El libro de la Selva", "Juan Disney");
			Libro libroHarryPotter = new Libro("Harry Potter y la piedra filosofal", "JK Rowling");

			Libro libroHarryPotter2 =  new Libro ("Harry Potter y la camara secreta", "JK Rowling");
			
			
			HashMap<ISBN, Libro> hashMapLibros = new HashMap<ISBN,Libro>();
			ISBN unIsbn= new ISBN("1-0-3");
			hashMapLibros.put(unIsbn, libroPrincipito);
			hashMapLibros.put(new ISBN("2-0-3"), libroDeLaSelva);
			hashMapLibros.put(new ISBN("E-0-3"), libroHarryPotter);
			hashMapLibros.put(new ISBN("6-0-3"), libroHarryPotter2);
			
//			Libro libro1 = hashMapLibros.get("Jack Sparrow");
			
//			System.out.println(hashMapLibros.keySet());
//			System.out.println(hashMapLibros.values());
//			System.out.println(hashMapLibros.get(new ISBN("1-0-3")));
			
			for(Map.Entry<ISBN, Libro> entry : hashMapLibros.entrySet()) {
				ISBN key = entry.getKey();
				Libro value = entry.getValue();
				System.out.println(key);
				System.out.println(value);
			}
//			System.out.println(hashMapLibros.containsKey(new ISBN("1-0-3")));
//			System.out.println(hashMapLibros.containsKey(new ISBN("45345345")));
			
			

		}
	}


	
