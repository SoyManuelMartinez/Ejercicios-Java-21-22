package relacion3;

public class Ej01Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num_maximo=7, num_minimo=1, tiradas=3;
		
		int dado, sumaDados=0;
		
		
		
		for(int i=1; i<=tiradas;i++) {
			dado=(int)Math.floor(Math.random()*(num_maximo-num_minimo)+num_minimo);
			System.out.println("El dado "+i+"º es "+dado);
			sumaDados=sumaDados+dado;
		}
		
		System.out.println("La suma total es: "+sumaDados);

	}

}
