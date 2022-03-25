Algoritmo EjAdicionalPseudocodigo2
	
	Definir day, month Como Entero
	Definir tiempoTransc Como Entero
	
	Repetir
		Escribir "Qué día de qué mes es"
		Leer day, month
		
		Si day<=31 y day>0 Y month<=12 y month>0
			Escribir "Validada"
		SiNo
			Escribir "ESA FECHA ES IMPOSIBLE"
		FinSi
	Hasta Que day<=31 y day>0 y month<=12 y month>0
	
	tiempoTransc=(month*30)+day
	
	Escribir "Si hipotéticamente todos los meses duraran 30 días, desde el inicio del año habrán transcurridos ", tiempoTransc " dias hasta ", day," - ", month
	
FinAlgoritmo
