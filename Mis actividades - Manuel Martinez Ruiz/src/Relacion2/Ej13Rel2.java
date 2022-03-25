package Relacion2;

import java.util.Scanner;

public class Ej13Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numLista = new int [10];
		int num, positivos=0;
		
		Scanner sn=new Scanner(System.in);
		
		//LEER NUMEROS
		
		for (int i=0;i<=9;i++) {
			System.out.println("Dime el "+(i+1)+"º valor");
			num=sn.nextInt();
			numLista[i]=num;
		}
		
		//VALORAR SI ES POSITIVO O NO
		
		for (int i=0;i<=9;i++) {
			if(numLista[i]>=0) {
				positivos++;
			}
		}
		
		System.out.println("Hay "+positivos+" valores positivos (o iguales a cero), y hay "+(10-positivos)+" valores negativos");

	}

}
