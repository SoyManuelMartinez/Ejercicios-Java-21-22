package relacion4;


public class Ej04Rel4 {
	
	//RELLENA LAS LISTA RESTANTES
	
	public static void FillArray(double[] lista, double[] listaOriginal, double elevado) {
		
		double paBorra=0;
		
		for(int i=0;i<=(lista.length-1);i++) {
			
			paBorra=listaOriginal[i];
			paBorra=Math.pow(paBorra, elevado);
			
			lista[i]=paBorra;
			System.out.print(lista[i]+"\t");
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int longitudListas=21, maxValor=101;
		double[] numeros = new double[longitudListas];
		double[] cuadrados = new double[longitudListas];
		double[] cubo = new double[longitudListas];
		int azar;
		
		System.out.print("NÚMEROS: \t");
		
		for(int i=0;i<=(longitudListas-1);i++) {
			
			azar=(int)Math.floor(Math.random()*(maxValor-0)+0);
			numeros[i]=azar;
			System.out.print(numeros[i]+"\t");
		}
		
		System.out.println("");
		System.out.print("CUADRADOS: \t");
		
		FillArray(cuadrados,numeros,2);
		
		System.out.println("");
		System.out.print("CUBOS:         \t");
		
		FillArray(cubo,numeros,3);
		
		

	}

}
