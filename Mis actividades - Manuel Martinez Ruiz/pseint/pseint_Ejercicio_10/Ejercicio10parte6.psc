Algoritmo Ejercicio10parte6
	
	Dimension posicion1[2]
	Dimension posicion2[2]
	Definir distancia Como Real
	
	//Definir punto1
	
	Escribir "Dime la posición en el eje X del primer punto"
	Leer posicion1[1]
	
	Escribir "Dime la posición en el eje Y del primer punto"
	Leer posicion1[2]
	
	Escribir "El primer punto se encuentra en ", posicion1[1], "x ", posicion1[2], "y."
	
	Escribir ""	
	//Definir punto2
	
	Escribir "Dime la posición en el eje X del segundo punto"
	Leer posicion2[1]
	
	Escribir "Dime la posición en el eje Y del segundo punto"
	Leer posicion2[2]
	
	Escribir "El segundo punto se encuentra en ", posicion2[1], "x ", posicion2[2], "y."
	
	Escribir ""
	
	distancia=RC((posicion2[1]-posicion1[1])^2+(posicion2[2]-posicion1[2])^2)
	
	Escribir "La distancia entre los 2 puntos es ", distancia
	
	
FinAlgoritmo
