package poo;

public class Pizza9 {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private String tamaño, tipo;
	private boolean estado=false;
	private static int numeroTotalPedidas=0, numeroTotalServidas=0;
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	public Pizza9() {
		numeroTotalPedidas++;
	}

	public Pizza9(String tamaño, String tipo) {
		this.tamaño = tamaño;
		this.tipo = tipo;
		numeroTotalPedidas++;
	}

	
	/**================
	 * GETTERS Y SETTERS
	 * ================ */
	
	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	//GET PEDIDAS
	public static int getPedidas() {
		return numeroTotalPedidas;
	}
	//GET SERVIDAS
	public static int getServidas() {
		return numeroTotalServidas;
	}

	//TO STRING
	@Override
	public String toString() {
		if(this.estado) {
			return "Pizza "+this.tipo+" "+this.tamaño+", servida";
		}
		else {
			return "Pizza "+this.tipo+" "+this.tamaño+", pedida";
		}
	}
	
	
	/**================================
	 *  MÉTODOS DE LA CLASE
	 * ================================ */
	
	public void Sirve() {
		if(!this.estado){
			this.estado=true;
			numeroTotalPedidas--;
			numeroTotalServidas++;
		}
		else{
			System.out.println("Esa pizza ya está servida");
		}
	}

}
