Algoritmo PROGExamenAct5
	
	//Ejercicio5
	
	Definir sueldo, añoAntiguedad Como Real
	
	sueldo=-1
	añoAntiguedad=-1
	
	//LEER SUELDO
	Mientras sueldo<0
		Escribir "Dime el sueldo del empleado"
		Leer sueldo
		Si sueldo<0
			Escribir "Es imposible que el empleado tenga sueldo negativo"
		FinSi
	FinMientras
	
	//LEER AÑOS
	Mientras añoAntiguedad<0
		Escribir "Dime los años de antigüedad del empleado"
		Leer añoAntiguedad
		Si añoAntiguedad<0
			Escribir "Es imposible que el empleado tenga años de antigüedad negativos"
		FinSi
	FinMientras
	
	//IMPRIMIR SUELDO
	Si sueldo<500 y añoAntiguedad>=10
		//a)
		Escribir "Se te otorga un aumento del sueldo del 20%, el cuál equivale a ", sueldo*1.2
	SiNo
		Si sueldo<500 y añoAntiguedad<10
			//b)
			Escribir "Se te otorga un aumento del sueldo del 5%, el cuál equivale a ", sueldo*1.05
		SiNo
			//c)
			Escribir "Tu sueldo es ", sueldo
		FinSi
	FinSi
	
	
FinAlgoritmo

//Manuel Martínez Ruiz
