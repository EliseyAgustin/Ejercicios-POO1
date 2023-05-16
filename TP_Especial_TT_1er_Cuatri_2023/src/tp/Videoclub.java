package tp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Videoclub {

	private String nombre;
	private String sucursal;
	private int direccion;
	
	
	public Videoclub() {
		this.nombre=" ";
		this.sucursal=" ";
		this.direccion=0;
		
	}
	
	public Videoclub(String nombre, String sucursal, int direc) {
		this.nombre = nombre;
		this.sucursal = sucursal;
		this.direccion = direc;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDireccion() {
		return direccion;
	}

	public void setDireccion(int direccion) {
		this.direccion = direccion;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}
	

	@Override
	public String toString() {
		return "nombre: " + getNombre() + ", sucursal: " + getSucursal() + ", direccion: " + getDireccion();
	}
	
	static void paraSeguir(Scanner Leer) 
	   {
		   System.out.print("Para seguir teclee un número: ");			    
		   Leer.nextInt();	   
		   System.out.print("\n\n");
	   }

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nombre,sucursal;
		int direccion;
		System.out.println("\tBienvenido\nIngrese el nombre de la Sucursal: ");
		nombre=teclado.next();
		System.out.println("Ingrese que sucursal es: ");
		sucursal=teclado.next();
		System.out.println("Ingrese la direccion: ");
		direccion=teclado.nextInt();
		
		List<Videoclub> listaSucursal1 = new ArrayList<Videoclub>();
		listaSucursal1.add(new Videoclub(nombre, sucursal, direccion));
		
		paraSeguir(teclado);
		
		
		
		List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
        listaPeliculas.add(new Pelicula("Forrest Gump", 1994, "Drama", "Robert Zemeckis"));
        listaPeliculas.add(new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", 2001, "Fantasía", "Peter Jackson"));
        listaPeliculas.add(new Pelicula("El Padrino", 1972, "Drama", "Francis Ford Coppola"));
        
        List<Serie> listaSeries = new ArrayList<Serie>();
        listaSeries.add(new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan"));
        listaSeries.add(new Serie("The Crown", 4, "Drama", "Peter Morgan"));
        listaSeries.add(new Serie("Game of Thrones", 8, "Fantasía", "David Benioff, D. B. Weiss"));

        
        List<Videojuego> listaVideojuegos = new ArrayList<Videojuego>();
        listaVideojuegos.add(new Videojuego("Grand Theft Auto V", 80, "Acción", "Rockstar Games"));
        listaVideojuegos.add(new Videojuego("The Legend of Zelda: Breath of the Wild", 100, "Aventura", "Nintendo"));
        listaVideojuegos.add(new Videojuego("The Witcher 3: Wild Hunt", 50, "RPG", "CD Projekt Red"));
       
        listaSeries.get(2).entregar();
        listaVideojuegos.get(0).entregar();
        listaVideojuegos.get(2).entregar();
        listaPeliculas.get(0).entregar();
        
        
        int peliculasEntregadas = 0;
        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;
   
        System.out.println("HISTORIAL DE ENTREGAS DEL VIDEOCLUB: "+listaSucursal1);
        System.out.println("\t\t------Peliculas------");
        for (Pelicula pelicula : listaPeliculas) {
        	if(pelicula.isEntregado()) {
        		
        		System.out.println(pelicula);
        		peliculasEntregadas++;
        	}
		}
        System.out.println("\nCantidad de Peliculas entregadas: "+peliculasEntregadas);
        
        System.out.println("\n\t\t------Series------");
        for (Serie serie : listaSeries) {
        	if(serie.isEntregado()) {
        		
        		System.out.println(serie);
        		seriesEntregadas++;
        	}
		}
        System.out.println("\nCantidad de Series entregadas: "+seriesEntregadas);
        
        System.out.println("\n\t\t------Videjuegos------");
        for (Videojuego videojuego : listaVideojuegos) {
        	if(videojuego.isEntregado()) {
        		
        		System.out.println(videojuego.toString());
        		videojuegosEntregados++;
        	}	
		}  
        System.out.println("\nCantidad de Videojuegos entregados: "+videojuegosEntregados);
        
        System.out.println("\n\nInformacion");
        
        Pelicula peliculaMasAntigua = Collections.min(listaPeliculas, Pelicula::compareTo);
        System.out.println("\n\nEl nombre de pelicula ingresada Mas antigua\n "+peliculaMasAntigua);
        
        Serie serieMasTemporadas = Collections.max(listaSeries, Serie::compareTo);
        System.out.println("\nEl nombre de la serie con mas Temporada\n "+serieMasTemporadas);
        
        Videojuego videojuegoMasHoras = Collections.max(listaVideojuegos, Videojuego::compareTo);
        System.out.println("\nEl nombre del videojuego con mas horas estimadas\n"+videojuegoMasHoras);

	}

	
}