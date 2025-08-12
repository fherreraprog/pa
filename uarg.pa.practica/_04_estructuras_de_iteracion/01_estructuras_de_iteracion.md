# Estructuras de Iteración en Java

Las iteraciones permiten repetir bloques de código. En Java, las principales son `while`, `do-while` y `for`.

## Bucle while

Ejecuta mientras una condición sea verdadera. Verifica la condición antes de entrar.

- Sintaxis:
  ```java
  while (condicion) {
      // Código a repetir
  }
  ```

- Ejemplo: Sumar cinco números.
  ```java
  import java.util.Scanner;

  public class SumaNum {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int cont = 1;
          int suma = 0;
          while (cont <= 5) {
              System.out.println("Ingrese valor");
              int num = scanner.nextInt();
              suma = suma + num;
              cont = cont + 1;
          }
          System.out.println("La suma es: " + suma);
          scanner.close();
      }
  }
  ```

**Buena práctica**: Asegúrate de que la condición cambie dentro del bucle para evitar loops infinitos.

## Bucle do-while

Ejecuta al menos una vez, verifica la condición después.

- Sintaxis:
  ```java
  do {
      // Código a repetir
  } while (condicion);
  ```

- Ejemplo: Sumar cinco números.
  ```java
  import java.util.Scanner;

  public class SumaNum2 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int cont = 1;
          int suma = 0;
          do {
              System.out.println("Ingrese valor");
              int num = scanner.nextInt();
              suma = suma + num;
              cont = cont + 1;
          } while (cont <= 5);
          System.out.println("La suma es: " + suma);
          scanner.close();
      }
  }
  ```

**Buena práctica**: Úsalo cuando necesites ejecutar el código al menos una vez, como en menús.

## Bucle for

Ideal para iteraciones con contador conocido.

- Sintaxis:
  ```java
  for (inicialización; condicion; incremento) {
      // Código a repetir
  }
  ```

- Ejemplo: Sumar cinco números.
  ```java
  import java.util.Scanner;

  public class SumaNumPara {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          int suma = 0;
          for (int cont = 1; cont <= 5; cont++) {
              System.out.println("Ingrese valor");
              int num = scanner.nextInt();
              suma = suma + num;
          }
          System.out.println("La suma es: " + suma);
          scanner.close();
      }
  }
  ```

- Otro ejemplo: Ingresar letras hasta 'a'.
  ```java
  import java.util.Scanner;

  public class OpcionA {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          char opcion;
          System.out.println("Ingrese letra");
          opcion = scanner.next().charAt(0);
          while (opcion != 'a' && opcion != 'A') {
              System.out.println("Ingrese letra");
              opcion = scanner.next().charAt(0);
          }
          System.out.println("Finalizó con la letra A");
          scanner.close();
      }
  }
  ```

**Buena práctica**: Inicializa variables dentro del `for` si solo se usan allí, como `for (int i = 0; i < 10; i++)`.