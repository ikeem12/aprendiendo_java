package Dia8;

public class Persona {

    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre.equals("johan") ? "johan": nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }

    public Persona() {
        this("Desconocido", 0);
    }
}
