## Dia 9: CONSTRUCTORES EN JAVA

- Es un "método especial" que se ejecuta automáticamente al crear un objeto.
- Tiene el mismo nombre que la clase.
- No tiene tipo de retorno (ni siquiera void).
- Se usa para inicializar los atributos del objeto.
    
### NOTA

cuando no se define un constructor, Java crea uno por defecto vacío.
pero si se define uno, el por defecto desaparece

---

### EJEMPLO BÁSICO:

````java
    public class Persona {
        String nombre;
        int edad;

        // Constructor
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
````

## SOBRECARGA DE CONSTRUCTORES

- Es tener varios constructores en una misma clase con diferentes parámetros.
- Te permite crear objetos de distintas formas según lo que necesites.

````java    
    public class Persona {
        String nombre;
        int edad;

        // Constructor sin parámetros
        public Persona() {
            this.nombre = "Desconocido";
            this.edad = 0;
        }

        // Constructor con solo nombre
        public Persona(String nombre) {
            this.nombre = nombre;
            this.edad = 0;
        }

        // Constructor con nombre y edad
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
````

## USO EN EL MAIN

````java
    public class Main {
        public static void main(String[] args) {
            Persona p1 = new Persona();                    // Usa constructor vacío
            Persona p2 = new Persona("Johan");             // Solo nombre
            Persona p3 = new Persona("Johan", 25);         // Nombre y edad

            System.out.println(p1.nombre + " - " + p1.edad);
            System.out.println(p2.nombre + " - " + p2.edad);
            System.out.println(p3.nombre + " - " + p3.edad);
        }
    }
````

## USOS COMUNES DE LA SOBRECARGA

1. Inicialización flexible de objetos permite crear objetos con solo los datos que se tengan disponibles.

2. Configuración de entorno ideal para clases como AppConfig, DatabaseConfig, etc.

3. Objetos de prueba o mocks

4. Librerías y frameworks Constructores sobrecargados para facilitar el uso o la serialización

5. Conversión desde otros tipos

6. Diseño de APIs limpias


## CUÁNDO NO USARLA
  
- Si hay muchos parámetros → mejor usar builder.(builder es un patron de diseño)
- Si los tipos se repiten y pueden confundirse → puede generar bugs.
- Si la lógica de construcción es compleja → mejor usar métodos estáticos de construcción (factories).

    
## DETALLES IMPORTANTES:

se Puede llamar a otro constructor desde un constructor de la misma clase usando `this(...)`:

````java
    public Persona(String nombre) {
        this(nombre, 0);  // llama al constructor con nombre y edad
    }

    // se Puede validar los parámetros dentro del constructor:

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = (edad < 0) ? 0 : edad;
    }
````