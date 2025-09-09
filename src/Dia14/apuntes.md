# Diá 14: Hilos en java

Los **hilos (threads)** en Java permiten ejecutar múltiples subprocesos de forma concurrente, sin 
interrumpir el programa principal.

Por defecto, Java corre en un solo hilo: el main thread, lo que significa que las instrucciones se ejecutan una tras otra.

Con hilos adicionales se puede, por ejemplo:

- Descargar un archivo mientras se actualiza una barra de progreso.
- Procesar datos mientras el usuario sigue usando la interfaz.
- Leer datos de sensores y mostrarlos en tiempo real.

## Como Funcionan

Java maneja hilos a través de la JVM, y estos pueden ejecutarse:

- En paralelo si hay un CPU con varios núcleos.

- En forma intercalada si hay un solo núcleo (la JVM los va turnando muy rápido para que parezca simultáneo).

## Formas Comunes de Crear Hilos

1. Extender la clase Thread

````java
class MiHilo extends Thread {
    public void run() {
        System.out.println("Hilo en ejecución: " + Thread.currentThread().getName());
    }
}

public class EjemploHilos {
    public static void main(String[] args) {
        MiHilo hilo = new MiHilo();
        hilo.start(); // ¡Importante! Usar start() y no run()
    }
}
````

2. Implementar la interfaz Runnable (más usado)

````java
class Tarea implements Runnable {
    public void run() {
        System.out.println("Tarea en hilo: " + Thread.currentThread().getName());
    }
}

public class EjemploRunnable {
    public static void main(String[] args) {
        Thread hilo = new Thread(new Tarea());
        hilo.start();
    }
}
````

3. Usar expresiones lambda (Java 8+)

````java
public class EjemploLambda {
    public static void main(String[] args) {
        Thread hilo = new Thread(() -> {
            System.out.println("Hilo con lambda: " + Thread.currentThread().getName());
        });
        hilo.start();
    }
}
````

### Buenas Practicas

- start() ≠ run(): start() crea un nuevo hilo, mientras que run() ejecuta el código en el hilo actual.
- Evitar modificar variables compartidas sin sincronización → problemas de concurrencia.


## Como Evitar Problemas de Concurrencia

En Java, los problemas de concurrencia aparecen cuando dos o más hilos acceden y modifican el mismo 
recurso a la vez, provocando resultados impredecibles o errores.
Esto es muy común con variables compartidas o colecciones que no están preparadas para ser usadas por 
varios hilos al mismo tiempo.

1. Sincronización con synchronized

Bloquea el acceso a un bloque de código o método para que solo un hilo a la vez pueda ejecutarlo.

````java
class Contador {
    private int valor = 0;

    public synchronized void incrementar() {
        valor++;
    }

    public synchronized int getValor() {
        return valor;
    }
}
````
Ventaja: Fácil de usar.
Desventaja: Puede reducir el rendimiento si se abusa, porque los hilos esperan turno.


2. Bloqueo de objetos (synchronized en bloques)

Permite sincronizar solo una parte del código y no todo el método.

````java
public void incrementar() {
    synchronized(this) {
        valor++;
    }
}
````


3. Clases seguras para hilos (Thread-safe)

Java ofrece colecciones y utilidades listas para usarse en entornos concurrentes:

- ConcurrentHashMap
- CopyOnWriteArrayList
- BlockingQueue

Métodos Collections.synchronizedList(), Collections.synchronizedMap()

````java
List<String> listaSegura = Collections.synchronizedList(new ArrayList<>());
````


4. Clases atómicas (java.util.concurrent.atomic)

Proporcionan operaciones seguras sin necesidad de synchronized.

````java
import java.util.concurrent.atomic.AtomicInteger;

AtomicInteger contador = new AtomicInteger(0);
contador.incrementAndGet(); // Incrementa de forma segura
````

### Regla de oro:

- Cuanto menos se compartan datos entre hilos, menos riesgo hay de problemas de concurrencia.
- Si se necesita compartir, sincronizar o usa estructuras diseñadas para concurrencia.