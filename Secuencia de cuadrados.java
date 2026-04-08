import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        int numero;
        int i = 1;

        // Solicitar número al usuario
        System.out.print("Ingresa un número entero positivo: ");
        numero = sc.nextInt();

        // Validación
        if (numero <= 0) {
            System.out.println("Error: El número debe ser positivo.");
        } else {

            // Ciclo do while
            do {
                int cuadrado = i * i;
                System.out.println("El cuadrado de " + i + " es: " + cuadrado);
                i++;
            } while (i <= numero);
        }

        sc.close();
    }
}