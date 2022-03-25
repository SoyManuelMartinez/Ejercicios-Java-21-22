// ----------------------
// PREGUNTAR COORDS X
// -----------------------

Funcion choiceX <- askCoordsX
	
	Dimension posicionEscogida[2]
	
	Repetir
		Escribir Sin Saltar "Coordenada x "
		Leer coordX
		Si coordX<0 o coordX>=6
			Escribir "Valor no aceptado"
		FinSi
	Hasta Que coordX>0 y coordX<6
	
	choiceX <- coordX
	
FinFuncion



Funcion choiceY <- askCoordsY
	
	Repetir
		Escribir Sin Saltar "Coordenada y "
		Leer coordY
		Si coordY<0 o coordY>=5
			Escribir "Valor no aceptado"
		FinSi
	Hasta Que coordY>0 y coordY<5
	
	choiceY <- coordY
	
FinFuncion


// ----------------------
// DIBUJAR EL MAPA
// -----------------------

SubProceso DrawMap(map)
	
	Para altura=1 Hasta 4
		
		Para largo=1 Hasta 5
			Segun map[largo, altura] Hacer
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
			Fin Segun
		FinPara
		
		Escribir "|",altura
		
	FinPara
	
	Escribir "----------"
	Escribir "1 2 3 4 5"
	
FinSubProceso

Algoritmo Busca_el_Tesoro
	
	Definir coordX, coordY Como Entero
	coordX=0
	coordY=0
	Dimension map[5,4]
	Definir finishGame Como Logico
	
	finishGame=falso
	
	cantidadMinas=1
	
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
	
	Para height=1 Hasta 4
		Para length=1 Hasta 5
			map[length,height]=0
		FinPara
	FinPara
	
	//Escodemos un tesoro
	
	coordTreasure[1]=(1+AZAR(5))
	coordTreasure[2]=(1+AZAR(4))
	
	map[coordTreasure[1],coordTreasure[2]]=1
	
	//Escondemos las minas
	
	minasColocadas=1
	
	Repetir
		
		Repetir
			
			coordKaboom[1,minasColocadas]=(1+AZAR(5))
			coordKaboom[2,minasColocadas]=(1+AZAR(4))
			
			Si !(coordKaboom[1,minasColocadas]==coordTreasure[1] y coordKaboom[2,minasColocadas]==coordTreasure[2])
				//La posición de la mina NO COINCIDE con la posición del tesoro
				map[coordKaboom[1,minasColocadas],coordKaboom[2,minasColocadas]]=2
				minasColocadas=minasColocadas+1
			FinSi
			
		Hasta Que !(coordKaboom[1,minasColocadas]==coordTreasure[1] y coordKaboom[2,minasColocadas]==coordTreasure[2])
		
	Hasta Que minasColocadas==cantidadMinas
	
	Repetir
		
		DrawMap(map)
		chosenX=askCoordsX
		chosenY=askCoordsY
			
		
		Segun map[chosenX, chosenY] Hacer
			0:
				map[chosenX,chosenY]=7
			1:
				finishGame=Verdadero
				ending=Verdadero
			2:
				finishGame=Verdadero
				ending=falso
				
			De Otro Modo:
				Escribir ""
				Escribir "Ya escogiste esa posición"
		Fin Segun
		
		Escribir ""
		Escribir "-------------------------------------------"
		Escribir ""
		
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
	
	DrawMap(map)
	
	
	//CREAR UN SUBPROCESO PARA REVELAR EL MAPA ENTERA Y LA POSICION DEL TESORO
	
	
FinAlgoritmo
