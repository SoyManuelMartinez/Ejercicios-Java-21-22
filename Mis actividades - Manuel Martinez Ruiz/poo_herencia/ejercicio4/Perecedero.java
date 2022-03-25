package ejercicio4;

public class Perecedero extends Producto {
	
	/** ATRIBUTOS */
	
	private int diasACaducar;
	
	/**Constructor */
	
	public Perecedero() {
		super();
	}

	
	public Perecedero(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);
		this.diasACaducar = diasACaducar;
	}

	/**Getters y Setters */
	
	public int getDiasACaducar() {
		return diasACaducar;
	}

	public void setDiasACaducar(int diasACaducar) {
		this.diasACaducar = diasACaducar;
	}
	
	/** Métodos */
	
	@Override
	public String toString() {
		return ("Perecedero"
			+ "\n ==========="
			+ "\n Nombre: "+this.nombre
			+ "\n Precio: "+this.precio
			+ "\n Dias a caducar: "+this.diasACaducar
			+"\n");
	}
	
	@Override
	public void Calcular(int p) {
		
		this.precio=this.precio*p;
		
		switch(this.diasACaducar) {
		
		case 1:
			this.precio=this.precio/4;
			break;
		case 2:
			this.precio=this.precio/3;
			break;
		case 3:
			this.precio=this.precio/4;
			break;
		
		}
	}
	
	
	
	

}
