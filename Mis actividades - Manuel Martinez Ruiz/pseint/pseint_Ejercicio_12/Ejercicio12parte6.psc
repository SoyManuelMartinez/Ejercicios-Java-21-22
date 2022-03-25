Funcion res <- EsPar (num)
	
	Si num%2==0
		res <- Verdadero
	SiNo
		res <- Falso
	FinSi
	
FinFuncion

Algoritmo Ejercicio12parte6
	
	Definir valor1 Como Entero
	
	Escribir "Dame un valor"
	Leer valor1
	
	Si EsPar(valor1)
		Escribir "¡El valor ", valor1, " es par!"
	SiNo
		Escribir "¡El valor ", valor1, " es impar!"
	FinSi
	
FinAlgoritmo
