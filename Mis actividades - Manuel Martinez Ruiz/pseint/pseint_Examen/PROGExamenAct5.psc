Algoritmo PROGExamenAct5
	
	//Ejercicio5
	
	Definir sueldo, a�oAntiguedad Como Real
	
	sueldo=-1
	a�oAntiguedad=-1
	
	//LEER SUELDO
	Mientras sueldo<0
		Escribir "Dime el sueldo del empleado"
		Leer sueldo
		Si sueldo<0
			Escribir "Es imposible que el empleado tenga sueldo negativo"
		FinSi
	FinMientras
	
	//LEER A�OS
	Mientras a�oAntiguedad<0
		Escribir "Dime los a�os de antig�edad del empleado"
		Leer a�oAntiguedad
		Si a�oAntiguedad<0
			Escribir "Es imposible que el empleado tenga a�os de antig�edad negativos"
		FinSi
	FinMientras
	
	//IMPRIMIR SUELDO
	Si sueldo<500 y a�oAntiguedad>=10
		//a)
		Escribir "Se te otorga un aumento del sueldo del 20%, el cu�l equivale a ", sueldo*1.2
	SiNo
		Si sueldo<500 y a�oAntiguedad<10
			//b)
			Escribir "Se te otorga un aumento del sueldo del 5%, el cu�l equivale a ", sueldo*1.05
		SiNo
			//c)
			Escribir "Tu sueldo es ", sueldo
		FinSi
	FinSi
	
	
FinAlgoritmo

//Manuel Mart�nez Ruiz
