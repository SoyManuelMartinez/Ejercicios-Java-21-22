Algoritmo Ejercicio10parte2
	
	Definir num Como Real
	
	Repetir
		
		Escribir "----------------------------"
		Escribir "Dime un valor y te dar� su ra�z"
		Leer num
		Escribir ""
	
		Si num==0
			Escribir "Apagando el programa. Buenas noches" 
		FinSi
	
		Si num<0
			Escribir "No existen ra�ces negativas"
		FinSi
	
		Si num>0
			Escribir "La ra�z de ", num, " es: ", RC(num)
		FinSi
		
		Escribir ""
		
	Hasta Que num==0
	
	
	
FinAlgoritmo
