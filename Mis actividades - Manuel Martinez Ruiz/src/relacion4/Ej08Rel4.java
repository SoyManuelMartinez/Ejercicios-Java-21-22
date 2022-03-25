package relacion4;

import java.util.Scanner;


public class Ej08Rel4 {
	
	public static void ShowDiagram(int [] media) {
		
		for(int i=0;i<=(media.length-1);i++) {
			
			for(int e=0;e<=(media[i]);e++) {
				
				System.out.print("%");
				
			}
			
			System.out.println("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int numMeses=12;
		int lectura;
		int[] temperaturas = new int[numMeses];
		
		
		Scanner sn=new Scanner(System.in);
		
		for(int i=0;i<=(numMeses-1);i++) {
			System.out.println("¿Qué temperatura hizo en el "+(i+1)+"º mes?");
			lectura=sn.nextInt();
			temperaturas[i]=lectura;
		}
		
		ShowDiagram(temperaturas);


	}

}
