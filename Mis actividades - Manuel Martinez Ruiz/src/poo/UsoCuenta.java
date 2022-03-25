package poo;

import java.util.Scanner;

public class UsoCuenta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nombre, numero;
		double interes,saldo;
		
		/**1. Crea objeto cuenta1 sin parámetros */
		Cuenta cuenta1 = new Cuenta();
		
		/**2. Introduce los valores de cuenta1 con valores pedidos por teclado. */
		
		//Nombre cliente
		System.out.print("Introduce nombre de cliente \n> ");
		nombre = sc.nextLine();
		cuenta1.setNombre(nombre);
		
		//Numero de cuenta
		System.out.print("Introduce numero cuenta \n> ");
		numero = sc.nextLine();
		cuenta1.setNumero(numero);
		
		//Interés
		System.out.print("Introduce interés \n> ");
		interes = sc.nextDouble();
		cuenta1.setInteres(interes);
		
		//Saldo
		System.out.print("Introduce saldo \n> ");
		saldo = sc.nextDouble();
		cuenta1.setSaldo(saldo);
		
		/** 3. Muestra los valores de cuenta1. */
		
		System.out.println(cuenta1.getDatosCliente());
		
		/** 4. Crea el objeto cuenta2 con los valores siguientes:*/
		
		Cuenta cuenta2 = new Cuenta("Juan Fernández Rubio","1234567890",1.75,300);
		
		/** 5. Crea cuenta3 como copia de cuenta1 */
		
		Cuenta cuenta3 = new Cuenta(cuenta1);
		
		/** 6. Realiza un ingreso en cuenta1 */
		
		cuenta1.Integro(300);
		
		/** 7. Muestra el saldo de cuenta1 después del ingreso */
		
		System.out.println(cuenta1.getSaldo()+"€");
		
		/** 8. Muestra los datos de cuenta2 */
		
		System.out.println(cuenta2.getDatosCliente());
		
		/** 9. Muestra los datos de cuenta3 */
		
		System.out.println(cuenta3.getDatosCliente());
		
		/** 10. Realiza una transferencia de 10€ desde cuenta3 a cuenta2 */
		
		cuenta3.transferenciaRafa(cuenta2, 50);
		
		/** 11. Muestra el saldo de cuenta3 */
		
		System.out.println("El saldo actual de la cuenta3 después del ingreso es "+cuenta3.getSaldo()+ "€");
		

	}

}
