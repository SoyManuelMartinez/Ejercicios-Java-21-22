package poo;

public class Cuenta {
	
	// Atributos
	
	private String nombreCliente, numeroCuenta;
	private double tipoInteres, saldo;
	
	/** CONSTRUCTORES */
	
	//Constructor
	public Cuenta(String nombre, String numero, double interes, double saldo){
		this.nombreCliente=nombre;
		this.numeroCuenta=numero;
		this.tipoInteres=interes;
		this.saldo=saldo;
	}
	
	//Constructor sin parametro
	public Cuenta() {
		
	}
	
	//Constructor copia de otro objeto
	public Cuenta(Cuenta copia) {
		this.nombreCliente=copia.nombreCliente;
		this.numeroCuenta=copia.numeroCuenta;
		this.tipoInteres=copia.tipoInteres;
		this.saldo=copia.saldo;
	}
	
	
	/** SETTER */
	
	//Set nombre cliente
	public void setNombre(String nombre){
		this.nombreCliente = nombre;
	}
	
	//Set numero cuenta
	public void setNumero(String numero){
		this.numeroCuenta = numero;
	}
	
	//Set interés
	public void setInteres(double interes){
		this.tipoInteres = interes;
	}
	
	//Set saldo
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	/**GETTER */
	
	public String getDatosCliente() {
		return 
				("Nombre cliente: "+this.nombreCliente+"\n"
				+"Numero cuenta: "+this.numeroCuenta+"\n"
				+"Interés: "+this.tipoInteres+"\n"
				+"Saldo: "+this.saldo);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	/**MÉTODOS */
	
	//INtegro
	public boolean Integro(double integro) {
		if(integro>=0) {
			this.saldo+=integro;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Reintegro
	public boolean Reintegro(double reintegro) {
		if(reintegro<=0) {
			this.saldo-=reintegro;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Transferencia
	
	public boolean transferenciaRafa(Cuenta cuenta, double dinero) {
		if (dinero>0 && this.saldo>=dinero) {
			cuenta.setSaldo(dinero+cuenta.getSaldo());
			saldo=saldo-dinero;
			return true;
		} else {
			return false;

		}
	}
	

}
