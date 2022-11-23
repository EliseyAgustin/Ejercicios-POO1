package stack;

import java.util.ArrayList;

import libro.Libro;

public class LibreriaArrays {
	
	private ArrayList<Libro> libros;
	
	
	public LibreriaArrays(ArrayList<Libro> libros) {
		this.libros = libros;
	}


	public ArrayList<Libro> getLibros() {
		return libros;
	}


	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}


	public ArrayList<Libro> buscarLibrosPorAutor(String autor){
		ArrayList<Libro> librosEncontrados = new ArrayList<Libro>();
		for (Libro libro : libros) {
			if (libro.getAutor().equals(autor)) {
				librosEncontrados.add(libro);
			}
		}
		return librosEncontrados;
	}
	
	
	public static void main(String[] args) {
		
		Libro libroPrincipito =  new Libro ("Principito", "Jack Sparrow");
		Libro libroDeLaSelva =  new Libro ("El libro de la Selva", "Juan Disney");
		Libro libroHarryPotter =  new Libro ("Harry Potter y la piedra filosofal", "JK Rowling");
		
		Libro libroHarryPotter2 =  new Libro ("Harry Potter y la camara secreta", "JK Rowling");

		ArrayList<Libro> librosArraylist = new ArrayList<Libro>(3); 
		
		librosArraylist.add(libroHarryPotter);
		librosArraylist.add(libroPrincipito);
		librosArraylist.add(libroDeLaSelva);
		librosArraylist.add(libroHarryPotter2);
		
		LibreriaArrays unaLibreria = new LibreriaArrays(librosArraylist);
		
		ArrayList<Libro> librosRowling = unaLibreria.buscarLibrosPorAutor("JK Rowling");
		
		System.out.println(librosRowling);
		
		
//		System.out.println(librosArraylist);
//		for (int i = 0; i < librosArraylist.size(); i++) {
//			System.out.println(librosArraylist.get(i));
//		}
		
		
		//Stack<Libro>
		
		
		
		
	}

}
