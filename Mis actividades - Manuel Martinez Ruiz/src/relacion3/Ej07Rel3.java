package relacion3;

public class Ej07Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int stopNumber=24;
		int azar=0, cuentaNumerosGenerados=0;
		
		while(azar!=stopNumber) {
			
			azar=(int)Math.floor(Math.random()*(101-0)+0);
			cuentaNumerosGenerados++;
		}
		
		System.out.println("He generado "+cuentaNumerosGenerados);

	}

}
