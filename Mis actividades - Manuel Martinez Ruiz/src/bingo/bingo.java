package bingo;

import java.util.Scanner;

public class bingo {
	
	//===========================================
	// SABER SI ES LA PRIMERA FILA
	//===========================================
	
	static boolean disableFirstTime(boolean valueToDisable, int checkIsNot, int valueNotToBe) {
		
		if(valueToDisable=true) {
			if(checkIsNot!=valueNotToBe) {
				valueToDisable=false;
			}
		}
		
		return valueToDisable;
	}
	
	//===========================================
	// SABER SI ES LA PRIMERA FILA
	//===========================================
	
	static int checkFirstLine(int [] playerScore, int impossibleNumber) {
		
		int firstLinePlayer=impossibleNumber;
		
		for (int i=0; i<playerScore.length;i++) {
			
			//DEVOLVER QUÃ‰ JUGADOR HA CONSEGUIDO LA PRIMERA LINEA
			
			if(playerScore[i]!=0) {
				firstLinePlayer=i;
			}
			
			//DEVOLVER QUÃ‰ JUGADOR HA CONSEGUIDO LA PRIMERA LINEA
			
		}
		
		return firstLinePlayer;
	}
	
	
	//===========================================
	// COMPROBAR SI YA SE HA TERMINADO LA PARTIDA
	//===========================================
	
	static int checkWinCondition(int [] playerScore, int filas, int impossibleNumber) {
		
		int winner=impossibleNumber;
		
		for(int player=0; player<playerScore.length; player++) {
			
			//Si hay un cartÃ³n completo
			//Asignamos que el resultado de la partida es terminarla y quien la ha ganado
			
			if(playerScore[player]==filas) {
				winner=player;
			}	
		}
			
		return winner;
	}
	
	//===============================
	// RESET PLAYER INFO
	//===============================
	
	static int[] resetInfo(int [] playerScore){
		
		
		for(int fila=0; fila<playerScore.length;fila++) {
			for(int player=0; player<playerScore.length; player++) {
				//Primer valor: puntaje
				playerScore[player]=0;
			}
		}
		
		return playerScore;
	}
	
	//===============================
	// RESET COMPLETED LINES
	//===============================
	
	static boolean[][] resetCompletedLine(boolean [][] completedLine){
		
		
		for(int fila=0; fila<completedLine.length;fila++) {
			for(int player=0; player<completedLine[1].length; player++) {
				//Primer valor: puntaje
				completedLine[fila][player]=true;
			}
		}
		
		return completedLine;
	}
	
	
	//===============================
	// PUNTAJE
	//===============================
	
	static int [] checkScore(int [][][] cartones, int [] playerScore, boolean [][] completedLine) {
		
		final int maxFila=(cartones.length-1),maxColumna=(cartones[1].length-1),maxPlayer=(cartones[1][1].length-1);
		boolean existLine;
		
		//MATRIZ DE INFORMACIÃ“N POR JUGADORES
		//Saber si una fila estÃ¡ tachada, quÃ© fila estÃ¡ tachada y jugador
		
		
		for(int player=0; player<=maxPlayer; player++) {
			for(int fila=0; fila<=maxFila; fila++) {
				
				existLine=true;
					
					for(int columna=0;columna<=maxColumna;columna++) {
						
						//Si detecta que en la lÃ­nea hay un nÃºmero que no era 0, se para
						
						if(cartones[fila][columna][player]!=0) {
							existLine=false;
						}
					}
				
				
				//Si la lÃ­nea estÃ¡ llena de 0
				//Sumamos un punto al jugador Y NO SE HA LEÃ�DO ANTES
				
				if(existLine) {
					//System.out.println("Â¡La lÃ­nea existe!");
					//Si no estÃ¡ leÃ­do
					if(completedLine [fila][player]) {
						//System.out.println("Â¡SUMO PUNTO! Primera vez que la veo");
						//Suma al contador
						playerScore[player]=playerScore[player]+1;
						
					}	
				}
			}	
		}
		return playerScore;
	}
	
