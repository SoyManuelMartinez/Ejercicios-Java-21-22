package ejercicio2;

public abstract class Poligono {
	
	protected int numeroLados;

	/**CONSTRUCTOR */
	
	public Poligono(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}
	
	public Poligono() {
		
	}

	/**get lados */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**Set lados */
	public void setNumeroLados(int numeroLados) {
		this.numeroLados = numeroLados;
	}


	@Override
	public String toString() {
		return ("Numero de lados "+this.numeroLados);
	}

	/** MÉTODO ÁREA */
	protected abstract double area();

}
