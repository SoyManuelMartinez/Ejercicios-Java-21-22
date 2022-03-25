package Relacion2;

import java.util.Scanner;

public class Ej11Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numLista = new int [5];
		int num;
		
		Scanner sn=new Scanner(System.in);
		
		for (int i=0;i<=4;i++) {
			System.out.println("Dime el "+(i+1)+"º valor");
			num=sn.nextInt();
			numLista[i]=num;
		}
		
		for (int i=0;i<=4;i++) {
			System.out.println(numLista[i]+"\t"+Math.pow(numLista[i],2)+"\t"+Math.pow(numLista[i],3));
		}

	}

}
