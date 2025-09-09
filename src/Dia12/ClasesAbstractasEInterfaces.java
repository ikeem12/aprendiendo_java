package Dia12;

/*
    Dia13

    CLASES ABSTRACTAS
    -------------------

    - Es una clase que **no se puede instanciar directamente**.
    - Puede tener:
        - Atributos
        - Métodos con implementación (normales)
        - Métodos abstractos (sin cuerpo) → obligan a las subclases a 
        implementarlos.
    - Se usa cuando se quiere definir una **estructura común** pero dejar 
    detalles para las subclases.


    SINTAXIS:
    ----------

    abstract class NombreClase {
        abstract void metodoAbstracto(); // sin cuerpo
        void metodoNormal() { ... }      // con cuerpo
    }


    Ejemplo:
    ---------

    abstract class Animal {
        abstract void hacerSonido();  // método abstracto

        void dormir() {
            System.out.println("Zzz...");
        }
    }

    class Perro extends Animal {
        @Override
        void hacerSonido() {
            System.out.println("Guau guau");
        }
    }

    Observaciones:
    --------------

    - `Animal` no se puede instanciar.
    - `Perro` está obligado a implementar `hacerSonido()`.
    - `dormir()` ya tiene lógica, y se hereda directamente.


    INTERFAZ
    ---------

    - Es un contrato. Solo define qué "debe hacer" una clase, no cómo.
    - Todos sus métodos son "públicos y abstractos por defecto""" (hasta Java 7).
    - Desde Java 8 puede tener métodos `default` (con cuerpo) y `static`.
    - Una clase puede implementar **múltiples interfaces** → ¡no hay herencia 
    múltiple, pero sí implementación múltiple!


    Sintaxis:
    ----------
    interface NombreInterface {
        void metodo(); // sin cuerpo
    }

    class Clase implements NombreInterface {
        public void metodo() {
            // implementación
        }
    }


    Ejemplo:
    ---------

    interface Volador {
        void volar();
    }

    class Pajaro implements Volador {
        public void volar() {
            System.out.println("El pájaro vuela");
        }
    }

    class Avion implements Volador {
        public void volar() {
            System.out.println("El avión vuela con motores");
        }
    }

    Cuándo usar uno u otro
    ----------------------------------------------------------

    Usar clase abstracta cuando:
    - Se tiene una jerarquía con atributos comunes (ej: todos los animales tienen nombre, edad, etc.).
    - Hay métodos que comparten lógica entre subclases.
    - Quieres evitar repetir código base.


    Usar interfaz cuando:

    - Se Quiere definir un "contrato genérico"(que debe hacer pero no como).
    - Varias clases "diferentes" pueden compartir ese comportamiento.
    - Se Necesita "implementación múltiple" (varias interfaces).

    
    ☑️ Ideal para agregar capacidades específicas a muchas clases sin forzar herencia.

*/  

public class ClasesAbstractasEInterfaces {
    public static void main(String[] args) {
        
    }
}
