Algoritmo Relacion5act9
	
	Definir numeroLeido Como Real
	Definir sumado Como Real
	Definir contador Como Real
	
	Mientras numeroLeido>=0
		Escribir "Dime un valor"
		Leer numeroLeido
		Si numeroLeido>=0
			sumado=sumado+numeroLeido
			contador=contador+1
		FinSi
	FinMientras
	
	Escribir "La media total de todos los valores positivos introducidos es ", sumado/contador
	
FinAlgoritmo
