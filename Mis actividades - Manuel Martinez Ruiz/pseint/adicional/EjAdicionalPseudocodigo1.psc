Algoritmo EjAdicionalPseudocodigo1
	
	Definir readSeconds Como Entero
	
	Definir hours Como Entero
	Definir minutes Como Entero
	Definir seconds Como Entero
	
	Escribir "Dime los segundos y los transformaré"
	Leer readSeconds
	
	hours=trunc(readSeconds/(60*60))
	minutes=trunc((readSeconds%(60*60))/60)
	seconds=readSeconds-((hours*60*60)+(minutes*60))
	
	Escribir readSeconds, " equivalen a: ", hours, " horas, ", minutes, " minutos y ", seconds, " segundos."
	
	
	
FinAlgoritmo
