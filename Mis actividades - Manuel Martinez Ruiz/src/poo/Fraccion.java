package poo;

public class Fraccion {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private int num,den;
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//Por defecto
	public Fraccion() {
		this.num = 0;
		this.den = 1;
	}
	
	public Fraccion(int num) {
		this.num = num;
		this.den = 1;
	}
	
	//Con parámetros
	public Fraccion(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	//Copia de otro
	public Fraccion(Fraccion copia) {
		this.num = copia.num;
		this.den = copia.den;
	}
	
	/**======
	 * SETTER
	 * ====== */
	
	//Set num
	public void setNum(int n) {
		this.num=n;
	}
	
	//Set denominador
	public void setDen(int d) {
		this.den=d;
	}
	
	/**======
	 * GETTER
	 * ====== */
	
	//Get num
	public int getNum() {
		return this.num;
	}
	
	//Get den
	public int getDen() {
		return this.den;
	}
	
	
	
	/**================================
	 *  MÉTODOS QUE MUESTREN OPERACION
	 * ================================ */
	
	//MINIMO COMÚN MULTIPLO
	private static int mcm(int num1, int num2) {
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = (a / mcd(num1, num2)) * b;
         
        return resultado;
 
    }
 
	//MAXIMO COMÚN DIVISOR
    private static int mcd(int num1, int num2) {
 
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
 
        } while (b != 0);
 
        return resultado;
 
    }
    
    //Sumar fracciones
    public Fraccion sumar(Fraccion b) {
    	int denSum = (mcm(this.den,b.den));
    	int numSum = ((this.num*(denSum/this.den))+(b.num*(denSum/b.den)));
    	
    	Fraccion suma = new Fraccion(numSum,denSum);
    	suma = suma.simplificar();
    	return suma;
    }
    
    //Restar fracciones
    public Fraccion restar(Fraccion b) {
    	int denRes = (mcm(this.den,b.den));
    	int numRes = ((this.num*(denRes/this.den))-(b.num*(denRes/b.den)));
    	
    	Fraccion resta = new Fraccion(numRes,denRes);
    	resta = resta.simplificar();
    	return resta;
    }
	
	//Multiplicar fracciones
	public Fraccion multiplicar(Fraccion b) {
		int numMult = (this.num *b.num);
		int denMult = (this.den * b.den);
		
		Fraccion mult = new Fraccion(numMult,denMult);
		mult = mult.simplificar();
		return mult;
	}
	
	//Dividir fracciones
	public Fraccion dividir(Fraccion b) {
		int numDiv = (this.num*b.den);
		int denDiv = (this.den*b.num);
		
		Fraccion div = new Fraccion(numDiv,denDiv);
		div = div.simplificar();
		return div;
	}
	
	//Simplificar
	private Fraccion simplificar() {
		int comun = mcd(this.num,this.den);
		
		Fraccion simple = new Fraccion((this.num/comun),(this.den/comun));
		return simple;
	}
	
	//toString
	@Override
	public String toString() {
		return (this.num+"/"+this.den);
	}
	
	

}
