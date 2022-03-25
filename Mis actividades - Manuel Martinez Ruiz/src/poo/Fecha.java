package poo;

public class Fecha {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private int dia,mes,year;

	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	public Fecha() {
		
	}
	
	public Fecha(int dia, int mes, int year) {
		this.dia = dia;
		this.mes = mes;
		this.year = year;
	}
	
	/**======
	 * SETTER
	 * ====== */
	
	//Set Dia
	public void setDia(int n) {
		this.dia=n;
	}
	
	//Set Mes
	public void setMes(int n) {
		this.mes=n;
	}
	
	//Set Año
	public void setYear(int n) {
		this.year=n;
	}
	
	/**======
	 * GETTER
	 * ====== */
	
	//Get Dia
	public int getDia() {
		return this.dia;
	}
	
	//Get Mes
	public int getMes() {
		return this.mes;
	}
	
	//Get Mes
	public int getYear() {
		return this.year;
	}
	
	/**================================
	 *  MÉTODOS QUE MUESTREN OPERACION
	 * ================================ */
	
	//To String
	@Override
	public String toString() {
		return (dia+"-"+mes+"-"+year);
	}
	
	
	//Comprobar si el año es bisiesto
	private boolean esBisiesto(int n) {
		boolean res=false;
		if (n%4==0) {
			res=true;
		}
		return res;
	}

	//Comprobar si la fecha es correcta
	public boolean esCorrecta() {
		boolean res=true;
		//Se pasa de meses
		if(this.mes>=13 || this.mes<=0) {
			res=false;
		}
		//Los meses son correctos
		
		int maxDias=0;
		//ENERO - FEBRERO - MARZO - ABRIL - MAYO - JUNIO - JULIO
		if(this.mes<=7) {
			//Meses impares
			if(this.mes%2==1) {
				//31 dias
				maxDias=31;
			}
			//Es Febrero
			else if(this.mes==2) {
				//Es bisiesto
				if(esBisiesto(this.year)) {
					//29 dias
					maxDias=29;
				}
				//No es bisiesto
				else {
					maxDias=28;
				}
			}
			//Meses pares
			else {
				maxDias=20;
			}
		}
		//AGOSTO - SEPTIEMBRE - OCTUBRE - NOVIEMBRE - DICIEMBRE
		if(this.mes>=8) {
			//Meses impares
			if(this.mes%2==0) {
				//31 dias
				maxDias=31;
			}
			else {
				//30 dias
				maxDias=30;
			}
		}
		
		//Comprobar si supera los meses
		if(this.dia>maxDias) {
			res=false;
		}
		
		return res;
	}
	
	//Dia Siguiente
	public Fecha diaSiguiente() {
		Fecha nextDia = new Fecha (this.dia+=1,this.mes,this.year);
		//¿Es el ultimo dia del mes?
		if(!nextDia.esCorrecta()) {
			nextDia = new Fecha (1,this.mes+=1,this.year);
			//¿Es el ultimo día del año?
			if(!nextDia.esCorrecta()) {
				nextDia = new Fecha (1,1,this.year+=1);
			}
		}
		return nextDia;
	}
	

}
