Algoritmo Ejercicio10parte1
	
	Definir numgGenerado Como Entero
	Definir resp Como Entero
	Definir repeticiones Como Entero
	
	numgGenerado=1+Azar(100)
	resp=0
	repeticiones=7
	
	
	Para acum=1 Hasta repeticiones
		
			
		
			Escribir "Intenta adivinar que numero entre 1 y 100 he generado"
			Leer resp
			
			Si resp<1 o resp>100
				Escribir "�",resp, " no es v�lida"
				
			SiNo
				
				Si resp=numgGenerado
					Escribir "�",resp," era al n�mero!"
					acum=repeticiones
				SiNo
					Si resp<numgGenerado
						Escribir resp, " es m�s peque�o que mi numero generado."
						Escribir "�DAME UN NUMERO MAS GRANDE!"
					SiNo
						Escribir resp, " es m�s grande que mi numero generado"
						Escribir "�DAME UN NUMERO MAS PEQUE�O!"
					FinSi
				FinSi
				
			FinSi
			
			Escribir "Te quedan ", repeticiones-acum, " intentos"
			resp=0
			Escribir ""
			Escribir "--------------------------------------------"
			Escribir ""

	FinPara
	
	Escribir  "�El n�mero generado era ", numgGenerado, "!"
	
FinAlgoritmo
