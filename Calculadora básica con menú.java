import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        int opcion;
        double num1, num2, resultado;
        char continuar;

        do {
            // Mostrar menú
            System.out.println("\n--- CALCULADORA ---");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();

            // Solicitar números
            System.out.print("Ingresa el primer número: ");
            num1 = sc.nextDouble();
            System.out.print("Ingresa el segundo número: ");
            num2 = sc.nextDouble();

            // Operaciones con switch
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            // Preguntar si desea continuar
            System.out.print("\n¿Deseas realizar otra operación? (s/n): ");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');

        sc.close();
    }
}
