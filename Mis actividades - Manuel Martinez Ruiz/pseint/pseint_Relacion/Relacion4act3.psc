Algoritmo Relacion4act3
	
	Definir dado1 Como Entero
	Definir dado2 Como Entero
	
	//DADO1
	
	Repetir
		
		Escribir "¿Cuánto has sacado en la PRIMERA tirada?"
		Leer dado1
		
		Segun dado1 Hacer
			1:
				Escribir "UNO"
			2:
				Escribir "DOS"
			3:
				Escribir "TRES"
			4:
				Escribir "CUATRO"
			5:
				Escribir "CINCO"
			6:
				Escribir "SEIS"
				
			De Otro Modo:
				Escribir "¡No me tomes el pelo!"
		Fin Segun
		
	Hasta Que dado1==1 o dado1==2 o dado1==3 o dado1==4 o dado1==5 o dado1==6
	
	Escribir ""
	
	//DADO 2
	
	Repetir
		
		Escribir "¿Cuánto has sacado en la SEGUNDA tirada?"
		Leer dado2
		
		Segun dado2 Hacer
			1:
				Escribir "UNO"
			2:
				Escribir "DOS"
			3:
				Escribir "TRES"
			4:
				Escribir "CUATRO"
			5:
				Escribir "CINCO"
			6:
				Escribir "SEIS"
				
			De Otro Modo:
				Escribir "¡No me tomes el pelo!"
		Fin Segun
		
	Hasta Que dado2==1 o dado2==2 o dado2==3 o dado2==4 o dado2==5 o dado2==6
	
	Escribir ""
	
	//SUMA
	
	Escribir "Ambas tiradas suman ", dado1+dado2
	
FinAlgoritmo
