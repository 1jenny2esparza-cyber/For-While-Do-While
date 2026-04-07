import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        int numero;
        long factorial = 1;

        // Solicitar número al usuario
        System.out.print("Ingresa un número: ");
        numero = sc.nextInt();

        // Validación
        if (numero < 0) {
            System.out.println("Error: No se puede calcular el factorial de un número negativo.");
        } else {

            // Cálculo del factorial usando for
            for (int i = 1; i <= numero; i++) {
                factorial = factorial * i;
            }

            // Mostrar resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        // Cerrar Scanner
        sc.close();
    }
}