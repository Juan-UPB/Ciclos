import java.util.Scanner;
import java.util.Random;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("=================================");
        System.out.println("       JUEGO: ADIVINA");
        System.out.println("=================================");


        System.out.println();
        System.out.println("Adivina el número secreto.");
        System.out.println();

        System.out.print("Ingresa el límite inferior: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: debes ingresar un número.");
            return;
        }

        int n = sc.nextInt();

        System.out.print("Ingresa el límite superior: ");

        if (!sc.hasNextInt()) {
            System.out.println("Error: debes ingresar un número.");
            return;
        }

        int m = sc.nextInt();

        if (n > m) {
            System.out.println("Error: el límite inferior no puede ser mayor que el límite superior.");
            return;
        }

        int secreto = n + rand.nextInt(m - n + 1);

        int intento;
        int contador = 0;

        System.out.println();
        System.out.println("Adivina el número entre " + n + " y " + m);

        do {
            System.out.print("Intento: ");

            if (!sc.hasNextInt()) {
                System.out.println("Error: debes ingresar un número.");
                return;
            }

            intento = sc.nextInt();
            contador++;

            if (intento < secreto) {
                System.out.println("Muy bajo.");
            } else if (intento > secreto) {
                System.out.println("Muy alto.");
            } else {
                System.out.println("=================================");
                System.out.println("¡CORRECTO!");
                System.out.println("Lo lograste en " + contador + " intentos.");
                System.out.println("=================================");
            }

        } while (intento != secreto);

        sc.close();
    }
}
