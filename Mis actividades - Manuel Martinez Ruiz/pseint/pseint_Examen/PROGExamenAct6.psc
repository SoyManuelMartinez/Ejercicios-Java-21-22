Algoritmo PROGExamenAct6
	
	//Ejercicio6
	
	Definir cantPreguntas, preguntasCorrectas, nivel Como Real
	
	cantPreguntas=-0
	preguntasCorrectas=0
	
	//LEER CANTITAD PREGUNTAS
	Mientras cantPreguntas<=0
		Escribir "Dime cu�ntas preguntas tuvo el test"
		Leer cantPreguntas
		Si cantPreguntas<=0
			Escribir "Es imposible que haya habido ", cantPreguntas, " preguntas"
		FinSi
	FinMientras
	
	//LEET RESPUESTAS CORRECTAS
	Mientras preguntasCorrectas<=0 o preguntasCorrectas>cantPreguntas
	Escribir "Dime cu�ntas preguntas ha contestado correctamente"
	Leer preguntasCorrectas
	Si preguntasCorrectas<=0 o preguntasCorrectas>cantPreguntas
		Escribir "Es imposible que haya respondido correctamente ", preguntasCorrectas, " preguntas"
	FinSi
	FinMientras

	//OPERAR nivel
	nivel=(preguntasCorrectas*100)/cantPreguntas
	
	Escribir "Tu resultado ha sido ",nivel,"%"
	
	//Nivel M�ximo
	Si nivel>=90
		Escribir "Ha alcanzado Nivel M�ximo"
	FinSi
	
	//Nivel medio
	Si nivel<90 y nivel>=75
		Escribir "Ha alcanzado Nivel medio"
	FinSi
	
	//Nivel regular
	Si nivel<75 y nivel>=50
		Escribir "Ha alcanzado Nivel regular"
	FinSi
	
	//Fuera de nivel
	Si nivel<50
		Escribir "Usted est� fuera de nivel"
	FinSi
	
FinAlgoritmo

//Manuel Mart�nez Ruiz