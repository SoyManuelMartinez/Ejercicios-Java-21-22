Algoritmo Ejercicio9parte3
	
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
	
	Escribir Sin Saltar "Los valores más grandes que la media son: "
	Para acum=1 Hasta 5
		Si media[acum] > (calculo/5)
			Escribir Sin Saltar media[acum], ", "
		FinSi
	FinPara
	
	Escribir ""
	
FinAlgoritmo
