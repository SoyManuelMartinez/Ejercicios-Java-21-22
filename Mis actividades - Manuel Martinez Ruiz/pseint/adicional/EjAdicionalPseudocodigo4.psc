Funcion res1 <- tiempoAños(yB,year)
	
	años=year-yB
	
	res1 <- años
	
FinFuncion

Funcion res2 <- tiempoMeses(mB,m)
	meses=m-mB
	Si meses<0
		meses=-meses
	FinSi
	
	res2 <- meses
FinFuncion

Funcion res3 <- tiempoDias(dB,d)
	dias=d-dB
	Si dias<0
		dias=-dias
	FinSi
	
	res3 <- dias
FinFuncion



Algoritmo EjAdicionalPseudocodigo4
	
	Definir dayBirth, monthBirth, yearBirth Como Entero
	Definir day, month, year Como Entero
	
	Repetir
		Escribir "Dime día, mes y año de nacimiento"
		Leer dayBirth, monthBirth, yearBirth
		
		Si dayBirth<=31 y dayBirth>0 Y monthBirth<=12 y monthBirth>0
			Escribir "Validada"
		SiNo
			Escribir "ESA FECHA ES IMPOSIBLE"
		FinSi
	Hasta Que dayBirth<=31 y dayBirth>0 y monthBirth<=12 y monthBirth>0
	
	Repetir
		Escribir "Dime día, mes y año que es hoy"
		Leer day, month, year
		
		Si day<=31 y day>0 Y month<=12 y month>0 y year>yearBirth
			Escribir "Validada"
		SiNo
			Escribir "ESA FECHA ES IMPOSIBLE"
		FinSi
	Hasta Que day<=31 y day>0 y month<=12 y month>0 y year>yearBirth
	
	Escribir "El usuario tiene ", tiempoAños(yearBirth,year), " años, ", tiempoMeses(monthBirth,month), " meses y ", tiempoDias(dayBirth,day), " días."
	
	
	
FinAlgoritmo
