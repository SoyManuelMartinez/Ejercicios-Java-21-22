package relacion3;

public class Ej03Rel3 {
	
	static String generatePalo() {
		
		String paloGenerado="";
		int azar=(int)Math.floor(Math.random()*(5-1)+1);
		switch(azar) {
			case 1:
				paloGenerado="oros";
				break;
				
			case 2:
				paloGenerado="espadas";
				break;
				
			case 3:
				paloGenerado="copas";
				break;
				
			case 4:
				paloGenerado="bastos";
				break;
		}
		
		return paloGenerado;
		
	}
	
	static String generateNumber() {
		
		String num="";
		int azar=(int)Math.floor(Math.random()*(12-2)+2);
		
		
			
			switch(azar) {
			
			case 1:
				num="1";
				break;
			case 2:
				num="2";
				break;
			case 3:
				num="3";
				break;
			case 4:
				num="4";
				break;
			case 5:
				num="5";
				break;
			case 6:
				num="6";
				break;
			case 7:
				num="7";
				break;
			case 8:
				num="Sota";
				break;
			case 9:
				num="Caballo";
				break;
			case 10:
				num="Rey";
				break;
			case 11:
				num="As";
				break;
			
			}
			
		
		
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(generateNumber()+" de "+generatePalo());

	}

}
