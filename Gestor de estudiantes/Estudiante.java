package parcial;

public class Estudiante extends Persona{
	
	private double notaFinal;
	private boolean notaProm;

	 public Estudiante(String nombre, String apellido, int dni, double notaFinal, boolean notaProm)  {
	        super(nombre, apellido, dni);
	        this.notaFinal = notaFinal;
	        this.notaProm = notaProm;
	    }

	public Double getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}

	public boolean getNotaProm() {
		return notaProm;
	}

	public void setNotaProm(boolean notaProm) {
		this.notaProm = notaProm;
	}
	
}