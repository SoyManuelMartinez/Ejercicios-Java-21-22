package relacion4;

public class Ej10Rel4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int azar;
		final int cantidadNumeros=20,maximoNumero=101;
		int [] numerosGenerados =new int[cantidadNumeros];
		int [] listaProOrdenada =new int[cantidadNumeros];
		int counterPosition=0;
		
		//GENERA 20 NUMEROS ALEATORIOS Y LOS ALMACENA EN UNA LISTA
		
		for(int i=0; i<=(cantidadNumeros-1);i++) {
			
			azar=(int)Math.floor(Math.random()*(maximoNumero-0)+0);
			numerosGenerados[i]=azar;
		}
		
		//METE PRIMERAMENTE LOS PARES EN LA LISTA PRO
		
		for(int i=0; i<=(cantidadNumeros-1);i++) {
			
			if(numerosGenerados[i]%2==0) {
				listaProOrdenada[counterPosition]=numerosGenerados[i];
				counterPosition++;
			}
		}
		
		//METE LOS IMPARES
		
		for(int i=0; i<=(cantidadNumeros-1);i++) {
			
			if(numerosGenerados[i]%2==1) {
				listaProOrdenada[counterPosition]=numerosGenerados[i];
				counterPosition++;
			}
		}
		
		//IMPRIME LA LISTA
		
		for(int i=0; i<=(cantidadNumeros-1);i++) {
			
			System.out.println((i+1)+"º: "+listaProOrdenada[i]);
			
		}

	}

}
