package ejercicio4;

public class NoPerecedero extends Producto {
	
	/** Atributo */
	
	private String tipo;

	
	/** Constructores */
	
	public NoPerecedero() {
		super();
	}
	
	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		this.tipo = tipo;
	}

	/** Getter y setter */
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	/** Método */
	
	@Override
	public String toString() {
		return ("No perecedero"
			+ "\n==========="
			+ "\nNombre: "+this.nombre
			+ "\nPrecio: "+this.precio
			+ "\nTipo: "+this.tipo
			+"\n");
	}

}
