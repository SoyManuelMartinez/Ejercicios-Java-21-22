Funcion efectividad <- ComprobarEfectividad(atacanteTipo, defensorTipo)
	
	Dimension tablaElemental[18,18]
	Definir superEfectivo, neutral, pocoEfectivo, inmune Como Real
	
	superEfectivo=2
	neutral=1
	pocoEfectivo=0.5
	inmune=0
	
	//Asignar neutralidad a todos los tipos
	
	Para columna=1 Hasta 18
		Para fila=1 Hasta 18
			tablaElemental[fila, columna]=neutral
		FinPara
	FinPara
	
	//ACERO
	
	tablaElemental[1,1]<- pocoEfectivo		//ACERO<ACERO
	tablaElemental[1,2]= pocoEfectivo		//ACERO<AGUA
	tablaElemental[1,5]= pocoEfectivo		//ACERO<ELECTRICO
	tablaElemental[1,7]= pocoEfectivo		//ACERO<FUEGO
	tablaElemental[1,8]= superEfectivo 		//ACERO>HADA
	tablaElemental[1,9]= superEfectivo		//ACERO>HIELO
	tablaElemental[1,14]=superEfectivo		//ACERO>ROCA
	
	//AGUA
	
	tablaElemental[2,2]=pocoEfectivo		//AGUA<AGUA
	tablaElemental[2,4]=pocoEfectivo		//AGUA<DRAGON
	tablaElemental[2,7]=superEfectivo		//AGUA>FUEGO
	tablaElemental[2,12]=pocoEfectivo		//AGUA<PLANTA
	tablaElemental[2,14]=superEfectivo		//AGUA>ROCA
	tablaElemental[2,16]=superEfectivo		//AGUA>TIERRA
	
	//BICHO
	
	tablaElemental[3,1]=pocoEfectivo		//BICHO<ACERO
	tablaElemental[3,6]=pocoEfectivo		//BICHO<FANTASMA
	tablaElemental[3,7]=pocoEfectivo		//BICHO<FUEGO
	tablaElemental[3,8]=pocoEfectivo		//BICHO<HADA
	tablaElemental[3,10]=pocoEfectivo		//BICHO<LUCHA
	tablaElemental[3,12]=superEfectivo		//BICHO>PLANTA
	tablaElemental[3,13]=superEfectivo		//BICHO>PLIQUICO
	tablaElemental[3,15]=superEfectivo		//BICHO>SINIESTRO
	tablaElemental[3,17]=pocoEfectivo		//BICHO<VENENO
	tablaElemental[3,18]=pocoEfectivo		//BICHO<VOLADOR
	
	//DRAGÓN
	
	tablaElemental[4,1]=pocoEfectivo		//DRAGÓN<ACERO
	tablaElemental[4,4]=superEfectivo		//DRAGÓN>DRAGÓN
	tablaElemental[4,8]=inmune				//DRAGÓN<>HADA
	
	//ELECTRICO
	
	tablaElemental[5,2]=superEfectivo		//ELECTRICO>AGUA
	tablaElemental[5,4]=pocoEfectivo		//ELECTRICO<DRAGON
	tablaElemental[5,5]=pocoEfectivo		//ELECTRICO<ELECTRICO
	tablaElemental[5,12]=pocoEfectivo		//ELECTRICO<PLANTA
	tablaElemental[5,16]=inmune				//ELECTRICO<>TIERRA
	tablaElemental[5,18]=superEfectivo		//ELECTRICO>VOLADOR
	
	//FANTASMA
	
	tablaElemental[6,6]=superEfectivo		//FANTASMA>FANTASMA
	tablaElemental[6,11]=inmune				//FANTASMA<>NORMAL
	tablaElemental[6,13]=superEfectivo		//FANTASMA>PSIQUICO
	tablaElemental[6,15]=pocoEfectivo		//FANTASMA<SINIESTRO
	
	//FUEGO
	
	tablaElemental[7,1]=superEfectivo		//FUEGO>ACERO
	tablaElemental[7,2]=pocoEfectivo		//FUEGO<AGUA
	tablaElemental[7,3]=superEfectivo		//FUEGO>BICHO
	tablaElemental[7,4]=pocoEfectivo		//FUEGO<DRAGON
	tablaElemental[7,7]=pocoEfectivo		//FUEGO<FUEGO
	tablaElemental[7,9]=superEfectivo		//FUEGO>HIELO
	tablaElemental[7,12]=superEfectivo		//FUEGO>PLANTA
	tablaElemental[7,14]=pocoEfectivo		//FUEGO<ROCA
	
	//HADA
	
	tablaElemental[8,1]=pocoEfectivo		//HADA<ACERO
	tablaElemental[8,4]=superEfectivo		//HADA>DRAGÓN
	tablaElemental[8,7]=pocoEfectivo		//HADA<FUEGO
	tablaElemental[8,10]=superEfectivo		//HADA>LUCHA
	tablaElemental[8,15]=superEfectivo		//HADA>SINIE
	tablaElemental[8,17]=pocoEfectivo		//HADA<VENENO
	
	//HIELO
	
	tablaElemental[9,1]=pocoEfectivo		//HIELO<ACERO
	tablaElemental[9,2]=pocoEfectivo		//HIELO<AGUA
	tablaElemental[9,4]=superEfectivo		//HIELO>DRAGÓN
	tablaElemental[9,7]=pocoEfectivo		//HIELO<FUEGO
	tablaElemental[9,12]=superEfectivo		//HIELO>PLANTA
	tablaElemental[9,16]=superEfectivo		//HIELO>TIERRA
	tablaElemental[9,18]=superEfectivo		//HIELO>VOLADOR
	
	//LUCHA
	
	tablaElemental[10,1]=superEfectivo		//LUCHA>ACERO
	tablaElemental[10,3]=pocoEfectivo		//LUCHA<BICHO
	tablaElemental[10,6]=inmune				//LUCHA<>FANTASMA
	tablaElemental[10,8]=pocoEfectivo		//LUCHA<HADA
	tablaElemental[10,9]=superEfectivo		//LUCHA>HIELO
	tablaElemental[10,11]=superEfectivo		//LUCHA>NORMAL
	tablaElemental[10,13]=pocoEfectivo		//LUCHA<PSIQU
	tablaElemental[10,14]=superEfectivo		//LUCHA>ROCA
	tablaElemental[10,15]=superEfectivo		//LUCHA>SINIE
	tablaElemental[10,17]=pocoEfectivo		//LUCHA<VENENO
	tablaElemental[10,18]=pocoEfectivo		//LUCHA<VOLADOR
	
	//NORMAL
	
	tablaElemental[11,1]=pocoEfectivo		//NORMAL<ACERO
	tablaElemental[11,6]=inmune				//NORMAL<>FANTASMA
	tablaElemental[11,14]=pocoEfectivo		//NORMAL<ROCA
	
	//PLANTA
	
	tablaElemental[12,1]=pocoEfectivo		//PLANTA<ACERO
	tablaElemental[12,2]=superEfectivo		//PLANTA>AGUA
	tablaElemental[12,3]=pocoEfectivo		//PLNTA<BICHO
	tablaElemental[12,4]=pocoEfectivo		//PLANTA<DRAGÓN
	tablaElemental[12,7]=pocoEfectivo		//PLANTA<FUEGO
	tablaElemental[12,12]=pocoEfectivo		//PLANTA<PLANTA
	tablaElemental[12,14]=superEfectivo		//PLANTA>ROCA
	tablaElemental[12,16]=superEfectivo		//PLANTA>TIERRA
	tablaElemental[12,17]=pocoEfectivo		//PLANTA<VENENO
	tablaElemental[12,18]=pocoEfectivo		//PLANTA<VOLADOR
	
	//PSIQ
	
	tablaElemental[13,1]=pocoEfectivo		//PSIQ<ACERO
	tablaElemental[13,10]=superEfectivo		//PSIQ>LUCHA
	tablaElemental[13,13]=pocoEfectivo		//PSIQ<PSIQ
	tablaElemental[13,15]=inmune			//PSIQ<>SINIES
	tablaElemental[13,17]=superEfectivo		//PSIQ>VENENO
	
	//ROCA
	
	tablaElemental[14,1]=pocoEfectivo		//ROCA<ACERO
	tablaElemental[14,3]=superEfectivo		//ROCA>BICHO
	tablaElemental[14,7]=superEfectivo		//ROCA>FUEGO
	tablaElemental[14,9]=superEfectivo		//ROCA>HIELO
	tablaElemental[14,10]=pocoEfectivo		//ROCA<LUCHA
	tablaElemental[14,16]=pocoEfectivo		//ROCA<TIERRA
	tablaElemental[14,18]=superEfectivo		//ROCA>VOLADOR
	
	//SINIE
	
	tablaElemental[15,6]=superEfectivo		//SINIE>FANT
	tablaElemental[15,8]=pocoEfectivo		//SINIE<HADA
	tablaElemental[15,10]=pocoEfectivo		//SINIE<LUCHA
	tablaElemental[15,13]=superEfectivo		//SINIE>PSIQ
	tablaElemental[15,15]=pocoEfectivo		//SINIE<SINIE
	
	//TIERRA
	
	tablaElemental[16,1]=superEfectivo		//TIERRA>ACERO
	tablaElemental[16,3]=pocoEfectivo		//TIERRA<BICHO
	tablaElemental[16,5]=superEfectivo		//TIERRA>ELCTRICO
	tablaElemental[16,7]=superEfectivo		//TIERRA>FUEGO
	tablaElemental[16,12]=pocoEfectivo		//TIERRA<PLANTA
	tablaElemental[16,14]=superEfectivo		//TIERRA>ROCA
	tablaElemental[16,17]=superEfectivo		//TIERRA>VENENO
	tablaElemental[16,18]=inmune			//TIERRA<>VOLADOR
	
	//VENENO
	
	tablaElemental[17,1]=inmune				//VENENO<>ACERO
	tablaElemental[17,6]=pocoEfectivo		//VENENO<FANTASMA
	tablaElemental[17,8]=superEfectivo		//VENENO>HADA
	tablaElemental[17,12]=superEfectivo		//VENENO>PLANTA
	tablaElemental[17,14]=pocoEfectivo		//VENENO<ROCA
	tablaElemental[17,16]=pocoEfectivo		//VENENO<TIERRA
	tablaElemental[17,17]=pocoEfectivo		//VENENO<VENENO
	
	//VOLADOR
	
	tablaElemental[18,1]=pocoEfectivo		//VOLADOR<ACERO
	tablaElemental[18,3]=superEfectivo		//VOLADOR>BICHO
	tablaElemental[18,5]=pocoEfectivo		//VOLADOR<ELECTRICO
	tablaElemental[18,10]=superEfectivo		//VOLADOR>LUCHA
	tablaElemental[18,12]=superEfectivo		//VOLADOR>PLANTA
	tablaElemental[18,14]=pocoEfectivo		//VOLADOR<ROCA
	

	efectividad <- tablaElemental[atacanteTipo, defensorTipo]
	
	
