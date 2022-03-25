package ejercicio3;

public class Repartidor extends Empleados {

	private String zona;

	/**Constructores */
	
	public Repartidor() {
		super();
		
	}

	public Repartidor(String nombre, int edad, double salario, String zona) {
		super(nombre, edad, salario);
		this.zona=zona;
		
	}
	
	/**Getter y setter */

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	
	/** Método */
	
	@Override
	public String toString() {
		return ("Repartidor"
				+ "\n==========="
				+ "\nNombre: "+this.nombre
				+ "\nEdad: "+this.edad
				+ "\nSalario: "+this.salario
				+ "\nZona: "+this.zona+"\n");
	}

	@Override
	protected void plus() {
		if(this.edad<25 && this.zona.equalsIgnoreCase("zona 3")) {
			this.salario=this.salario+this.PLUS;
		}
	}
	
	
	
	
	
	
	
}
