package relacion5;
import funciones.MathFunction;
import java.util.Scanner;

public class Rel5Ej11 {

	public static void main(String[] args) {
		
		int num=0, cifrasNum=0, newBaseNum=0, powerBase;
		final int transformBase=2;
		boolean isBinary=false;
		Scanner sc = new Scanner(System.in);
		
		 //LECTOR DE NÚMEROS BINARIOS
		
		while(!isBinary) {
			
			isBinary=true;
			 System.out.println("Escribe un número binario. Lo transformaré en decimal");
			 num=sc.nextInt();
			 cifrasNum=funciones.MathFunction.CuentaDigitos(num);
			 
			 //DETECTOR DE NUMEROS BINARIOS
			 for (int i=0;i<cifrasNum;i++) {
				 if(funciones.MathFunction.NumeroDeCifra(num, i)>=transformBase) {
					 isBinary=false;
				 }
			 }
			 if(!isBinary) {
				 System.out.println("¡"+num+" NO ES BINARIO!");
			 }
		}
		
		//CONVERSOR A DECIMAL
		for (int i=0;i<cifrasNum;i++) {
			powerBase=funciones.MathFunction.Potencia(transformBase,i);
			//i+1?
			powerBase*=funciones.MathFunction.NumeroDeCifra(num,i+1);
			newBaseNum+=powerBase;
		}
		
		System.out.println(num+" en base decimal es "+newBaseNum);
		
		

	}

}
