package biblioteca;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Libro> listaLibros = new ArrayList<>();
		ArrayList<Prestamo> listaPrestamos = new ArrayList<>();	
		
		Pais pais1 = new Pais(100, "Colombia");

        Autor autor1 = new Autor("Gabriel Gracia Marquez", pais1);

        Editorial editorial1 = new Editorial(10111, "Editorial Sudamericana", pais1);

        Libro libro1 = new Libro("1015", "Cien años de soledad", 1, autor1, 100, editorial1);
        
        
        listaLibros.add(libro1);

        System.out.println(listaLibros);

        // Estudiante estudiante1 = new Estudiante(1015407477, "Santiago");

        // Prestamo prestamo1 = new Prestamo(libro1, estudiante1, 5);

        // listaPrestamos.add(prestamo1);

        // System.out.println(listaPrestamos);
	
	}

}
