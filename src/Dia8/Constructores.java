package Dia8;

public class Constructores {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Johan");
        Persona p3 = new Persona("Johan", 25);

        System.out.println(p1.nombre + " - " + p1.edad);
        System.out.println(p2.nombre + " - " + p2.edad);
        System.out.println(p3.nombre + " - " + p3.edad);

        Libro book = new Libro();
        Libro book1 = new Libro("1984", "Orwell");
        Libro book2 = new Libro("Clean Code", "Robert C. Martin", -450);

        System.out.println(book.titulo + " - " + book.autor + " - " + book.paginas);
        System.out.println(book1.titulo + " - " + book1.autor);
        System.out.println(book2.titulo + " - " + book2.autor + " - " + book2.paginas);

    }
}
