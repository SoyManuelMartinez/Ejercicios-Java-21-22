Algoritmo Relacion5act11
	
	Definir numeroLeido Como Real
	Definir contadorCeros Como Entero
	Definir sumado Como Real
	Definir sumadoNeg Como Real
	Definir contadorNeg Como Real
	
	Para acum=1 Hasta 10
		Escribir "Dime un valor"
		Leer numeroLeido
		
		Si numeroLeido<>0
			Si numeroLeido>0
				sumado=sumado+numeroLeido
			SiNo
				sumadoNeg=sumadoNeg+numeroLeido
				contadorNeg=contadorNeg+1
			FinSi
		SiNo
			contadorCeros=contadorCeros+1
		FinSi
	FinPara
	
	Escribir "Ha escrito ", contadorCeros, " ceros"
	Escribir "La suma de los numeros positivos es ", sumado
	Escribir "La media de todos los numeros negativos es ", sumadoNeg/contadorNeg
	
FinAlgoritmo
