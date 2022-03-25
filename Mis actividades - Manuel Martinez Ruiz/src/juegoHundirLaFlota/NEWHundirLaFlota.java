package juegoHundirLaFlota;
import java.util.Scanner;

public class NEWHundirLaFlota {

	public static void main(String[] args) {

		// Cantidad de filas y columnas
		final int maxFilas = 10, maxColumnas = 10;

		// Mapa del jugador y la consola
		int[][] playerMap = new int[maxFilas][maxColumnas];
		int[][] consoleMap = new int[maxFilas][maxColumnas];

		generateConsoleBoats(consoleMap, 5, 3, 2);
		generateConsoleBoats(playerMap, 5, 3, 2);
		
		MainGame(playerMap,consoleMap);
		
	}
	
	/**========================================= 
	 * DIBUJAR MAPA DE LA CONSOLA
	 * =========================================
	 */
	
	//A diferencia del metodo que dibuja el mapa del jugador, este no revelar� las posiciones de los barcos
	
	public static void DrawConsoleMap(int[][] consoleMap) {
		
		final String emptySpace = ".", drownSpace = "X", waterSpace = "A";
		
		// Dibuja eje X
		System.out.printf("%3s ", "");
		for (int numeroColumna = 0; numeroColumna < consoleMap[1].length; numeroColumna++) {
			System.out.printf("%2s ", "[" + numeroColumna + "]");
		}
		System.out.println("");
		
		// Dibuja mapa + eje Y
				for (int filas = 0; filas < consoleMap.length; filas++) {
					System.out.printf("%2s ", "[" + filas + "]");
					for (int columna = 0; columna < consoleMap[1].length; columna++) {

						// Dibuja lo que está en la casilla
						switch (consoleMap[filas][columna]) {
						// Está vacío
						case 0:
							System.out.printf("%2s  ", emptySpace);
							break;
						// Agua
						case 8:
							System.out.printf("%2s  ", waterSpace);
							break;
						// Hundido
						case 9:
							System.out.printf("%2s  ", drownSpace);
							break;
						// Barco de 1 casilla
						case 1:
							System.out.printf("%2s  ", emptySpace);
							break;
						// Barco de 3 casillas
						case 3:
							System.out.printf("%2s  ", emptySpace);
							break;
						// Barco de 5 casillas
						case 5:
							System.out.printf("%2s  ", emptySpace);
							break;
						}
					}
					System.out.println("");
					System.out.println("");
				}
		
	}
	
	

	/**========================================= 
	 * DIBUJAR MAPA DEL JUGADOR
	 * =========================================
	 */

	public static void DrawPlayerMap(int[][] playerMap) {

		final String emptySpace = ".", drownSpace = "X", waterSpace = "A";
		final String boat1 = "1", boat3 = "3", boat5 = "5";

		// Dibuja eje X
		System.out.printf("%3s ", "");
		for (int numeroColumna = 0; numeroColumna < playerMap[1].length; numeroColumna++) {
			System.out.printf("%2s ", "[" + numeroColumna + "]");
		}
		System.out.println("");

		// Dibuja mapa + eje Y
		for (int filas = 0; filas < playerMap.length; filas++) {
			System.out.printf("%2s ", "[" + filas + "]");
			for (int columna = 0; columna < playerMap[1].length; columna++) {

				// Dibuja lo que está en la casilla
				switch (playerMap[filas][columna]) {
				// Está vacío
				case 0:
					System.out.printf("%2s  ", emptySpace);
					break;
				// Agua
				case 8:
					System.out.printf("%2s  ", waterSpace);
					break;
				// Hundido
				case 9:
					System.out.printf("%2s  ", drownSpace);
					break;
				// Barco de 1 casilla
				case 1:
					System.out.printf("%2s  ", boat1);
					break;
				// Barco de 3 casillas
				case 3:
					System.out.printf("%2s  ", boat3);
					break;
				// Barco de 5 casillas
				case 5:
					System.out.printf("%2s  ", boat5);
					break;
				}
			}
			System.out.println("");
			System.out.println("");
		}
	}

	/**========================================= 
	 * GENERAR MAPA DE LA CONSOLA
	 * =========================================
	 */

