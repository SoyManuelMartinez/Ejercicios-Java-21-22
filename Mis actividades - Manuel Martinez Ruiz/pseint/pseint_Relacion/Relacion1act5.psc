Algoritmo Relacion1act5
	
	divisor=0
	Escribir "Dime el dividendo"
	Leer dividendo
	
	Mientras divisor<=0
	Escribir "Dime el divisor"
	Leer divisor
	Si divisor <= 0
		Escribir divisor, " no es un divisor válido"
	FinSi
	FinMientras
	
	Escribir "El cociente de ", dividendo, " entre ", divisor, " es ", Trunc(dividendo/divisor), " y de resto ", dividendo%divisor
	
FinAlgoritmo
