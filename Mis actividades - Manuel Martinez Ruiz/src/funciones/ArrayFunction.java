package funciones;

public class ArrayFunction {
	
	
	/**=================
	 * 13 - GENERATE ARRAY
	 * =================
	 */
	
	public static int[] GenerateArray(int longitud, int minRange, int maxRange) {
		maxRange++;
		int [] newArray=new int[longitud];
		
		for(int i=0;i<longitud;i++) {
			newArray[i]=(int)Math.floor(Math.random()*(maxRange-minRange)+minRange);
		}
		
		return newArray;
	}
	
	/**=================
	 * 14 -MINIMO ARRAY
	 * =================
	 */
	
	public static int MinimoArray(int [] array) {
		int minNum=9;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<minNum) {
				minNum=array[i];
			}
		}
		return minNum;
	}
	
	/**=================
	 * 15 -MAXIMO ARRAY
	 * =================
	 */
	
	public static int MaximoArray(int [] array) {
		int maxNum=0;
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>maxNum) {
				maxNum=array[i];
			}
		}
		return maxNum;
	}
	
	/**=================
	 * 16 - MEDIA ARRAY
	 * =================
	 */
	
	public static double MediaArray(int [] array) {
		double sumaTotal=0;
		
		for(int i=0;i<array.length;i++) {
			sumaTotal+=array[i];
		}
		sumaTotal/=array.length;
		
		return sumaTotal;
	}
	
	/**=================
	 * X - TEST
	 * =================
	 */

	public static void main(String[] args) {
		
		int [] array=new int[100];
		
		array=GenerateArray(array.length,0,100);
		
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+", ");
		}
		
		System.out.println("");
		System.out.println("LA MEDIA ES "+MediaArray(array));

	}

}
