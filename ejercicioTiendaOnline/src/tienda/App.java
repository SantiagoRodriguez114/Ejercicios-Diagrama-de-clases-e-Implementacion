package tienda;

public class App {
    public static void main(String[] args) {
        
        Proveedor proveedor1 = new Proveedor(1234, "Nike");
        Proveedor proveedor2 = new Proveedor(9870, "Adidas");

        TipoProducto tenis = new TipoProducto(000123, "casual", 0.19);
        TipoProducto camisetas = new TipoProducto(25684, "Camiseta Deportiva", 0.19);

        Producto producto1 = new Producto(tenis, 01234, "Air max", 350.000, 10, proveedor1);
        Producto producto2 = new Producto(camisetas, 7465, "Climate", 150.000, 10, proveedor2);

        Cliente cliente1 = new Cliente("Anuel", 79625);
        Detalle detalle1 = new Detalle(producto1, 1);
        Detalle detalle2 = new Detalle(producto2, 2);
    
        Venta venta1 = new Venta(null, cliente1,0.19);

        venta1.agregarDetalle(detalle1);
        venta1.agregarDetalle(detalle2);

        System.out.println(venta1);
    }
}
