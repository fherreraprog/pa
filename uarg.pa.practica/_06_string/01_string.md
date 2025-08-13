# Uso de la Clase String en Java

En Java, la clase `String` se utiliza para manejar cadenas de texto, como nombres, frases o cualquier secuencia de caracteres. Es una de las clases más usadas y está diseñada para ser fácil de usar en programas básicos, como los que desarrollarás en Programación de Algoritmos. A continuación, aprenderás sus características principales y los métodos más útiles para trabajar con cadenas.

## Características de la Clase String

- **Inmutabilidad**: Una vez creado un objeto `String`, su contenido no puede modificarse. Si cambias una cadena (por ejemplo, concatenando), se crea un nuevo objeto `String`. Esto garantiza seguridad y estabilidad en tus programas.
- **Pertenece al paquete `java.lang`**: No necesitas importar `String` porque está disponible automáticamente en todos los programas Java.
- **Creación sencilla**: Puedes crear cadenas usando comillas dobles (`"texto"`) o instanciando un objeto `String`.
- **Uso común**: Ideal para manejar entradas de usuario (como nombres) o mostrar mensajes en pantalla.

Ejemplo de creación:
```java
String nombre = "Juan";  // Forma común
String mensaje = new String("Hola, mundo");  // Usando constructor
```

**Buena práctica**: Usa la forma literal (`"texto"`) en lugar de `new String("texto")`, ya que es más eficiente.

## Principales Métodos de la Clase String

Aquí están los métodos más útiles para tus algoritmos iniciales:

1. **length()**  
   Devuelve la longitud (número de caracteres) de la cadena.  
   ```java
   String texto = "Hola";
   int longitud = texto.length();  // Devuelve 4
   System.out.println("Longitud: " + longitud);
   ```

2. **charAt(int indice)**  
   Devuelve el carácter en la posición especificada (índices empiezan en 0).  
   ```java
   String texto = "Hola";
   char letra = texto.charAt(1);  // Devuelve 'o'
   System.out.println("Carácter en posición 1: " + letra);
   ```

3. **toUpperCase() y toLowerCase()**  
   Convierte la cadena a mayúsculas o minúsculas.  
   ```java
   String texto = "Hola Mundo";
   System.out.println(texto.toUpperCase());  // "HOLA MUNDO"
   System.out.println(texto.toLowerCase());  // "hola mundo"
   ```

4. **trim()**  
   Elimina espacios en blanco al inicio y al final de la cadena.  
   ```java
   String texto = "  Hola  ";
   String limpio = texto.trim();  // "Hola"
   System.out.println("Sin espacios: " + limpio);
   ```

5. **equals(String otra)**  
   Compara si dos cadenas tienen el mismo contenido. Usa `equals` en lugar de `==` para comparar cadenas.  
   ```java
   String texto1 = "Hola";
   String texto2 = "hola";
   boolean igual = texto1.equals(texto2);  // false
   boolean igualIgnora = texto1.equalsIgnoreCase(texto2);  // true
   System.out.println("¿Iguales? " + igual);
   ```

6. **concat(String otra)**  
   Concatena (une) dos cadenas. También puedes usar el operador `+`.  
   ```java
   String texto1 = "Hola";
   String texto2 = "Mundo";
   String resultado = texto1.concat(" ").concat(texto2);  // "Hola Mundo"
   System.out.println(resultado);
   ```

7. **substring(int inicio, int fin)**  
   Extrae una parte de la cadena desde el índice `inicio` hasta `fin-1`.  
   ```java
   String texto = "Programación";
   String sub = texto.substring(0, 4);  // "Prog"
   System.out.println("Subcadena: " + sub);
   ```

8. **startsWith(String prefijo) y endsWith(String sufijo)**  
   Verifica si la cadena comienza o termina con un texto específico.  
   ```java
   String texto = "Hola Mundo";
   boolean empieza = texto.startsWith("Hola");  // true
   boolean termina = texto.endsWith("Mundo");  // true
   System.out.println("Empieza con Hola: " + empieza);
   ```

## Ejemplo Completo con Scanner

Este programa usa `String` y `Scanner` para procesar una entrada del usuario:

```java
import java.util.Scanner;

public class EjemploString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine().trim();  // Limpia espacios
        
        System.out.println("Longitud del nombre: " + nombre.length());
        System.out.println("Nombre en mayúsculas: " + nombre.toUpperCase());
        System.out.println("Primer carácter: " + nombre.charAt(0));
        
        if (nombre.equalsIgnoreCase("juan")) {
            System.out.println("¡Hola, Juan!");
        } else {
            System.out.println("Hola, " + nombre);
        }
        
        scanner.close();
    }
}
```

## Buenas Prácticas al Usar String

- **Usa comillas literales**: Crea cadenas con `"texto"` en lugar de `new String("texto")` para mejor rendimiento.
- **Evita comparar con `==`**: Usa `equals()` o `equalsIgnoreCase()` para comparar contenido.
- **Valida entradas**: Usa `trim()` para limpiar espacios en entradas de usuario y verifica con `isEmpty()` si la cadena está vacía.
- **Concatenación eficiente**: Para unir muchas cadenas en bucles, considera `StringBuilder` (lo verás en materias avanzadas). Por ahora, usa `+` o `concat()` para tareas simples.
- **Cierra Scanner**: Si usas `Scanner` con `String`, no olvides `scanner.close()`.

La clase `String` es una herramienta poderosa y fácil de usar para manejar texto en tus algoritmos. Practica con estos métodos para familiarizarte con su uso en programas básicos.