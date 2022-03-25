Algoritmo Ejercicio6parte3
	
	num1=AZAR(101)
	num2=AZAR(101)
	respuesta=1000
	Mientras respuesta <> (num1+num2)
		Escribir "¿Cuánto suman ", num1, " y ", num2, "?"
		Leer respuesta
		Si respuesta<>(num1+num2)
			Escribir "¡MAL!"
		FinSi
	FinMientras
	
	Escribir "¡Correcto! La respuesta es ", respuesta
	
FinAlgoritmo
