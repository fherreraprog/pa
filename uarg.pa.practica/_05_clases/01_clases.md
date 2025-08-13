# Estructura de Clases en Java

En Java, todo el código se organiza en clases. Una clase es como un blueprint o molde que define las propiedades (atributos) y comportamientos (métodos) de los objetos. En esta materia, usaremos clases para implementar algoritmos modulares y conceptos básicos de orientación a objetos, como encapsulación.

## Estructura General de una Clase

Una clase típica en Java incluye los siguientes elementos, en este orden:

1. **Paquete (Package)**:  
   Un paquete es un espacio de nombres que organiza clases relacionadas y evita conflictos de nombres. Se declara al inicio del archivo.  
   Sintaxis:  
   ```java
   package nombreDelPaquete;
   ```  
   Ejemplo: `package algoritmos.basicos;`.  
   **Buena práctica**: Usa paquetes para organizar proyectos grandes. Si no lo especificas, la clase está en el paquete por defecto.

2. **Imports**:  
   Importa clases de otros paquetes que necesitas usar, como `Scanner` para entrada.  
   Sintaxis:  
   ```java
   import java.util.Scanner;
   ```  
   Puedes importar todo un paquete con `*`, como `import java.util.*;`, pero es mejor importar solo lo necesario.  
   **Buena práctica**: Coloca los imports después del package y antes de la clase.

3. **Nombre de la Clase**:  
   La clase se declara con `public class NombreDeLaClase`. El nombre debe coincidir exactamente con el nombre del archivo (por ejemplo, `MiClase.java`).  
   **Importancia de los nombres de las clases**:  
   - Deben ser descriptivos y reflejar el propósito de la clase (ej: `Calculadora` en lugar de `C`).  
   - Usa CamelCase: Primera letra mayúscula, sin espacios, y mayúscula en cada palabra nueva (ej: `PersonaEstudiante`).  
   - Evita abreviaturas confusas; un buen nombre hace el código más legible y mantenible.  
   - En Java, las clases públicas deben estar en su propio archivo con el mismo nombre.

4. **Atributos (Variables de Instancia)**:  
   Son las propiedades de la clase, declaradas dentro de la clase pero fuera de métodos. Representan el estado del objeto.  
   Ejemplo:  
   ```java
   private int edad;  // Atributo privado para encapsulación
   private String nombre;
   ```  
   **Buena práctica**: Hazlos privados (`private`) para encapsularlos y accede a ellos vía métodos.

5. **Constantes**:  
   Valores fijos que no cambian, declarados con `final`.  
   Ejemplo:  
   ```java
   private static final double PI = 3.1416;
   ```  
   **Buena práctica**: Usa mayúsculas para nombres de constantes y `static` si son compartidas por todos los objetos.

6. **Constructor**:  
   Un método especial que se llama al crear un objeto. Inicializa los atributos. Si no lo defines, Java proporciona uno por defecto sin parámetros.  
   Sintaxis: Mismo nombre que la clase, sin tipo de retorno.  
   Ejemplo:  
   ```java
   public Persona(String nombreInicial, int edadInicial) {
       this.nombre = nombreInicial;
       this.edad = edadInicial;
   }
   ```  
   Usa `this` para referirte a los atributos de la clase.  
   **Buena práctica**: Proporciona constructores para inicializar objetos de manera segura.

7. **Métodos Básicos: Getters y Setters**:  
   Getters (get) devuelven el valor de un atributo; setters (set) lo modifican. Promueven la encapsulación (ocultar detalles internos).  
   Ejemplos:  
   ```java
   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nuevoNombre) {
       this.nombre = nuevoNombre;
   }

   public int getEdad() {
       return edad;
   }

   public void setEdad(int nuevaEdad) {
       if (nuevaEdad >= 0) {  // Validación básica
           this.edad = nuevaEdad;
       }
   }
   ```  
   **Buena práctica**: Usa setters para validar datos antes de asignarlos.

## Declaración e Instanciación de Objetos

- **Declaración**: Reserva espacio para una referencia a un objeto, pero no crea el objeto.  
  Ejemplo:  
  ```java
  Persona miPersona;  // Declaración (miPersona es null por ahora)
  ```

- **Instanciación**: Crea el objeto en memoria usando `new` y llama al constructor.  
  Ejemplo:  
  ```java
  miPersona = new Persona("Juan", 25);  // Instanciación
  ```  
  O combinado:  
  ```java
  Persona miPersona = new Persona("Juan", 25);
  ```  
  **Buena práctica**: Instancia objetos solo cuando los necesites para evitar uso innecesario de memoria.

## El Método Main

El método `main` es el punto de entrada de cualquier programa Java ejecutable. Java lo busca para empezar la ejecución.  
Sintaxis:  
```java
public static void main(String[] args) {
    // Código principal aquí
}
```  
- `public`: Accesible desde fuera.  
- `static`: Se ejecuta sin instanciar la clase.  
- `void`: No retorna valor.  
- `String[] args`: Parámetros de línea de comandos (usa raramente en esta materia).  

Ejemplo completo de una clase:  
```java
package algoritmos;

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private static final int EDAD_MINIMA = 0;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);  // Usa setter para validar
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= EDAD_MINIMA) {
            this.edad = edad;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese nombre: ");
        String nom = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int ed = scanner.nextInt();

        Persona persona = new Persona(nom, ed);
        System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());

        scanner.close();
    }
}
```  

**Buena práctica**: En clases principales, usa `main` para probar la clase. Mantén el código indentado y comenta secciones para claridad.