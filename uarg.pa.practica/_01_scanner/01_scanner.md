# Uso de la clase Scanner en Programación de Algoritmos

La clase `Scanner` te permite leer datos que el usuario ingresa por teclado, como números o palabras, y es una herramienta sencilla para tus primeros programas en Java. En esta materia, usarás `Scanner` para escribir algoritmos básicos y pasar de pseudocódigo a código en Java.

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