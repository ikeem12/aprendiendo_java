package Dia8;

public class User {
    String nombre;
    String email;
    int edad;

    public User(String nombre, String email, int edad){
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
    }

    public User(){
        this("No existe", "No encontrado", 0); 
    }

    public User(String nombre){
        this(nombre, "No encontrado", 0); 
    }
}
