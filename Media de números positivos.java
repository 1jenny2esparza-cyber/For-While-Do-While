import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        double numero, suma = 0;
        int contador = 0;

        // Ciclo do while
        do {
            System.out.print("Ingresa un número (negativo para terminar): ");
            numero = sc.nextDouble();

            if (numero >= 0) {
                suma = suma + numero;
                contador++;
            }

        } while (numero >= 0);

        // Calcular media
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        sc.close();
    }
}
