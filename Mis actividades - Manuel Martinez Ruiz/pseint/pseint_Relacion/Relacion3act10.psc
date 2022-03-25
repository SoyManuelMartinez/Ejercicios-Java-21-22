Algoritmo Relacion3act10
	
	Definir primMano Como Caracter
	Definir segMano Como Caracter
	
	Escribir "Opciones: PIEDRA / PAPEL / TIJERA"
	Escribir "-------------------------------"
	
	//primera mano
	
	Repetir
		Escribir "Seleccione una de las tres opciones"
		Leer primMano
		
		Si primMano=="TIJERAS" o primMano=="PIEDRA" o primMano=="PAPEL"
			Escribir ""
		SiNo
			Escribir "¡No aceptamos esa opción! Comprueba que esté bien escrito"
		FinSi
		
	Hasta Que primMano=="TIJERAS" o primMano=="PIEDRA" o primMano=="PAPEL"
	
	//segunda mano
	
	Repetir
		Escribir "Seleccione una de las tres opciones"
		Leer segMano
		
		Si segMano=="TIJERAS" o segMano=="PIEDRA" o segMano=="PAPEL"
			Escribir ""
		SiNo
			Escribir "¡No aceptamos esa opción! Comprueba que esté bien escrito"
		FinSi
		
	Hasta Que segMano=="TIJERAS" o segMano=="PIEDRA" o segMano=="PAPEL"
	
	//JUGADOR 1 SACA PIEDRA
	
	Si primMano=="PIEDRA"
		
		Si segMano=="PIEDRA"
			Escribir "¡Empate!"
		FinSi
		
		Si segMano=="PAPEL"
			Escribir "1º PIERDES... ------ 2º ¡GANAS!"
		FinSi
		
		Si segMano=="TIJERAS"
			Escribir "1º ¡GANAS! ------ 2º PIERDES..."
		FinSi
		
	FinSi
	
	//JUGADOR 1 SACA PAPEL
	
	Si primMano=="PAPEL"
		
		Si segMano=="PIEDRA"
			Escribir "1º ¡GANAS! ------ 2º PIERDES..."
		FinSi
		
		Si segMano=="PAPEL"
			Escribir "¡Empate!"
		FinSi
		
		Si segMano=="TIJERAS"
			Escribir "1º PIERDES... ------ 2º ¡GANAS!"
		FinSi
		
	FinSi
	
	//JUGADOR 1 SACA TIJERAS
	
	Si primMano=="TIJERAS"
		
		Si segMano=="PIEDRA"
			Escribir "1º PIERDES... ------ 2º ¡GANAS!"
		FinSi
		
		Si segMano=="PAPEL"
			Escribir "1º ¡GANAS! ------ 2º PIERDES..."
		FinSi
		
		Si segMano=="TIJERAS"
			Escribir "¡Empate!"
		FinSi
		
	FinSi
	
	
	
FinAlgoritmo
