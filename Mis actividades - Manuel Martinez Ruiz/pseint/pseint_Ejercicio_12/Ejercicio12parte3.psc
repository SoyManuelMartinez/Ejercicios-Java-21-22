Funcion resultado <- CantidadDivisores(numero1,numero2)
	
	Definir booleanEsMultiplo Como Entero
	Definir numeroMasGrande Como Entero
	Definir numeroMasPequeño Como Entero
	
	Si numero1>=numero2
		numeroMasGrande=numero1
		numeroMasPequeño=numero2
	SiNo	
		numeroMasGrande=numero2
		numeroMasPequeño=numero1
	FinSi
	
	
	Si numeroMasGrande%numeroMasPequeño==0
		resultado <- Verdadero
		
	SiNo
		resultado <- Falso
	FinSi
	
FinFuncion

Algoritmo Ejercicio12parte3
	
	Escribir "Dime el primer numero"
	Leer valorRecibido1
	Escribir "Dime el segundo numero"
	Leer valorRecibido2
	
	Si CantidadDivisores(valorRecibido1,valorRecibido2)
		Escribir "¡Sí! ¡", valorRecibido1, " y ", valorRecibido2," son múltiplos entre sí!"
	SiNo
		Escribir "No... Ninguno de los valores dados son múltiplos entre sí"
	FinSi
	
	
	
FinAlgoritmo
