Algoritmo Ejemplo3
	
	Escribir "Dime un numero"
	Leer mayorMenorPrim
	Escribir "Dime otro numero"
	Leer mayorMenorSeg
	Si mayorMenorPrim=mayorMenorSeg
		Escribir mayorMenorPrim, " es igual a ", mayorMenorSeg
	Sino
		Si mayorMenorPrim > mayorMenorSeg Entonces
			Escribir mayorMenorPrim, " es mayor que ", mayorMenorSeg
		Sino
			Escribir mayorMenorSeg, " es mayor que ", mayorMenorPrim
		FinSi
	FinSi
	
	Escribir "¡Dime un número e identifiaré si es positivo o negativo!"
	Leer otroNum
	
	Si otroNum > 0  o  otroNum = 0 Entonces
		Escribir otroNum, " es mayor o igual que cero"
	Sino
		Escribir otroNum, " es negativo"
	FinSi
	
FinAlgoritmo
