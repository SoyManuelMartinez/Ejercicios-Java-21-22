Funcion resultado <- CantidadDivisores(numero1,numero2)
	
	Definir booleanEsMultiplo Como Entero
	Definir numeroMasGrande Como Entero
	Definir numeroMasPeque�o Como Entero
	
	Si numero1>=numero2
		numeroMasGrande=numero1
		numeroMasPeque�o=numero2
	SiNo	
		numeroMasGrande=numero2
		numeroMasPeque�o=numero1
	FinSi
	
	
	Si numeroMasGrande%numeroMasPeque�o==0
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
		Escribir "�S�! �", valorRecibido1, " y ", valorRecibido2," son m�ltiplos entre s�!"
	SiNo
		Escribir "No... Ninguno de los valores dados son m�ltiplos entre s�"
	FinSi
	
	
	
FinAlgoritmo
