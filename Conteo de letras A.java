import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        String palabra;
        int contador = 0;

        // Solicitar palabra al usuario
        System.out.print("Ingresa una palabra: ");
        palabra = sc.nextLine();

        // Recorrer la palabra con for
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("La letra 'a' aparece " + contador + " veces.");

        // Cerrar Scanner
        sc.close();
    }
}