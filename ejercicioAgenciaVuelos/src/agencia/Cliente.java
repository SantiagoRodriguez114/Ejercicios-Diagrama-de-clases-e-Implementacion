package agencia;

public class Cliente {
    private String nombre;
    private int id;
    private int edad;
    private char genero;
    
    public Cliente(String nombre, int id, int edad, char genero) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Cliente:" +nombre + ", id=" + id + ", edad=" + edad + ", genero=" + genero + "]";
    }

     
}
