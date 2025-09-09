package Dia10;

/*
    Dia11
    ======

    HERENCIA EN JAVA
    -------------------

    La herencia permite que una clase (hija) adquiera los atributos y métodos 
    de otra clase (padre o superclase).

    Se usa para evitar código duplicado y modelar jerarquías de objetos.

    SINTAXIS BÁSICA
    ----------------

     public class Animal {
        String nombre;

        public void hacerSonido() {
            System.out.println("Hace un sonido genérico");
        }
    }

    public class Perro extends Animal {
        public void hacerSonido() {
            System.out.println("Guau guau");
        }
    }


    PALABRAS CLAVE
    ---------------

    - `extends`: define la herencia.
    - `super`: permite acceder a métodos o constructores de la superclase.
    - `@Override`: indica que se está sobrescribiendo un método del padre.

    
    BENEFICIOS DE LA HERENCIA
    ---------------------------

    - Reutilización de código
    - Estructura lógica jerárquica


    USOS REALES EN BACKEND (JAVA)
    ==============================

    1. Clases base para modelos (entidades)
        
    public class BaseEntity {
        protected Long id;
        protected LocalDate createdAt;
        protected LocalDate updatedAt;
    }

    public class Usuario extends BaseEntity {
        private String nombre;
        private String email;
    }

    2. Clases base para tests
    public class BaseTest {
        protected void setupMockData() { ... }
    }

    public class UsuarioServiceTest extends BaseTest {
        @Test
        public void testCrearUsuario() { ... }
    }

    3. Jerarquías simples de errores personalizados
        public class AppException extends RuntimeException { ... }
        public class NotFoundException extends AppException { ... }

    4. Controladores o servicios base
        public abstract class BaseController {
            protected ResponseEntity<?> ok(Object body) {
                return ResponseEntity.ok(body);
            }
        }

    NO USAR herencia para modelar relaciones artificiales (Animal → Mamífero → Gato),
    ni para casos donde solo se cambian 1 o 2 cosas. En esos casos, usar composición o interfaces.
*/
public class Herencia {
    public static void main(String[] args) {
        Carro p = new Carro("Ford", "Focus", "rojo", 4);

        p.mostrarInfo();
    }
}
