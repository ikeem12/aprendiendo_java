# Dia13: Excepciones y Manejo de errores en java

## ¿Que es una excepción?
una **excepción** es un evento que interrumpe el flujo normal de ejecucion de un programa debido a un error o una situacion inesperada

## Jerarquia de excepciones

1. Error

**Descripción**: Representa problemas graves del entorno donde se ejecuta la aplicación.

**Características**: Son errores del sistema, NO de la lógica del programa.

**Ejemplos**:

StackOverflowError: Se produce cuando una función se llama a sí misma infinitamente (recursión infinita).

OutOfMemoryError: Cuando la aplicación agota toda la memoria disponible en la JVM.

**No se capturan con try-catch de forma normal**.


2. Exception

**Descripción**: Representa situaciones anómalas que la aplicación sí puede manejar.

**Subdivisión**:

Checked Exceptions (Excepciones comprobadas)

Unchecked Exceptions (Excepciones no comprobadas)


3. Checked Exceptions (Comprobadas)

**Definición**: Excepciones que el compilador te obliga a manejar usando -> try-catch o declarar throws en la firma del método.

**Cuándo ocurren**: En situaciones que dependen de factores externos al programa.

**Ejemplos**:

IOException: Problemas de entrada/salida (archivos, red).

SQLException: Errores al interactuar con una base de datos.

FileNotFoundException: Cuando intentas abrir un archivo que no existe.

**Obligan a anticipar el error, porque se sabe que pueden ocurrir en cualquier momento.**


4. Unchecked Exceptions (No comprobadas / Runtime Exceptions)

**Definición**: Excepciones que NO obligan a ser capturadas en tiempo de compilación.

**Cuándo ocurren**: Normalmente son errores de programación.

**Ejemplos**:

NullPointerException: Intentar acceder a un objeto nulo.

ArrayIndexOutOfBoundsException: Acceder a una posición inexistente de un array.

ArithmeticException: División por cero.

No son obligatorias de capturar, pero si no se manejan y ocurren, la aplicación se rompe en tiempo de ejecución.

Se deben prevenir con validaciones o capturar si es necesario.

## Formas de manejar excepciones

### Try-Catchs
el try-catch ejecuta el codigo y captura la excepcion 

```java
try {
    // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
    // Código para manejar la excepción
} finally {
    // (Opcional) Código que siempre se ejecuta
}
```

### Throws
el **throws** hace que un metodo lanze la exepcion a quien haya llamado ese metodo debe atrapar la excepción

```java
public void abrirArchivo() throws FileNotFoundException {
    // Si el archivo no existe, lanzará FileNotFoundException
    Scanner sc = new Scanner(new File("documento.txt"));
}

try {
    abrirArchivo();
} catch (FileNotFoundException e) {
    System.out.println("El archivo no existe, manejaré el error aquí.");
}
```

### Crear excepciones personalizadas 
puedo crear mis propias excepciones extendiendo Exception o RuntimeException.

```java
public class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}

if (edad < 18) {
    throw new MiExcepcion("No eres mayor de edad.");
}
```

### try-with-resources (Java 7+)
Permite cerrar automáticamente recursos que implementan la **interfaz AutoCloseable**.

```java
try (Scanner sc = new Scanner(new File("archivo.txt"))) {
    // Código que usa el recurso
} catch (FileNotFoundException e) {
    System.out.println("Archivo no encontrado.");
}
```

## Buenas practicas en manejo de excepciones

1. No capturar Exception genérico sin necesidad.

Capturar Exception de manera genérica puede ocultar errores imprevistos, dificultando su detección.
Es mejor capturar las excepciones específicas que se espera (por ejemplo, IOException, ArithmeticException), para manejar cada 
situación adecuadamente.

Solo usar Exception al final, como salvaguarda, cuando no se quiere que el programa se caiga.

MALO:

```java
try {
    int resultado = 10 / 0;
} catch (Exception e) { // Muy genérico, atrapa TODO sin necesidad
    System.out.println("Algo salió mal: " + e.getMessage());
}
```

BUENO:

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) { // Captura específica
    System.out.println("Error: División por cero.");
}
```

Solo usar Exception al final, como salvaguarda, cuando no se quiere que el programa se caiga.

```java
try {
    int resultado = 10 / 0;
} catch (ArithmeticException e) { // Captura específica
    System.out.println("Error: División por cero.");
}catch (Exception e) { 
    System.out.println("Algo salió mal: " + e.getMessage());
}
```

2. No usar excepciones para controlar flujo normal.

Las excepciones son costosas en términos de rendimiento. El flujo normal de la aplicación debe controlarse con condiciones (if, 
else) y no dependiendo de que ocurra una excepción.

Usar excepciones como control de flujo hace el código menos legible y más propenso a errores.

MALO:

```java
try {
    String nombre = obtenerNombre(); // Si no existe, lanza excepción
} catch (Exception e) {
    nombre = "Desconocido"; // Control de flujo con excepciones -> MALO
}
```

BUENO:

```java
String nombre = obtenerNombre();
if (nombre == null || nombre.isEmpty()) {
    nombre = "Desconocido"; // Control de flujo con IF -> Correcto
}
```

3. Lanzar excepciones personalizadas SOLO cuando aportan contexto

No tiene sentido lanzar excepciones personalizadas si no aportan información adicional.
Las excepciones personalizadas deben usarse cuando agregan claridad al problema, facilitando su manejo en capas superiores 
(servicio, controlador).

MALO:

```java
throw new Exception("Usuario no encontrado"); // Muy genérico
```

BUENO:

```java
class UsuarioNoEncontradoException extends Exception {
    public UsuarioNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}

// Y al lanzarla:
throw new UsuarioNoEncontradoException("El usuario con ID 10 no existe");
```

4. Siempre cerrar recursos con try-with-resources o finally

Abrir recursos como archivos, conexiones de base de datos, etc., consume memoria del sistema.
Si no se cierran correctamente, pueden provocar fugas de memoria (Memory Leaks) o bloquear conexiones.

try-with-resources asegura que el recurso se cierre automáticamente, incluso si ocurre una excepción.
 
MALO:

```java
Connection conn = null;
try {
    conn = DriverManager.getConnection(...);
    // operaciones
} catch (SQLException e) {
    e.printStackTrace();
}
// Pero aquí si ocurre un error, podría NO cerrarse bien la conexión
if (conn != null) conn.close();  // Es fácil olvidarse de esto
````

BUENO:

```java
try (Connection conn = DriverManager.getConnection(...)) {
    // operaciones
} catch (SQLException e) {
    e.printStackTrace();
}
// Aquí, el recurso se cerrará automáticamente al salir del try.
```