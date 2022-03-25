package poo;
import java.util.*;

public class UsoDisco {

	public static void main(String[] args) {
		
		int crudSelect, numCod=000;
		boolean menuLoop=true;
		Scanner sc = new Scanner(System.in);
		
		//Creamos la lista y la lleno de discos vacios
		Disco[] listaDiscos = new Disco [100];
		for(int i=0;i<listaDiscos.length;i++) {
			listaDiscos[i]= new Disco();
		}
		
		//El bucle no termina hasta que el usuario no lo indice
		while(menuLoop) {
			crudSelect=DrawMenu();
			switch(crudSelect) {
			//Ignorar
			case 0:
				break;
			//R
			case 1:
				ReadDisco(listaDiscos);
				break;
			//C
			case 2:
				numCod=CreateDisco(Integer.toString(numCod),listaDiscos);
				break;
			//U
			case 3:
				UpdateDisco(listaDiscos);
				break;
			//D
			case 4:
				DeleteDisco(listaDiscos);
				break;
			//End
			default:
				menuLoop=false;
				break;
			}
			System.out.println("");
		}
		
		

	}
	
	/** DIBUJAR MENU */
	
	public static int DrawMenu() {
		Scanner sc = new Scanner(System.in);
		int crudSelect;
		
		System.out.println("COLECCIÓN DE DISCOS\n" + 
				"===================\n" + 
				"1.  Listado.\n" + 
				"2.  Nuevo Disco.\n" + 
				"3.  Modificar.\n" + 
				"4.  Borrar.\n" + 
				"5. Salir.");
		
		System.out.print("> ");
		try {
			crudSelect = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("¡ESE VALOR NO ES VÁLIDO!");
			crudSelect=0;
		}
		
		return crudSelect;
	}
	
	/** MODIFICAR DISCO */
	
	public static void UpdateDisco (Disco [] listaDiscos) {
		
		Scanner st = new Scanner(System.in);
		System.out.print("Disco que desea modificar > ");
		String discoToUpdate = st.nextLine();
		
		//Comprueba los discos hasta hallar uno que coincida
		boolean celdaVacia=false;
		int i=0;
		while(!celdaVacia) {
			if(listaDiscos[i].getCodigo().contentEquals(discoToUpdate)) {
				//Autor
				System.out.print("Autor > ");
				String createAutor = st.nextLine();
				//Titulo
				System.out.print("Titulo > ");
				String createTitulo = st.nextLine();
				//Genero
				System.out.print("Género > ");
				String createGenero= st.nextLine();
				//Duracion
				System.out.print("Duración > ");
				int createDuracion= st.nextInt();
				//Crea un disco como se ha modificado
				listaDiscos[i] = new Disco (discoToUpdate, createAutor, createTitulo, createGenero, createDuracion);
				System.out.print("Disco modificado exitosamente");
				celdaVacia=true;
			}
			i++;
			//Si el codigo no coincide con ningun elemento de la lista
			if(i>=listaDiscos.length) {
				celdaVacia=true;
				System.out.print("Codigo "+discoToUpdate+" no existe");
			}
		}
	}
	
	
	
	/** CREAR DISCO */
	
	public static int CreateDisco(String codigo, Disco [] listaDiscos) {
		
		String  createAutor, createTitulo, createGenero;
		int createDuracion;
		Scanner st = new Scanner(System.in);
		
		//Autor
		System.out.print("Autor > ");
		createAutor = st.nextLine();
		//Titulo
		System.out.print("Titulo > ");
		createTitulo = st.nextLine();
		//Genero
		System.out.print("Género > ");
		createGenero= st.nextLine();
		//Duracion
		System.out.print("Duración > ");
		createDuracion= st.nextInt();	
		
		//Crea objeto
		Disco discoCreado = new Disco (codigo, createAutor, createTitulo, createGenero, createDuracion);
		//Convierte el codigo en un numero
		int numCodigo = Integer.parseInt(codigo);
		//Almacena el disco creado en el primer espacio vacio que encuentra
		boolean celdaVacia=false;
		int i=0;
		while(!celdaVacia) {
			if(listaDiscos[i].getCodigo()=="LIBRE") {
				listaDiscos[i]=discoCreado;
				celdaVacia=true;
			}
			i++;
		}
		
		//Aumenta en uno el codigo
		numCodigo++;
		return numCodigo;
		
	}
	
	/**LEER TODOS LOS DISCOS */
	public static void ReadDisco(Disco [] listaDiscos) {
		for(int i=0;i<listaDiscos.length;i++) {
			if(listaDiscos[i].getCodigo()!="LIBRE") {
				System.out.println(listaDiscos[i]);
			}
		}
	}
	
	
	/** BORRAR DISCO */
	
	public static void DeleteDisco(Disco [] listaDiscos) {
		Scanner se = new Scanner(System.in);
		String deleteDisco;
		
		System.out.print("Introduce el código del disco que desea borrar > ");
		deleteDisco = se.nextLine();
		
		//Comprueba todos los codigos hasta hallar uno con el que coincida
		boolean celdaVacia=false;
		int i=0;
		while(!celdaVacia) {
			if(listaDiscos[i].getCodigo().contentEquals(deleteDisco)) {
				listaDiscos[i]=new Disco();
				System.out.print("Disco borrado exitosamente");
				celdaVacia=true;
			}
			i++;
			//Si el codigo no coincide con ningun elemento de la lista
			if(i>=listaDiscos.length) {
				celdaVacia=true;
				System.out.print("Codigo "+deleteDisco+" no existe");
			}
		}
		
		
	}

}
