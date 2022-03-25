package Relacion2;

import java.util.Scanner;

public class Ej28Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, factorial=1;
		
		Scanner sn=new Scanner(System.in);
		
		
		
		System.out.println("Dame un número y calcularé su factorial");
		num=sn.nextInt();
		
		for(int i=1;i<=num;i++) {
			factorial*=i;
		}
		
		System.out.println(factorial);

	}

}
