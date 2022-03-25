Algoritmo Relacion3act7
	
	Escribir "Dime que nota has sacado"
	Leer nota
	
	Si nota>=9 Y nota<=10
		Escribir "SOBRESALIENTE"
	FinSi
	
	Si nota>=7 Y nota<9
		Escribir "NOTABLE"
	FinSi
	
	Si nota>=6 Y nota<7
		Escribir "BIEN"
	FinSi
	
	Si nota>=5 Y nota<6
		Escribir "SUFICIENTE"
	FinSi
	
	Si nota<5
		Escribir "INSUFICIENTE"
	FinSi
	
	Si nota<0 o nota>10
		Escribir "Esa calificación es imposible"
	FinSi
	
FinAlgoritmo
