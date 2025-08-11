package DIa6;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean shouldContinue = true;

        System.out.println("CALCULADORA");

        do {
            
            System.out.println("Por favor, introduce el primer valor");

            int num = scan.nextInt();
                
            System.out.println("Por favor, introduce el segundo valor");
            
            int num1 = scan.nextInt();

            System.out.println("¿Que operación quieres realizar?");

            System.out.println("- sumar");
            System.out.println("- restar");
            System.out.println("- multiplicar");
            System.out.println("- dividir");

            String operation = scan.next();

            System.out.println("el resultado de la operacion es:");

            switch (operation) {
                case "sumar":
                    System.out.println(num + num1);
                    break;
                case "restar":
                    System.out.println(num - num1);
                    break;
                case "multiplicar":
                    System.out.println(num * num1);
                    break;
                case "dividir": 
                    if (num1 != 0) {
                        System.out.println(num / num1);
                    } else {
                        System.out.println("No se puede dividir entre cero.");
                    }
                    break; 
                default:
                    System.out.println("la operacion introducidad es incorrecta");
                    break;
            }

            System.out.println("¿Desea realizar otra operación? (si/no)");
            String respuesta = scan.next();
            shouldContinue = respuesta.equalsIgnoreCase("si");
        } while (shouldContinue);
        
        scan.close();
    }
}
