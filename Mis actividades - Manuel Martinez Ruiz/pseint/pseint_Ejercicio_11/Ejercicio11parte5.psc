Algoritmo Ejercicio11parte5
	
	Definir frase Como Caracter
	Definir wordCounter Como Entero
	Definir booleanRepeatedSpace Como Entero
	
	wordCounter=0
	
	Escribir "Dime una frase y leeré cuántas palabras tiene"
	Leer frase
	
	Para acum=1 Hasta Longitud(frase)
		
		Si Subcadena(frase, acum, acum)==" "		//Si encuentra un espacio
			Si booleanRepeatedSpace==1				//Si el espacio va detrás de una letra
				booleanRepeatedSpace=0				//Asignamos que estamos dentro de un espacio
			FinSi
		SiNo
			Si booleanRepeatedSpace==0			//Si esa letra va detrás de un espacio
				wordCounter=wordCounter+1		//Suma uno al contador
			FinSi
			booleanRepeatedSpace=1				//Estamos en medio de una palabra
		FinSi
		
	FinPara
	
	Escribir "Tu frase tiene ", wordCounter," palabras"
	
FinAlgoritmo

