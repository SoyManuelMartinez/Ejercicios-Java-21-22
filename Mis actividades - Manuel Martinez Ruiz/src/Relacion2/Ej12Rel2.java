package Relacion2;

import java.util.Scanner;

public class Ej12Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int repetir=0,fibonacci=1,lastFibonacci=0;
		
		
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("¿Cuantos valores quieres de la serie de Fibonacci?");
		repetir=sn.nextInt();
		
		System.out.println("0");
		
		for (int i=0;i<=(repetir-1);i++) {
			System.out.println(fibonacci);
			fibonacci=fibonacci+lastFibonacci;
			lastFibonacci=fibonacci-lastFibonacci;
		}
		
		
		
		

	}

}
