## 📖 1. ¿Qué es Scanner?

La clase `Scanner` pertenece al paquete `java.util` y permite leer datos desde:

- Consola (teclado)
- Archivos
- Cadenas de texto

En esta materia la utilizaremos principalmente para **leer datos ingresados por el usuario desde la consola/terminal**.

Es una herramienta estándar en Java y muy útil para manejar datos ingresados por el usuario.


## 📦 2. **Importación de la clase**
Antes de usar `Scanner`, es necesario importarla:
```java
import java.util.Scanner;
```

## 🛠️ 3. **Crear una instancia de Scanner**
Se crea una instancia utilizando el constructor y especificando la fuente de entrada. 

Para leer del teclado:
```java
Scanner scanner = new Scanner(System.in);
```
En la materia trabajaremos con una sola instancia asociada a System.in.

## 🔤 4. **Lectura de datos**
La clase Scanner ofrece métodos para leer distintos tipos de datos:
| Método          | Tipo que lee            | Uso típico              |
| --------------- | ----------------------- | ----------------------- |
| `nextLine()`    | String (línea completa) | Nombre completo, frases |
| `next()`        | String (una palabra)    | Palabras sueltas        |
| `nextInt()`     | int                     | Edad, menú, cantidad    |
| `nextDouble()`  | double                  | Precio, promedio        |
| `nextBoolean()` | boolean                 | true / false            |
| `hasNextInt()`  | Validación              | Verificar antes de leer |

## 🔠 5. Lectura de caracteres (char)

Scanner no tiene un método nextChar().

Para leer un carácter se usa:

```java
char letra = sc.next().charAt(0);
```

-   `next()` → lee una palabra (String)
-   `charAt(0)` → toma el primer carácter

Ejemplo:

``` java
System.out.print("Ingrese una letra: ");
char letra = sc.next().charAt(0);
System.out.println("Ingresaste: " + letra);
```

## 🛡️ Versión más segura
```java
String entrada = sc.next();

if (!entrada.isEmpty()) {
    char letra = entrada.charAt(0);
}
```
------------------------------------------------------------------------

## 🧪 6. Ejemplo básico completo

``` java
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su inicial: ");
        char inicial = sc.next().charAt(0);

        System.out.println("Hola " + nombre + 
                           ", tenés " + edad + 
                           " años y tu inicial es " + inicial);

        sc.close();
    }
}
```

## ⚠️ 7. **Limpiar el buffer**
Si se mezclan lecturas de diferentes tipos, es importante limpiar el buffer:

```java
scanner.nextLine(); // Limpia el salto de línea pendiente
```

Ejemplo:

``` java
int edad = sc.nextInt();
sc.nextLine(); // limpiar antes de leer texto
String nombre = sc.nextLine();
```

------------------------------------------------------------------------

## 🛡️ 8. Validación de entradas

### Validación preventiva

``` java
if (sc.hasNextInt()) {
    int numero = sc.nextInt();
} else {
    System.out.println("Entrada inválida.");
    sc.next(); // descarta valor incorrecto
}
```

------------------------------------------------------------------------

## ✅ 9. Buenas prácticas en la materia

-   Crear una sola instancia de `Scanner`
-   Cerrar el `Scanner` al finalizar (`sc.close()`)
-   Limpiar el buffer cuando se mezclen tipos
-   Validar entradas antes de usarlas
-   No capturar `Exception` genérica si podemos usar
    `InputMismatchException`

------------------------------------------------------------------------

## 10. **Cerrar el Scanner**
Es una buena práctica cerrar el Scanner al finalizar su uso para liberar recursos:
```java
scanner.close();
```







# Uso de la clase Scanner

La clase `Scanner` te permite leer datos que el usuario ingresa por teclado, como números o palabras, y es una herramienta sencilla para tus programas en Java. En esta materia, usarás `Scanner` para escribir tu código en Java.

## 1. **Importar la clase Scanner**
Para usar `Scanner`, incluye esta línea al inicio de tu programa:
```java
import java.util.Scanner;
```

## 2. **Crear un Scanner**
Crea un objeto `Scanner` para leer desde el teclado con esta línea:
```java
Scanner scanner = new Scanner(System.in);
```

## 3. **Leer datos con Scanner**
`Scanner` tiene métodos para leer diferentes tipos de datos:
- `nextLine()`: Lee una línea completa de texto (por ejemplo, un nombre).
- `next()`: Lee una palabra (sin espacios).
- `nextInt()`: Lee un número entero.
- `nextDouble()`: Lee un número decimal.
- `nextBoolean()`: Lee un valor `true` o `false`.

Ejemplo de cómo leer un nombre y una edad:
```java
System.out.print("Ingresa tu nombre: ");
String nombre = scanner.nextLine();

System.out.print("Ingresa tu edad: ");
int edad = scanner.nextInt();

System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
```

## 4. **Validar entradas**
Para evitar errores si el usuario ingresa algo incorrecto, usa métodos como `hasNextInt()` o `hasNextDouble()` para comprobar si la entrada es válida antes de leerla.

Ejemplo de cómo leer un número entero de forma segura:
```java
System.out.print("Ingresa un número entero: ");
if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
    System.out.println("El número es: " + numero);
} else {
    System.out.println("Por favor, ingresa un número entero válido.");
    scanner.next(); // Descarta la entrada incorrecta
}
```

## 5. **Limpiar el buffer**
Si lees un número (como con `nextInt()`) y luego una línea de texto (con `nextLine()`), debes limpiar el buffer para evitar problemas. Agrega esta línea después de leer un número:
```java
scanner.nextLine(); // Limpia el buffer
```

Ejemplo completo:
```java
System.out.print("Ingresa un número entero: ");
if (scanner.hasNextInt()) {
    int numero = scanner.nextInt();
    scanner.nextLine(); // Limpia el buffer
    System.out.println("El número es: " + numero);
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Hola " + nombre);
} else {
    System.out.println("Por favor, ingresa un número entero válido.");
    scanner.nextLine(); // Limpia la entrada incorrecta
}
```

## 6. **Cerrar el Scanner**
Cuando termines de usar `Scanner`, ciérralo para liberar recursos:
```java
scanner.close();
```
