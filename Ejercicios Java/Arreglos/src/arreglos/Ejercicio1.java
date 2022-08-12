package arreglos;

public class Ejercicio1 {
	
	private int [] v;

	public Ejercicio1(int[] v) {
		
		this.v = v;
	}
     public String mostrarArreglos() {
    	 String s = "";
    	 for (int i = 0; i < v.length; i++) {
			s += v[i] + " ";
		}
    	 return s;
     }
     
     public String mostrarInvertido() {
    	 String s = " ";
    	 
    	 for(int i =v.length - 1; i>=0;i--) {
    		 s += v[i] + " ";
    	 }
    	 return s;
     }
    

	public static void main(String[] args) {
		int [] v = {1,2,3,4,5,6,7,8,9};
		
		Ejercicio1 e1 = new Ejercicio1(v);
		System.out.println(e1.mostrarArreglos());
		System.out.println(e1.mostrarInvertido());
		
		int [] a = {12, 56, -1, 5};
		
		Ejercicio1 e2 = new Ejercicio1(a);
		System.out.println(e2.mostrarArreglos());
		System.out.println(e2.mostrarInvertido());
		
				

	}

}
