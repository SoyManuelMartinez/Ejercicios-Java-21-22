Algoritmo Relacion3act8
	
	Definir radioCir Como Entero
	Definir alturaTr Como Entero
	Definir baseTri Como Entero
	
	Definir areaCir Como Real
	Definir areaTr Como Real
	
	Escribir "Dime el radio de tu círculo"
	Leer radioCir
	
	Escribir "Dime la altura de tu triangulo"
	Leer alturaTr
	
	Escribir "Dime la base de tu triangulo"
	Leer baseTri
	
	areaCir=PI*radioCir*radioCir
	areaTr=(baseTri*alturaTr)/2
	
	Si areaCir==areaTr
		Escribir "Tanto el círculo como el triángulo tienen el mismo área (", areaCir,")."
	FinSi
	
	Si areaCir>areaTr
		Escribir "El círculo (", areaCir, ") es más grande que el triángulo (", areaTr, ")."
	SiNo
		Escribir "El triangulo (", areaTr, ") es más grande que el circulo (", areaCir, ")."
	FinSi
	
FinAlgoritmo
