package Relacion2;
import java.util.Scanner;

public class Ej07Rel2 {

	public static void main(String[] args) {
		
int cajaFuerte=1234,num=0;
		
		Scanner sn=new Scanner(System.in);
		
		for (int i=1;i<=4;i++) {
			System.out.println("INTENTO "+i+": Di el codigo de la caja fuerte");
			num=sn.nextInt();
			
			
			if(num==cajaFuerte) {
				i=4;
				System.out.println("¡HAS ACERTADO!");
				}
			}
		
		if(num!=cajaFuerte) {
			System.out.println("Has perdido...");
		}

	}

}
