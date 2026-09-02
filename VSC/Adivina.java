import java.util.Scanner;
import java.util.Random;

public class Adivina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Ingresa el límite inferior: ");
        int n = sc.nextInt();

        System.out.print("Ingresa el límite superior: ");
        int m = sc.nextInt();

        int secreto = n + rand.nextInt(m - n + 1);

        int intento;
        int contador = 0;

        System.out.println("Adivina el número entre " + n + " y " + m);

        do {
            System.out.print("Intento: ");
            intento = sc.nextInt();
            contador++;

            if (intento < secreto) {
                System.out.println("Muy bajo.");
            } else if (intento > secreto) {
                System.out.println("Muy alto.");
            } else {
                System.out.println("Correcto, lo lograste en " + contador + " intentos.");
            }

        } while (intento != secreto);

        sc.close();
    }
}