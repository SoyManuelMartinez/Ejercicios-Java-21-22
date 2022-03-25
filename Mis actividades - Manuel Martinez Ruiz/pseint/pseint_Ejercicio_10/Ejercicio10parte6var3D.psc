Algoritmo Ejercicio10parte6var3D
	
	Dimension posicion1[3]
	Dimension posicion2[3]
	Definir distancia Como Real
	
	//Definir punto1
	
	Escribir "Dime la posición en el eje X del primer punto"
	Leer posicion1[1]
	
	Escribir "Dime la posición en el eje Y del primer punto"
	Leer posicion1[2]
	
	Escribir "Dime la posición en el eje Z del primer punto"
	Leer posicion1[3]
	
	Escribir "El primer punto se encuentra en ", posicion1[1], "x ", posicion1[2], "y ", posicion1[3], "z."
	
	Escribir ""
	
	//Definir punto2
	
	Escribir "Dime la posición en el eje X del segundo punto"
	Leer posicion2[1]
	
	Escribir "Dime la posición en el eje Y del segundo punto"
	Leer posicion2[2]
	
	Escribir "Dime la posición en el eje Z del segundo punto"
	Leer posicion2[3]
	
	Escribir "El segundo punto se encuentra en ", posicion2[1], "x ", posicion2[2], "y ", posicion2[3], "z."
	
	Escribir ""
	
	distancia=RC((posicion2[1]-posicion1[1])^2+(posicion2[2]-posicion1[2])^2+(posicion2[3]-posicion1[3])^2)
	
	Escribir "La distancia entre los 2 puntos es ", distancia

FinAlgoritmo
