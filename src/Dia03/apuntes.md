# Dia 3: Conversiones en Java

Conversiones o "casting" es convertir un valor de un tipo a otro.

en java hay dos tipos de conversiones

## Conversión implícita (widening)

esta conversion lo hace java automaticamente 

### Ejemplo

de tipo pequeño a tipo más grande.   

int i = 100;
long l = i;       // int a long (implícito)
double d = l;     // long a double (implícito)

en este orden: byte -> short -> char -> int -> long -> float -> double

## Conversión explícita (narrowing)

- Se hace de manera manula usando el operador cast: (tipo) valor
       
### Ejemplo

double d2 = 9.78;
int i2 = (int) d2; // double a int (explícito), se trunca el decimal

en este orden: double -> float -> long -> int -> char -> short -> byte

## NOTA:

- Siempre preferir conversiones implícitas para evitar perdidas de datos.
- La conversión explícita requiere cuidado ya que se puede perder datoss