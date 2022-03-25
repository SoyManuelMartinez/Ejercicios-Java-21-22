Algoritmo Relacion5act6
	
	Definir sumado Como Entero
	Definir multipli Como Entero
	
	multipli=1
	
	Para acum=0 Hasta 20
		Si acum%2==0
			sumado=sumado+acum
		SiNo
			multipli=multipli*acum
		FinSi
	FinPara
	
	Escribir "La suma de los pares hasta 20 es ", sumado
	Escribir "La multiplicación de los impares hasta 20 es ", multipli
	
FinAlgoritmo
