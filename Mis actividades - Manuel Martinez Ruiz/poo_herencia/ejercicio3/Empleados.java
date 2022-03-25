package ejercicio3;

public abstract class Empleados {
	
	/**ATRIBUTOS */
	
	protected String nombre;
	protected int edad;
	protected double salario;
	protected static int PLUS = 300;
	
	/**constructor */
	
	public Empleados(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	public Empleados() {
		
	}
	
	/**Getter y setter */

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	/**Metodo */
	
	@Override
	public String toString() {
		return ("Empleados \n"
			+ "==========="
			+ "Nombre: "+this.nombre
			+ "Edad: "+this.edad
			+ "Salario: "+this.salario);
	}
	
	protected abstract void plus();
	
	

}
