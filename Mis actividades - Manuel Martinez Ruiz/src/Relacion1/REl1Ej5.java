package Relacion1;

import javax.swing.JOptionPane;

public class REl1Ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double euros, pesetas;
		String lectura=JOptionPane.showInputDialog("Dame un valor en euros y lo convertiré a pesetas");
		euros=Double.parseDouble(lectura);//No puedo porque no me va el swing
		pesetas=(euros*166.386);
		System.out.println(euros+"€ equivalen a "+pesetas+" pesetas.");

	}

}
