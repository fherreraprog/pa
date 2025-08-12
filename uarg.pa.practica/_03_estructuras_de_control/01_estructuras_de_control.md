# Estructuras de Control en Java

Las estructuras de control permiten tomar decisiones en el flujo del programa basadas en condiciones. En Java, las principales son `if-else` y `switch`.

## Estructura if-else

Usa `if` para ejecutar código si una condición es verdadera. Agrega `else` para el caso contrario.

- Sintaxis básica:
  ```java
  if (condicion) {
      // Código si verdadera
  } else {
      // Código si falsa
  }
  ```

- Ejemplo: Verificar si un número es positivo.
  ```java
  import java.util.Scanner;

  public class NroPositivo {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese un número para verificar si es positivo o negativo");
          int nro = scanner.nextInt();
          if (nro >= 0) {
              System.out.println("El número ingresado es positivo");
          } else {
              System.out.println("El número ingresado es negativo");
          }
          scanner.close();
      }
  }
  ```

- If anidado: Para condiciones múltiples.
  ```java
  if (nro >= 0) {
      if (nro % 2 == 0) {
          System.out.println("El número es positivo y par");
      } else {
          System.out.println("El número es positivo e impar");
      }
  } else {
      System.out.println("El número es negativo");
  }
  ```

**Buena práctica**: Siempre usa llaves `{}` para bloques, incluso si es una sola línea, para evitar errores.

## Estructura switch

Usa `switch` para seleccionar entre múltiples opciones basadas en un valor.

- Sintaxis:
  ```java
  switch (variable) {
      case valor1:
          // Código para valor1
          break;
      case valor2:
          // Código para valor2
          break;
      default:
          // Código por defecto
          break;
  }
  ```

- Ejemplo: Determinar el trimestre.
  ```java
  import java.util.Scanner;

  public class Trimestre {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese un número para obtener el Trimestre");
          int nro = scanner.nextInt();
          switch (nro) {
              case 1:
                  System.out.println("Primer Trimestre");
                  break;
              case 2:
                  System.out.println("Segundo Trimestre");
                  break;
              case 3:
                  System.out.println("Tercer Trimestre");
                  break;
              default:
                  System.out.println("No corresponde a ningún Trimestre");
                  break;
          }
          scanner.close();
      }
  }
  ```

**Buena práctica**: Siempre incluye `break;` al final de cada `case` para evitar que se ejecuten casos siguientes. Usa `default` para manejar valores inesperados.