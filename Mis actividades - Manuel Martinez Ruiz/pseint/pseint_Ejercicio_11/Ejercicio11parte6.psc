Algoritmo Ejercicio11parte6
	
	Definir frase Como Caracter
	Definir booleanRepeatedSpace Como Entero
	
	Escribir "Dime tu nombre"
	Leer frase
	
	Para acum=1 Hasta Longitud(frase)
		
		Si Subcadena(frase, acum, acum)==" "		//Si encuentra un espacio
			Si booleanRepeatedSpace==1				//Si el espacio va detrás de una letra
				booleanRepeatedSpace=0				//Asignamos que estamos dentro de un espacio
				Escribir Sin Saltar " "			//Escribe un espacio
			FinSi
		SiNo									//Si encuentra una letra
			Si booleanRepeatedSpace==0			//Si esa letra va detrás de un espacio
				Escribir Sin Saltar Mayusculas(Subcadena(frase, acum, acum))
			SiNo								//Si esa letra va detrás de otra letra
				Escribir Sin Saltar Minusculas(Subcadena(frase, acum, acum))
			FinSi
			booleanRepeatedSpace=1				//Estamos en medio de una palabra
		FinSi
		
	FinPara
	
	Escribir ""
	
FinAlgoritmo
