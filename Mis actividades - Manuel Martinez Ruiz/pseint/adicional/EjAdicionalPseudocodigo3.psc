Funcion res <- capicuo(num)
	
	Dimension cifrasSeparadas[3]
	
	
	cifrasSeparadas[1]=trunc(num/100)
	cifrasSeparadas[2]=trunc((num-(cifrasSeparadas[1]*100))/10)
	cifrasSeparadas[3]=trunc((num-((cifrasSeparadas[1]*100)+(cifrasSeparadas[2]*10)))/1)
	
	Si cifrasSeparadas[1]==cifrasSeparadas[3]
		
		res <- Verdadero
		
	SiNo
		
		res <- Falso
		
	FinSi
	
FinFuncion




Algoritmo EjAdicionalPseudocodigo3
	
	Definir numeroLeido Como Entero
	Definir valido Como Entero
	
	valido=1
	
	Repetir
		
		Escribir "Dime un n�mero de 3 cifras"
		Leer numeroLeido
	
		Si trunc(numeroLeido/100)>9
			Escribir "�ESE VALOR ES DE M�S DE CUATRO CIFRAS!"
		SiNo
			valido=0
		FinSi
		
	Hasta Que valido==0
	
	Si capicuo(numeroLeido)
		Escribir numeroLeido, " es capic�o"
	SiNo
		Escribir "No es capic�o..."
	FinSi
	
FinAlgoritmo