	public static int[][] generateConsoleBoats(int[][] consoleMap, int boat1Amount, int boat3Amount, int boat5Amount) {

		// Maxima coordenada en la que se puede generar un barco en cada eje
		final int maxX = consoleMap.length, maxY = consoleMap[1].length;
		// Cuanto ocupa cada tipo de barco
		final int boat1Space = 1, boat3Space = 3, boat5Space = 5;
		// Cuantas coordenadas pueden ocupar todos los barcos
		final int possibleCoordLocation = ((boat1Space * boat1Amount) + (boat3Space * boat3Amount)
				+ (boat5Space * boat5Amount));

		// Lista para guardar la Coordenada aleatoria y orientación aleatoria
		int[] coordArray = new int[3];

		/**
		 * boat Random Location X [0] boat Random Location Y[1] Orienteción [2]
		 * ============ 
		 * 0=Derecha 1=Arriba 2=Izquierda 3=Abajo
		 */

		// Localiza botes de 5
		for (int boatGenerated = 0; boatGenerated < boat5Amount; boatGenerated++) {
		consoleMap=PlaceBoats(boat5Amount, boat5Space, coordArray, consoleMap, maxX, maxY, possibleCoordLocation);
		}
		
		// Localiza botes de 3
		for (int boatGenerated = 0; boatGenerated < boat3Amount; boatGenerated++) {
			consoleMap=PlaceBoats(boat3Amount, boat3Space, coordArray, consoleMap, maxX, maxY, possibleCoordLocation);
		}
		
		// Localiza botes de 1
		for (int boatGenerated = 0; boatGenerated < boat1Amount; boatGenerated++) {
			consoleMap=PlaceBoats(boat1Amount, boat1Space, coordArray, consoleMap, maxX, maxY, possibleCoordLocation);
		}
		
		//Esto se puede adaptar para generar tipos de barcos infinitos, pero no es obligatorio

		return consoleMap;

	}
	
	/**================================================ 
	 * HA ALCANZADO UN BARCO
	 * ==================================================
	 */
	
	//tileAttack[0] = xCoordAttack
	//tileAttack[1] = yCoordAttack
	
	public static boolean CheckAttack(int mapToCheck [][], int tileAttack[]) {
		boolean drowned;
		
		if (mapToCheck[tileAttack[0]][tileAttack[1]]!=0) {
			System.out.println("�HA ALCANZADO UN BARCO!");
			drowned=true;
		}
		else {
			System.out.println("AGUA");
			drowned=false;
		}
		return drowned;
	}
	
	/**================================================ 
	 * HA ATACADO EN UN LUGAR NUEVO
	 * ==================================================
	 */
	
	public static boolean AlreadyPickedTile(int mapToCheck [][], int tileAttack[]) {
		boolean repeated=false;
		
		if(mapToCheck[tileAttack[0]][tileAttack[1]]==8 || mapToCheck[tileAttack[0]][tileAttack[1]]==9) {
			System.out.println("Ha escogido una casilla repetida");
			repeated=true;
		}
		return repeated;
	}
	
	
	/**================================================ 
	 * PIDE COORDENADAS PARA ATACAR AL ADVERSARIO
	 * ==================================================
	 */
	
	public static int[] AskCoords(int consoleMap[][]) {
		//Inicializar Scanner
		Scanner sc = new Scanner(System.in);
		
		String askedCoords;
		int[] tileAttack = new int[2];
		char xCoord,yCoord;
		boolean invalidCoord=true;
		
		//Bucle para leer COORDS
		while(invalidCoord) {
			invalidCoord=false;
			
			//Lee coordenada
			System.out.print("> ");
			askedCoords = sc.nextLine();
			askedCoords= askedCoords.trim();
			
			//Almacena el primer caracter del string en las coordenadas
			xCoord=askedCoords.charAt(0);
			yCoord=askedCoords.charAt(1);
			
			//Asegura que introduzca una coordenada válida
			try {
				tileAttack[0]=Integer.parseInt(String.valueOf(xCoord));
				tileAttack[1]=Integer.parseInt(String.valueOf(yCoord));
			}
			catch(Exception e){
				System.out.println("Eso no es una coordenada válida...");
				invalidCoord=true;
			}
			
			//Asegura que el ataque es nuevo
			if(AlreadyPickedTile(consoleMap,tileAttack)) {
				invalidCoord=true;
				System.out.println("Ya has lanzado un ataque en esa coordenada...");
			}
		}

		return tileAttack;
	}
	
