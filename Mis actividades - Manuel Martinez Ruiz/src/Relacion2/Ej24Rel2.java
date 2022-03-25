package Relacion2;

import java.util.Scanner;

public class Ej24Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numLeer, maxNum=1;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dame un valor");
		numLeer=sn.nextInt();
		
		for(int i=1;i<=numLeer;i++) {
			
			for(int j=1;j<=(maxNum);j++) {
				System.out.print(j);
			}
			
			for(int j=1;j<=(maxNum-1);j++) {
				System.out.print(maxNum-j);
			}
			
			System.out.println("");
			maxNum++;
		
		}

	}

}
