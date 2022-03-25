package poo;

public class Tiempo {
	
	/**Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo son
	intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20, 30) donde
	los parámetros que se le pasan al constructor son las horas, los minutos y los segundos
	respectivamente. Crea el método toString para ver los intervalos de tiempo de la forma
	10h 35m 5s. Si se suman por ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s.
	Realiza un programa de prueba para comprobar que la clase funciona bien.
	 * 
	 */
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private int segundo, minuto, hora;
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//	Con parametro
	public Tiempo(int segundo, int minuto, int hora) {
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = hora;
	}
	
	//	Constructor 2
	public Tiempo(int segundo, int minuto) {
		this.segundo = segundo;
		this.minuto = minuto;
		this.hora = 0;
	}
	
	//	Constructor 3
	public Tiempo(int segundo) {
		this.segundo = segundo;
		this.minuto = 0;
		this.hora = 0;
	}
	
	//toString
		@Override
		public String toString() {
			return (this.hora+"h "+this.minuto+"m "+this.segundo+"s");
		}
		
	/**================================
	*  MÉTODOS QUE MUESTREN OPERACION
	* ================================ */
		
	public Tiempo sumaTiempo(Tiempo b) {
		boolean carry=false;
		
		//SEGUNDOS
		int segSuma = (this.segundo+b.segundo);
		if(segSuma>=60) {
			segSuma-=60;
			carry=true;
		}
		//MINUTOS
		int minSuma = (this.minuto+b.minuto);
		if(carry) {
			minSuma++;
			carry=false;
		}
		if(minSuma>=60) {
			minSuma-=60;
			carry=true;
		}
		//HORAS
		int horaSuma=(this.hora+b.hora);
		if(carry){
			horaSuma++;
		}
		
		Tiempo sumaT = new Tiempo(segSuma,minSuma,horaSuma);
		return sumaT;

	}
	

	
	
	
	

}