	/**======================================
	 * BUCLE DE JUEGO PRINCIPAL
	 * =======================================
	 */
	
	//Cada turno ataca un jugador
	//Guarda en el mapa el ataque
	//Dibuja el mapa
	//Almacena el puntaje
	//Cuando se agoten los punto: GAME OVER
	
	public static void MainGame(int[][] playerMap, int[][] consoleMap) {
		
		boolean endGame=false, repeatRandomAttack;
		int[] tileAttack = new int[2];
		int playerScore=24,consoleScore=24;
		
		/**ACTIVAR MODO VER MAPA VER ENEMIGO
		 * --------------------------------
		 * Al activar esta variable, cada vez que se dibuje el mapa del enemigo el jugador podr� verlo */
		final boolean modoVerMapaEnemigo=false;
		
		while(!endGame) {
			System.out.println("REGISTRO MAPA DEL USUARIO");
			
			//Dibuja el Mapa del jugador
			DrawPlayerMap(playerMap);
			
			//Mostrar puntos del enemigo
			System.out.println("PUNTOS RESTANTES DEL JUGADOR: "+playerScore);
			System.out.println("");
			System.out.println("TURNO DEL JUGADOR");
			
			
			//Guarda las coords del ataque del jugador
			tileAttack=AskCoords(consoleMap);
			
			//Determinar si ha alcanzado
			if(CheckAttack(consoleMap,tileAttack)) {
				consoleMap[tileAttack[0]][tileAttack[1]]=9;
				consoleScore--;
			}
			else {
				consoleMap[tileAttack[0]][tileAttack[1]]=8;
			}
			System.out.println("");
			
			//Determinar si el puntaje de la m�quina es 0 y ha terminado para acabar la partida
			if(consoleScore<=0) {
				endGame=true;
			}
			//En caso de que no, la consola inicia su turno
			else {
				
				System.out.println("REGISTRO MAPA DEL ORDENADOR");
				//Dibuja el Mapa del enemigo
				//Depende del modo de juego spoilea o no
				if(modoVerMapaEnemigo) {
					DrawPlayerMap(consoleMap);
				}
				else {
					DrawConsoleMap(consoleMap);
				}
				
				//Mostrar puntos del enemigo
				System.out.println("PUNTOS RESTANTES DEL ORDENADOR: "+consoleScore);
				System.out.println("");
				System.out.println("TURNO DEL ORDENADOR");
				
				//Genera una coordenada aleatoria donde atacar
				repeatRandomAttack=true;
				while(repeatRandomAttack) {
					repeatRandomAttack=false;
					tileAttack[0]=(int) Math.floor(Math.random() * (playerMap.length - 0) + 0);
					tileAttack[1]=(int) Math.floor(Math.random() * (playerMap.length - 0) + 0);
					//Si ha escogido una posicion repetida vuelve a generar otra coordenada
					if(AlreadyPickedTile(playerMap,tileAttack)) {
						repeatRandomAttack=true;
					}
				}
				
				System.out.println("Ordenador ataca a "+tileAttack[0]+tileAttack[1]);
				
				//Determinar si ha alcanzado
				if(CheckAttack(playerMap,tileAttack)) {
					playerMap[tileAttack[0]][tileAttack[1]]=9;
					playerScore--;
				}
				else {
					playerMap[tileAttack[0]][tileAttack[1]]=8;
				}
				System.out.println("");
			}
			
			//Determinar si el puntaje del usuario es 0 y ha terminado para acabar la partida
			if(playerScore<=0) {
				endGame=true;
			}
		}
		
		//LA PARTIDA HA TERMINADO
		//DECLARAR GANADOR
		
		//Ha ganado el usuario
		if(playerScore>consoleScore) {
			System.out.println("");
			System.out.println("=======================");
			System.out.println("    V I C T O R I A");
			System.out.println("=======================");
		}
		//Ha ganado el ordenador
		else {
			System.out.println("=======================");
			System.out.println("     D E R R O T A");
			System.out.println("=======================");
		}
		
	}
	

