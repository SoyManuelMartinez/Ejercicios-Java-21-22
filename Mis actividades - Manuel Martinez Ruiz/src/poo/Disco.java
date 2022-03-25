package poo;

public class Disco {
	
	/**==========
	 * ATRIBUTOS
	 * ========== */
	
	private String codigo="LIBRE", autor, titulo, genero;
	private int duracion;
	
	
	/**============
	 * CONSTRUCTOR
	 * ============*/
	
	//Constructor por defecto
	public Disco() {
		
	}
	
	//Constructor por parametros
	public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
		this.codigo = codigo;
		this.autor = autor;
		this.titulo = titulo;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	//Constructor copia
	public Disco(Disco copia) {
		this.codigo = copia.codigo;
		this.autor = copia.autor;
		this.titulo = copia.titulo;
		this.genero = copia.genero;
		this.duracion = copia.duracion;
	}

	
	/**===========================
	 * GETTERS, SETTERS & TOSTRING
	 * =========================== */
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	//To String
	@Override
	public String toString() {
		return "Disco [codigo=" + codigo + ", autor=" + autor + ", titulo=" + titulo + ", genero=" + genero
				+ ", duracion=" + duracion + "]";
	}
	
	
	

}
