package Dia03;

public class Conversiones {
    public static void main(String[] args) {

        // EJERSICIOS 
        
        int varInt = 120;
        double varDouble = 3.14 + varInt;

        System.out.println("suma: " + varDouble);

        /* -------------------------------------------------------------------- */

        int castInt = 100;
        long castLong =  castInt;  //casting implicito

        System.out.println("Casting int a long: " + castLong); 

        /* -------------------------------------------------------------------- */ 

        double castDouble = 3.14;
        int castIntFromDouble = (int) castDouble; //casting explicito

        System.out.println("Casting double a int: " + castIntFromDouble);

        /* -------------------------------------------------------------------- */

        char varChar2 = 'B';
        int varunicode = varChar2; 

        System.out.println("Variable char: " + varChar2 + " (Valor Unicode: " + varunicode + ")");

        /* -------------------------------------------------------------------- */

        int castInt2 = 65; 
        char castChar = (char) castInt2; // casting explicito de int a char

        System.out.println("Casting int a char: " + castChar + " (Valor Unicode: " + (int)castChar + ")");

        /* -------------------------------------------------------------------- */

        float casFloat = 5.5f;
        int castIntFromFloat = (int) casFloat; 

        System.out.println("Casting float a int: " + castIntFromFloat);

        /* -------------------------------------------------------------------- */

        long castLong2 = 123456789L;
        int castIntFromLong = (int) castLong2; 

        System.out.println("Casting long a int: " + castIntFromLong);

        /* -------------------------------------------------------------------- */

        byte castByte = 100;
        short castShort = 23; 

        int castIntFromByteShort = castByte + castShort; 

        System.out.println("Casting byte y short a int: " + castIntFromByteShort);

        /* -------------------------------------------------------------------- */

        double castDouble2 = 3.14159;
        float castFloat = 44.4f;

        double resultado = castDouble2 + castFloat; // casting implicito

        System.out.println("Resultado de la suma de double y float: " + resultado);

        /* -------------------------------------------------------------------- */

        float resultadoFloat = castFloat + (float) castDouble2;
        
        System.out.println("Resultado de la suma de float y double (convertido a float): " + resultadoFloat);

    }
}