package poo;

public class UsoPizza9 {

	public static void main(String[] args) {
		
		Pizza9 p1 = new Pizza9("Gigante","Ibérica");
		Pizza9 p2 = new Pizza9("Infantil","Piña");
		p2.Sirve();
		Pizza9 p3 = new Pizza9("Mediana","Cereales");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		p2.Sirve();
		System.out.println("PEDIDAS: "+Pizza9.getPedidas());
		System.out.println("SERVIDAS: "+Pizza9.getServidas());

	}

}
