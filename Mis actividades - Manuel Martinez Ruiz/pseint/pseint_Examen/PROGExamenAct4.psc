Algoritmo PROGExamenAct4
	
	//Ejercicio4
	
	Definir coordX, coordY Como Real
	coordX=0
	coordY=0
	
	//Determinar coordenada X
	Mientras coordX==0
		Escribir "Dime la coordenada X de tu punto. No acepto el 0"
		Leer coordX
		Si coordX==0
			Escribir "NO ACEPTO EL VALOR 0"
		FinSi
	FinMientras
	
	//Determinar coordenada Y
	Mientras coordY==0
		Escribir "Dime la coordenada Y de tu punto. No acepto el 0"
		Leer coordY
		Si coordY==0
			Escribir "NO ACEPTO EL VALOR 0"
		FinSi
	FinMientras
	
	Si coordX>0
		//El punto se encuentra a la derecha del eje Y
		Si coordY>0
			//El punto se encuentra por encima del eje X
			//1º CUADRANTE
			Escribir "El punto ",coordX,"x ",coordY,"y se encuentra en el PRIMER CUADRANTE"
		SiNo
			//El punto se encuntra por debajo del eje X
			//4º CUADRANTE
			Escribir "El punto ",coordX,"x ",coordY,"y se encuentra en el CUARTO CUADRANTE"
		FinSi
	SiNo
		//El punto se encuentra a la izquierda del eje Y
		Si coordY>0
			//El punto se encuentra por encima del eje X
			//2º CUADRANTE
			Escribir "El punto ",coordX,"x ",coordY,"y se encuentra en el SEGUNDO CUADRANTE"
		SiNo
			//El punto se encuntra por debajo del eje X
			//3º CUADRANTE
			Escribir "El punto ",coordX,"x ",coordY,"y se encuentra en el TERCER CUADRANTE"
		FinSi
	FinSi
	
FinAlgoritmo

//Manuel Martínez Ruiz
