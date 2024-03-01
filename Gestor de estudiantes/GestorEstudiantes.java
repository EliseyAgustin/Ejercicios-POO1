package parcial;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GestorEstudiantes implements Calculable {
    private Map<Integer, Estudiante> estudiantes;
    private Scanner scanner;

    public GestorEstudiantes() {
        estudiantes = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getDni(), estudiante);
    }

    public Estudiante buscarEstudiante(int dni) {
        return estudiantes.get(dni);
    }

    public void eliminarEstudiante(int dni) {
        estudiantes.remove(dni);
    }

    public void mostrarEstudiantesOrdenados() {
        List<Estudiante> listaEstudiantes = new ArrayList<>(estudiantes.values());
        Collections.sort(listaEstudiantes, new Comparator<Estudiante>() {
            @Override
            public int compare(Estudiante e1, Estudiante e2) {
                return Double.compare(e1.getNotaFinal(), e2.getNotaFinal());
            }
        });

        System.out.println("\n--- ESTUDIANTES ORDENADOS POR NOTA FINAL ---");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Apellido: " + estudiante.getApellido());
            System.out.println("DNI: " + estudiante.getDni());
            System.out.println("Nota Final: " + estudiante.getNotaFinal());
            System.out.println("---------------------------");
        }
    }

    public double calcularPromedioCuatrimestre() {
        double totalNotas = 0.0;
        int totalEstudiantes = 0;

        for (Estudiante estudiante : estudiantes.values()) {
            totalNotas += estudiante.getNotaFinal();
            totalEstudiantes++;
        }
        
        return totalNotas / totalEstudiantes;
    }

    public void ejecutarMenu() {
        int opcion = -1;

        while (opcion != 0) {
            System.out.println("------- MENÚ -------");
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Buscar Estudiante");
            System.out.println("3. Eliminar Estudiante");
            System.out.println("4. Mostrar Estudiantes Ordenados por Nota Final");
            System.out.println("5. Calcular Promedio Cuatrimestre");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    agregarEstudianteDesdeConsola();
                    break;
                case 2:
                    buscarEstudianteDesdeConsola();
                    break;
                case 3:
                    eliminarEstudianteDesdeConsola();
                    break;
                case 4:
                    mostrarEstudiantesOrdenados();
                    break;
                case 5:
                    mostrarPromedioCuatrimestre();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        scanner.close();
    }

    public void agregarEstudianteDesdeConsola() {
    	System.out.println("\n--- AGREGAR ESTUDIANTE ---");
    	System.out.print("Ingrese el nombre: ");
    	String nombre = scanner.nextLine();
    	System.out.print("Ingrese el apellido: ");
    	String apellido = scanner.nextLine();
    	System.out.print("Ingrese el DNI: ");
    	String dniStr = scanner.nextLine();
    	int dni;
    	try {
    	    dni = validarDNI(dniStr);
    	} catch (DniInvalidoException e) {
    	    System.out.println("" + e.getMessage());
    	    return;
    	}

    	System.out.print("Ingrese la nota final: ");
    	double notaFinal = scanner.nextDouble();
    	scanner.nextLine();

    	boolean notaProm = false;
    	Estudiante estudiante = new Estudiante(nombre, apellido, dni, notaFinal, notaProm);
    	agregarEstudiante(estudiante);

    	System.out.println("Estudiante agregado correctamente.");
    }

    public int validarDNI(String dniStr) throws DniInvalidoException {
        int dni;
        try {
            dni = Integer.parseInt(dniStr);
        } catch (NumberFormatException e) {
            throw new DniInvalidoException("El DNI debe ser un número válido.");
        }

        if (dni < 10000000 || dni > 99999999) {
            throw new DniInvalidoException("El DNI debe tener exactamente 8 dígitos.");
        }

        return dni;
    }

    public void buscarEstudianteDesdeConsola() {
        System.out.println("\n--- BUSCAR ESTUDIANTE ---");
        System.out.print("Ingrese el DNI del estudiante a buscar: ");
        int dni = scanner.nextInt();
        scanner.nextLine();

        Estudiante estudiante = buscarEstudiante(dni);
        if (estudiante != null) {
            System.out.println("Estudiante encontrado:");
            System.out.println(estudiante);
        } else {
            System.out.println("No se encontró ningún estudiante con el DNI " + dni);
        }
    }

    public void eliminarEstudianteDesdeConsola() {
        System.out.println("\n--- ELIMINAR ESTUDIANTE ---");
        System.out.print("Ingrese el DNI del estudiante a eliminar: ");
        int dni = scanner.nextInt();
        scanner.nextLine();

        eliminarEstudiante(dni);
        System.out.println("Estudiante con DNI " + dni + " eliminado.");
    }

    public void mostrarPromedioCuatrimestre() {
        double promedioCuatrimestre = calcularPromedioCuatrimestre();
        System.out.println("\n--- PROMEDIO DE NOTAS DEL CUATRIMESTRE ---");
        System.out.println("Promedio de notas del cuatrimestre: " + promedioCuatrimestre);
    }
}
