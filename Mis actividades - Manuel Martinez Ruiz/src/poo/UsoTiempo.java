package poo;

public class UsoTiempo {

	public static void main(String[] args) {
		
		Tiempo f1 = new Tiempo(40,30);
		Tiempo f2 = new Tiempo (20,35);
		Tiempo fx= f1.sumaTiempo(f2);
		
		System.out.println(fx.toString());

	}

}
