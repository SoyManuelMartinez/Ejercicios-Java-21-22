package ejercicio4;

public class Producto {
	
	/**ATRIBUTOS */
	
	protected String nombre;
	protected double precio;
	
	/**constructor */
	
	public Producto() {
		
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	
	/**Getters y Setters */
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	/**Métodos */
	
	@Override
	public String toString() {
		return ("Producto"
			+ "\n==========="
			+ "\nNombre: "+this.nombre
			+ "\nPrecio: "+this.precio
			+"\n");
	}
	
	protected void Calcular (int p) {
		this.precio=this.precio*p;
	}
	
	

}
