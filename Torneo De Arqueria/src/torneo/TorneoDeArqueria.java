package torneo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
// import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeMap;

public class TorneoDeArqueria {

	private TreeMap<Integer, LinkedList<Disparo>> disparos;
	private TreeMap<Integer, LinkedList<Integer>> puntajes;

	public TorneoDeArqueria(String ruta) throws IOException {
		super();
		this.disparos = new TreeMap<Integer, LinkedList<Disparo>>();
		this.puntajes = new TreeMap<Integer, LinkedList<Integer>>(Collections.reverseOrder());
		this.setListaDisparos(ruta);
		this.setPuntajes();
	}

	private void setListaDisparos(String ruta) throws IOException {
		// Rehacer con PriorityQueue<Disparo> cola;

		File archivo = new File(ruta);
		Scanner sc = new Scanner(archivo);
		FileWriter archExc = new FileWriter("excepciones.out");
		PrintWriter salida = new PrintWriter(archExc);

		String linea;
		String[] arrDatos;
		int nroParticipante;
		double x;
		double y;
		Disparo disp;
		LinkedList<Disparo> listaDispAux;
		int contLinea = 1;

		while (sc.hasNext()) {
			linea = sc.nextLine();
			arrDatos = linea.split(",");
			nroParticipante = Integer.parseInt(arrDatos[0]);
			x = Double.parseDouble(arrDatos[1]);
			y = Double.parseDouble(arrDatos[2]);

			try {
				disp = new Disparo(nroParticipante, x, y);
				listaDispAux = this.disparos.getOrDefault(nroParticipante, new LinkedList<Disparo>());
				listaDispAux.add(disp);
				this.disparos.put(nroParticipante, listaDispAux);

			} catch (DisparoInvalidoException e) {
				salida.print("Linea " + contLinea + ": ");
				salida.println(e.getMessage());
			}
			contLinea++;

		}
		sc.close();
		salida.close();

		for (Map.Entry<Integer, LinkedList<Disparo>> m : this.disparos.entrySet()) {
			Collections.sort(m.getValue());
		}
	}

	private void setPuntajes() {
		int puntajeTotal;

		LinkedList<Disparo> listaValue;

		for (Map.Entry<Integer, LinkedList<Disparo>> m : this.disparos.entrySet()) {
			listaValue = m.getValue();
			if (listaValue.size() >= 5) {
				puntajeTotal = getPuntajeTotalParticipante(listaValue);

				LinkedList<Integer> listaParticipantes = this.puntajes.getOrDefault(m.getKey(),
						new LinkedList<Integer>());
				listaParticipantes.add(m.getKey());
				this.puntajes.put(puntajeTotal, listaParticipantes);
			}
		}
	}

	private int getPuntajeTotalParticipante(LinkedList<Disparo> listaDisparos) {

		Iterator<Disparo> itr = listaDisparos.iterator();
		int puntajeTotal = 0;
		int cont = 0;
		while (itr.hasNext() && cont < 5) {
			Disparo d = itr.next();
			puntajeTotal += d.getPuntaje();
			cont++;
		}
		return puntajeTotal;
	}

	public void generarPodio() throws IOException {
		FileWriter archivoOut = new FileWriter("podio.out");
		PrintWriter salida = new PrintWriter(archivoOut);

		Iterator<Map.Entry<Integer, LinkedList<Integer>>> itr = puntajes.entrySet().iterator();
		int cont = 1;

		while (itr.hasNext() && cont <= 3) {
			Map.Entry<Integer, LinkedList<Integer>> entry = itr.next();
			salida.println("Puesto " + cont + ": Puntaje= " + entry.getKey());
			salida.println(entry.getValue());
			cont++;

		}
		salida.close();

	}

	// ******* MAIN ********
	public static void main(String[] args) throws IOException {

		TorneoDeArqueria torneo = new TorneoDeArqueria("1000tiros.csv");

		torneo.generarPodio();
	}

}
