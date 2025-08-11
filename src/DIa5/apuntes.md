# Día 5: Bucles en Java 

Los bucles permiten ejecutar un bloque de código varias veces.

## Tipos de Bucles:

1. FOR

Ideal cuando se sabe cuántas veces se va repetir algo.

### Sintaxis

```java
for (inicialización; condición; actualización) {
    // código a repetir
}

Ejemplo:

for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
```

**Usos Comunes**:

- Recorrer arreglos o listas (for (int i = 0; i < array.length; i++))
- Generar secuencias (ej: imprimir del 1 al 100)
- Calcular sumas o productos acumulados
- Crear tablas de multiplicar
- Contar cuántos elementos cumplen una condición


2. WHILE

Ideal cuando no se sabe cuántas veces se va a repetir algo, pero se tiene una condición.
es decir, el bucle se va repetir mientras la condicion sea verdadera

### Sintaxis

````java
while (condición) {
    // código
}

Ejemplo:

int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
````

**Usos Comunes**

- Esperar una entrada válida del usuario
- Ejecutar procesos que dependen de una variable externa
- Repetir acciones hasta que ocurra un evento (while (!conectado))
- Comprobar si hay más datos por leer (while (scanner.hasNext()))
- Control de procesos que pueden terminar en cualquier momento


3. DO-WHILE

Similar al `while`, pero primero se ejecuta el codigo una ves y de ahi se comprueba la condicion

### Sintaxis

````java
do {
    // código
} while (condición);

Ejemplo:

int i = 0;

do {
    System.out.println(i);
    i++;
} while (i < 5);
````

**Usos Comunes**
    
- Menús interactivos (do { ... } while (opción != 3))
- Validar entrada del usuario con retroalimentación
- Solicitar datos hasta que sean válidos (edad, contraseña, etc.)
- Simular juegos simples o repeticiones por turnos


## Diferencias Clave

- `for` y `while`: primero evalúan la condición.
- `do-while`: primero ejecutan el código y luego evalúan.

## Buenas Practicas

- Siempre asegurar que los bucles tengan una condición de salida clara.
- Evitar bucles infinitos accidentales (`while (true)` sin `break`).