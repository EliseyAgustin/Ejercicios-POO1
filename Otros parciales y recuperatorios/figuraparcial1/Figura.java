package figuraparcial;

public abstract class Figura implements Comparable<Figura>{
	
	private double area;
	
	public Figura(double area) {
		this.area = area;
	}
	
	public final double getArea() {
		return this.area;
	}
	
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}
	
}
