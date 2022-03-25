package ejercicio3;

public class Comercial extends Empleados{
	
	private double comision;

	
	/**Constructores */
	
	public Comercial() {
		super();
	}

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	
	/**Getter y setter */
	
	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	/** Método */
	
	@Override
	public String toString() {
		return ("Comercial"
				+ "\n==========="
				+ "\nNombre: "+this.nombre
				+ "\nEdad: "+this.edad
				+ "\nSalario: "+this.salario
				+ "\nComisión: "+this.comision+"\n");
	}

	@Override
	protected void plus() {
		if(this.edad>=30 && this.comision>=200) {
			this.salario=this.salario+this.PLUS;
		}
	}
	
	
	

}
