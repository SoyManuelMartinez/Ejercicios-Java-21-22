Funcion res<-cifrasFaltan(n)
	
	Si n<10
		res <- 10-n
	SiNo
		res <- 100-n
	FinSi
	
	
FinFuncion


Algoritmo EjAdicionalPseudocodigo7
	
	Definir num Como Real
	num=-1
	
	Mientras num<0 o num>=1000
		Escribir "Dime un numero de 2 cifras"
		Leer num
		Si num<0 o num>=1000
			Escribir "No acepto ese valor"
		FinSi
	FinMientras

	Si n<10
		Escribir "A ese valor le falta sumar ", cifrasFaltan(num), " para tener 2 cifras"
	SiNo
		Escribir "A ese valor le falta sumar ", cifrasFaltan(num), "para tener 3 cifras"
	FinSi
	
	
	
FinAlgoritmo
