# Dia 7: Clases en java

## SINTAXIS DE CLASES EN JAVA

````java
modificadores class nombreClase{
    // Atributos
    modificador tipo nombreAtributos;


    // Métodos
    modficador retorno nombreMetodo(){
        // Codigo
    }
}
````
## MODIFICADORES DE ACCESO PARA CLASES Y MÉTODOS

| Modificador | Se puede usar en... | Significado                                                            |
| ----------- | ------------------- | ---------------------------------------------------------------------- |
| `public`    | Clases, métodos     | Accesible desde cualquier parte del programa.                          |
| `private`   | Métodos, atributos  | Solo accesible dentro de la misma clase.                               |
| `protected` | Métodos, atributos  | Accesible desde la misma clase, subclases o el mismo paquete.          |
| *(default)* | Clases, métodos     | Accesible solo desde el mismo paquete (sin usar `public` o `private`). |

### NOTA

Las clases no pueden ser privadas (solo public o default).

## MODIFICADORES DE COMPORTAMIENTO

| Modificador | Se puede usar en...            | Significado                                                       |
| ----------- | -------------------------------| ----------------------------------------------------------------- |
| `static`    | Atributos, métodos             | No depende de una instancia, se accede con el nombre de la clase. |
| `final`     | Métodos, clases, Atributos     | Método no se puede sobrescribir. Clase no puede ser extendida.    |
| `abstract`  | Clases, métodos                | No se puede instanciar (clase) o no tiene cuerpo (método).        |


## ¿CUANDO USAR STATIC EN UN METODO?

Cuando la acción no depende de datos específicos del objeto.
**Por ejemplo**, una utilidad general como calcularIVA(), imprimirSeparador() o un contador global.

## ¿CUANDO NO USAR STATIC EN UN METODO?

Cuando el método depende de atributos del objeto (por ejemplo, marca, modelo, año si son no estáticos).
Usar esos métodos cuando se crea objetos de la clase.

## ¿CUANDO USAR STATIC EN UN ATRIBUTO?

cuando el atributo vaya ser comun o global para todos los objetos


## ¿CUANDO NO USAR STATIC EN UN ATRIBUTO?

cuando el atributo NO vaya ser comun o global para todos los objetos


## ¿CUANDO USAR FINAL EN UN ATRIBUTO?

Cuando el valor del atributo no debería cambiar nunca después de ser asignado