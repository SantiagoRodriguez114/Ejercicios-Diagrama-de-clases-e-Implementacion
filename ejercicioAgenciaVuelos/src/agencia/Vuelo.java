package agencia;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vuelo {
    private int numeroVuelo;
    private Ciudad ciudadSalida;
    private Ciudad ciudadDestino;
    private LocalDateTime horaSalida;
    private int duracionVuelo;
    private ArrayList<Silla> listaPasajeros;
    private Piloto piloto;
    
    public Vuelo(int numeroVuelo, Ciudad ciudadSalida, Ciudad ciudadDestino, int duracionVuelo, Piloto piloto) {
        this.numeroVuelo = numeroVuelo;
        this.piloto = piloto;
        this.ciudadSalida = ciudadSalida;
        this.ciudadDestino = ciudadDestino;
        this.duracionVuelo = duracionVuelo;
        this.horaSalida = LocalDateTime.now();
        this.listaPasajeros = new ArrayList<>();
    }

    
    public void asignarSilla(Cliente cliente) {
        Silla nuevoPasajero = new Silla(cliente); 
        listaPasajeros.add(nuevoPasajero);  
    }

    public ArrayList<Silla> obtenerListaPasajeros() {
        return listaPasajeros;
    }


    @Override
    public String toString() {
        return "Vuelo No. " + numeroVuelo + 
                "\nCiudad salida: " + ciudadSalida + 
                "\nCiudad destino: " + ciudadDestino + 
                "\nHora salida: " + horaSalida.toLocalTime().withSecond(0) + 
                "\nDuración del vuelo: " + duracionVuelo + 
                "\nPiloto: " + piloto + 
                "\nPasajeros: " + obtenerListaPasajeros() + "\n\n";
    }
}
