Algoritmo Relacion3act3
	
	Dimension num[2]
	
	Escribir "�Dime dos valores y dir� si el primero el multiplo del segundo!"
	
	Para acum=1 Hasta 2
		Escribir "Dime el ", acum, "� valor"
		Leer num[acum]
	FinPara
	
	Si num[2]%num[1]==0
		Escribir num[1], " es m�ltiplo de ", num[2]
	SiNo
		Escribir "No es m�ltiplo"
	FinSi
	
FinAlgoritmo
