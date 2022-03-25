package ejercicio2;

public class Triangulo extends Poligono {

	private double lado1, lado2, lado3;
	private boolean vacio=true;
	
	
	public Triangulo() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Triangulo(double lado1, double lado2, double lado3) {
		super(3);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
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

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/** MÉTODO */

	@Override
	protected double area() {
		//Calculamos mediante la formula de Heron
		double p = (this.lado1+this.lado2+this.lado3)/2;
		
		double a = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
		return (a);
	}



	@Override
	public String toString() {
		return ("Triangulo de "+lado1+", "+lado2+" y "+lado3);
	}
	
	
	
	

}
