package Relacion2;

import java.util.Scanner;

public class Ej20Rel2 {

	public static void main(String[] args) {
		
		int altura, separacionMaxima,piso;
		String cosa;
		
		Scanner sn=new Scanner(System.in);
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Dime una altura");
		altura=sn.nextInt();
		
		System.out.println("Dime con qué escribimos la pirámide");
		cosa=sc.next();
		
		separacionMaxima=altura;
		
		//PASA POR PISOS
		
		for(piso=1; piso<=altura;piso++) {
			
			
			//ESCRIBE LOS ESPACIOS
			for(int espacios=1; espacios<=separacionMaxima;espacios++) {
				System.out.print("   ");
			}
			//ESCRIBE LAS COSAS
			for(int i=1;i<=((piso*2)-1);i++) {
				if(i==1 || i==((piso*2)-1) || piso==altura) {
					System.out.print(" "+cosa+" ");
				}else {
					System.out.print("   ");
				}
				
			}
			System.out.print("\n");
			separacionMaxima-=1;
		}

	}

}
