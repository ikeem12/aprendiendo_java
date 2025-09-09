package Dia13;

public class Excepciones {
    public static void main(String[] args) {
        // try {
        //     ejersicio2.foundName("graciela");
        // } catch (UsuarioNoEncontradoException e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        try {
            Ejersicio3.conexionBaseDatos("laura");     
        } catch (ConexionFallidaException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
