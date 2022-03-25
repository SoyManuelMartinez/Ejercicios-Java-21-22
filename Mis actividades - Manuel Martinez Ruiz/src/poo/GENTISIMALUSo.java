package poo;

import java.util.Scanner;

public class GENTISIMALUSo {

	public static void main(String[] args) {
		
		GESTISIMAL[] almacen = new GESTISIMAL [5];
		
		/** PRODUCTOS DEL ALMACÉN */
		almacen[0] = new GESTISIMAL(120,"Peluche Teletubby",8.22,10.22);
		almacen[1]= new GESTISIMAL (14,"Elden Ring",40.22,59.99);
		almacen[2] = new GESTISIMAL (22,"Pokémon ESPAÑA",30.22,99.98);
		almacen[3] = new GESTISIMAL (1,"Kirby Lost Kingdom",150.50,1000);
		almacen[4] = new GESTISIMAL (49,"Xenoblade Chronicles 3",2.05,87.99);
		
		int crudSelect;
		boolean menuLoop=true;
		
		//Loop
		while(menuLoop) {
			crudSelect=DrawMenu();
			switch(crudSelect) {
			//Ignorar
			case 0:
				break;
			//1. Listado
			case 1:
				ListarMercancia(almacen);
				break;
			//2. Alta
			case 2:
				DarAlta(almacen);
				break;
			//3. Baja
			case 3:
				DarBaja(almacen);
				break;
			//4. Modificar
			case 4:
				ModificarMercancia(almacen);
				break;
			//5. Entra
			case 5:
				EntraMercancia(almacen);
				break;
			//6. Sale
			case 6:
				SaleMercancia(almacen);
				break;
			//CIERRA
			default:
				menuLoop=false;
				break;
			}
			System.out.println("");
		}

	}
	
	/**LISTA**/
	public static void ListarMercancia(GESTISIMAL[] almacen) {
		for(int i=0; i<almacen.length;i++) {
			System.out.println(almacen[i]);
		}
	}
	
	/**DAR DE ALTA*/
	public static void DarAlta(GESTISIMAL [] almacen) {
		Scanner st = new Scanner(System.in);
		//Autor
		System.out.print("Stock > ");
		int createStock = st.nextInt();
		//Titulo
		System.out.print("Descripcion > ");
		String createDesc = st.nextLine();
		//Genero
		System.out.print("Precio compra > ");
		int createCompra= st.nextInt();
		//Duracion
		System.out.print("Precio baja > ");
		int createVenta= st.nextInt();
		
		//Busca el primer espacio libre
		boolean celdaVacia=false;
		int i=0;
		while(!celdaVacia) {
			//Encuentra un espacio vacio
			if(almacen[i].getDescripcion()=="vacio") {
				//Crea objeto y lo almacena
				almacen[0]=new GESTISIMAL(createStock,createDesc,createCompra,createVenta);
				celdaVacia=true;
			}
			i++;
		}
		
	}
	
	/**DAR DE BAJA*/
	public static void DarBaja(GESTISIMAL[] almacen) {
		int searchProduct=EncuentraProducto(almacen);
		
		if(searchProduct!=-1) {
			almacen[searchProduct]=new GESTISIMAL();
		}
	}
	
	/**MODIFICAR */
	public static void ModificarMercancia(GESTISIMAL[] almacen) {
		int searchProduct=EncuentraProducto(almacen);
		
		if(searchProduct!=-1) {
			Scanner st = new Scanner(System.in);
			//Autor
			System.out.print("Stock > ");
			int createStock = st.nextInt();
			//Titulo
			System.out.print("Descripcion > ");
			String createDesc = st.nextLine();
			//Genero
			System.out.print("Precio compra > ");
			int createCompra= st.nextInt();
			//Duracion
			System.out.print("Precio baja > ");
			int createVenta= st.nextInt();
			
			almacen[searchProduct]=new GESTISIMAL(createStock,createDesc,createCompra,createVenta);
		}
	}
	
	/**ENTRA MERCANCIA */
	public static void EntraMercancia(GESTISIMAL[] almacen) {
		int searchProduct=EncuentraProducto(almacen);
		
		if(searchProduct!=-1) {
			Scanner sc = new Scanner(System.in);
			System.out.print("¿Cuánta mercancia entra? \n"+
					"> ");
			int cantidadEntra = sc.nextInt();
			almacen[searchProduct].EntraProducto(cantidadEntra);
		}
	}
	
	/**SALE MERCANCIA*/
	public static void SaleMercancia(GESTISIMAL[] almacen) {
		int searchProduct=EncuentraProducto(almacen);
		
		if(searchProduct!=-1) {
			Scanner sc = new Scanner(System.in);
			System.out.print("¿Cuánta mercancia sale? \n"+
					"> ");
			int cantidadEntra = sc.nextInt();
			almacen[searchProduct].SaleProducto(cantidadEntra);
		}
	}
	
	/** ENCONTRAR PRODUCTO */
	public static int EncuentraProducto(GESTISIMAL[] almacen) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el código del producto \n"+
				"> ");
		int searchCode = sc.nextInt();
		int valorRetornado = -1;
		boolean codigoEncontrado = false;
		//Encuentra el producto que coincida con el codigo
		for(int i=0;i<almacen.length;i++) {
			if(almacen[i].getCODIGO()==searchCode) {
				//Ha encontrado el producto
				codigoEncontrado=true;
				valorRetornado=i;
			}
		}
		if(!codigoEncontrado) {
			System.out.println("No se ha encontrado ningún producto que coincida con "+searchCode+"\n");
		} 
		
		return valorRetornado;
	}
	
	/** DIBUJAR MENU */
	
	public static int DrawMenu() {
		Scanner sc = new Scanner(System.in);
		int crudSelect;
		
		System.out.println("GESTIÓN SIMPLIFICADA DE ALMACÉN\n" + 
				"===================\n" + 
				"1.  Listado.\n" + 
				"2.  Alta.\n" + 
				"3.  Baja.\n" + 
				"4.  Modificación.\n" + 
				"5.  Entrada de mercancía.\n"+
				"6.  Salida de mercancía.\n"+
				"7.  Salir");
		
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

}
