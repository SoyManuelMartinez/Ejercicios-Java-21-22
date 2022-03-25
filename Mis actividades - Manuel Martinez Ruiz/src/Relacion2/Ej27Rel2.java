package Relacion2;

import java.util.Scanner;

public class Ej27Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numMax, i,cont=0,sumTotal=0;
		
		Scanner sn=new Scanner(System.in);
		
		
		
		System.out.println("Dame un número");
		numMax=sn.nextInt();
		
		for(i=3;i<=numMax;i=i+3) {
			System.out.print(i+" ");
			sumTotal=sumTotal+i;
			cont++;
		}
		
		System.out.println("");
		System.out.println("Hay "+cont+" numeros");
		System.out.println("Dichos múltiplos suman "+sumTotal);

	}

}
