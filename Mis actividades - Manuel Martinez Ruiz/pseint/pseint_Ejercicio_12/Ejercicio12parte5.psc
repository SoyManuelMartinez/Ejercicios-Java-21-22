Funcion res <- MayorQue (num1, num2, num3)
	
	Si num1>= num2 y num1>= num3
		res <- num1
	FinSi
	
	Si num2>= num1 y num2>= num3
		res <- num2
	FinSi
	
	Si num3>= num2 y num3>= num1
		res <- num3
	FinSi
	
FinFuncion

Algoritmo Ejercicio12parte5
	
	Definir valor1, valor2, valor3 Como Real
	
	Escribir "Dame 3 valores seguidos"
	Leer valor1, valor2, valor3
	
	Escribir "El mayor valor entre todos es: ",MayorQue(valor1, valor2, valor3)
	
FinAlgoritmo
