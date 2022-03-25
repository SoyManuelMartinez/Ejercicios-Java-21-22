package relacion6;

import java.util.Scanner;

public class Ej02Rel6V1 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	boolean finishGame=false;
	int counter=0;
	String check;
	
	System.out.println("JUGADOR 1, introduzca la contraseña");
	String password = sc.nextLine();
	
	//System.out.print("\033[H\033[2J");
	//System.out.flush();

	
	pistas(password);
	
	while(!finishGame) {
		counter++;
		System.out.print("> ");
		check = sc.nextLine();
		if(check.equals(password)) {
			finishGame=true;
		}
	}
	
	System.out.println("El JUGADOR 2 ha resuelto la contraseña");
	System.out.println("Ha consumido "+counter+" intentos");
	
	}
	
	public static void pistas(String password) {
		System.out.println("La contraseña tiene "+password.length()+ " caracteres");
		System.out.println("Su primer carácter es "+password.charAt(0));
		System.out.println("Su primer carácter es "+password.charAt(password.length()-1));
	}

}
