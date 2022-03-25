Algoritmo Ejercicio11parte2
	
	Definir nombre Como Caracter
	
	Escribir "Dime tu nombre"
	Leer nombre
	
	Para acum=1 Hasta Longitud(nombre)
		
		Si acum%2==0
			Escribir Sin Saltar Minusculas(Subcadena(nombre, acum, acum))
		SiNo
			Escribir Sin Saltar Mayusculas(Subcadena(nombre, acum, acum))
		FinSi
		
	FinPara
	
	Escribir ""
	
FinAlgoritmo
