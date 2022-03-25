package ejercicio1;

public class Empleado {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	protected String nombre, edad;
	protected int salario;
	protected final int plus=200;
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//Por defecto
	public Empleado() {
		
	}
	
	//Con parametros solo el nombre
	public Empleado(String nombre) {
		this.nombre = nombre;
	}
	
	//Con parámetros
	public Empleado(String nombre, String edad, int salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	
	

	
	/**===========================
	 * GETTERS, SETTERS & TOSTRING
	 * =========================== */
	
	//GET NOMBRE
	public String getNombre() {
		return nombre;
	}

	//SET NOMBRE
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
	

}
