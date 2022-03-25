Algoritmo Ejercicio11parte3
	
	Definir nombre Como Caracter
	Definir vocalCounter Como Entero
	
	Escribir "Dime tu nombre"
	Leer nombre
	
	Para acum=1 Hasta Longitud(nombre)
		
		Segun Mayusculas(Subcadena(nombre, acum, acum)) Hacer
			"A":
				vocalCounter=vocalCounter+1
			"E":
				vocalCounter=vocalCounter+1
			"I":
				vocalCounter=vocalCounter+1
			"O":
				vocalCounter=vocalCounter+1
			"U":
				vocalCounter=vocalCounter+1
			De Otro Modo:
				
		Fin Segun
		
	FinPara
	
	Escribir nombre, " tiene ", vocalCounter, " vocales"
	
FinAlgoritmo