	//===============================
	// LA LÃ�NEA ESTÃ� REPETIDA
	//===============================
	
	static boolean [][] checkRepeated(int [][][] cartones, boolean [][] completedLine) {
		
		final int maxFila=(cartones.length-1),maxColumna=(cartones[1].length-1),maxPlayer=(cartones[1][1].length-1);
		boolean existLine;
		
		//MATRIZ DE INFORMACIÃ“N POR JUGADORES
		//Saber si una fila estÃ¡ tachada, quÃ© fila estÃ¡ tachada y jugador
		
		
		for(int player=0; player<=maxPlayer; player++) {
			for(int fila=0; fila<=maxFila; fila++) {
				
				existLine=true;
					
					for(int columna=0;columna<=maxColumna;columna++) {
						
						//Si detecta que en la lÃ­nea hay un nÃºmero que no era 0, se para
						
						if(cartones[fila][columna][player]!=0) {
							existLine=false;
						}
					}
				
				
				//Si la lÃ­nea estÃ¡ llena de 0
				//Sumamos un punto al jugador Y NO SE HA LEÃ�DO ANTES
				
				if(existLine) {
					//System.out.println("Â¡Che nueva lÃ­nea :D!");
					if(completedLine[fila][player]=true) {
						//System.out.println("Â¡AMIGO ESTE VALOR ES NUEVO!");
						//System.out.println("Ya hemos registrado esta lÃ­nea. La voy a borrar");
						completedLine[fila][player]=false;
					}
					
				}
			}	
		}
		return completedLine;
	}
	
	
	//===============================
	// TACHADOR DE NÃšMEROS
	//===============================
	
	static int[][][] crossCardboard(int [][][] cartones, int numberToCross) {
		
		final int maxFila=(cartones.length-1),maxColumna=(cartones[1].length-1),maxPlayer=(cartones[1][1].length-1);
		
		//SUSTITUIMOS TODOS LOS VALORES DE LOS CARTONES QUE COINCIDAN CON EL NUMERO GENERADO
		//CUANDO UN NÃšMERO ESTÃ‰ TACHADO, SE SUSTITUYE POR 0 y se INTERPRETA por X
		
		for(int player=0; player<=maxPlayer; player++) {
			for(int fila=0; fila<=maxFila; fila++) {
				for(int columna=0;columna<=maxColumna;columna++) {
					
					//Si el valor encontrado coincide con el que hay que tachar
					
					if(cartones[fila][columna][player]==numberToCross) {
						
						//Asigna al valor encontrado a 0
						
						cartones[fila][columna][player]=0;
						
					}
				}
			}
		}
		
		return cartones;
	}

	
	
	//============================================
	//IMPRIME LOS CARTONES 
	//============================================
	
