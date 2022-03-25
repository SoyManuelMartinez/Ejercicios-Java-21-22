package relacion6;
import java.util.Scanner;

public class Ej04Rel6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		char checkIndex;
		int counter=0;
		
		System.out.print("> ");
		frase = sc.nextLine();
		
		for(int i=0;i<frase.length();i++) {
			checkIndex=frase.charAt(i);
			if(checkIndex==' ') {
				counter++;
			}
		}
		System.out.println("-------------");
		System.out.println("Tiene "+counter+" espacios");
		

	}

}
