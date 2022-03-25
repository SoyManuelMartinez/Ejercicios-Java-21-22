Algoritmo Ejercicio9parte6
	
	Dimension numerosMayores[7]
	Escribir "Dime el primer valor"
	Leer numerosMayores[1]
	maximoActual=numerosMayores[1]
	
	Para acum=2 Hasta 7
		Escribir "Dime la ", acum, "º valor"
		Leer numerosMayores[acum]
		
		SI numerosMayores[acum] > maximoActual
			maximoActual=numerosMayores[acum]
		FinSi
	FinPara
	
	Escribir Sin Saltar"El mayor valor de la lista ["
	
	Para acum=1 Hasta 7
		Escribir Sin Saltar numerosMayores[acum], ", "
	FinPara
	
	Escribir "] es ", maximoActual
	
FinAlgoritmo
