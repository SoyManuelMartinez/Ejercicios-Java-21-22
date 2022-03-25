package poo;

public class Contador {
	
	//Atributo
	private int cont;
	
	/** CONSTRUCTOR */
	
	//Constructor por defecto
	public Contador() {
		
	}
	
	//Constructor con parametros
	public Contador(int cont) {
		if(cont<0) {
			this.cont = 0;
		}
		this.cont = cont;
	}
	
	//Constructor copia
	public Contador(Contador copia) {
		this.cont = copia.cont;
	}
	
	/**SETTER*/
	
	//Set cont
	public void setCont(int c) {
		this.cont = c;
	}
	
	/**GETTER */
	
	//Get cont
	public int getCont() {
		return this.cont;
	}
	
	/**MÉTODOS */
	
	//Incrementa
	public void incrementaCont() {
		this.cont++;
	}
	
	//Incrementa un numero
		public void incrementaCont(int i) {
			this.cont+=i;
		}
	
	//Decrementa
	public void decrementaCont() {
		this.cont--;
		if(cont<0) {
			this.cont=0;
		}
	}
	
	

}
