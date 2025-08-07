package Dia4;

public class Ejersicios {
    public static void comprobarNumero(int num){
        if (num > 0) {
            System.out.println("el numero: " + num + " es positivo");
        } else if (num < 0) {
            System.out.println("el numero: " + num + " es negativo");
        } else {
            System.out.println("el numero: " + num + " es cero");
        }
    }

    public static void mostrarMes(int num){
        switch (num) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;

            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;

            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("ingrese un numero valido del 1 al 12");
                break;
        }
    }

    public static void evaluarNota(int nota){
        if (nota >= 90) {
            System.out.println("Excelente");
        }
        else if (nota >= 70) {
            System.out.println("Aprobado");
        }else{
            System.out.println("Reprobado");
        }
    }

    public static void evaluarEdad(int edad){
        if (edad >= 65) {
            System.out.println("Adulto mayor");
        }else if (edad >= 18) {
            System.out.println("Adulto");
        }else if (edad >= 13) {
            System.out.println("Adolescente");
        }else{
            System.out.println("Niño");
        }
    }

    public static void parOImpar(int num){
        if (num % 2 == 0) {
            System.out.println("el numero: " + num + " es par");
        }else{
            System.out.println("el numero: " + num + " es impar");
        }
        
    }
}
