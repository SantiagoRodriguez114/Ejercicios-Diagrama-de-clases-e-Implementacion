package biblioteca;

import java.time.LocalDate;

public class Prestamo {
	
	private LocalDate fechaPrestamo;
	private Libro libro;
	private LocalDate fechaEntrega;
	private Estudiante estudiante;
	private int diasPrestamo;
	private int diasMora;
	private int multa;
	/**
	 * @param libro
	 * @param estudiante
	 * @param diasPrestamo
	 */
	public Prestamo(Libro libro, Estudiante estudiante, int diasPrestamo) {
		super();
		this.libro = libro;
		this.estudiante = estudiante;
		this.diasPrestamo = diasPrestamo;
        this.fechaPrestamo = LocalDate.now();
        this.fechaEntrega = fechaPrestamo.plusDays(diasPrestamo);
        libro.setEstado(true);
	}
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public int getDiasPrestamo() {
        return diasPrestamo;
    }
    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }
    public int getDiasMora() {
        return diasMora;
    }
    public void setDiasMora(int diasMora) {
        this.diasMora = diasMora;
    }
    public int getMulta() {
        return multa;
    }
    public void setMulta(int multa) {
        this.multa = multa;
    }
    @Override
    public String toString() {
        return "Prestamo [fechaPrestamo=" + fechaPrestamo + ", libro=" + libro + ", fechaEntrega=" + fechaEntrega
                + ", estudiante=" + estudiante + ", diasPrestamo=" + diasPrestamo + ", diasMora=" + diasMora
                + ", multa=" + multa + "]";
    }
	
    	
	
	
}
