package Relacion2;

import java.util.Scanner;

public class Ej30Rel2 {
	
		// ============
		// LEER DÍA
		// ============
		
	
	static int readDay() {
		String lectura;
		boolean check=true;
		int diaSemana=0;
		
		Scanner sn=new Scanner(System.in);
		
		while(check) {
			System.out.print("Día: ");
			lectura=sn.next();
			lectura=lectura.toUpperCase();
			check=false;
			
			switch(lectura){
			
				case "1":
				case "LUNES":
					diaSemana=1;
					break;
					
				case "2":
				case "MARTES":
					diaSemana=2;
					break;
					
				case "3":
				case "MIERCOLES":
					diaSemana=3;
					break;
					
				case "4":
				case "JUEVES":
					diaSemana=4;
					break;
					
				case "5":
				case "VIERNES":
					diaSemana=5;
					break;
				
				case "6":
				case "SABADO":
					diaSemana=6;
					break;
					
				case "7":
				case "DOMINGO":
					diaSemana=7;
					break;
					
				default:
					System.out.println("No corresponde a ningún día de la semana");
					check=true;
				
			}
		}
		
		return diaSemana;
		
	}
	
	
	// ============
	// LEER HORA
	// ============
	
	static int readHour() {
		int lectura=0;
		boolean check=true;
		
		Scanner sn=new Scanner(System.in);
		
		while(check) {
			
			System.out.print("Hora: ");
			lectura=sn.nextInt();
			check=false;
			
			if(!(lectura>=0 && lectura<=23)) {
				System.out.println("Esa hora no existe");
				check=true;
			}
			
		}
		
		return lectura;
	}
	
		// ============
		// MAIN
		// ============
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lectura;
		int primHora, segunHora=0, primDia, segunDia=0, difDias, difHora, difTotal;
		boolean checkSecondDay=true;
		
		Scanner sn=new Scanner(System.in);
		
		//SCAN PRIMER DÍA
		
		System.out.println("Por favor, introduzca la primera hora");
		
		
		primDia=readDay();
		primHora=readHour();
		
		
		//SCAN SEGUNDO DÍA
		
		System.out.println("Por favor, introduzca la segunda hora");
		
		while (checkSecondDay) {
			segunDia=readDay();
			checkSecondDay=false;
			if(primDia>segunDia) {
				System.out.println("El segundo día no puede ser más pequeño que el primero");
				checkSecondDay=true;
			}
		}
		
		checkSecondDay=true;
		
		while (checkSecondDay) {
			segunHora=readHour();
			checkSecondDay=false;
			if(primDia>=segunDia && primHora>=segunHora) {
				System.out.println("El segundo día no puede ser más pequeño que el primero");
				checkSecondDay=true;
			}
			}
		
		//CALCULAR DIFERENCIA
		
		difDias=((segunDia-primDia)*24);
		difHora=(segunHora-primHora);
		difTotal=(difDias+difHora);
		
		System.out.println("Entre las "+primHora+":00 del primer días y las "+segunHora+":00 del segundo día hay "+difTotal+" horas.");
		
		}
		
		
		

	}


