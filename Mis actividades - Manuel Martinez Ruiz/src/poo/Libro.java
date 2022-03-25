package poo;

public class Libro {
	
	/**ATRIBUTOS*/
	
	private String titulo, autor;
	private int numEjLibro, numEjPrestado;
	
	/**CONSTRUCCIÓN */
	
	//Constructor por defecto
	public Libro() {
		
	}
	
	//Constructor parametros
	public Libro(String titulo, String autor, int numEjLibro, int numEjPrestado) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjLibro = numEjLibro;
		this.numEjPrestado = numEjPrestado;
	}
	
	/**SETTER */
	
	//Set titulo
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	//Set titulo
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	//Set numero ejemplares de libro
	public void setEjLibros(int libros) {
		this.numEjLibro=libros;
	}
	
	//Set numero de ejemplares prestado
	public void setEjPrestados(int prestado) {
		this.numEjPrestado=prestado;
	}
	
	/** GETTER */
	
	//Get titulo
	public String getTitulo() {
		return this.titulo;
	}
	
	//Get autor
	public String getAutor() {
		return this.autor;
	}
	
	//Get numero ejemplares libros
	public int getEjLibros() {
		return this.numEjLibro;
	}
	
	//Get numero ejemplares prestados
	public int getEjPrestados() {
		return this.numEjPrestado;
	}
	
	/**MÉTODOS */
	
	//Prestamos
	public boolean Prestamo() {
		if(this.numEjLibro>0) {
			this.numEjLibro--;
			this.numEjPrestado++;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Devolucion
	public boolean Devolucion() {
		if(this.numEjPrestado>0) {
			this.numEjLibro++;
			this.numEjPrestado--;
			return true;
		}
		else {
			return false;
		}
	}
	
	//toString
	@Override
	public String toString() {
		return ("Título: "+this.titulo+"\n"
				+"Autor: "+this.autor+"\n"
				+"Ejemplares de libros: "+this.numEjLibro+"\n"
				+"Ejemplares prestados: "+this.numEjPrestado);
	}
	

}
