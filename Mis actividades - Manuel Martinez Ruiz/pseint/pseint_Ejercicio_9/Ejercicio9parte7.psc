Algoritmo Ejercicio9parte7
	
	Dimension lista[10]
	vecesEncontrado= 0
	
	lista[1]=1
	lista[2]=8
	lista[3]=0
	lista[4]=2
	lista[5]=2
	lista[6]=0
	lista[7]=0
	lista[8]=2
	lista[9]=1
	lista[10]=9
	
	Escribir "¡Tengo una lista con 10 numeros del 0 al 9!"
	Escribir  "¿Que numero deseas buscar?"
	Leer numBuscado
	
	Para acum=1 Hasta 10
		Si lista[acum]=numBuscado
			vecesEncontrado=vecesEncontrado+1
		FinSi
	FinPara
	
	Si vecesEncontrado=0
		Escribir "No he sido capaz de encontrar ", numBuscado, " en la lista"
	SiNo
		Escribir "He encontrado ", numBuscado, " hasta ", vecesEncontrado, " en la lista"
	FinSi
	
	Escribir "Aquí tienes la lista para combrobarlo: "
	Escribir Sin Saltar "["
	
	Para acum=1 Hasta 10
		Escribir Sin Saltar lista[acum], ", "
	FinPara
	
	Escribir "]"
	
FinAlgoritmo