FinFuncion


Algoritmo PokemonTablaDeTipos
	
	Definir choice1, choice2, choice3 Como Real
	Dimension tipos[18]
	
	tipos[1]="ACERO"
	tipos[2]="AGUA"
	tipos[3]="BICHO"
	tipos[4]="DRAGÓN"
	tipos[5]="ELÉCTRICO"
	tipos[6]="FANTASMA"
	tipos[7]="FUEGO"
	tipos[8]="HADA"
	tipos[9]="HIELO"
	tipos[10]="LUCHA"
	tipos[11]="NORMAL"
	tipos[12]="PLANTA"
	tipos[13]="PSÍQUICO"
	tipos[14]="ROCA"
	tipos[15]="SINIESTRO"
	tipos[16]="TIERRA"
	tipos[17]="VENENO"
	tipos[18]="VOLADOR"
	
	//Imprimir tipos
	
	Escribir "1. ACERO - 2. AGUA - 3. BICHO - 4. DRAGON - 5. ELÉCTRICO - 6. FANTASMA"
	Escribir "7. FUEGO - 8. HADA - 9. HIELO - 10. LUCHA - 11. NORMAL - 12. PLANTA"
	Escribir "13. PSÍQ. - 14. ROCA - 15. SINIE. - 16. TIERRA - 17. VENENO - 18. VOLAD."
	Escribir ""
	
	//Leer tipo Atacante
	
	Repetir
		Escribir "¿Qué tipo pokémon escoges atacar?"
		Leer choice1
		Si !(choice1>0 y choice1<=18)
			Escribir "¡ESE TIPO NO EXISTE!"
		FinSi
	Hasta Que choice1>0 y choice1<=18
	Escribir ""
	
	//Leer tipo defensor
	
	Repetir
		Escribir "¿Qué tipo pokémon escoge tu rival defender?"
		Leer choice2
		Si !(choice2>0 y choice2<=18)
			Escribir "¡ESE TIPO NO EXISTE!"
		FinSi
	Hasta Que choice2>0 y choice2<=18
	Escribir ""
	
	
	//Escribir "¿El pokémon defensor tiene doble tipo?"
	//Escribir "1. SÍ	- 2. NO"
	
	
	
	Segun ComprobarEfectividad(choice1, choice2) Hacer
		2:
			Escribir "¡",tipos[choice1]," ES SÚPER-EFECTIVO CONTRA ",tipos[choice2],"!"
		1:
			Escribir tipos[choice1], " es de daño neutral contra ", tipos[choice2]
		0.5:
			Escribir tipos[choice1]," no es muy eficaz contra ",tipos[choice2],"..."
		0:
			Escribir  tipos[choice1]," es inmune contra ", tipos[choice2],"..."
	Fin Segun
	
FinAlgoritmo
