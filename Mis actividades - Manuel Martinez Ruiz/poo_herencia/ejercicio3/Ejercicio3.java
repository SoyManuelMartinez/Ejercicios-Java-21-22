package ejercicio3;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Repartidor Antonio = new Repartidor ("Antonio",27,975,"zona 1");
		Repartidor Batricio = new Repartidor ("Batricio",19,965,"zona 2");
		Repartidor Carmela = new Repartidor ("Carmela",24,1205,"zona 3");
		
		Comercial Domingo = new Comercial ("Domingo",64,2000,50);
		Comercial Ernesta = new Comercial ("Ernesta",18,1500,215);
		Comercial Fulgencia = new Comercial ("Fulgencia",80,3000,400);
		
		Antonio.plus();
		Batricio.plus();
		Carmela.plus();
		Domingo.plus();
		Ernesta.plus();
		Fulgencia.plus();
		
		System.out.println(Antonio);
		System.out.println(Batricio);
		System.out.println(Carmela);
		System.out.println(Domingo);
		System.out.println(Ernesta);
		System.out.println(Fulgencia);

	}

}
