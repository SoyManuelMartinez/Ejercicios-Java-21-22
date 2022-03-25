package poo;
import java.util.*;

public class UsoFecha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia,mes,year;
		
		System.out.println("Introdce fecha");
		System.out.print("dia: ");
		dia = sc.nextInt();
		System.out.print("mes: ");
		mes = sc.nextInt();
		System.out.print("año: ");
		year = sc.nextInt();
		
		//Crea la fecha
		Fecha f1 = new Fecha (dia,mes,year);
		
		if(f1.esCorrecta()) {
			System.out.println(f1);
			Fecha fx = new Fecha (dia,mes,year);
			for(int i=0;i<10;i++) {
				fx = fx.diaSiguiente();
				System.out.println(fx);
			}
		}
		else {
			System.out.println("Esa fecha no es posible");
		}

	}

}
