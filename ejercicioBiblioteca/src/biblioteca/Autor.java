package biblioteca;

public class Autor {
	private String nombre;
	private Pais pais;
	/**
	 * @param nombre
	 * @param pais
	 */
	public Autor(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
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
		return nombre + ", pais=" + pais;
	}
	
	
	
}

