package poo;

public class GESTISIMAL {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private int CODIGO, stock;
	private String descripcion="vacio";
	private double precioCompra, precioVenta;
	private static int codigoActual=0;
	
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//Constructor por defecto
	public GESTISIMAL() {
		
	}
	
	//Constructor con parametros
	public GESTISIMAL(int stock, String descripcion, double precioCompra, double precioVenta) {
		this.CODIGO = codigoActual;
		codigoActual++;
		this.stock = stock;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}
	
	/**================
	 * GETTERS Y SETTERS
	 * ================ */

	public int getCODIGO() {
		return CODIGO;
	}

	public void setCODIGO(int cODIGO) {
		CODIGO = cODIGO;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	
	/**================================
	 *  MÉTODOS DE LA CLASE
	 * ================================ */
	
	public void EntraProducto(int cantidad) {
		this.stock+=cantidad;
	}
	
	public void SaleProducto(int cantidad) {
		//Pueden salir productos
		if(this.stock-cantidad>=0) {
			this.stock-=cantidad;
		}
		else {
			System.out.println("No existen tantos productos en el almacén");
		}
	}

	@Override
	public String toString() {
		return "GESTISIMAL [CODIGO=" + CODIGO + ", stock=" + stock + ", descripcion=" + descripcion + ", precioCompra="
				+ precioCompra + ", precioVenta=" + precioVenta + "]";
	}
	
	

	

}
