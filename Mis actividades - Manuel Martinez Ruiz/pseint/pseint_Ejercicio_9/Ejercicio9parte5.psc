Algoritmo Ejercicio9parte5
	
	Dimension vector1[3]
	Dimension vector2[3]
	Dimension productoEscalar[3]
	
	Para acum=1 Hasta 3
		Escribir "Dime la ", acum, "º componente del primer vector"
		Leer vector1[acum]
	FinPara
	
	Para acum=1 Hasta 3
		Escribir "Dime la ", acum, "º componente del segundo vector"
		Leer vector2[acum]
	FinPara
	
	Para acum=1 Hasta 3
		productoEscalar[acum]=vector1[acum]*vector2[acum]
	FinPara
	
	Escribir Sin Saltar "El producto escalar de ["
	
	Para acum=1 Hasta 3
		Escribir Sin Saltar vector1[acum], ", "
	FinPara
	Escribir Sin Saltar "] y ["
	Para acum=1 Hasta 3
		Escribir Sin Saltar vector2[acum], ", "
	FinPara
	Escribir Sin Saltar "] es: ["
	
	Escribir Sin Saltar productoEscalar[1]+productoEscalar[2]+productoEscalar[3], "]."
	
FinAlgoritmo
