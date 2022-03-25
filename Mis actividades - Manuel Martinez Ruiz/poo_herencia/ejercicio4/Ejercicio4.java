package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Producto p1 = new Producto ("Toallitas",0.25);
		Producto p2 = new Producto ("Papel higiénico",0.10);
		
		Perecedero p3 = new Perecedero ("Pizza de salmón",5.00,1);
		Perecedero p4 = new Perecedero ("Super Mario 3D All Stars",60.00,2);
		Perecedero p5 = new Perecedero ("Perro viejo",10.00,3);
		Perecedero p6 = new Perecedero ("Carnet de conducir",5.00,10);
		
		NoPerecedero p7 = new NoPerecedero ("Hormigón", 2.00, "Material de construcción");
		
		p1.Calcular(2);
		p2.Calcular(7);
		p3.Calcular(4);
		p4.Calcular(12);
		p5.Calcular(33);
		p6.Calcular(6);
		p7.Calcular(9);
		
		System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4 + "\n" + p5 + "\n" + p6 + "\n" + p7);

	}

}
