package recuperatorio;

public class Programa implements Comparable<Programa>{
	
	private int numCanal;
	private String Programa;
	private double rating;

	public Programa(int numCanal, String programa, double rating) {
		this.numCanal = numCanal;
		this.Programa = programa;
		this.rating = rating;
	}
	
	public int getNumCanal() {
		return numCanal;
	}

	public String getPrograma() {
		return Programa;
	}

	public double getRating() {
		return rating;
	}
	
	
	@Override
	public String toString() {
		return "Programa [numCanal=" + numCanal + ", Programa=" + Programa + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Programa p) {
		return Double.compare(this.getRating(), p.getRating());
	}

}
