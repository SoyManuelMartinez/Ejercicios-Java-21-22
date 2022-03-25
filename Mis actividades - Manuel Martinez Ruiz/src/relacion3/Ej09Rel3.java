package relacion3;

public class Ej09Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int notas[]= new int[5];
		int azar=0;
		final int notasGeneradas=16;
		
		notas[0]=0;
		notas[0]=1;
		notas[0]=2;
		notas[0]=3;
		notas[0]=4;
		
		//0 = suspenso
		//1 = suficiente
		//2 = bien
		//3 = notable
		//4 = sobresaliente
		
		for(int i=1; i<=notasGeneradas; i++) {
			
			azar=(int)Math.floor(Math.random()*(5-0)+0);
			notas[azar]++;
		}
		
		System.out.println(notas[0]+" suspensos");
		System.out.println(notas[1]+" suficientes");
		System.out.println(notas[2]+" bien");
		System.out.println(notas[3]+" notables");
		System.out.println(notas[4]+" sobresalientes");

	}

}
