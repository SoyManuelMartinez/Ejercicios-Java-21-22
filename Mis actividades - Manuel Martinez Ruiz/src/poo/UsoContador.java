package poo;

public class UsoContador {

	public static void main(String[] args) {
		
		/**1. Utilizar el constructor por defecto */
		
		Contador contador1 = new Contador();
		
		/**2. Asignar un valor al contador */
		
		contador1.setCont(100);
		
		/**3. Incrementar el contador */
		
		contador1.incrementaCont();
		
		/**4. Mostrar el valor actual */
		
		System.out.println("El contador actual del contador 1 es "+contador1.getCont());
		
		/**5. Incrementar el contador dos veces */
		
		contador1.incrementaCont(2);
		
		/**6. Mostrar el valor actual */
		
		System.out.println("El contador actual del contador 1 es "+contador1.getCont());
		
		/**7. Restar 1 al valor del contador */
		
		contador1.decrementaCont();
		
		/**8. Mostrar el valor actual */
		
		System.out.println("El contador actual del contador 1 es "+contador1.getCont());
		
		/**9. Crear un nuevo objeto Contador con valor inicial 10 */
		
		Contador contador2 = new Contador(10);
		
		/**10. Incrementar y decrementar el contador 2 y mostrar su valor  */
		
		contador2.incrementaCont();
		System.out.println("El contador 2 es: "+contador2.getCont());
		contador2.decrementaCont();
		System.out.println("El contador 2 es: "+contador2.getCont());
		
		/**11. Crear un objeto Contador utilizando el constructor copia */
		/**12. Crear el objeto contador3 como copia de contador2*/
		
		Contador contador3 = new Contador(contador2);
		
		/**13. Mostrar el valor de contador3 */
		
		System.out.println("El contador actual del contador 3 es "+contador3.getCont());

	}

}
