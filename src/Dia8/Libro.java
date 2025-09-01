package Dia8;

public class Libro {
    String titulo;
    String autor;
    int paginas;
    
    public Libro(){
        this.titulo = "Sin titulo";
        this.autor = "Desconocido";
        this.paginas = 0;
    }

    public Libro(String titulo, String  autor){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    public Libro(String titulo, String  autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = (paginas < 0) ? 0 : paginas;
    }
}
