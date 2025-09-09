package Dia11;

/*
    Dia12 
    ======

    POLIMORFISMO
    -------------

    TIPOS DE POLIMORFISMO EN JAVA
    --------------------------------

    1. Polimorfismo en tiempo de compilación (estático) → Ocurre cuando existen varios métodos o 
    constructores con el mismo nombre pero distinta firma (diferente número o tipo de parámetros). 
    Esto se conoce como *sobrecarga de métodos* (method overloading).
    Se resuelve en tiempo de compilación.

    2. Polimorfismo en tiempo de ejecución (dinámico) → Ocurre cuando una subclase redefine 
    (sobrescribe) un método de su superclase. 
    El comportamiento se decide en tiempo de ejecución, dependiendo del objeto real que esté 
    referenciado. 
    Esto se conoce como *sobrescritura de métodos* (method overriding).


    Ejemplo 1: Polimorfismo con herencia y sobreescritura
    -----------------------------------------------------

    class Animal {
        void hacerSonido() {
            System.out.println("El animal hace un sonido");
        }
    }

    class Perro extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("El perro ladra");
        }
    }

    class Gato extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("El gato maúlla");
        }
    }


    Ejemplo 2: Polimorfismo con interfaces
    ---------------------------------------

    interface Figura {
        double calcularArea();
    }

    class Circulo implements Figura {
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }
    }

    class Rectangulo implements Figura {
        double base, altura;

        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return base * altura;
        }
    }

    Ventajas del polimorfismo:
    ------------------------------------------------------------
    - Permite cambiar implementaciones sin afectar al código cliente.
    - Facilita el uso de **interfaces** y la **inyección de dependencias**.
    - Es base para aplicar patrones de diseño como **Strategy**, **Factory**, etc.
    - Es clave para el principio de **abierto/cerrado (OCP)** de SOLID.

*/

public class Polimorfismo {
    public static void main(String[] args) {
        
    }
}
