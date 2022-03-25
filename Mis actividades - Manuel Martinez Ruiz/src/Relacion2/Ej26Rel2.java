package Relacion2;

import java.util.Scanner;

public class Ej26Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numLeer, cifra;
		
		Scanner sn=new Scanner(System.in);
		
		
		
		System.out.println("Dame un número");
		numLeer=sn.next();
		
		System.out.println("Dame una cifra");
		cifra=sn.next();
		
		System.out.println(cifra.charAt(0));
		
		for(int i=1;i<=(numLeer.length()-1);i++) {
			
			if ((numLeer.charAt(i))==(cifra.charAt(0))) {
				System.out.println(cifra+" se encuentra en la posición "+(i+1));
			}
			
		}
		
	}

}
