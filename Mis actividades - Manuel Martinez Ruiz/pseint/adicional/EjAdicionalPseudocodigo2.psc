Algoritmo EjAdicionalPseudocodigo2
	
	Definir day, month Como Entero
	Definir tiempoTransc Como Entero
	
	Repetir
		Escribir "Qu� d�a de qu� mes es"
		Leer day, month
		
		Si day<=31 y day>0 Y month<=12 y month>0
			Escribir "Validada"
		SiNo
			Escribir "ESA FECHA ES IMPOSIBLE"
		FinSi
	Hasta Que day<=31 y day>0 y month<=12 y month>0
	
	tiempoTransc=(month*30)+day
	
	Escribir "Si hipot�ticamente todos los meses duraran 30 d�as, desde el inicio del a�o habr�n transcurridos ", tiempoTransc " dias hasta ", day," - ", month
	
FinAlgoritmo
