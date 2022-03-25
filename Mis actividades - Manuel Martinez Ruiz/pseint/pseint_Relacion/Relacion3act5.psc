Algoritmo Relacion3act5
	
	Dimension num[3]
	
	Para acum=1 Hasta 3
		Escribir "Dime el ", acum, "º valor"
		Leer num[acum]
	FinPara
	
	
	Si num[1]>num[2] y num[1]>num[3]
		
		Si num[2]>num[3]
			Escribir num[1],", ",num[2],", ",num[3]
		SiNo
			Escribir num[1],", ",num[3],", ",num[2]
		FinSi
		
	FinSi
	
	
	Si num[2]>num[1] y num[2]>num[3]
		
		Si num[1]>num[3]
			Escribir num[2],", ",num[1],", ",num[3]
		SiNo
			Escribir num[2],", ",num[3],", ",num[1]
		FinSi
		
	FinSi
	
	Si num[3]>num[1] y num[3]>num[2]
		
		Si num[1]>num[2]
			Escribir num[3],", ",num[1],", ",num[2]
		SiNo
			Escribir num[3],", ",num[2],", ",num[1]
		FinSi
		
	FinSi
	
FinAlgoritmo
