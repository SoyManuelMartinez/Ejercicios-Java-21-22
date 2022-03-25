package poo;

import java.util.Scanner;

public class UsoLibro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/**1. Libro("El quijote", "Cervantes", 1, 0) */
		
		Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
		
		/**2. Crea el objeto libro2 utilizando el constructor por defecto */
		
		Libro libro2 = new Libro();
		
		/**3. Asigna a libro2 los datos pedidos por teclado. */
		
		//Titulo
		System.out.print("TÍTULO > ");
		String titulo = sc.nextLine();
		libro2.setTitulo(titulo);
		
		//Autor
		System.out.print("AUTOR > ");
		String autor = sc.nextLine();
		libro2.setAutor(autor);
		
		//Ejemplares
		System.out.print("EJEMPLARES > ");
		int ejemplares = sc.nextInt();
		libro2.setEjLibros(ejemplares);
		
		//Prestados
		System.out.print("PRESTADO > ");
		int prestado = sc.nextInt();
		libro2.setEjPrestados(prestado);
		
		/**4. Muestran por pantalla los datos del objeto libro1. */
		
		System.out.println(libro1.toString());
		
		/**5. Realiza un préstamo de libro1. El método devuelve true si se ha podido realizar el 
		 * préstamo y false en caso contrario.  */
		
		libro1.Prestamo();
		
		/**6. Realiza una devolución de libro1. El método devuelve true si se ha podido realizar la 
		 * devolución y false en caso contrario.  */
		
		libro1.Devolucion();
		
		/**7. Realiza un préstamo de libro1. */
		
		libro1.Prestamo();
		
		/**8. Realiza otro préstamo de libro1. En este caso no se podrá realizar ya que solo hay un
		ejemplar de este libro y ya está prestado. Se mostrará por pantalla el mensaje “No 
		quedan ejemplares del libro…” */
		
		if(!libro1.Prestamo()) {
			System.out.println("No quedan ejemplares del libro…");
		}
		
		/**9. Mostrar los datos del objeto libro1 */
		
		System.out.println(libro1.toString());
		
		/**10. Mostrar los datos del objeto libro2 */
		
		System.out.println(libro2.toString());
		

	}

}
