Algoritmo Ejercicio10parte3
	
	Definir num Como Real
	
	Repetir
		
		Escribir "----------------------------"
		Escribir "Dime un valor y te daré su raíz cubica"
		Leer num
		Escribir ""
		
		Si num==0
			Escribir "Apagando el programa. Buenas noches" 
		FinSi
		
		Si num<0
			Escribir "No existen raíces negativas"
		FinSi
		
		Si num>0
			Escribir "La raíz de ", num, " es: ", num^(1/3)
		FinSi
		
		Escribir ""
		
	Hasta Que num==0
	
FinAlgoritmo
