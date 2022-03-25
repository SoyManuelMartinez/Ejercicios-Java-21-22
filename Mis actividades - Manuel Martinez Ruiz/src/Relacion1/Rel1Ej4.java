package Relacion1;
import javax.swing.JOptionPane;

public class Rel1Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double euros, pesetas;
		String lectura=JOptionPane.showInputDialog("Dame un valor en pesetas y lo convertiré a euros");
		pesetas=Double.parseDouble(lectura);//No puedo porque no me va el swing
		euros=(pesetas/166.386);
		System.out.println(pesetas+"pesetas equivalen a "+euros+"€.");
		

	}

}
