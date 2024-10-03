package tienda;

public class Detalle {
    private Producto productos;
    private int cantidad;
    
    
    public Detalle(Producto productos, int cantidad) {
        this.productos = productos;
        this.cantidad = cantidad;
    }

    public double calcularSubtotal() {
        return productos.getPrecio() * cantidad;
    }

    @Override
    public String toString() {
        return productos + "\nCantidad comprada: " + cantidad + ", Subtotal: $" + calcularSubtotal()+"\n";
    }
}
