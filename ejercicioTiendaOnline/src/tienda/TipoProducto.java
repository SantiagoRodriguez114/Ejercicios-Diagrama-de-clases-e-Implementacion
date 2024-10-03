package tienda;

public class TipoProducto {
    private int codigo;
    private String descripcion;
    private double iva;
    
    public TipoProducto(int codigo, String descripcion, double iva) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.iva = iva;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return descripcion + " (Código: " + codigo + ", IVA: " + (iva * 100) + "%)";
    }
    
    
}
