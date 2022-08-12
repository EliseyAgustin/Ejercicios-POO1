package archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Persona {
	
	private Integer dni;
	private String apellido;
	private Integer edad;

	public Persona(Integer dni, String apellido, Integer edad) {
		this.dni = dni;
		this.apellido = apellido;
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", apellido=" + apellido + ", edad=" + edad + "]";
	}

	public static List<Persona> getPersonas(String archivo) throws IOException{
		
		LinkedList<Persona> personas = new LinkedList<Persona>();
		
		try {
			FileReader fr = new FileReader(archivo);
		    try (BufferedReader br = new BufferedReader(fr)) {
				String[] datos;
				String linea = br.readLine();
				
				while(linea != null) {
					datos = linea.split(" ");
					int dni = Integer.parseInt(datos[0]);
					String apellido = datos[1];
					int edad = Integer.parseInt(datos[2]);
					
					Persona p = new Persona(dni, apellido, edad);
					personas.add(p);
					
					try {
						linea = br.readLine();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
					
				}
			} catch (FileNotFoundException e) {
				throw e;
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			}	
				
		}
		
		catch(FileNotFoundException e){
            e.printStackTrace();
		}
		return personas;
	}
	
	public static List<Persona> getPersonasMayoresAEdad(LinkedList<Persona> p, int edad){
		LinkedList<Persona> personasMayoresAEdad = new LinkedList<Persona>();
		for(Persona persona : p) {
			if(persona.getEdad() > edad) {
				personasMayoresAEdad.add(persona);
			}
		}
		
		Collections.sort(p, Collections.reverseOrder());
		return p;
		
	}
	
    public static void main(String[] args) throws IOException {
    	
    LinkedList<Persona> p = new LinkedList<Persona>();
	p.add(new Persona(34567890, "Gomez", 31));
	p.add(new Persona(89439493, "Albarracin", 5));
	p.add(new Persona(12091201, "Flores", 63));
	p.add(new Persona(69869665, "Diaz", 10));
	p.add(new Persona(47484849, "Alvarez", 17));
	p.add(new Persona(68686866, "Florez", 11));
	
	try (PrintWriter personasMayoresDeXX = new PrintWriter(new FileWriter("personasMayoresDeXX.out"))) {
		personasMayoresDeXX.print(p); //en lugar de syso      
		personasMayoresDeXX.println(" "+ p); //en lugar de syso

	}
  }
}
