package relacion3;

public class Ej05Rel3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int azar, sumaAzar=0, maxNum=0, minNum=1000, media=0;
		final int numeroVeces=50;
		
		
		for(int i=1;i<=numeroVeces;i++) {
			azar=(int)Math.floor(Math.random()*(200-100)+100);
			sumaAzar=sumaAzar+azar;
			System.out.print(azar+" ");
			
			//MÁXIMO
			
			if(azar>maxNum) {
				maxNum=azar;
			}
			
			//MÍNIMO
			
			if(azar<minNum) {
				minNum=azar;
			}
			
			//MEDIA
			
			media=media+azar;
			
		}
		
		System.out.println("");
		System.out.println("El valor máximo ha sido "+maxNum);
		System.out.println("El valor mínimo ha sido "+minNum);
		System.out.println("La media total ha sido "+(media/numeroVeces));
		

	}

}
