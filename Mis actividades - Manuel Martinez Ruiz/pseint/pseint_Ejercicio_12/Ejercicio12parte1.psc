SubAlgoritmo EscribirCentrado(textoPorCentrar)
	
	Para acum=1 Hasta ((80-Longitud(textoPorCentrar))/2)
		Escribir Sin Saltar " "
	FinPara
	
	Escribir Sin Saltar textoPorCentrar
	
	Para acum=1 Hasta ((80-Longitud(textoPorCentrar))/2)
		Escribir Sin Saltar " "
	FinPara
	
	Escribir ""
	
FinSubAlgoritmo



Algoritmo Ejercicio12parte1
	
	Escribir "Dime una frase y la centraré"
	Leer frase
	
	EscribirCentrado(frase)
	
FinAlgoritmo
