import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        int cantidad, numero;
        int positivos = 0, negativos = 0, ceros = 0;
        int i = 1;

        // Solicitar cantidad de números
        System.out.print("¿Cuántos números deseas ingresar? ");
        cantidad = sc.nextInt();

        // Validación
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a 0.");
        } else {

            // Ciclo while
            while (i <= cantidad) {
                System.out.print("Ingresa el número " + i + ": ");
                numero = sc.nextInt();

                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                } else {
                    ceros++;
                }

                i++;
            }

            // Mostrar resultados
            System.out.println("\nResultados:");
            System.out.println("Números mayores que 0: " + positivos);
            System.out.println("Números menores que 0: " + negativos);
            System.out.println("Números iguales a 0: " + ceros);
        }

        // Cerrar Scanner
        sc.close();
    }
}
