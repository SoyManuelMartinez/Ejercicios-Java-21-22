Algoritmo EjAdicionalPseudocodigo10
	
	Definir num Como Real
	Definir longitudNumero, sumaCifras Como Real
	
	Leer num
	
	
	Para acum=0 Hasta 100
		Si num>=(10^acum)
			longitudNumero=acum+1
		FinSi
	FinPara
	
	Escribir "Ese numero es de longitud = ",longitudNumero
	Dimension cifras[longitudNumero]
	
	
	Para cifrillas=1 Hasta longitudNumero
		Para acum=0 Hasta 9
			Si (num-(acum*(10^(cifrillas-1))))%(10^(cifrillas))==0
				cifras[cifrillas]=acum
				num=num-(acum*(10^(cifrillas-1)))
			FinSi
		FinPara
	FinPara
	
	Escribir Sin Saltar "Sus cifras separadas son: "
	
	Para cont=longitudNumero Hasta 1
		Escribir Sin Saltar cifras[cont],", "
	FinPara
	
	Para cont=1 Hasta longitudNumero
		sumaCifras=sumaCifras+cifras[cont]
	FinPara
	
	Escribir ""
	Escribir "La suma de todas sus cifras es ", sumaCifras
	
FinAlgoritmo

//¡LO HICE! :D
