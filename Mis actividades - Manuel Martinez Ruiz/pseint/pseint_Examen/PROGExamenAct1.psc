Algoritmo PROGExamenAct1
	
	//Ejercicio1
	
	Definir day, month, year Como Entero
	
	day=0
	month=0
	
	//LEER D�A
	Mientras day<=0 o day>31
		Escribir "Dime qu� d�a es"
		Leer day
		Si day<=0 o day>31
			Escribir "Ese d�a es imposible"
		FinSi
	FinMientras
	
	//LEER MES
	Mientras month<=0 o month>12
		Escribir "Dime qu� mes es"
		Leer month
		Si month<=0 o month>12
			Escribir "Ese mes no existe"
		FinSi
	FinMientras
	
	//LEER A�O
	Escribir "�En qu� a�o estamos?"
	Leer year
	

	//VERIFICAR SI ES NAVIDAD
	Si day==25 y month==12
		Escribir "Hoy es 25 de Diciembre del a�o ", year ,". Es Navidad"
	SiNo
		Escribir "Ese d�a no es Navidad"
	FinSi
	
FinAlgoritmo

//Manuel Mart�nez Ruiz
