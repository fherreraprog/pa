# Tipos de Datos y Operadores en Java

En Java, los tipos de datos simples son fundamentales para declarar variables y realizar operaciones básicas. A continuación, se explican los tipos principales, las operaciones de asignación, entrada y salida, los operadores aritméticos, relacionales, lógicos, abreviados e incrementales.

## Tipos de Datos Simples

Java utiliza tipos de datos primitivos para almacenar valores básicos. Los más comunes son:

- **Entero (`int`)**: Para números enteros, como 5 o -10.
- **Real (`double` o `float`)**: Para números decimales. Usa `double` para mayor precisión, como 3.14.
- **Carácter (`char`)**: Para un solo carácter, como 'A' (debe ir entre comillas simples).
- **Booleano (`boolean`)**: Para valores lógicos, `true` o `false`.

## Declaración de Constantes y Variables

- **Variables**: Se declaran con el tipo de dato seguido del nombre. Ejemplos:
  ```java
  int unEntero;
  double unDouble;
  char unCaracter;
  boolean unBooleano;
  ```

- **Constantes**: Usa `final` para valores que no cambian. Ejemplo:
  ```java
  final double PI = 3.1416;
  ```

**Buena práctica**: Nombra las variables de forma descriptiva (por ejemplo, `edadUsuario` en lugar de `e`) y usa mayúsculas para constantes (como `PI`).

## Operaciones Básicas

- **Asignación**: Usa `=` para asignar valores.
  ```java
  int numero = 10;
  ```

- **Entrada**: Usa la clase `Scanner` para leer datos del usuario (importa `import java.util.Scanner;`).
  ```java
  Scanner scanner = new Scanner(System.in);
  int edad = scanner.nextInt();
  ```

- **Salida**: Muestra información en la consola.
  ```java
  System.out.println("El valor es: " + numero);
  ```

**Buena práctica**: Siempre cierra el `Scanner` al final con `scanner.close();` para liberar recursos.

## Operadores Aritméticos

Usados para cálculos matemáticos:

- **Suma (`+`)**: 5 + 3 = 8
- **Resta (`-`)**: 5 - 3 = 2
- **Multiplicación (`*`)**: 5 * 3 = 15
- **División (`/`)**: 5 / 2 = 2 (entero) o 5.0 / 2 = 2.5 (decimal)
- **Módulo (`%`)**: 5 % 3 = 2 (resto de la división)
- **Potenciación**: Usa `Math.pow(base, exponente)`, como `Math.pow(2, 3)` = 8.0

**Buena práctica**: Importa `Math` con `import java.lang.Math;` si usas funciones como `pow()`.

## Operadores Abreviados

Los operadores abreviados combinan una operación aritmética con una asignación, haciendo el código más corto y claro. Son útiles para actualizar el valor de una variable.

- **Suma abreviada (`+=`)**: `x += 5;` es igual a `x = x + 5;`
- **Resta abreviada (`-=`)**: `x -= 3;` es igual a `x = x - 3;`
- **Multiplicación abreviada (`*=`)**: `x *= 2;` es igual a `x = x * 2;`
- **División abreviada (`/=`)**: `x /= 2;` es igual a `x = x / 2;`
- **Módulo abreviado (`%=`)**: `x %= 3;` es igual a `x = x % 3;`

- Ejemplo de uso:
  ```java
  int contador = 10;
  contador += 5; // Ahora contador es 15
  contador *= 2; // Ahora contador es 30
  System.out.println("Valor final: " + contador);
  ```

## Operadores Incrementales

Los operadores incrementales aumentan o disminuyen el valor de una variable en 1. Son muy comunes en bucles y contadores.

- **Incremento (`++`)**: `x++;` es igual a `x = x + 1;`
- **Decremento (`--`)**: `x--;` es igual a `x = x - 1;`

- Ejemplo de uso:
  ```java
  int contador = 5;
  contador++; // Ahora contador es 6
  contador--; // Ahora contador es 5
  System.out.println("Valor final: " + contador);
  ```

- Nota: `++x` (pre-incremento) y `x++` (post-incremento) tienen diferencias en expresiones complejas, pero para nuestros ejercicios básicos, el efecto es el mismo cuando se usan solos.

**Buena práctica**: Usa `++` y `--` en contadores de bucles o cuando necesites incrementar/decrementar por 1, pero evita usarlos en expresiones complejas para mantener el código claro.

## Operadores Relacionales

Comparan valores y devuelven un booleano (`true` o `false`):

- Mayor que (`>`): 5 > 3 → `true`
- Menor que (`<`): 5 < 3 → `false`
- Igual (`==`): 5 == 5 → `true`
- Mayor o igual (`>=`): 5 >= 5 → `true`
- Menor o igual (`<=`): 5 <= 3 → `false`
- Distinto (`!=`): 5 != 3 → `true`

**Buena práctica**: Usa `==` para comparación, no `=` (que es asignación).

## Operadores Lógicos

Combinan condiciones booleanas:

- Y (`&&`): `true && false` → `false` (ambas deben ser `true`)
- O (`||`): `true || false` → `true` (al menos una debe ser `true`)
- Negación (`!`): `!true` → `false`

**Buena práctica**: Usa paréntesis para aclarar el orden en expresiones complejas, como `(a > b) && (c < d)`.