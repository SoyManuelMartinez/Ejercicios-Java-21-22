Algoritmo Ejercicio12parte4
	
	Definir frase Como Caracter
	
	Escribir "Dime una frase la reescribiré espaciada"
	Leer frase
	
	EscribirEspaciado(frase)
	
FinAlgoritmo

SubProceso EscribirEspaciado(texto)
	
	Para acum=1 Hasta Longitud(texto)
		
		Escribir Sin Saltar Subcadena(texto, acum, acum)
		Escribir Sin Saltar " "
		
	FinPara
	
	Escribir ""
	
FinSubProceso
