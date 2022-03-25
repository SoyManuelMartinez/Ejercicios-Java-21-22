Algoritmo Ejercicio9parte2
	
	Dimension media[5]
	
	Para acum=1 Hasta 5
		
		//Mientras media[acum] <= 0
			Escribir "¡Dime un número y lo añadiré a la lista!"
			Leer media[acum]
			
			//Si media[acum] <= 0
				//Escribir media[acum], " no es un valor valido"
			//FinSi
			
		//FinMientras
		
	FinPara
	
	Para acum=1 Hasta 5
		calculo=calculo+media[acum]
	FinPara
	
	Escribir "La media de todos los valores que me has dado es ", calculo/5
	
FinAlgoritmo