	/**================================================ 
	 * DETERMINAR LA DIRECCIÓN
	 * ==================================================
	 */

	// direction[0] = xMultiplier
	// direction[1] = yMultiplier

	public static int[] DetermineDirection(int orientation) {

		int xMultiplier = 0, yMultiplier = 0;

		switch (orientation) {

		// DERECHA
		case 0:
			xMultiplier = 1;
			yMultiplier = 0;
			break;
		// ARRIBA
		case 1:
			xMultiplier = 0;
			yMultiplier = 1;
			break;
		// IZQUIERDA
		case 2:
			xMultiplier = -1;
			yMultiplier = 0;
			break;
		// ABAJO
		case 3:
			xMultiplier = 0;
			yMultiplier = -1;
			break;
		}

		int[] direction = new int[2];
		direction[0] = xMultiplier;
		direction[1] = yMultiplier;

		return direction;
	}

	/**================================================ 
	 * COMPROBAR SI EL BARCO SOBREPASA EL MAPA 
	 * ==================================================
	 */

	public static boolean CheckExceedMap(int orientation, int boatSpace, int xCoord, int yCoord, int maxX, int maxY) {

		boolean exceed = false;

		switch (orientation) {

		// DERECHA
		case 0:
			if (!(xCoord + boatSpace < maxX)) {
				exceed = true;
			}
			break;
		// ARRIBA
		case 1:
			if (!(yCoord + boatSpace < maxY)) {
				exceed = true;
			}
			break;
		// IZQUIERDA
		case 2:
			if (!(xCoord - boatSpace > 0)) {
				exceed = true;
			}
			break;
		// ABAJO
		case 3:
			if (!(yCoord - boatSpace > 0)) {
				exceed = true;
			}
			break;
		}

		return exceed;
	}

	/**================================================ 
	 * COMPRUEBA SI EL BARCO CABE EN DICHA ORIENTACIÓN 
	 * ==================================================
	 */

	// orientation = randomOrientation
	// boatSpace = boat5Space
	// maxCoord = possiblCoordLocation
	// xCoord = boatRandomLocationX, yCoord = boatRandomLocationY

	public static boolean CheckOrientation(int orientation, int boatSpace, int maxCoord,
			int xCoord, int yCoord, int maxX, int maxY) {
		boolean tryAgain = false;
		int xMultiplier = 0, yMultiplier = 0;
		int[] auxiliarMultipliers = new int[2];

		// Asigna los multiplicadores en funcion de la orientacion
		auxiliarMultipliers = DetermineDirection(orientation);
		xMultiplier = auxiliarMultipliers[0];
		yMultiplier = auxiliarMultipliers[1];

		// Comprueba si el barco es demasiado grande para caber
		tryAgain = CheckExceedMap(orientation, boatSpace, xCoord, yCoord, maxX, maxY);

		/**
		 * Comprobar si las posiciones intermedias están ocupadas
		 */

		
		return tryAgain;
	}

	/**============================================== 
	 * GENERA ALEATORIAMENTE UNA POSICION + ORIENTACIÓN 
	 * ================================================
	 */

	// maxCoord = possiblCoordLocation

	public static int[] GenerateRandom(int maxX, int maxY) {

		int boatRandomLocationX = (int) Math.floor(Math.random() * (maxX - 0) + 0);
		int boatRandomLocationY = (int) Math.floor(Math.random() * (maxY - 0) + 0);
		int randomOrientation = (int) Math.floor(Math.random() * (4 - 0) + 0);

		int[] generatedRandom = new int[3];
		generatedRandom[0] = boatRandomLocationX;
		generatedRandom[1] = boatRandomLocationY;
		generatedRandom[2] = randomOrientation;

		return generatedRandom;
	}

	/**============================================== 
	 * ASEGURA QUE LA POSICION NO ESTÉ OCUPADA 
	 * ================================================
	 */

	// maxCoord = possibleCoord Location
	// xCoord=boatRandomLocationX, yCoord=boatRandomLocationY

