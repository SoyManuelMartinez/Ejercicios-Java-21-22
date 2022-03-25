Algoritmo EjAdicionalPseudocodigo6
	
	Definir num Como Real
	Definir longitudNumero Como Real
	
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
	
	Escribir "La centena es ", cifras[longitudNumero]
	Escribir "La decena es ", cifras[longitudNumero-1]
	Escribir "La unidad es ", cifras[longitudNumero-2]
	
FinAlgoritmo
