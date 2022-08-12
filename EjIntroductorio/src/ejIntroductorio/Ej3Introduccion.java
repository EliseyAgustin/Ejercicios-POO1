package ejIntroductorio;

public class Ej3Introduccion {
	
	public static boolean EsPar(int numero) {

		return (numero % 2 == 0);
	}

	public static void main(String[] args) {
		System.out.println(EsPar(4));
		System.out.println(EsPar(3));
		System.out.println(EsPar(6));
		System.out.println(EsPar(40));
		System.out.println(EsPar(51));
		System.out.println(EsPar(49));

	}

}
