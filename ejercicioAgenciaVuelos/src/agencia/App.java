package agencia;

public class App {
    public static void main(String[] args) {
        // Crear piloto, ciudades, y vuelo
        Piloto piloto1 = new Piloto("Arcangel", 125);
        Ciudad ciudad1 = new Ciudad(1234, "Bogota");
        Ciudad ciudad2 = new Ciudad(5678, "Barranquilla");
        Vuelo vuelo1 = new Vuelo(896, ciudad1, ciudad2, 2, piloto1);

        Cliente cliente1 = new Cliente("Jhayco", 1015, 28, 'M');
        Cliente cliente2 = new Cliente("Bad Bunny", 1016, 29, 'M');

        vuelo1.asignarSilla(cliente1);
        vuelo1.asignarSilla(cliente2);

        System.out.println(vuelo1);

    }
}

