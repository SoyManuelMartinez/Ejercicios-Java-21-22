package Relacion2;

import java.util.Scanner;

public class Ej14Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int baseLeida,exponenteLeido;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dime una base");
		baseLeida=sn.nextInt();
		
		System.out.println("Dime un exponente");
		exponenteLeido=sn.nextInt();
		
		System.out.println(baseLeida+"^"+exponenteLeido+" = "+(Math.pow(baseLeida,exponenteLeido)));

	}

}
