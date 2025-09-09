# Dia 6: Metodos y Modificadores en Java 

Un método (o función) es un bloque de código que se puede llamar y reutilizar

## Sintaxis

````java
modificadores tipoRetorno nombreMetodo(parámetros) {
    // código
    return valor; (si es necesario)
}
````

## Tipos de Retorno:

- void → no retorna nada
- int, double, String, boolean → retornan valores de ese tipo

### Ejemplo

````java
public static void saludar() {
    System.out.println("¡Hola, mundo!");
}

public static int sumar(int a, int b) {
    return a + b;
}
````

## Parametros

- Se pueden pasar argumentos al método
- Puede haber múltiples parámetros separados por coma


## beneficios de usar Metodos
    
- Reutilización de código
- Organización y legibilidad
- Separación de lógica

### NOTA

En Java no existen funciones sueltas como en otros lenguajes (por ejemplo, Python o JavaScript).

- Todo el código debe estar dentro de una clase.
- Por eso, lo que en otros lenguajes se llama “función”, en Java se llama MÉTODO.

---

# MODIFICADORES EN JAVA

en java hay dos tipos de modificadores:

- **modificadores de acceso**: Controlan desde dónde se puede llamar al método, es decir, desde donde los puedo usar
- **modificadores de comportamiento**: Controlan cómo se comporta el método o cómo se puede sobrescribir

## Modificadores de acceso
    
| Modificador | Significado                                                      |
| ----------- | ---------------------------------------------------------------- |
| `public`    | cualquiera puede usarlo, desde cualquier archivo/clase.          |
| `private`   | solo se puede usar dentro de la misma clase.                     |
| `protected` | Accesible desde la misma clase, paquete y subclases.             |
| *sin nada*  | solo se puede usar desde el mismo paquete.                       |


## Modificadores de comportamiento

| Modificador    | Significado                                                                                              |
| -------------- | -------------------------------------------------------------------------------------------------------- |
| `static`       | Se puede usar sin crear una instancia de la clase.                                                       |
| `final`        | No se puede cambiar o modificar el atributo o el metodo más adelante                                     |
| `abstract`     | El método no tiene cuerpo y debe ser implementado en una subclase. Solo se usa en clases abstractas.     | 
| `synchronized` | Solo **un hilo a la vez** puede ejecutar ese método. Se usa en programación concurrente.                 |

## Sobrecarga de metodos

con la sobrecarga de metodos, varios metodos pueden tener el mismo nombre pero diferentes parametros y diferente codigo

````java
public static void saludar() {
    System.out.println("¡Hola, mundo!");
}

public static void saludar(String nombre) {
    System.out.println("¡Hola, " + nombre);
}
````