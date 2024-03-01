package parcial;

public class DniInvalidoException extends Exception{
	
	private static final long serialVersionUID = 1L;
	
	public DniInvalidoException(String msg) {
		super("Error: "+ msg);
	}
}