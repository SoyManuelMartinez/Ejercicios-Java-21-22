Algoritmo Ejercicio10parte2
	
	Definir num Como Real
	
	Repetir
		
		Escribir "----------------------------"
		Escribir "Dime un valor y te daré su raíz"
		Leer num
		Escribir ""
	
		Si num==0
			Escribir "Apagando el programa. Buenas noches" 
		FinSi
	
		Si num<0
			Escribir "No existen raíces negativas"
		FinSi
	
		Si num>0
			Escribir "La raíz de ", num, " es: ", RC(num)
		FinSi
		
		Escribir ""
		
	Hasta Que num==0
	
	
	
FinAlgoritmo
