package poo;

public class Pizza {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private String ingred, tamaño;
	private boolean pedida;
	private static int totalPedidas=0, totalServidas=0;
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//2 parametros
	public Pizza(String ingred, String tamaño) {
		this.ingred = ingred;
		this.tamaño = tamaño;
		this.pedida = true;
		totalPedidas++;
	}
	
	
	/**================================
	 *  MÉTODOS QUE MUESTREN OPERACION
	 * ================================ */
	
	//SERVIR PIZZA
	public void sirve() {
		if(this.pedida) {
			pedida=false;
			totalPedidas--;
			totalServidas++;
		}
		else {
			System.out.println("esa pizza ya se ha servido");
		}
	}
	
	//Get pedidas
	public int getTotalPedidas() {
		return totalPedidas;
	}
	
	//Get servidas
	public int getTotalServidas() {
		return totalServidas;
	}

}
