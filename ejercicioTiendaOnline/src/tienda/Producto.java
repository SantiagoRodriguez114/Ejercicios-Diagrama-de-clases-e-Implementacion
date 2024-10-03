package tienda;

public class Producto {
    private TipoProducto producto;
    private int codigo;
    private String descripcion;
    private double precio;
    private int cantidadActual;
    private Proveedor proveedor;
    
    public Producto(TipoProducto producto, int codigo, String descripcion, double precio, int cantidadActual,Proveedor proveedor) {
        
        this.producto = producto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadActual = cantidadActual;
        this.proveedor = proveedor;
    }

    public TipoProducto getProducto() {
        return producto;
    }

    public void setProducto(TipoProducto producto) {
        this.producto = producto;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void reducirCantidad(int cantidadVendida) {
        this.cantidadActual -= cantidadVendida;
    }

    @Override
public String toString() {
    return descripcion + " (Código: " + codigo + ", Precio: $" + precio + ", Cantidad disponible: " + cantidadActual + ")\n" +proveedor;
}

}
