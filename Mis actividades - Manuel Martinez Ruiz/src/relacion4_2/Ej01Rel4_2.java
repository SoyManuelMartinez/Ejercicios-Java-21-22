package relacion4_2;

public class Ej01Rel4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int fila=3, columna=6;
		int[] [] arrayGenerica = new int[fila][columna];
		
		arrayGenerica[0][0]=0;
		arrayGenerica[0][1]=30;
		arrayGenerica[0][2]=2;
		arrayGenerica[0][5]=5;
		
		arrayGenerica[1][0]=75;
		arrayGenerica[1][4]=0;
		
		arrayGenerica[2][2]=-2;
		arrayGenerica[2][3]=9;
		arrayGenerica[2][5]=11;
	
		//ESCIBIR COLUMNAS
		
		System.out.print("Array"+"\t");
		
		for (int i=0; i<=columna-1; i++) {
			System.out.print("C"+i+"\t");
		}
		
		System.out.println("");
		
		//DIBUJA LOS NUMEROS
		
		for(int f=0; f<=fila-1; f++) {
			System.out.print("F"+f+"\t");
			for (int c=0; c<=columna-1; c++) {
				System.out.print(arrayGenerica[f][c]+"\t");
			}
			System.out.println("");
		}

	}

}
