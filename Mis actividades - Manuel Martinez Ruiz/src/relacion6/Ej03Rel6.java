package relacion6;

import java.util.Scanner;

public class Ej03Rel6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String fraseCompleta="", fraseLeer;
		boolean unfinishedWhile=true;
		
		while(unfinishedWhile) {
			System.out.print("> ");
			fraseLeer = sc.nextLine();
			if(checkFin(fraseLeer)) {
				unfinishedWhile=false;
			}
			else {
				fraseCompleta+=fraseLeer;
				fraseCompleta+=" ";
			}
		}
		
		System.out.println("------------");
		System.out.println(fraseCompleta);

	}
	
	/**
	 * CHECKEA QUE LA FRASE ES FIN
	 */
	
	public static boolean checkFin(String frase) {
		boolean isFin=false;
		
		if(frase.equalsIgnoreCase("fin")) {
			isFin=true;
		}
		
		return isFin;
	}

}
