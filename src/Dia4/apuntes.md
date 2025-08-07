# Dia 4: Estructuras de Control en Java

las estructura de control Permiten controlar el flujo del programa según condiciones lógicas.

1. IF, ELSE IF, ELSE

Estructura condicional que ejecuta un bloque de código si se cumple una condición.

## Sintaxis básica:

```java
if (condición) {
        // código si se cumple la condición
} else if (otraCondición) {
        // código si se cumple la otra condición
} else {
        // código si no se cumple ninguna
}
```

2. SWITCH - CASE

Útil para evaluar una sola variable contra múltiples valores.

## Sintaxis:

```java
switch (variable) {
    case valor1:
        // código
        break;
    case valor2:
        // código
        break;
    default:
        // código por defecto
}
```

### Notas:

- `break` evita que el código siga ejecutando los siguientes casos.
- `default` es opcional y se ejecuta si ningún `case` coincide.

### Cuándo usar:

- `if-else`: cuando se evalua rangos, condiciones booleanas o comparaciones complejas.
- `switch`: cuando se compara un valor contra varias opciones (menú, tipo, día, etc.).