package relacion5;
import funciones.MathFunction;

public class Rel5Ej9 {

	public static void main(String[] args) {
		
		for (int i=0;i<1000;i++) {
			if(funciones.MathFunction.EsPrimo(i)) {
				System.out.println(i);
			}
		}

	}

}
