package biblioteca;

public class Editorial {
	private int codigo;
	private String nombre;
	private Pais pais;
	/**
	 * @param codigo
	 * @param nombre
	 * @param pais
	 */
	public Editorial(int codigo, String nombre, Pais pais) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.pais = pais;
	}
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the pais
	 */
	public Pais getPais() {
		return pais;
	}
	/**
	 * @param pais the pais to set
	 */
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return codigo + ", nombre=" + nombre + ", pais=" + pais;
	}
	
	
}
