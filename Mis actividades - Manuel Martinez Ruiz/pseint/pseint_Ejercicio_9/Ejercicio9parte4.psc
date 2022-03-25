Algoritmo Ejercicio9parte4
	
	Dimension vector1[3]
	Dimension vector2[3]
	Dimension vectorSuma[3]
	
	Para acum=1 Hasta 3
		Escribir "Dime la ", acum, "º componente del primer vector"
		Leer vector1[acum]
	FinPara
	
	Para acum=1 Hasta 3
		Escribir "Dime la ", acum, "º componente del segundo vector"
		Leer vector2[acum]
	FinPara
	
	Para acum=1 Hasta 3
		vectorSuma[acum]=vector1[acum]+vector2[acum]
	FinPara
	
	Escribir Sin Saltar "La suma del vector ["
	
	Para acum=1 Hasta 3
		Escribir Sin Saltar vector1[acum], ", "
	FinPara
	Escribir Sin Saltar "] y ["
	Para acum=1 Hasta 3
		Escribir Sin Saltar vector2[acum], ", "
	FinPara
	Escribir Sin Saltar "] es: ["
	
	Para acum=1 Hasta 3
		Escribir Sin Saltar vectorSuma[acum], ", "
	FinPara
	Escribir "]."
	
FinAlgoritmo
