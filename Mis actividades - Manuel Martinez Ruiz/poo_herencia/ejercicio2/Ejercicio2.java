package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Triangulo[] listaTriangulos = new Triangulo[99];
		Rectangulo[] listaRectangulo = new Rectangulo[99];
		
		int select;
		Scanner sc = new Scanner(System.in);
		boolean menuLoop = true;
		
		/** MENU */
		
		while(menuLoop) {
			System.out.println("1. Introducir triángulo \n"
					+ "2. Introducir rectángulo");
			select = sc.nextInt();
			switch(select) {
			case 1:
				llenarTriangulos(listaTriangulos);
				break;
			case 2:
				llenarRectangulos(listaRectangulo);
				break;
			default:
				menuLoop=false;
				break;
			}
		}
		
		mostrarResultados(listaRectangulo,listaTriangulos);
	}
	
	public static void llenarTriangulos(Triangulo [] lista) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean encontrado=true;
		
		for(int i=0; i<lista.length; i++) {
			if(encontrado) {
				if(!lista[i].getVacio()) {
					System.out.println("L1 > ");
					double l1 = sc.nextInt();
					System.out.println("L2 > ");
					double l2 = sc.nextInt();
					System.out.println("L3 > ");
					double l3 = sc.nextInt();
					lista[i]=new Triangulo(l1,l2,l3);
					encontrado=false;
				}
			}
		}
	}
	
public static void llenarRectangulos(Rectangulo [] lista) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean encontrado=true;
		
		for(int i=0; i<lista.length; i++) {
			if(encontrado) {
				if(!lista[i].getVacio()) {
					System.out.println("L1 > ");
					double l1 = sc.nextInt();
					System.out.println("L2 > ");
					double l2 = sc.nextInt();
					lista[i]=new Rectangulo(l1,l2);
					encontrado=false;
				}
			}
		}
	}

public static void mostrarResultados(Rectangulo [] lrec, Triangulo [] ltri) {
	for(int i=0; i<lrec.length; i++) {
		System.out.println(lrec[0]);
	}
	for(int i=0; i<ltri.length; i++) {
		System.out.println(ltri[0]);
	}
}
	
	

}
