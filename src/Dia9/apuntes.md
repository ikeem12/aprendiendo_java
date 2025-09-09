# Dia10: ENCAPSULAMIENTO

el encapsulamiento es una tecnica de progrmacion orientada a objetos que:

- protege los atributos de una clase(los vuelve privado).
- permite controlarlos a traves de metodos publicos(getter y setters).
- evita accesos directos o cambios indebidos desde fuera de la clase

    
## BENEFICIOS DEL ENCAPSULAMIENTO

- Controla cómo se accede y se modifica la información.
- se Puede validar valores o lanzar errores.
- Si se cambia la lógica interna, el resto del código no se rompe.
- Mejora la seguridad y la mantenibilidad del código.

## EJEMPLO CONCEPTUAL:

Si yo quiero acceder a la información de mi cuenta bancaria, no debería ser posible modificar el 
saldo directamente desde fuera.

````java
// NO SE DEBE HACER ESTO
cuenta.saldo = -10000;
````

Por eso:

- El atributo `saldo` se marca como `private`.
- Se usa un método público `retirar(double monto)` para manejar la lógica,
- validando si tengo suficiente saldo, y controlando cómo se actualiza.


## CUÁNDO USAR GETTERS Y SETTERS

1. USAR GETTER + SETTER

Cuando se quiere exponer el valor de un atributo, pero también se necesita controlarlo o 
validarlo antes de modificarlo.

````java
    private int edad,
    private int precio,
    private int saldo
    public int getEdad() { return edad; }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        }
    }
````
    
2. SOLO GETTER (sin setter)

Cuando el atributo debe poder leerse, pero no debe modificarse desde fuera.

````java
    private final String id;

    public String getId() { return id; }
````

3. SOLO SETTER (sin getter)

Raro, pero puede pasar. Se usa cuando se necesita pasar valores, pero no se quiere exponerlos 
nunca.

````java
    private String claveSecreta;

    public void setClaveSecreta(String clave) {
        this.claveSecreta = encriptar(clave);
    }
````

4. NI GETTER NI SETTER

Cuando el atributo es totalmente interno y solo lo usa la propia clase.

Ejemplo: un contador de accesos, un estado interno de caché, un temporizador, etc.

````java
    private int intentosFallidos;

    // Solo lo manejas dentro de la clase, por ejemplo:
    private void registrarFallo() {
        intentosFallidos++;
    }
````

5. MÉTODOS PERSONALIZADOS EN VEZ DE SETTERS DIRECTOS

Cuando modificar un atributo requiere lógica de negocio más compleja, como verificación de permisos, validaciones cruzadas, límites, etc.

Ejemplo:

- retirar dinero del saldo
- cambiar de contraseña con validación
- agregar productos a un carrito

En vez de:
    cuenta.setSaldo(cuenta.getSaldo() - monto);

Mejor usar:
    cuenta.retirar(monto);  // Dentro hace todas las validaciones