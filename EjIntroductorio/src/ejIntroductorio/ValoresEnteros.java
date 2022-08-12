package ejIntroductorio;

import java.util.Scanner;

public class ValoresEnteros {
	
	

	public static void main(String[] args) {
    try (Scanner entrada = new Scanner(System.in)) {
			
			int num1,num2,suma;
			
			
			System.out.println("Ingrese el primer numero: ");	
			num1 = entrada.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			num2 = entrada.nextInt();
			
			suma=num1+num2;
		
		
		System.out.printf("La suma de los numeros da como resultado %d\n", suma);
		
        }
    
     }

}


