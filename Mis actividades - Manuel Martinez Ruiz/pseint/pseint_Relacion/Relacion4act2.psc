Algoritmo Relacion4act2
	
	Definir num1 Como Real
	Definir num2 Como Real
	Definir optionSelected Como Caracter
	
	Escribir "Introduzca un valor"
	Leer num1
	Escribir ""
	Escribir "Introduzca otro valor"
	Leer num2
	Escribir ""
	
	Escribir "A - SUMAR"
	Escribir "B - RESTAR"
	Escribir "C - MULTIPLICAR"
	Escribir "D - DIVIDIR"
	Escribir ""
	
	Repetir
		Escribir "Escoja que operación ejecutar"
		Leer optionSelected
		
		Segun optionSelected
			"A":
				Escribir num1, " + ", num2, " = ", num1+num2
			"B":
				Escribir num1, " - ", num2, " = ", num1-num2
			"C":
				Escribir num1, " x ", num2, " = ", num1*num2
			"D":
				Escribir num1, " / ", num2, " = ", num1/num2
				
			De Otro Modo:
				Escribir "¡Esa opción no existe!"
		FinSegun
		
	Hasta Que optionSelected=="A" o optionSelected=="B" o optionSelected=="C" o optionSelected=="D"
	
	
FinAlgoritmo
