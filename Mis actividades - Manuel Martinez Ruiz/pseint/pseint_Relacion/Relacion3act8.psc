Algoritmo Relacion3act8
	
	Definir radioCir Como Entero
	Definir alturaTr Como Entero
	Definir baseTri Como Entero
	
	Definir areaCir Como Real
	Definir areaTr Como Real
	
	Escribir "Dime el radio de tu c�rculo"
	Leer radioCir
	
	Escribir "Dime la altura de tu triangulo"
	Leer alturaTr
	
	Escribir "Dime la base de tu triangulo"
	Leer baseTri
	
	areaCir=PI*radioCir*radioCir
	areaTr=(baseTri*alturaTr)/2
	
	Si areaCir==areaTr
		Escribir "Tanto el c�rculo como el tri�ngulo tienen el mismo �rea (", areaCir,")."
	FinSi
	
	Si areaCir>areaTr
		Escribir "El c�rculo (", areaCir, ") es m�s grande que el tri�ngulo (", areaTr, ")."
	SiNo
		Escribir "El triangulo (", areaTr, ") es m�s grande que el circulo (", areaCir, ")."
	FinSi
	
FinAlgoritmo
