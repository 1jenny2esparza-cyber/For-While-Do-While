import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        int inicio, diferencia, maximo;
        int actual;

        // Solicitar datos al usuario
        System.out.print("Ingresa el primer número: ");
        inicio = sc.nextInt();

        System.out.print("Ingresa la diferencia: ");
        diferencia = sc.nextInt();

        System.out.print("Ingresa el número máximo: ");
        maximo = sc.nextInt();

        actual = inicio;

        // Validación básica
        if (diferencia == 0) {
            System.out.println("Error: La diferencia no puede ser 0.");
        } else {

            // Ciclo do while
            do {
                System.out.println(actual);
                actual = actual + diferencia;
            } while ((diferencia > 0 && actual <= maximo) || 
                     (diferencia < 0 && actual >= maximo));
        }

        sc.close();
    }
}
