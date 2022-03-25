package relacion3;

public class Ej11Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado1=0, dado2=1;
		final int maxValor=7;
		
		
		
		while(dado1!=dado2) {
			
			dado1=(int)Math.floor(Math.random()*(maxValor-0)+0);
			dado2=(int)Math.floor(Math.random()*(maxValor-0)+0);
			System.out.println(dado1+" y "+dado2);
			
		}

	}

}
