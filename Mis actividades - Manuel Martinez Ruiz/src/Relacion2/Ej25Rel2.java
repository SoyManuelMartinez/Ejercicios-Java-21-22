package Relacion2;

import java.util.Scanner;

public class Ej25Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numLeer;
		
		System.out.println("Dame un número y lo devolveré al revés");
		Scanner sn=new Scanner(System.in);
		numLeer=sn.next();
		
		
		for(int i=1;i<=numLeer.length();i++) {
			System.out.print(numLeer.charAt(numLeer.length()-i));
		}

	}

}
