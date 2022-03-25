package Relacion2;

import java.util.Scanner;

public class Ej16REl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numIntr;
		boolean esPrimo=true;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dime un numero y valoraré si es primo");
		numIntr=sn.nextInt();
		
		for(int i=2;i<=(numIntr-1);i++) {
			if(numIntr%i==0) {
				esPrimo=false;
			}
		}
		
		if(esPrimo) {
			System.out.println(numIntr+" es primo");	
		}else {
			System.out.println(numIntr+" NO es primo");
		}
		

	}

}
