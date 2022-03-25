package Relacion2;

import java.util.Scanner;

public class Ej08Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner sn=new Scanner(System.in);
		System.out.println("Dime un número y diré su tabla de multiplicar");
		num=sn.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}

	}

}
