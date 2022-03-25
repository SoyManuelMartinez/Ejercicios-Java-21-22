package Relacion2;

import java.util.Scanner;

public class Ej21Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double numLeer=0,numIntr=0,maxPar=0,mediaImpares=0,imparesIntr=0;
		
		Scanner sn=new Scanner(System.in);
		
		//LEER VALOR
		
		while(numLeer>=0) {
			
			System.out.println("Dame un valor");
			numLeer=sn.nextInt();
			
			//COMPROBAR MAXIMO PAR
			if(numLeer>maxPar && (numLeer%2==0) && numLeer>=0) {
				maxPar=numLeer;
				
			//MEDIA IMPARES
			}
			if((numLeer%2==1)) {
				mediaImpares=mediaImpares+numLeer;
				imparesIntr++;
			}
			
			//SUMAR AL CONTADOR
			numIntr++;
			
		}
		
		numIntr--;
		
		System.out.println("Has introducido "+numIntr+" números (positivos)");
		System.out.println("El mayor valor par introducido fue "+maxPar);
		System.out.println("La media de todos los valores impares es "+(mediaImpares/imparesIntr));

	}

}