	public static boolean CheckAvailable(int consoleMap[][], int maxCoord, int xCoord, int yCoord, int orientation, int boatSpace) {
		boolean isNotAvailable = false;
		// Asigna los multiplicadores en funcion de su orientacion
		int[] orientationMultiplier = new int[2];
		orientationMultiplier = DetermineDirection(orientation);

		//Mira si las casillas del mapa están ocupadas casilla por casilla
		for (int nextToTile = 0; nextToTile < boatSpace; nextToTile++) {
			//Si no está vacia, no lo dibuja
			if(consoleMap[xCoord+(nextToTile * orientationMultiplier[0])][yCoord+(nextToTile * orientationMultiplier[1])]!=0) {
				isNotAvailable=true;
			}
		}

		return isNotAvailable;
	}

	/**============================================== 
	 * GUARDA LAS POSICIONES EN EL MAPA 
	 * ================================================
	 */

	// consoleMap = mapToUpdate
	// boatGenerated = boat5Generated
	// xCoord = boatRandomLocationX = coordArray[0]
	// yCoord = boatRandomLocationY = coordArray[1]

	public static int[][] UpdateMap(int mapToUpdate[][], int boatSpace, int boatGenerated, int xCoord, int yCoord,
			int orientation) {
		// Asigna los multiplicadores en funcion de su orientacion
		int[] orientationMultiplier = new int[2];
		orientationMultiplier = DetermineDirection(orientation);

		// Guarda posición por posicion el valor a almacenar asigando
		for (int nextToTile = 0; nextToTile < boatSpace; nextToTile++) {
			mapToUpdate[xCoord + (nextToTile * orientationMultiplier[0])][yCoord
					+ (nextToTile * orientationMultiplier[1])] = boatSpace;
		}
		return mapToUpdate;
	}

	/** ============================================== 
	 * ACTUALIZA EL REGISTRO PARA QUENO SE SUPERPONGA 
	 * ================================================
	 */

	public static int[][] RegisterMapLocations(int mapLocations[][], int boatGenerated, int xCoord, int yCoord,
			int boatSpace, int orientation) {
		// Asigna los multiplicadores en funcion de su orientacion
		int[] orientationMultiplier = new int[2];
		orientationMultiplier = DetermineDirection(orientation);

		for (int nextToTile = 0; nextToTile < boatSpace; nextToTile++) {
			mapLocations[boatGenerated][0] = xCoord + (nextToTile * orientationMultiplier[0]);
			mapLocations[boatGenerated][1] = yCoord + (nextToTile * orientationMultiplier[1]);
		}
		return mapLocations;
	}

	/** ============================================== 
	 * GENERA BARCOS DE X TAMAÑO ASIGNADOS Z VECES ASIGNADAS
	 *  ================================================
	 */

	public static int[][] PlaceBoats(int boatAmount, int boatSpace, int coordArray [], int consoleMap [][], int maxX, int maxY, int possibleCoordLocation) {

		boolean tryAgain=true;
		// Localiza botes de 5
		for (int boatGenerated = 0; boatGenerated < boatAmount; boatGenerated++) {

			// Repite el while hasta que de con una coordenada valida
			while (tryAgain) {
				tryAgain = false;

				// Genera una coordenada aleatoria y una orientación
				coordArray = GenerateRandom(maxX, maxY);

				// Comprobar si es posible con la orientación generada
				tryAgain = CheckOrientation(coordArray[2], boatSpace, possibleCoordLocation,
						coordArray[0], coordArray[1], maxX, maxY);
				
				// Comprobar si no está repetido
				if (!tryAgain) {
					tryAgain = CheckAvailable(consoleMap, possibleCoordLocation, coordArray[0],
							coordArray[1], coordArray[2], boatSpace);
				}
			}

			// Guarda la cordenada en la lista
			consoleMap = UpdateMap(consoleMap, boatSpace, boatGenerated, coordArray[0], coordArray[1], coordArray[2]);
			// Guarda el registro

		}
		return consoleMap;
	}

}

/** ============================================== 
 * PROGRAMA DESARROLLADO POR MANUEL MART�NEZ RUIZ
 *  ================================================
 *  
 *  Perd�n por la innecesaria complejidad del programa y la asignaci�n a variable de nombres confusos.
 *  No se volver� a repetir.
 */
