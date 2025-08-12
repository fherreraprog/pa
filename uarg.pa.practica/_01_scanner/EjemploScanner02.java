import java.util.Scanner;

public class EjemploScanner_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\n¡Bienvenido al Menú Interactivo!");
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Contar hasta un número");
            System.out.println("2. Adivinar el número secreto");
            System.out.println("3. Crear una historia divertida");
            System.out.println("4. Salir");
            System.out.print("Ingresa tu opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Contar hasta un número
                    System.out.print("Ingresa un número positivo: ");
                    int numero = scanner.nextInt();
                    if (numero > 0) {
                        System.out.println("Contando hasta " + numero + "...");
                        for (int i = 1; i <= numero; i++) {
                            System.out.print(i + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Por favor, ingresa un número válido.");
                    }
                    break;

                case 2:
                    // Adivinar el número secreto
                    int numeroSecreto = (int) (Math.random() * 10) + 1;
                    System.out.println("Adivina el número secreto (entre 1 y 10): ");
                    int intento;
                    do {
                        intento = scanner.nextInt();
                        if (intento < numeroSecreto) {
                            System.out.println("¡Muy bajo! Intenta de nuevo.");
                        } else if (intento > numeroSecreto) {
                            System.out.println("¡Muy alto! Intenta de nuevo.");
                        } else {
                            System.out.println("🎉 ¡Adivinaste! El número secreto era " + numeroSecreto + ".");
                        }
                    } while (intento != numeroSecreto);
                    break;

                case 3:
                    // Crear una historia divertida
                    System.out.println("Vamos a crear una historia. Completa lo siguiente:");
                    System.out.print("Ingresa un nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa un lugar: ");
                    String lugar = scanner.nextLine();
                    System.out.print("Ingresa una acción (verbo): ");
                    String accion = scanner.nextLine();
                    System.out.println("\nAquí está tu historia:");
                    System.out.println(nombre + " fue al " + lugar + " y comenzó a " + accion + " sin parar.");
                    System.out.println("¡Fue un día inolvidable!");
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("¡Gracias por usar el menú interactivo! ¡Hasta pronto!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 4.");
            }
        } while (opcion != 4);

        // Cerrar el scanner
        scanner.close();
    }
}