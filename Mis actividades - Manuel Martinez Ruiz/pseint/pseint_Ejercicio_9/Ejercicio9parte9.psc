Algoritmo Ejercicio9parte9
	
	Dimension matriz[2,2]
	
	Para acum=1 Hasta 2
		Escribir "Dime el ", acum, "º valor de la matriz en la primera linea"
		Leer matriz[acum,1]
	FinPara
	
	Para acum=1 Hasta 2
		Escribir "Dime el ", acum, "º valor de la matriz en la segunda linea"
		Leer matriz[acum,2]
	FinPara
	
	Escribir "Si dibujara tu matriz sería la siguiente: "
	Escribir "[", matriz[1,1], " ", matriz[2,1],"]"
	Escribir "[", matriz[1,2], " ", matriz[2,2],"]"
	
	Escribir "El determinante de la matriz es ", (matriz[1,1]*matriz[2,2])-(matriz[1,2]*matriz[2,1])
	
	
FinAlgoritmo
