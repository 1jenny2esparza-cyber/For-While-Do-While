import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Crear objetos
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int intento;

        // Ciclo do while
        do {
            System.out.print("Adivina el número (1-100): ");
            intento = sc.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
            }

        } while (intento != numeroSecreto);

        sc.close();
    }
}
