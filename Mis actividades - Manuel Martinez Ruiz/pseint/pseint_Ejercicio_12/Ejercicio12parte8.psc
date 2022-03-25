Funcion res <- Iniciales(frase)
	
	Definir nuevaCadena Como Caracter
	Definir nuevaFrase Como Caracter
	
	Para acum=1 Hasta Longitud(frase)
		
		Si Subcadena(frase, acum, acum)==" "		//Si encuentra un espacio
			Si booleanRepeatedSpace==1				//Si el espacio va detrás de una letra
				booleanRepeatedSpace=0				//Asignamos que estamos dentro de un espacio
			FinSi
		SiNo									//Si encuentra una letra
			Si booleanRepeatedSpace==0			//Si esa letra va detrás de un espacio
				nuevaFrase=nuevaFrase+Mayusculas(Subcadena(frase, acum, acum))
			FinSi
			booleanRepeatedSpace=1				//Estamos en medio de una palabra
		FinSi
		
	FinPara
	
	
	res <- nuevaFrase
	
FinFuncion



Algoritmo Ejercicio12parte8
	
	Escribir "Dime una frase"
	Leer texto1
	
	Escribir Iniciales(texto1)
	
FinAlgoritmo

//ESTA MAL. TIENE QUE SER UNA FUNCIÓN, NO UN SUBPROCESO
