package parcial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
2DO PARCIAL 2022
  Se dispone del archivo ventas.in con las ventas realizadas por la empresa de los productos enviados por el depósito número 5. 
  Cada línea del archivo contiene: 
• Código de producto (6 caracteres alfanuméricos).
• Cantidad vendida (entero 1 y 1000).

Los campos están separados por un espacio en blanco. 
Generar el archivo ventasPorProducto.out con el siguiente formato (una línea por producto):        
codigoDeProducto  cantidadTotalVendida

Ejemplo:

ventas.in           ventasPorProducto.out
af234 235           af234 435
bc456 100           bc456 100
xcx213 1000         xcx213 1010
af234 200
xcx213 1000


public class Ventas {
private Map<String, Integer> ventasPorProducto = new HashMap<String, Integer>();
public Ventas(){ //TODO }
       public void leerVentas(String entrada) { //TODO }
       public void escribirVentasPorProducto(String salida) { //TODO }
       public static void main(String[] args) throws IOException { //TODO }
}

Ayudas: 
FileReader fr = new FileReader(new File(archivoDeEntrada));
BufferedReader br = new BufferedReader(fr);
PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
for (Entry<K,V> cu : mapa.entrySet())

Nota: Se espera un adecuado tratamiento de excepciones.
*/

public class Ventas {
	
	private Map<String, Integer> ventasPorProducto;

	public Ventas() {
		this.ventasPorProducto = new HashMap<String, Integer>();
	}
	
	public void leerVentas(String archivoDeEntrada) throws IOException {
		FileReader fr = new FileReader(new File(archivoDeEntrada));
		BufferedReader br = new BufferedReader(fr);
		String linea = br.readLine();
		String datos[];
		while(linea != null) {
			datos = linea.split(" ");
			String codProd = datos[0];
		try {
			Integer cantVendida = Integer.parseInt(datos[1]);
			if(cantVendida < 1 || cantVendida > 1000)
				throw new CantidadInvalidaException("Dato Ingresado Erroneo");
			
			if(ventasPorProducto.containsKey(codProd))
				cantVendida += ventasPorProducto.get(codProd);
			ventasPorProducto.put(codProd, cantVendida);
			
		} catch (CantidadInvalidaException e) {
			e.printStackTrace();
		}
			br.readLine();
			
		}
				
			fr.close();
	}
	
	public void escribirVentasPorProducto(String archivoDeSalida) throws IOException {
		PrintWriter salida = new PrintWriter(new FileWriter(archivoDeSalida));
		
		for(Entry<String, Integer> cu : ventasPorProducto.entrySet()) {
			String clave = cu.getKey();
			Integer valor = cu.getValue();
			
			salida.println(clave + " " + valor);
		}
		
		salida.close();
	}

	public static void main(String[] args) throws IOException {
		Ventas ventas = new Ventas();
		ventas.leerVentas("src/parcial/ventas.in");
		ventas.escribirVentasPorProducto("src/parcial/ventasPorProducto");
	}

}
