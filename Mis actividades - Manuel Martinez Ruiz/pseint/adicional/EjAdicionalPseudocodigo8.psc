Algoritmo EjAdicionalPseudocodigo8
	
	Definir num Como Entero
	Definir fraseUnidad, fraseDecena Como Caracter
	
	cont=0
	unidad=-1
	num=-1
	
	Mientras num<0 o num>=100
		Escribir "Dime un numero de 2 cifras"
		Leer num
		Si num<0 o num>=100
			Escribir "No acepto ese valor"
		FinSi
	FinMientras
	
	Repetir
		
		Si (num-cont)%10==0
			unidad=cont
			decena=(num-cont)/10
		FinSi
		
		cont=cont+1
		
	Hasta Que unidad<>-1
	
	
	Segun unidad Hacer
		0:
			fraseUnidad=""
		1:
			fraseUnidad="uno"
		2:
			fraseUnidad="dos"
		3:
			fraseUnidad="tres"
		4:
			fraseUnidad="cuatro"
		5:
			fraseUnidad="cinco"
		6:
			fraseUnidad="seis"
		7:
			fraseUnidad="siete"
		8:
			fraseUnidad="ocho"
		9:	
			fraseUnidad="nueve"
	Fin Segun
	
	Segun decena Hacer
		0:
			fraseDecena=""
		1:
			fraseDecena="dieci"
		2:
			fraseDecena="veinti"
		3:
			fraseDecena="treinta y "
		4:
			fraseDecena="cuarenta y "
		5:
			fraseDecena="cincuenta y "
		6:
			fraseDecena="sesenta y "
		7:
			fraseDecena="setenta y "
		8:
			fraseDecena="ochenta y "
		9:
			fraseDecena="noventa y "
	Fin Segun
	
	Segun num Hacer
		11:
			Escribir "once"
		12:
			Escribir "doce"
		13:
			Escribir "trece"
		14:
			Escribir "catorce"
		15:
			Escribir "quince"
		De Otro Modo:
			Escribir fraseDecena,fraseUnidad
	Fin Segun
	
FinAlgoritmo
