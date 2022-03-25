package relacion5;
import funciones.MathFunction;

public class Rel5Ej10 {

	public static void main(String[] args) {
		
		for (int i=0;i<99999;i++) {
			if(funciones.MathFunction.EsCapicua(i)) {
				System.out.println(i);
			}
		}

	}

}
