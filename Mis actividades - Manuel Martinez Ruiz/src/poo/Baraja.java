package poo;

import java.util.Arrays;

public class Baraja {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private int numeroCartas;
	private Carta[] baraja = new Carta[numeroCartas];
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//Constructor con parámetros
	public Baraja(int numeroCartas) {
		this.numeroCartas = numeroCartas;
		this.baraja= new Carta[numeroCartas];
		
		/**Llenar la baraja de cartas vacias*/
		/**=================================*/
		for(int i=0;i<this.numeroCartas;i++) {
			this.baraja[i]=new Carta();
		}
		
	}

	
	/**================
	 * GETTERS Y SETTERS
	 * ================ */
	
	//Get y Setter de una carta en específico
	
	public Carta getCartaDeBaraja(int i) {
		return baraja[i];
	}
	
	public void setCartaDeBaraja(int i,Carta c) {
		this.baraja[i]=c;
	}
	
	
	
	@Override
	public String toString() {
		return "Baraja [numeroCartas=" + numeroCartas + ", baraja=" + Arrays.toString(baraja) + "]";
	}


	/**================================
	 *  MÉTODOS DE LA CLASE
	 * ================================ */
	
	//SIN HACER
	public void Barajar() {
		//Creo una baraja auxiliar
		Carta[] barajaAuxiliar = new Carta[this.numeroCartas];
		//Relleno la baraja auxiliar
		for(int i=0;i<this.numeroCartas;i++) {
			barajaAuxiliar[i]=this.baraja[i];
		}
		//Creo una lista en la que se almacenen si las posiciones ya se han usado
		boolean[] posicionUsada=new boolean[this.numeroCartas];
		
		boolean finishWhile;
		int rngPos;
		
		//Rellena la baraja original
		for(int i=0;i<this.numeroCartas;i++) {
			finishWhile=false;
			while(!finishWhile) {
				rngPos = (int)(Math.floor(Math.random() * (this.numeroCartas - 0) + 0));
				if(!posicionUsada[rngPos]) {
					posicionUsada[rngPos]=true;
					this.baraja[rngPos]=barajaAuxiliar[i];
					finishWhile=true;
				}
			}
		}
		
		
		
	}
	
	
	
	/**Mostrar las cartas que hayan salido*/
	/**====================================*/
	public void cartasMonton() {
		
		int cartasMostradas=0;
		
		//Se mete en un bucle que recorre todo el mazo
		for(int i=0;i<numeroCartas;i++) {
			//Si encuentra una carta que se haya mostrado
			if(baraja[i].getMostrada()) {
				//Si es la primera carta en mostrarse
				if(cartasMostradas==0) {
					System.out.println("CARTAS MOSTRADAS \n ==============");
				}
				//Asigna que se ha mostrado una carta más
				cartasMostradas++;
				//Mostrar la carta encontrada
				System.out.println("Carta "+cartasMostradas+": "+baraja[i]);
			}
		}
		//Si ha recorrido toda la lista y no ha encontrado ninguna sola carta
		if(cartasMostradas==0) {
			System.out.println("No se ha mostrado ninguna carta");
		}
	}
	
	
	/**Crea una baraja random */
	/**=======================*/
	public void CrearBaraja() {
		
		boolean repetida=false;
		int randomNumero, randomPalo;
		String palo;
		
		//Rellena cada posicion de la baraja
		//==================================
		for(int j=0;j<this.numeroCartas;j++) {
			//Se repite hasta generar una carta completamente nueva
			repetida=true;
			while(repetida) {
				//Crea una carta con atributos random
				//===================================
				//Entra en un bucle hasta generar un numero que no sea 8 o 9
				randomNumero=8;
				while(randomNumero==8 || randomNumero==9) {
					//Asigna un numero
					randomNumero = (int)(Math.floor(Math.random() * (13 - 1) + 1));
				}
				//Genera un numero aleatorio para el palo
				randomPalo = (int)(Math.floor(Math.random() * (4 - 0) + 0));
				
				//Dependiendo del resultado, asigna un palo
				palo="Che";
				switch(randomPalo) {
				case 0:
					palo="espadas";
					break;
					
				case 1:
					palo="bastos";
					break;
					
				case 2:
					palo="oros";
					break;
				case 3:
					palo="copas";
					break;
				}
				
				Carta cAux = new Carta (randomNumero,palo);
				
				//Confirmar que la carta no está repetida en la baraja
				repetida=false;
				for(int i=0;i<this.numeroCartas;i++) {
					if(cAux.Compara(baraja[i])) {
						/*
						System.out.println("Ciclo "+j+" \n Iteracion "+i+"\n RESULTADO: "+cAux.Compara(baraja[i])+"\n Carta generada: "+cAux+"\n Carta comparada:"+baraja[i]+"\n");
						*/
						repetida=true;
					}
				}
				
				
				
				
				//Si la carta NO está repetida se incluye a la baraja
				if(!repetida) {
					baraja[j]=new Carta(randomNumero,palo);
				}
			}
			//Fin del WHILE
			
		}
		
	}

}
