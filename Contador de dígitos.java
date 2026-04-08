import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        int numero, contador = 0;

        // Solicitar número al usuario
        System.out.print("Ingresa un número entero: ");
        numero = sc.nextInt();

        // Validación para número 0
        if (numero == 0) {
            contador = 1;
        } else {
            // Convertir a positivo por si es negativo
            numero = Math.abs(numero);

            // Ciclo while para contar dígitos
            while (numero > 0) {
                numero = numero / 10;
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("El número tiene " + contador + " dígitos.");

        // Cerrar Scanner
        sc.close();
    }
}