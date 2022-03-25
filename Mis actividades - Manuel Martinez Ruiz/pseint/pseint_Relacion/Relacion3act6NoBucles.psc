Algoritmo Relacion3act6NoBucles
	
	resp=0
	
	Repetir 
		Escribir "Dime un valor entre 0 y 9999"
		Leer resp
		Si resp<0 o resp>9999
			Escribir resp, " es inválido"
		FinSi
	Hasta Que resp>0 y resp<9999
	
	Si resp<10 y resp>0
		Escribir resp," tiene 1 cifra"
	SiNo
		Si resp<100 y resp>10
			Escribir resp," tiene 2 cifras"
		SiNo
			Si resp<1000 y resp>100
				Escribir resp," tiene 3 cifras"
			SiNo
				Escribir resp," tiene 4 cifras"
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
