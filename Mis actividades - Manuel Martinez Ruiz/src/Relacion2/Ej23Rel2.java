package Relacion2;

import java.util.Scanner;

public class Ej23Rel2 {

	public static void main(String[] args) {
		int numLeer, maximoTolerado=10000, cont=0, sumaTotal=0;
		
		Scanner sn=new Scanner(System.in);
		
		
		
		while(sumaTotal<maximoTolerado) {
			System.out.println("Dame un valor");
			numLeer=sn.nextInt();
			cont++;
			sumaTotal=sumaTotal+numLeer;
			System.out.println("Llevamos una suma de "+sumaTotal);
		}
		
		System.out.println("Hemos sumado "+sumaTotal);
		System.out.println("Ha introducido "+cont+" números");
		System.out.println("Su media es "+(sumaTotal/cont));

	}

}
