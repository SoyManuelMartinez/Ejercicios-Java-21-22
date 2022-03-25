package poo;
import java.math.*;

public class UsoBaraja {

	public static void main(String[] args) {
		
		/**
		
		Carta c0 = new Carta(2,"espadas");
		Carta c1 = new Carta(2,"espadas");
		Carta c2 = new Carta(7,"bastos");
		
		System.out.println("Guacamole "+c0.Compara(c2));
		
		**/
		/**
		boolean[] test=new boolean[10];
		System.out.print(test[9]);
		**/
		
		
		
		
		Baraja b0 = new Baraja(4);
		b0.CrearBaraja();
		System.out.println(b0);
		/**
		b0.cartasMonton();
		b0.Barajar();
		b0.cartasMonton();
		**/
		
		
	}
	
	/** */
	
	/**NI CASO */
	public static void ejemplo() {
		//Creo una carta
		Carta c1 = new Carta(7,"espadas");

		//Creo una baraja
		Baraja b1 = new Baraja(40);
				
		//Muestro la carta
		System.out.println(c1);
				
		//Guardo la carta en la baraja
		b1.setCartaDeBaraja(1, c1);
		
		//Muestro la carta almacenada en la posicion 0
		System.out.println("La carta de la baraja es "+b1.getCartaDeBaraja(1)+"\n Hola");
	}

}
