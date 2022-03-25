package funciones;

public class MathFunction {
	
	/**=================
	 * 1- FUNCION ES CAPICUA
	 * =================
	 */
	
	public static boolean EsCapicua(int num) {
		int numBack = Voltea(num);
		
		//El numero no es igual volteado
		if(num!=numBack) {
			return false;
		}
		//El numero volteado es igual
		else {
			return true;
		}
	}
	
	/**=================
	 * 2 - FUNCION ES PRIMA
	 * =================
	 */
	
	public static boolean EsPrimo(int num) {
		boolean esPrimo=true;
		
		for(int i=2;i<(num);i++) {
			//Comprueba si su resto es cero
			if(num%i==0){
				esPrimo=false;
			}
		}
		// Devuelve resultado
		return esPrimo;
	}
	
	/**=================
	 * 3 - SIGUIENTE PRIMO
	 * =================
	 */
	
	public static int SiguientePrimo(int num) {
		boolean unfinished=true;
		int checkNumber=num;
		
		while(unfinished) {
			checkNumber++;
			if(EsPrimo(checkNumber)) {
				unfinished=false;
			}
		}
		
		// Devuelve resultado
		return checkNumber;
		
	}
	
	/**=================
	 * 4 - POTENCIA
	 * =================
	 */
	
	public static int Potencia(int base, int exp) {
		int resultado=1;
		
		for(int i=0;i<(exp);i++) {
			resultado=resultado*base;
		}
		// Devuelve resultado
		return resultado;
	}
	
	/**=================
	 * 5 - CONTAR DÍGITOS
	 * =================
	 */
	
	public static int CuentaDigitos(int num) {
		boolean unfinishedCount=true;
		int checkNumber, counter=1, digits=0;
		
		while(unfinishedCount) {
			checkNumber=num/counter;
			digits+=1;
			counter*=10;
			//El valor es de 1 sola cifra
			if(checkNumber<=9) {
				unfinishedCount=false;	
				}
		}
		// Devuelve resultado
		return digits;
	}
	
	/**=================
	 * 6 - VOLTEA
	 * =================
	 */
	
	public static int Voltea(int num) {
		
		//Guarda los digitos uno por uno
		int digitAmount=CuentaDigitos(num);
		int reverse=0, nextAdd;
		
		for(int i=0;i<digitAmount;i++) {
			nextAdd=NumeroDeCifra(num,i+1);
			nextAdd=nextAdd*Potencia(10,digitAmount-i)/10;
			reverse+=nextAdd;
		}
		// Devuelve resultado
		return reverse;
	}
	
	/**=================
	 * 7 -DIGITO N
	 * =================
	 */
	
	public static int NumeroDeCifra(int num, int cifra) {
		int step,aux;
		
		step=num/Potencia(10,cifra);
		step=Potencia(10,cifra)*step;	
		step=num-step;
		
		for(int i=1;i<cifra;i++) {
			aux=step/Potencia(10,i);
			aux=aux*Potencia(10,i);
			aux=step-aux;
			step=step-aux;
		}
		step/=Potencia(10,cifra-1);
		
		// Devuelve resultado
		return step;
	}
	
	/**=================
	 * 8 - PRIMERA POSICIÓN DE DIGITO
	 * =================
	 */
	
	public static int posicionDigito(int num, int searchDigit) {
		int digitAmount=CuentaDigitos(num);
		int firstPosition=-1;
		boolean notFoundYet=true;
		
		for(int i=0;i<digitAmount;i++) {
			if(searchDigit==NumeroDeCifra(num,i+1)) {
				if(notFoundYet) {
					firstPosition=i+1;
					notFoundYet=false;
				}
			}
		}
		// Devuelve resultado
		return firstPosition;
	}
	
	

	/**
	 * TESTEO
	 */
	
	public static void main(String[] args) {
		

	}

}
