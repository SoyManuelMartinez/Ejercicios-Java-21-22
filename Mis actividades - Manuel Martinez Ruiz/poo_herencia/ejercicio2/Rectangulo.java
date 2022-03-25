package ejercicio2;

public class Rectangulo extends Poligono {

	private double lado1, lado2;
	private boolean vacio=true;
	
	/** CONSTRUCTORES */
	
	public Rectangulo() {
		super();
	}

	public Rectangulo(double lado1, double lado2) {
		super(4);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.vacio = false;
		
	}
	
	/** GETTERS Y SETTERS */

	public boolean getVacio() {
		return this.vacio;
	}
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}
	
	/** MÉTODO */

	@Override
	protected double area() {
		return (this.lado1*this.lado2);
	}

	@Override
	public String toString() {
		return ("Rectángulo de lado "+this.lado1+" y "+this.lado2);
	}
	
	
	
	
	
	
	
	

}
