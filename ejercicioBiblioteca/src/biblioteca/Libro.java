package biblioteca;

public class Libro {
	private String isbn;
	private String titulo;
	private int edicion;
	private Autor autor;
	private int nPaginas;
	private boolean estado;
    private Editorial editorial;
	/**
	 * @param isbn
	 * @param titulo
	 * @param edicion
	 * @param autor
	 * @param nPaginas
	 */
	public Libro(String isbn, String titulo, int edicion, Autor autor, int nPaginas, Editorial editorial) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.edicion = edicion;
		this.autor = autor;
		this.nPaginas = nPaginas;
        this.editorial = editorial;
	}
	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the edicion
	 */
	public int getEdicion() {
		return edicion;
	}
	/**
	 * @param edicion the edicion to set
	 */
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	/**
	 * @return the autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	/**
	 * @return the nPaginas
	 */
	public int getnPaginas() {
		return nPaginas;
	}
	/**
	 * @param nPaginas the nPaginas to set
	 */
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}
	/**
	 * @param estado the estado to set
	 */
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

    public Editorial getEditorial() {
        return editorial;
    }
    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    @Override
    public String toString() {

        String estadoLibro = estado ? "El libro está prestado" : " Disponible";

        return "Libro " + isbn + ", titulo=" + titulo + ", edicion=" + edicion + ", autor=" + autor
                + ", nPaginas=" + nPaginas + ", estado=" +estadoLibro + ", editorial=" + editorial;
        
    }

	
	
}
