package Relacion2;

import java.util.Scanner;

public class Ej17Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumando=0, valorIntroducido;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dime un numero y sumaré sus siguientes 100 numeros");
		valorIntroducido=sn.nextInt();
		
		for(int i=0;i<=99;i++) {
			sumando=sumando+(valorIntroducido+i);
		}
		
		System.out.println(sumando);

	}

}
