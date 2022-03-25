Algoritmo Relacion3act9
	
	Dimension nums[3]
	
	Para acum=1 Hasta 3
		Escribir "Dame el ", acum, "º valor"
		Leer nums[acum]
	FinPara
	
	Si nums[1]+nums[2]==nums[3]
		Escribir "La suma de ", nums[1], " y ", nums[2], " es ", nums[3]
	SiNo
		Escribir nums[1], " y ", nums[2], " NO suman ", nums[3]
	FinSi
	
FinAlgoritmo
