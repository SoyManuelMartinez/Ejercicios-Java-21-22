package relacion6;
import java.util.Scanner;

public class Ej06Rel6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String newFrase="";
		
		System.out.print("> ");
		String frase = sc.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			newFrase+=frase.charAt(frase.length()-i-1);
		}
		
		System.out.print(newFrase);
		
		

	}

}
