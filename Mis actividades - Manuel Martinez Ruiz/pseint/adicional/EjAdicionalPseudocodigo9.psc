Algoritmo EjAdicionalPseudocOdigo9
	
	Dimension nombres[5]
	Dimension notas[5,5]
	Dimension mediaNotas[5]
	Definir alumnoMejor,queAlumno Como Real
	
	Para num=1 Hasta 5
		Escribir "Dime el nombre del ",num, "º alumno"
		Leer nombres[num]
	FinPara
	
	Para alum=1 Hasta 5
		Para subject=1 Hasta 5
			Repetir
				Escribir "Que nota ha sacado ", nombres[alum], " en la ", subject, "º asignatura"
				Leer valor1
				notas[alum, subject]=valor1
				Si notas[alum, subject]<0 y notas[alum, subject]>10
					Escribir "¡Eso es imposible!"
				FinSi
			Hasta Que notas[alum, subject]>=0 y notas[alum, subject]<=10
		FinPara
		Escribir ""
	FinPara
	
	Para acum=1 Hasta 5
		Para suma=1 Hasta 5
			mediaNotas[acum]=mediaNotas[acum]+notas[acum,suma]
		FinPara
		mediaNotas[acum]=mediaNotas[acum]/5
	FinPara
	
	Para che=1 Hasta 5
		Si mediaNotas[che]>alumnoMejor
			alumnoMejor=mediaNotas[che]
			queAlumno=che
		FinSi
	FinPara
	
	Para cont=1 Hasta 5
		Escribir nombres[cont], " tiene una media total de ", mediaNotas[cont]
	FinPara
	
	Escribir ""
	
	Escribir "El alumno con mejor media es ", nombres[queAlumno]
	
FinAlgoritmo



//Momias, esqeletos helados, esqueletos wither, minizombie, zombiepigmman