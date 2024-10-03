package tienda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private ArrayList<Detalle> listaDetalles = new ArrayList<>();
    private LocalDate fechaVenta;
    private Cliente cliente;
    private double valorTotal;
    private double iva;

    
    public Venta(LocalDate fechaVenta, Cliente cliente, double iva) {
        this.fechaVenta = LocalDate.now();
        this.cliente = cliente;
        this.iva = iva;
        this.valorTotal = 0;
    }

    public void agregarDetalle(Detalle detalle) {
        listaDetalles.add(detalle);
        valorTotal += detalle.calcularSubtotal();
    }

    public double calcularIVA() {
        return valorTotal * iva;
    }

    public double calcularTotalPagar() {
        return valorTotal + calcularIVA();
    }

    @Override
    public String toString() {
        return "====Factura de Venta======\n" +
           "Fecha: " + fechaVenta + "\n" +
           "Cliente: " + cliente + "\n" +
           "Detalles:\n" + listaDetalles +
           "\nValor Total: $" + valorTotal + 
           "\nIVA: $" + calcularIVA() + 
           "\nTotal a Pagar: $" + calcularTotalPagar();
    }
    
    
    
}
