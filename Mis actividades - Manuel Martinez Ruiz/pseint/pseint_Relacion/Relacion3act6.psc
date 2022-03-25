Algoritmo Relacion3act6
	
	resp=0
	acum=1
	counter=0
	
	Repetir 
		Escribir "Dime un valor entre 0 y 9999"
		Leer resp
		Si resp<0 o resp>9999
			Escribir resp, " es inválido"
		FinSi
	Hasta Que resp>0 y resp<9999
	
	Mientras acum<= resp
		counter=counter+1
		acum=acum*10
	FinMientras
	
	Escribir resp, " tiene ", counter, " cifras"
	
	
FinAlgoritmo
