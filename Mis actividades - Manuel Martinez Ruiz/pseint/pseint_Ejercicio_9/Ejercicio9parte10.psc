Algoritmo Ejercicio9parte10
	
	Dimension matriz[3,3]
	
	//Guardo la información de la matriz
	
	Para fila=1 Hasta 3
		Para columna=1 Hasta 3
			Escribir "Dime el ", columna, "º valor de la matriz en la ", fila,"º linea"
			Leer matriz[columna,fila]
		FinPara
	FinPara
	
	Escribir ""
	
	//Muestro la matriz
	
	
	Escribir "Si dibujara tu matriz sería la siguiente: "
	Escribir "[", matriz[1,1], " ", matriz[2,1], " ", matriz[3,1], "]"
	Escribir "[", matriz[1,2], " ", matriz[2,2], " ", matriz[3,2], "]"
	Escribir "[", matriz[1,3], " ", matriz[2,3], " ", matriz[3,3], "]"
	
	Escribir ""
	
	//Explico el primer paso
	
	Escribir Sin Saltar "determinante = ( ("
	Escribir Sin Saltar matriz[1,1],"*",matriz[2,2],"*",matriz[3,3],") + ("
	Escribir Sin Saltar matriz[2,1],"*",matriz[3,2],"*",matriz[1,3], ") + ("
	Escribir Sin Saltar matriz[3,1],"*",matriz[1,2],"*",matriz[2,3] ") ) - ( ("
	
	Escribir Sin Saltar matriz[1,3],"*",matriz[2,2],"*",matriz[3,1] ") ) + ("
	Escribir Sin Saltar matriz[2,3],"*",matriz[3,2],"*",matriz[1,1] ") ) + ("
	Escribir Sin Saltar matriz[3,3],"*",matriz[1,2],"*",matriz[2,1] ") )"
	
	Escribir ""
	
	//Realizo el primer paso
	
	matrizPos1= matriz[1,1]*matriz[2,2]*matriz[3,3]
	matrizPos2= matriz[2,1]*matriz[3,2]*matriz[1,3]
	matrizPos3= matriz[3,1]*matriz[1,2]*matriz[2,3]
	
	matrizNeg1= matriz[1,3]*matriz[2,2]*matriz[3,1]
	matrizNeg2= matriz[2,3]*matriz[3,2]*matriz[1,1]
	matrizNeg3= matriz[3,3]*matriz[1,2]*matriz[2,1]
	
	//Explico el segundo paso
	
	Escribir Sin Saltar "determinante = ( + (", matrizPos1,") + (", matrizPos2, ") + (", matrizPos3, ") )"
	Escribir Sin Saltar " - ( ( +", matrizNeg1, ") + (", matrizNeg2, ") + (", matrizNeg3, ") )"
	Escribir ""
	
	//Explico el tercer paso
	
	Escribir "determinante = ( (", (matrizPos1+matrizPos2+matrizPos3), ") - (", (matrizNeg1+matrizNeg2+matrizNeg3), ") )"
	Escribir ""
	
	// Realizo el segundo y tercer paso a la vez
	
	determinante=(matrizPos1+matrizPos2+matrizPos3)-(matrizNeg1+matrizNeg2+matrizNeg3)
	
	//Muestro el resultado
	
	Escribir "El determinante de la matriz dada es ", determinante
	
	
FinAlgoritmo
