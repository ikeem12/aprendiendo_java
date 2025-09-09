package Dia13;

public class Ejersicio3 {
    public static void conexionBaseDatos(String usuario) throws ConexionFallidaException{
        String usurioBaseDatos = "johan";

        if (usuario.equals(usurioBaseDatos) ) {
            System.out.println("conectando a la base de datos");
        }else{
            throw new ConexionFallidaException("fallo la conexion a la base de datos, usuario incorrecto");
        }
    }    
}
