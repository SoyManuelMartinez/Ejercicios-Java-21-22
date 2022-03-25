// ----------------------
// PREGUNTAR COORDS X
// -----------------------

Funcion choiceX <- askCoordsX(maxX)
	
	Dimension posicionEscogida[2]
	
	Repetir
		Escribir Sin Saltar "Coordenada x "
		Leer coordX
		Si coordX<0 o coordX>maxX
			Escribir "Valor no aceptado"
		FinSi
	Hasta Que coordX>0 y coordX<=maxX
	
	choiceX <- coordX
	
FinFuncion


// ----------------------
// PREGUNTAR COORDS Y
// -----------------------

Funcion choiceY <- askCoordsY(maxY)
	
	Repetir
		Escribir Sin Saltar "Coordenada y "
		Leer coordY
		Si coordY<0 o coordY>maxY
			Escribir "Valor no aceptado"
		FinSi
	Hasta Que coordY>0 y coordY<=maxY
	
	choiceY <- coordY
	
FinFuncion


// ----------------------
// VALORAR SI SALE DEL MAPA 
// -----------------------

Funcion esValido <- outOfMap(valorDado,limitesMapa)
	
	Si valorDado<1 o valorDado>limitesMapa
		
		esValido<- Falso
		
	SiNo
		
		esValido<- Verdadero
		
	FinSi
	
FinFuncion




// ----------------------
// DIBUJAR EL MAPA
// -----------------------



SubProceso DrawMap(map,maximaAlturaMapa,maximaLongitudMapa,nextToObjectValues)
	
	Para altura=1 Hasta maximaAlturaMapa
		
		Para largo=1 Hasta maximaLongitudMapa
			Segun map[largo, altura] Hacer
				-1:
					Escribir Sin Saltar "  "
				0:
					Escribir Sin Saltar "  "
				1:
					Escribir Sin Saltar "  " //$$$$$_Hay que pnerlo en espacios
				2:
					Escribir Sin Saltar "  " //KABOOOOOOOM_Hay que pnerlo en espacios
				7:
					Escribir Sin Saltar "X "
				8:
					Escribir Sin Saltar "* "
				9:
					Escribir Sin Saltar "$ "
				10:
					Escribir Sin Saltar nextToObjectValues[largo,altura]," " //Hay x objetos al lado
			Fin Segun
		FinPara
		
		Escribir "|",altura
		
	FinPara
	
	Para largo=1 Hasta maximaLongitudMapa
		Escribir Sin Saltar "--"
	FinPara
	
	Escribir ""
	
	Para largo=1 Hasta maximaLongitudMapa
		Escribir Sin Saltar largo," "
	FinPara
	
	Escribir ""
	
FinSubProceso


// ···········································
// ···········································
// ALGORITMO PRINCIPAL
// ···········································
// ···········································


Algoritmo Busca_el_Tesoro_2
	
	Definir coordX, coordY Como Entero
	coordX=0
	coordY=0
	
	longitudMapa=6
	alturaMapa=6
	Dimension map[longitudMapa,alturaMapa]
	Dimension nextToObject[longitudMapa,alturaMapa]
	
	Definir finishGame Como Logico
	
	finishGame=falso
	
	cantidadMinas=3
	
	// ----------------------
	// GENERAR MAPA
	// -----------------------
	
	//0=NADA
	//1=TESORO
	//2=MINA
	//7=POSICIÓN_DESCUBIERTA
	
	cantidadMinas=cantidadMinas+1
	
	Dimension coordTreasure[2]
	Dimension coordKaboom[2,cantidadMinas]

	
	//Llenamos el mapa de nada
	
	Para height=1 Hasta alturaMapa
		Para length=1 Hasta longitudMapa
			map[length,height]=0
		FinPara
	FinPara
	
	//Escodemos un tesoro
	
	coordTreasure[1]=(1+AZAR(longitudMapa))
	coordTreasure[2]=(1+AZAR(alturaMapa))
	
	map[coordTreasure[1],coordTreasure[2]]=1
	
	//Escondemos las minas
	
	minasColocadas=1
	
	
	Repetir
		
		Repetir
			
			coordKaboom[1,minasColocadas]=(1+AZAR(longitudMapa))
			coordKaboom[2,minasColocadas]=(1+AZAR(alturaMapa))
			
			boomCheckX=(coordKaboom[1,minasColocadas])
			boomCheckY=(coordKaboom[2,minasColocadas])
			
			Si !map[boomCheckX,boomCheckY]==2 o !map[boomCheckX,boomCheckY]==1
				
				//La posición de la mina NO COINCIDE con la posición del tesoro
				map[coordKaboom[1,minasColocadas],coordKaboom[2,minasColocadas]]=2
				minasColocadas=minasColocadas+1
			FinSi
			
		Hasta Que !map[boomCheckX,boomCheckY]==2 o !map[boomCheckX,boomCheckY]==1
		
	Hasta Que minasColocadas==cantidadMinas
	
	
	// ----------------------
	// DIBUJAR EN EL MAPA LOS OBJETOS DE AL LADO
	// -----------------------
	
	Para height=1 Hasta alturaMapa
		Para length=1 Hasta longitudMapa
			
		//Al encontrar una mina o el tesoro
			
			Si map[length,height]==1 o map[length,height]==2
				
				Para xCheck=-1 Hasta 1
					Para yCheck=-1 Hasta 1
			
						Si outOfMap((length+xCheck),longitudMapa) y outOfMap((height+yCheck),alturaMapa)
							overWriteX=(length+xCheck)
							overWriteY=(height+yCheck)
							Si map[overWriteX,overWriteY]<=0
					
								//SE PUEDE DIBUJAR
								
								map[overWriteX,overWriteY]=-1
								nextToObject[overWriteX,overWriteY]=(nextToObject[overWriteX,overWriteY]+1)
								
							FinSi
						FinSi
						
					FinPara
				FinPara
				
			FinSi
			
		FinPara
	FinPara




	
	Repetir
		
		DrawMap(map,alturaMapa,longitudMapa,nextToObject)
		chosenX=askCoordsX(longitudMapa)
		chosenY=askCoordsY(alturaMapa)
			
		
		Segun map[chosenX, chosenY] Hacer
			-2:
				map[chosenX,chosenY]=20
			-1:
				map[chosenX,chosenY]=10
			0:
				map[chosenX,chosenY]=7
			1:
				finishGame=Verdadero
				ending=Verdadero
			2:
				finishGame=Verdadero
				ending=falso
				
			De Otro Modo:
				//Ya escogió esa opción
		Fin Segun
		
		Limpiar Pantalla
		
		
	Hasta Que finishGame==Verdadero
	
	//RESULTADO
	
	Si ending==Verdadero	//VICTORIA
		Escribir "¡Encontraste el tesoro!"
	SiNo				//DERROTA
		Escribir "¡KABOOOOOOOOOOOM!"
	FinSi
	
	Escribir ""
	
	Para cont=1 Hasta (cantidadMinas-1)
		map[coordKaboom[1,cont],coordKaboom[2,cont]]=8
	FinPara
	
	map[coordTreasure[1],coordTreasure[2]]=9
	
	DrawMap(map,alturaMapa,longitudMapa,nextToObject)
	
	
	//CREAR UN SUBPROCESO PARA REVELAR EL MAPA ENTERA Y LA POSICION DEL TESORO
	
	
FinAlgoritmo

//IDEAS
//Hacer que funcione como el BUscaminas real
//Modo historia
//Timer
