package repaso;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/*Encontrar la suma de todos los elementos que estan por encima de la diagonal.
Sea un archivo de texto que se recibe por parametro (suruta). Se sabe que contiene las palabras "sistema"
y "operativo", generar otro archivo igual al anterior, pero reemplazando sistema por "Operating" y operativo
por "system". (No distingue max de min).

Ejercicio de repaso:
Diapositiva 16 clase 00, Ejercicio 4
*/

public class MatrizSuma {
	
	private int m [][];
	private int j;
	

	public static int sumaSobreDiagPrincipal(int m [][]) {
		int suma = 0;
		for(int i = 0; i < m.length - 1; i++) 
			for(int j = i + 1; j < m.length; j++) 
				suma += m [i][j];
		return suma;
	}
	
	public static int Suma(int m [][]) {
		int suma = 0;
		for(int i = 0; i < m.length; i++)
			for(int j = 0; j < m.length - i; j++)
				suma += m[i][j];
		return suma;
	}
	
	 public static void main (String [] arg) {
	        FileReader fr = null;
	        BufferedReader br = null;
	        PrintWriter pr = null;

	        try {
	            fr = new FileReader ("./src/ejercicios/texto.in");
	            br = new BufferedReader(fr);
	            pr = new PrintWriter(pr);
	            
	            String linea = br.readLine();
	            String salida = " ";
	            while((linea != null)){
	            	String palabras [] = linea.split(" ");
	                System.out.println(linea);
	                System.out.println(palabras);
	                pr.println(salida);
	                linea = br.readLine();
	            }
	        }
	        catch(IOException e){
	            e.printStackTrace();
	        }finally{
	            try{                    
	                if(fr != null){   
	                    fr.close();     
	                }                  
	            }catch (Exception e2){ 
	                e2.printStackTrace();
	            }
	            
	        }
	 }

	public int[][] getM() {
		return m;
	}

	public void setM(int m[][]) {
		this.m = m;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}   
	           
}
