package relacion4_2;

public class Ej03Rel4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int fila=5, columna=6, maxNum=101;
		int[] [] arrayGenerica = new int[fila][columna];
		int [] sumaFila = new int [fila];
		int [] sumaColumna = new int [columna];
		
		//RELLENAR DE NUMEROS ALEATRIOS
		
		for(int f=0; f<=fila-1; f++) {
			for (int c=0; c<=columna-1; c++) {
				arrayGenerica[f][c]=(int)Math.floor(Math.random()*(maxNum-0)+0);
			}
		}
		
		//DIBUJA LOS NUMEROS
		
		for(int f=0; f<=fila-1; f++) {
			for (int c=0; c<=columna-1; c++) {
				System.out.print(arrayGenerica[f][c]+"\t");
				sumaFila[f]=sumaFila[f]+arrayGenerica[f][c];
			}
			System.out.println(sumaFila[f]);
		}
		
		//FALTA QUE MUESTRE LA SUMA DE LAS COLUMNAS
		

		
		
	}

}
