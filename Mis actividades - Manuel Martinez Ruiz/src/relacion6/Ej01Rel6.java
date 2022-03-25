package relacion6;
import java.util.Scanner;

public class Ej01Rel6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la palabra 1");
		String p1 = sc.nextLine();
		System.out.println("Introduce la palabra 2");
		String p2 = sc.nextLine();
		
		int diferencia =  p1.length()-p2.length();
		
		//MISMA LONGITUD
		if(diferencia==0) {
			System.out.println("Ambas palabras tiene la misma longitud");
		}
		else {
			//La segunda es más larga
			if(diferencia>0) {
				System.out.println("La primera palabra "+p1+" es la más larga");
			}
			//La primera es más larga
			else if(diferencia<0){
				System.out.println("La segunda palabra "+p2+" es la más larga");
			}
		}
		
		
		

	}

}
