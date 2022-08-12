package repaso;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Siniestro {
	private int datos[][];
	private int fecha;
	private int patente;
	private int detalle;
	
	public Siniestro(int patente, int fecha, int detalle) {
		this.detalle = detalle;
		this.fecha = fecha;
		this.patente = patente;
	}
	
    public static void main(String[] args) {
		
		BufferedReader br = null;
		
		String Linea = br.readLine();
		
		Map<s, L<s>> m = new TreeMap<s, L<s>>();
		Linea = br.readLine();
		while(Linea != null) {
			String key = new String();
			Siniestro s = new Siniestro(0, 0, 0);
			if(m.containsKey(key)) {
				m.get(key).add(s);
			}else {
				List<Siniestro> L = new ArrayList<Siniestro>();
				L.add(s);
				m.put(key, L);
				for(Entry <String, List<Siniestro>> cf : m)
				System.out.println(cf.getKey());
				System.out.println();
			}
		}
	}

	public int[][] getDatos() {
		return datos;
	}

	public int getFecha() {
		return fecha;
	}

	public int getPatente() {
		return patente;
	}

	public int getDetalle() {
		return detalle;
	}

}
