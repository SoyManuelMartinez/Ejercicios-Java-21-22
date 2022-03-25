Funcion resultado <- CantidadDivisores(numero)
	
	Definir divisorCounter Como Entero
	
	Para acum=1 Hasta numero
		Si numero%acum==0
			divisorCounter=divisorCounter+1
		FinSi
	FinPara
	
	resultado <- divisorCounter
	
FinFuncion

Algoritmo Ejercicio12parte2
	
	Escribir "Dime un numero"
	Leer valorRecibido
	
	Escribir valorRecibido, " tiene ", CantidadDivisores(valorRecibido), " divisores."
	
FinAlgoritmo
