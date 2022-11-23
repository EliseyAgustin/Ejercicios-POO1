package figuraparcial;

import java.util.Arrays;

public class DemoFiguras {

	public static void main(String[] args) {
		Circulo c1 = new Circulo(2);
		Elipse e1 = new Elipse(8, 4);
		Triangulo t1 = new Triangulo(4, 2);
		Rectangulo r1 = new Rectangulo(4, 2);
		Cuadrado cuad1 = new Cuadrado(6);
		
		Figura [] figuras = {c1, e1, t1, r1, cuad1};
		
		for (Figura figura : figuras) 
			System.out.println(figura.getArea());
		
		double areaTotal = 0;
		for (Figura figura : figuras) 
			areaTotal =+ figura.getArea();
		System.out.println(areaTotal);
		
		Arrays.sort(figuras);
		for (Figura figura : figuras) {
			System.out.println(figura.getArea());
		}
		
	}

}
