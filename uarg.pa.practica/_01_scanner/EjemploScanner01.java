import java.util.Scanner;

public class EjemploScanner_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuántos años tenes? ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        System.out.print("¿Cuál es tu altura? ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer

        System.out.print("¿Estás estudiando Programación Orientada a Objetos? (true/false): ");
        boolean estudiando = scanner.nextBoolean();

        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tenes " + edad + " años.");
        System.out.println("Altura " + altura + " cm.");
        System.out.println("Estás estudiando: " + estudiando);

        scanner.close();
    }
}