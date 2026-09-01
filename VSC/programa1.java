import java.util.Scanner;

public class programa1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        int a = 0;
        int b = 1;
        int fibonacci = 0;
        int i;

        System.out.println("Ingrese el valor de n: ");
        n = teclado.nextInt();

        if (n < 0) {
            System.out.println("El valor de n debe ser mayor o igual a 0.");
        } else {

            for (i = 0; i < n; i++) {
                fibonacci = a;
                a = b;
                b = fibonacci + b;
            }

            System.out.println("El valor de fibonacci en la posicion "
                    + n + " es: " + fibonacci);
        }

        teclado.close();
    }
}
