package ejIntroductorio;

import java.util.Scanner;

public class Ej2Introduccion {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int num1, num2, cociente;
		
		System.out.println("Se calculara el cociente de la division de los numeros ingresados");
		System.out.print("Ingrese el primer numero: ");	
		num1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = entrada.nextInt();
		
		cociente=num1/num2;
		entrada.close();
	
		
		System.out.println("El cociente de la division es "+ cociente);
		
	}

}
