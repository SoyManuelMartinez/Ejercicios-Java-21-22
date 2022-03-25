package Relacion2;

public class Ej22Rel2 {

	public static void main(String[] args) {
		
		int numStart=2, numEnd=100, c=0;
		boolean esPrimo=true;
		
		//COMPRUEBA TODOS LOS NUMEROS DEL 2 AL 200
		
		for(c=numStart;c<=numEnd;c++) {
			
			//DESDE EL2 HASTA EL 100
			
			for(int i=2;i<=(c/2) && esPrimo;i++) {
				if(c%i==0) {
					esPrimo=false;
				}
			}
			
			if(esPrimo) {
				System.out.print(c+", ");
			}
			
			esPrimo=true;
		}
		
		System.out.print(numEnd+".");

	}

}
