package colecciones;

public class Producto implements Comparable <Producto> {

	private int codProducto;
	private int stockProducto;
	
	public Producto(int codProducto, int stocProducto) {
		this.codProducto = codProducto;
		this.stockProducto = stocProducto;
	}

	public int getCodProducto() {
		return codProducto;
	}

	public int getStockProducto() {
		return stockProducto;
	}

	@Override
	public int compareTo(Producto o) {
		return Integer.compare(this.codProducto, o.codProducto);
	}

}
