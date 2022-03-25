package Relacion2;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class Ej18Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numIntr1, numIntr2;
		
		Scanner sn=new Scanner(System.in);
		
		System.out.println("Dime el primer valor");
		numIntr1=sn.nextInt();
		numIntr2=numIntr1;
		
		while(numIntr1==numIntr2) {
			System.out.println("Dime el segundo valor");
			numIntr2=sn.nextInt();
			if(numIntr1==numIntr2) {
				JOptionPane.showMessageDialog(null, "No acepto valores iguales");
			}
		}
		
		for(int i=0;i<=numIntr2;i+=7) {
			System.out.println(numIntr1+i);
		}

	}

}
