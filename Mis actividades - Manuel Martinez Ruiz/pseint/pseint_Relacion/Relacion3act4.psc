Algoritmo Relacion3act4
	
	Dimension num[2]
	
	Escribir "�Dime dos valores y dir� alguno es multiplo entre ellos!"
	
	Para acum=1 Hasta 2
		Escribir "Dime el ", acum, "� valor"
		Leer num[acum]
	FinPara
	
	Si num[2]%num[1]==0 o num[1]%num[2]==0
		Escribir "Uno de los valores entre ", num[1], " y ", num[2], " es multiplo del otro"
	SiNo
		Escribir "No es m�ltiplo"
	FinSi
	
FinAlgoritmo
