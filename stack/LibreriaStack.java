package stack;

import java.util.Stack;

import libro.Libro;

public class LibreriaStack {
	
	private Stack<Libro> libros;
	
	
	public LibreriaStack(Stack<Libro> libros) {
		this.libros = libros;
	}


	public Stack<Libro> getLibros() {
		return libros;
	}


	public void setLibros(Stack<Libro> libros) {
		this.libros = libros;
	}


	public Stack<Libro> buscarLibrosPorAutor(String autor){
		Stack<Libro> librosEncontrados = new Stack<Libro>();
		Stack<Libro> libros = new Stack<Libro>();
		
		for (int i = 0; i < libros.size(); i++) {
			Libro libro = libros.pop();
			if(libro.getAutor().equals(autor)) {
				
			}
		}

		return librosEncontrados;
	}
	
	
	public static void main(String[] args) {
		
		Libro libroPrincipito =  new Libro ("Principito", "Jack Sparrow");
		Libro libroDeLaSelva =  new Libro ("El libro de la Selva", "Juan Disney");
		Libro libroHarryPotter =  new Libro ("Harry Potter y la piedra filosofal", "JK Rowling");
		
		Libro libroHarryPotter2 =  new Libro ("Harry Potter y la camara secreta", "JK Rowling");

		Stack<Libro> libros = new Stack<Libro>(); 
		
		libros.push(libroHarryPotter);
		libros.push(libroPrincipito);
		libros.push(libroDeLaSelva);
		libros.push(libroHarryPotter2);
		
		Libro ultimoDeLaPila = libros.peek();

		libros.push(libroHarryPotter);
		System.out.println(libros.get(2));
		System.out.println(ultimoDeLaPila);
		
//		LibreriaStack unaLibreria = new LibreriaStack(libros);
		
//		System.out.println(unaLibreria.getLibros());
		
//		Stack<Libro> librosRowling = unaLibreria.buscarLibrosPorAutor("JK Rowling");
//		
//		System.out.println(librosRowling);
//		
		
//		System.out.println(librosStack);
//		for (int i = 0; i < librosStack.size(); i++) {
//			System.out.println(librosStack.get(i));
//		}
		
	}

}