	public static void drawCardBoard(int [][][] cartones, boolean firstTime, int whoFirstLine, boolean endGame, int whoBingo, int [] moneyList) {
		
		final int maxFila=(cartones.length-1),maxColumna=(cartones[1].length-1),maxPlayer=(cartones[1][1].length-1);
		final String blanco="X";
		boolean drawMoneyBag=false;
		
		for(int jug=0;jug<=maxPlayer;jug++) {
			System.out.println("-------------------------");
			System.out.println("      Jugador "+(jug+1));
			System.out.println("-------------------------");
			System.out.println("");
			
			//IMPRIMIR CADA VALOR
			
			for(int fila=0; fila<=maxFila; fila++) {
				for(int columna=0;columna<=maxColumna;columna++) {
					
					//Escribe numeros normales
					
					if(cartones[fila][columna][jug]!=0) {
						//System.out.print(cartones[fila][columna][jug]+"\t"+"|"+"\t");
						System.out.printf("%2d |  ",cartones[fila][columna][jug]);
					}
					
					//Ha encontrado un 0
					
					else {
						//System.out.print("X"+"\t"+"|"+"\t");
						System.out.printf("%2s |  ",blanco);
					}
					
				}
				System.out.println("");
			}
			
			System.out.println("");
			
			//Â¡Primera lÃ­nea!
			if(firstTime) {
				if(whoFirstLine==jug) {
					System.out.println("El jugador "+(whoFirstLine+1)+" ha cantado lÃ­nea");
					System.out.println("");
					drawMoneyBag=true;
				}
			}
			
			//Â¡Bingo!
			if(endGame) {
				if(whoBingo==jug) {
					System.out.println("Â¡El jugador "+(whoBingo+1)+" ha cantado BINGO!");
					System.out.println("");
					drawMoneyBag=true;
				}
			}
			
			//Si ha saltado una nueva lÃ­nea, canta
			//Hay que recoger un nuevo dato que detecte las nuevas lineas tachadas
			//y no se repita
			
			
			
		}
		
		//Dibujar dinero si se activa
		
		if(drawMoneyBag) {
			System.out.println("");
			System.out.println("   Dinero acumulado");
			System.out.println("-------------------------");
			
			for(int player=0 ;player<maxPlayer+1; player++) {
				System.out.println(" Jugador "+(player+1)+": "+moneyList[player]+"$");
			}
		}
		
	}
	
	//============================================
	//RELLENA LOS CARTONES CON NÃšMEROS ALEATORIOS
	//============================================
	
	static int[][][] fillCardboard(int [][][] cartones) {
		
		final int maxFila=(cartones.length-1),maxColumna=(cartones[1].length-1),maxPlayer=(cartones[1][1].length-1);
		
		int minNumAzar=1,maxNumAzar=11;
		int azar;
		boolean finish;
		
		int[] isRepeated = new int[cartones.length];
		boolean alreadyRepeated;
		
		//Llenar lista de repeticiones con valores nulos
		
		for(int clearRep=0;clearRep<=((isRepeated.length)-1);clearRep++) {
			isRepeated[clearRep]=0;
		}
		
		//------------------------------
		//LLENAR LOS CARTONES DE NUMEROS
		//-------------------------------
		
		for(int player=0; player<=maxPlayer; player++) {
			for(int columna=0;columna<=maxColumna;columna++) {
				for(int fila=0; fila<=maxFila; fila++) {
						
						finish=false;
						
						//No termina hasta que no le meta un valor
						
						while(!finish) {
							
							//Genera un numero al azar
							
							alreadyRepeated=false;
							azar=(int)Math.floor(Math.random()*(maxNumAzar-minNumAzar)+minNumAzar);
							
							//COMPROBAR QUE EL NUMERO NO ESTÃ� REPETIDO
							
							for(int checkRep=0;checkRep<=((isRepeated.length)-1);checkRep++) {
								if(isRepeated[checkRep]==azar) {
									alreadyRepeated=true;
								}
							}
							
							//El numero no estÃ¡ repetido
							
							if(!alreadyRepeated) {
								cartones[fila][columna][player]=azar;
								isRepeated[fila]=azar;
								finish=true;
								
							}
						}					
					}
				
				//Aumentar el mÃ­nimo y mÃ¡ximo nÃºmero que puede llegar a sacar
				minNumAzar=minNumAzar+10;
				maxNumAzar=maxNumAzar+10;
				
				}
			
			//Reseteamos el mÃ­nimo y mÃ¡ximo nÃºmero
			minNumAzar=1;
			maxNumAzar=11;
		}
		
		//Devuelvo el cartÃ³n generado
		
		return cartones;
		
	}
	
	//============================================
	// PRINCIPAL
	//============================================

