Algoritmo Ejercicio11parte4
	
	Definir nombre Como Caracter
	Definir vocalCounter Como Entero
	
	Escribir "Dime tu nombre"
	Leer nombre
	
	Escribir Sin Saltar "Tus vocales son: "
	
	Para acum=1 Hasta Longitud(nombre)
		
		Segun Mayusculas(Subcadena(nombre, acum, acum)) Hacer
			"A":
				vocalCounter=vocalCounter+1
				Escribir Sin Saltar Subcadena(nombre, acum, acum)
			"E":
				vocalCounter=vocalCounter+1
				Escribir Sin Saltar Subcadena(nombre, acum, acum)
			"I":
				vocalCounter=vocalCounter+1
				Escribir Sin Saltar Subcadena(nombre, acum, acum)
			"O":
				vocalCounter=vocalCounter+1
				Escribir Sin Saltar Subcadena(nombre, acum, acum)
			"U":
				vocalCounter=vocalCounter+1
				Escribir Sin Saltar Subcadena(nombre, acum, acum)
			De Otro Modo:
				
		Fin Segun
		
	FinPara
	
	Escribir ""
	
	Escribir nombre, " tiene ", vocalCounter, " vocales"
	
FinAlgoritmo
