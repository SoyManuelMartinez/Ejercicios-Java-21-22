Algoritmo Ejercicio9parte8
	
	Dimension numerosMayores[10,2]
	
	Escribir "Dime el primer valor del primer bloque"
	Leer numerosMayores[1,1]
	maximoActualBloque1=numerosMayores[1,1]
	
	Para acum=2 Hasta 10
		Escribir "Dime la ", acum, "º valor del primer bloque"
		Leer numerosMayores[acum, 1]
		
		SI numerosMayores[acum, 1] > maximoActualBloque1
			maximoActualBloque1=numerosMayores[acum,1]
		FinSi
	FinPara
	
	Escribir "Dime el primer valor del segundo bloque"
	Leer numerosMayores[1,2]
	maximoActualBloque2=numerosMayores[1,2]
	
	Para acum=2 Hasta 10
		Escribir "Dime la ", acum, "º valor del segundo bloque"
		Leer numerosMayores[acum, 2]
		
		SI numerosMayores[acum, 2] > maximoActualBloque2
			maximoActualBloque2=numerosMayores[acum,2]
		FinSi
	FinPara
	
	Escribir"El mayor valor del bloque 1 es ", maximoActualBloque1, ", y el máximo del bloque 2 es ", maximoActualBloque2
	
	Escribir Sin Saltar"El BLOQUE 1 es ["
	
	Para acum=1 Hasta 10
		Escribir Sin Saltar numerosMayores[acum,1], ", "
	FinPara
	
	Escribir Sin Saltar "]."
	
	Escribir ""
	
	Escribir Sin Saltar"El BLOQUE 2 es ["
	
	Para acum=1 Hasta 10
		Escribir Sin Saltar numerosMayores[acum,2], ", "
	FinPara
	
	Escribir Sin Saltar "]."
	
FinAlgoritmo
