package Relacion2;

import java.util.Scanner;

public class Ej29Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLeer, esDiv;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dame un número. Diré todos sus enteros más pequeños");
		numLeer=sn.nextInt();
		
		System.out.println("Dame otro número. Todos los valores que sean divisibles por este no aparecerán");
		esDiv=sn.nextInt();
		
		for(int i=1;i<=numLeer;i++) {
			if(!(i%esDiv==0)) {
				System.out.print(i+" ");
			}
		}

	}

}