	public static void main(String[] args) {
		
		// VALORES PREDETERMINADOS
		
		final int fila=3,columna=5,player=2;
		final int premioLinea=100, premioBingo=500, impossibleNumber=player;
		int randomBingoNumber=0, counterRepeated=0, winner=0, firstLineWinner=player;
		boolean endGame=false,repeated, firstTime=true;
		String lectura;
		Scanner sn=new Scanner(System.in);
		
		//Cartones
		int[] [] [] cardBoard = new int[fila][columna][player];
		
		//InformaciÃ³n de los numeros que ye han tocado
		int [] alreadyRepeatedNumbers = new int [(columna*10)];
		
		//InformaciÃ³n de las lÃ­neas hechas
		int [] playerScore = new int [player];
		boolean [][] completedLine = new boolean[fila][player];
		
		//Lista de dinero
		int [] moneyList = new int [player];
		
		//RESETEA INFO
		playerScore=resetInfo(playerScore);
		completedLine=resetCompletedLine(completedLine);
		
		//GENERA EL CARTÃ“N
		cardBoard=fillCardboard(cardBoard);
		
		System.out.println("******BINGO IES MARTÃ�NEZ MONTAÃ‘Ã‰S******");
		System.out.println("            PREMIO");
		System.out.println("         LÃ­nea: "+premioLinea+" $");
		System.out.println("         BINGO: "+premioBingo+" $");
		System.out.println("");
		
		
		//CICLO DE JUEGO QUE NO TERMINA HASTA GANAR
		
		while(!endGame) {
			
			//DIBUJA EL CARTÃ“N
			drawCardBoard(cardBoard, firstTime, firstLineWinner,endGame, winner, moneyList);
			firstTime=disableFirstTime(firstTime, firstLineWinner, impossibleNumber);
			
			
			System.out.println("");
			System.out.println("Pulse cualquier letra para generar bola");
			lectura=sn.next();
			System.out.println("");
			
			//==============================
			// GENERADOR DE NÃšMEROS ALEATORIOS
			//===============================
			repeated=true;
			
			while(repeated) {
				randomBingoNumber=(int)Math.floor(Math.random()*(columna*10-1)+1);
				repeated=false;
				//Comprueba si el numero no se ha repetido aÃºn
				for(int num:alreadyRepeatedNumbers) {
					//Se ha repetido
					if (randomBingoNumber==num) {
						repeated=true;
					}
				}
				//NO estÃ¡ repetido
				if (!repeated) {
					alreadyRepeatedNumbers[counterRepeated]=randomBingoNumber;
					counterRepeated++;
				}
			}
			
			System.out.println("Ha salido el nÃºmero "+randomBingoNumber);
			System.out.println("");
			
			//Tacha el numero que haya salido de los cartones
			cardBoard=crossCardboard(cardBoard,randomBingoNumber);
			//Almacena informacion de cuantas lineas completas tiene cada jugador
			playerScore=checkScore(cardBoard,playerScore,completedLine);
			completedLine=checkRepeated(cardBoard,completedLine);
			
			
			if(firstTime) {
				//Saber si es la primera linea y quien la ha hecho
				//Si es diferente a 0, aun no hay
				if(checkFirstLine(playerScore, impossibleNumber)!=impossibleNumber) {
					firstLineWinner=checkFirstLine(playerScore, impossibleNumber);
					moneyList[firstLineWinner]=moneyList[firstLineWinner]+premioLinea;
				}
			}
			
			//Comprueba si ya han ganado
			winner=checkWinCondition(playerScore, fila, impossibleNumber);
			
			//Si existe un ganador, termina la partida
			if(winner!=impossibleNumber) {
				moneyList[winner]=moneyList[winner]+premioBingo;
				endGame=true;
			}
			
		}
		
		//Alguien ha conseguido Bingo
		
		drawCardBoard(cardBoard, firstTime, firstLineWinner,endGame, winner, moneyList);
		
		
		
		
		
		
		//Corregir detector de casillas repetidas + Impresor
		//Imprimir bolsa de dinero despuÃ©s de bingo o primera lÃ­nea
		//Y hacer sistema de puntajes
		
		

	}

}
