# Estructura de Clases en Java

En Java, los programas se organizan en clases. Cada archivo Java contiene una clase principal con un método `main` para ejecutar el código.

## Estructura General de un Programa

- Sintaxis básica:
  ```java
  public class NombreClase {  // El nombre debe coincidir con el archivo (ej: MiPrograma.java)
      public static void main(String[] args) {
          // Declaración de variables
          // Cuerpo del programa
      }
  }
  ```

- Ejemplo completo: Calcular segundos en horas.
  ```java
  import java.util.Scanner;

  public class Secuenciacion {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese una hora para calcularle los segundos");
          int horas = scanner.nextInt();
          int segundos = horas * 60 * 60;
          System.out.println("La cantidad de segundos que tiene es: " + segundos);
          scanner.close();
      }
  }
  ```

**Buena práctica**: 
- Usa comentarios con `//` para líneas o `/* */` para bloques para explicar el código.
- Importa solo lo necesario (como `Scanner`).
- Nombra la clase con mayúscula inicial (CamelCase).
- Mantén el código indentado para legibilidad.
- Siempre cierra recursos como `Scanner`.

Esta estructura es el punto de entrada para tus algoritmos en Java.