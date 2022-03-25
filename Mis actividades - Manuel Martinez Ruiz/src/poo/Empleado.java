package poo;

public class Empleado {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private String nif, nombre;
	private double sueldo, irpf;
	private int horasExtras, numeroHijos;
	private boolean casado;
	private static double importeHorasExtras;

	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	public Empleado() {
		
	}
	
	public Empleado(String dni) {
		this.nif=dni;
	}
	
	/**================
	 * GETTERS Y SETTERS
	 * ================ */

	//nif
	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	//nombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Sueldo
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	//IRPF
	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	//Horas extras
	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}

	//Numero de hijos
	public int getNumeroHijos() {
		return numeroHijos;
	}

	public void setNumeroHijos(int numeroHijos) {
		this.numeroHijos = numeroHijos;
	}

	//Casado
	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	//Importe
	
	public static void setImporteHoras(double i) {
		importeHorasExtras=i;
	}
	
	/**================================
	 *  MÉTODOS DE LA CLASE
	 * ================================ */
	
	//COMPLEMENTO HORAS EXTRAS
	public double complementoHorasExtras() {
		return (this.horasExtras*importeHorasExtras);
	}
	
	//SUELDO BRUTO
	public double sueldoBruto() {
		return (this.sueldo+(this.horasExtras*importeHorasExtras));
	}
	
	//Retenciones IRPF
	public double retencionesIRPF() {
		double retencion;
		double porcentaje=this.irpf;
		
		//¿Está casado?
		if(this.casado) {
			porcentaje-=2;
		}
		
		//Reduccion por hijos
		porcentaje-=this.numeroHijos;
		
		retencion=(sueldoBruto()*(porcentaje*0.01));
		
		return retencion;
	}

	@Override
	public String toString() {
		return (nif+" "+nombre+"\n"+
				"Sueldo Base: "+sueldo+"\n"+
				"Horas Extras: "+horasExtras+"\n"+
				"tipo IRPF: "+irpf+"\n"+
				"Casado: "+casado+"\n"+
				"Número de hijos: "+numeroHijos);
	}
	
	
	
	

}
