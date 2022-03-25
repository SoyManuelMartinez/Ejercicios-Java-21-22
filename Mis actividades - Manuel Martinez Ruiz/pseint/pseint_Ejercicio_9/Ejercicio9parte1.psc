Algoritmo Ejercicio9parte1
	
	Dimension meses[12]
	
	meses[1]=31		//Enero
	meses[2]=28		//Febrero
	meses[3]=31		//Marzo
	meses[4]=30		//Abril
	meses[5]=31		//Mayo
	meses[6]=30		//Junio
	meses[7]=31		//Julio
	meses[8]=31		//Agosto
	meses[9]=30		//Septiembre
	meses[10]=31	//Octubre
	meses[11]=30	//Noviembre
	meses[12]=31	//Diciembre
	
	num=0
	
	Mientras num<=0 o num>12
		Escribir "Dime un numero"
		Leer num
		Si num<=0 o num>12
			Escribir num, " no se corresponde con ningun mes del año"
		FinSi
	FinMientras

	
	Escribir "El mes que corresponde a ", num, " tiene ", meses[num], " días"
	
	
FinAlgoritmo
