package poo;

public class Carta {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private int numero=1000000;
	private String palo="VACIO";
	private boolean mostrada;
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//Constructor por defecto
	public Carta() {
	}
	
	
	//Constrctor con parametros
	public Carta(int numero, String palo) {
		
		this.numero = numero;
		this.palo = palo;
		this.mostrada=false;
	}
	
	/**================
	 * GETTER & SETTER
	 * ================ */
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
	
	
	//Saber si ya se ha mostrado
	public boolean getMostrada() {
		return this.mostrada;
	}

	//Asignar que se ha mostrado
	public void setMostrada(boolean r) {
		this.mostrada=r;
	}

	
	/**================
	 * TO STRING
	 * ================ */
	
	//To String
	@Override
	public String toString() {
		return numero + " de " + palo ;
	}
	
	/**================
	 * Comparaciones
	 * ================ */
	
	public boolean Compara(Carta c1) {
		boolean a=false;
		
		//Si tienen el mismo numero y mismo palo
		if(this.numero==c1.numero && this.palo.equals(c1.palo)) {
			a=true;
		}
		
		return a;
	}
	
	

}
