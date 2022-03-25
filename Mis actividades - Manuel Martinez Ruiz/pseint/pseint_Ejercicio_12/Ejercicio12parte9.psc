Funcion res <- Contiene(frase1, frase2)
	
	Definir fraseMasLarga Como Caracter
	Definir fraseMasCorta Como Caracter
	Definir estaDentro Como Entero
	
	estaDentro=0
	
	Si Longitud(frase1)>=Longitud(frase2)
		fraseMasLarga=frase1
		fraseMasCorta=frase2
	SiNo
		fraseMasLarga=frase2
		fraseMasCorta=frase1
	FinSi
	
	Para letra=1 Hasta Longitud(fraseMasLarga)
		Para longitudPalabra=1 Hasta Longitud(fraseMasLarga)
			Si Subcadena(fraseMasLarga, letra, longitudPalabra)==fraseMasCorta
				estaDentro=1
			FinSi
		FinPara
	FinPara
	
	Si estaDentro==1
		res <- Verdadero
	SiNo
		res <- Falso
		
	FinSi
	
FinFuncion


Algoritmo Ejercicio12parte9
	
	Definir texto1, texto2 Como Caracter
	
	Escribir "Dime una frase y luego otra"
	Leer texto1, texto2
	
	Si Contiene(texto1, texto2)
		Escribir "¡Sí! Una cadena está dentro de la otra"
	SiNo
		Escribir "No... Ninguna cadena contiene a la otra"
	FinSi
	
	
	
	
	
	
FinAlgoritmo
