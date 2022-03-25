Algoritmo PROGExamenAct1
	
	//Ejercicio1
	
	Definir day, month, year Como Entero
	
	day=0
	month=0
	
	//LEER DÍA
	Mientras day<=0 o day>31
		Escribir "Dime qué día es"
		Leer day
		Si day<=0 o day>31
			Escribir "Ese día es imposible"
		FinSi
	FinMientras
	
	//LEER MES
	Mientras month<=0 o month>12
		Escribir "Dime qué mes es"
		Leer month
		Si month<=0 o month>12
			Escribir "Ese mes no existe"
		FinSi
	FinMientras
	
	//LEER AÑO
	Escribir "¿En qué año estamos?"
	Leer year
	

	//VERIFICAR SI ES NAVIDAD
	Si day==25 y month==12
		Escribir "Hoy es 25 de Diciembre del año ", year ,". Es Navidad"
	SiNo
		Escribir "Ese día no es Navidad"
	FinSi
	
FinAlgoritmo

//Manuel Martínez Ruiz
