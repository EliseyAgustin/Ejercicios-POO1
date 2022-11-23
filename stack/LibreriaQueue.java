package stack;

import java.util.LinkedList;
import java.util.Queue;

import libro.Libro;

public class LibreriaQueue {
	
	private Queue<Libro> libros;
	
	
	public LibreriaQueue(Queue<Libro> libros) {
		this.libros = libros;
	}


	public Queue<Libro> getLibros() {
		return libros;
	}


	public void setLibros(Queue<Libro> libros) {
		this.libros = libros;
	}


	public Queue<Libro> buscarLibrosPorAutor(String autor){
		Queue<Libro> librosEncontrados = new LinkedList<Libro>();
		
		for (int i = 0; i < libros.size(); i++) {
			Libro libro = libros.poll();
			if(libro.getAutor().equals(autor)) {
				librosEncontrados.offer(libro);
			}
			libros.offer(libro);
		}

		return librosEncontrados;
	}
	
	public static void main(String[] args) {
		
		Libro libroPrincipito =  new Libro ("Principito", "Jack Sparrow");
		Libro libroDeLaSelva =  new Libro ("El libro de la Selva", "Juan Disney");
		Libro libroHarryPotter =  new Libro ("Harry Potter y la piedra filosofal", "JK Rowling");
		
		Libro libroHarryPotter2 =  new Libro ("Harry Potter y la camara secreta", "JK Rowling");

		Queue<Libro> libros = new LinkedList<Libro>(); 
		
		libros.offer(libroHarryPotter);
		libros.offer(libroPrincipito);
		libros.offer(libroDeLaSelva);
		libros.offer(libroHarryPotter2);
		
		
		
		
		
		LibreriaQueue unaLibreria = new LibreriaQueue(libros);

		int size = libros.size();

		for (int i = 0; i < size; i++) {
			System.out.println(libros.poll());
		}
		
		System.out.println(unaLibreria.getLibros());
		
		Queue<Libro> librosRowling = unaLibreria.buscarLibrosPorAutor("JK Rowling");
		
		System.out.println(librosRowling);
	}

}