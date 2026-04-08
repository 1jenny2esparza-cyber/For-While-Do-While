import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear objeto Scanner
        Scanner sc = new Scanner(System.in);

        String entrada;
        char letra;

        // Ciclo do while
        do {
            System.out.print("Ingresa una letra (espacio para salir): ");
            entrada = sc.nextLine();

            // Validar si es espacio para salir
            if (entrada.equals(" ")) {
                break;
            }

            // Tomar el primer carácter
            letra = entrada.toLowerCase().charAt(0);

            // Verificar si es letra
            if (Character.isLetter(letra)) {

                // Verificar vocal o consonante
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("Es una vocal.");
                } else {
                    System.out.println("Es una consonante.");
                }

            } else {
                System.out.println("Ingresa solo letras.");
            }

        } while (true);

        sc.close();
    }
}