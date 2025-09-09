package Dia13;

public class ejersicio2 {
    public static String[] arr = {"sebastian", "laura", "anderson"};

    public static void foundName(String name) throws UsuarioNoEncontradoException{
        for (String usuario: arr) {
            if (usuario.equals(name)) {
                System.out.println("El usuario existe: " + name);
                return;
            }
        }
        
        throw new UsuarioNoEncontradoException("El usuario " + name + " no fue encontrado.");
    }
}
