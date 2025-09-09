package Dia6;

// import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int[] numeros = new int[10];
        // int positivos = 0;
        // int negativos = 0;
        // int ceros = 0;

        // System.out.println("Introduce 10 números");

        // for(int i = 0; i < numeros.length; i++){
        //     numeros[i] = scan.nextInt();

        //     if (numeros[i] > 0) {
        //         positivos++;
        //    }else if (numeros[i] == 0) {
        //         ceros++;
        //    }else{
        //         negativos++;
        //    }
        // }
        
        // System.out.println("hay " + positivos + " positivos");
        // System.out.println("hay " + negativos + " negativos");
        // System.out.println("hay " + ceros + " ceros");

        // scan.close();
    }

    static void saludar(){
        System.out.println("Hola, bienvenido");
    }

    static int multiplicar(int a, int b){
        return a*b;
    }

    static boolean esPar(int n){
        if (n % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    static void mostrarMenu(){
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Saludar");
        System.out.println("2. Ver hora");
        System.out.println("3. Salir");
    }

    static void presentar(String nombre){
        System.out.println("Hola, soy " + nombre );
    }
}
