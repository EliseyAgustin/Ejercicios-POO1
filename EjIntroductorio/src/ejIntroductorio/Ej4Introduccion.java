package ejIntroductorio;

public class Ej4Introduccion {
	int numero;

	public Ej4Introduccion(int f) {
		numero = f;
	}

	int Diaa() {
		return numero % 100;
	}

	int Mess() {
		return numero / 100 % 100;
	}

	int Anioo() {
		return numero / 10000;
	}

	public String Fecha() {

		return ("Dia: " + Diaa() + " Mes: " + Mess() + " Año: " + Anioo());

	}

	public static void main(String[] args) {
		
		Ej4Introduccion hoy = new Ej4Introduccion(20210813);
        System.out.println(hoy.Fecha());

	}

}
