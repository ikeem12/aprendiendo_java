package DIa02;

public class Operadores {
    public static void main(String[] args) {
        
        //Ejersicios

        // Operadores Aritméticos
        int a = 10;
        int b = 5;
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores de Comparación
        System.out.println("Igual a: " + (a == b));
        System.out.println("Diferente de: " + (a != b));
        System.out.println("Mayor que: " + (a > b));
        System.out.println("Menor que: " + (a < b));
        System.out.println("Mayor o igual que: " + (a >= b));
        System.out.println("Menor o igual que: " + (a <= b));

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("AND lógico: " + (x && y));
        System.out.println("OR lógico: " + (x || y));
        System.out.println("NOT lógico: " + (!x));

        // Operadores de Asignación
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("Asignación con suma: " + c);

        // Operadores Unarios
        int d = 10;
        System.out.println("Valor positivo: " + (+d));
        
        d++; // Incremento
        System.out.println("Incremento: " + d);

        d--; // Decremento
        System.out.println("Decremento: " + d);
        
        boolean z = true;
        System.out.println("Negación lógica: " + (!z));
    }
}