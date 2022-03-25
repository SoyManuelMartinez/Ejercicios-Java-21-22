package Relacion2;

import java.util.Scanner;

public class Ej10Rel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num=1, media=0;
		
		Scanner sn=new Scanner(System.in);
		
		while (num>=0) {
			System.out.println("Introduce valores");
			num=sn.nextInt();
			if (num>=0){
				media=media+num;
				i++;
			}
		}
		
		System.out.println("La media de todos los valores es "+media/i);
			
		

	}

}
