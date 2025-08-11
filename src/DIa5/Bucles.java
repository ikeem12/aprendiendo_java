package Dia5;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Bucles {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        /*-------------------------------------------------- */

        int x = 10;
        while (1 <= x) {
            System.out.println(x);
            x--;
        }

        /*-------------------------------------------------- */ 

        Scanner scan = new Scanner(System.in);
        String password = "";

        do {
            System.out.println("escribe una contraseña");
            password = scan.nextLine();
        } while (!password.equals("1234"));

        System.out.println("¡Contraseña correcta! Acceso concedido.");

        scan.close();

        /*-------------------------------------------------- */ 

        int suma = 0;

        for(int i = 1; i <= 100; i++){
            suma += i;
        }

        System.out.println("la suma total del bucle es: " + suma);

        /*-------------------------------------------------- */ 

        int a = 1;
        
        while (a <= 20) {
            if (a % 2 == 0) {
                System.out.println("numero par: " + a);
            }
            a++;
        }

        /*-------------------------------------------------- */ 

        for(int i = 1; i <= 10; i++){

            int multiplicar = 5 * i;
            System.out.println("5 x " + i + " es igual a: " + multiplicar);
        }

        /*-------------------------------------------------- */ 

        Scanner scane = new Scanner(System.in);
        String edadstr = "";
        int edad = 0;

        do {
            System.out.println("escribe tu edad");
            edadstr = scan.nextLine();
            edad = Integer.parseInt(edadstr);
        } while (edad <= 0);

         System.out.println("edad correcta");

        scane.close();

        /*-------------------------------------------------- */ 

        Scanner sca = new Scanner(System.in);
        String opciones = "";

        do {
            System.out.println("Escoge una opcion");
            System.out.println("- Saludar");
            System.out.println("- Mostrar hora");
            System.out.println("- Salir");
            opciones = scan.nextLine();
        } while ( !opciones.equals("saludar") && !opciones.equals("mostrar hora") && !opciones.equals("salir"));

        sca.close();

        if (opciones.equals("saludar")) {
            System.out.println("saludando");
        }else if (opciones.equals("mostrar hora")) {
            LocalTime horaActual = LocalTime.now();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
            System.out.println("son las: " + horaActual.format(formato));
        }else{
            System.out.println("saliendo");
        }
    }
}