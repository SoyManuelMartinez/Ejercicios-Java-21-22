Algoritmo Relacion3act2
	
	Dimension num[2]
	
	Para acum=1 Hasta 2
		Escribir "Dime el ", acum, "º valor"
		Leer num[acum]
	FinPara
	
	Si num[1]==num[2]
		Escribir "Ambos valores son iguales"
	SiNo
		Si num[1]>num[2]
			Escribir num[1]," es mayor que ", num[2]
		SiNo
			Escribir num[1]," es menor que ", num[2]
		FinSi
	FinSi
	
FinAlgoritmo
