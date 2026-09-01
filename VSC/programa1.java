import java.util.Scanner;

public class programa1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int opcion;
        int n;
        int a;
        int b;
        int fibonacci;
        int i;
        int contador;
        int numero;
        int primo;

        while (true) {

            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Calcular el n-esimo termino de Fibonacci");
            System.out.println("2. Calcular el n-esimo numero primo");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    a = 0;
                    b = 1;
                    fibonacci = 0;

                    System.out.print("Ingrese el valor de n: ");
                    n = teclado.nextInt();

                    if (n < 0) {
                        System.out.println("El valor de n debe ser mayor o igual a 0.");
                    } else {

                        for (i = 0; i < n; i++) {
                            fibonacci = a;
                            a = b;
                            b = fibonacci + b;
                        }

                        System.out.println("El valor de Fibonacci en la posicion "
                                + n + " es: " + fibonacci);
                    }

                    break;

                case 2:

                    System.out.print("Ingrese el valor de n: ");
                    n = teclado.nextInt();

                    if (n <= 0) {
                        System.out.println("El valor de n debe ser mayor que 0.");
                    } else {

                        contador = 0;
                        numero = 1;
                        primo = 0;

                        while (contador < n) {

                            numero++;

                            boolean esPrimo = true;

                            for (i = 2; i < numero; i++) {

                                if (numero % i == 0) {
                                    esPrimo = false;
                                    break;
                                }
                            }

                            if (esPrimo) {
                                contador++;
                                primo = numero;
                            }
                        }

                        System.out.println("El numero primo en la posicion "
                                + n + " es: " + primo);
                    }

                    break;

                case 3:

                    System.out.println("Programa finalizado.");
                    teclado.close();
                    return;

                default:

                    System.out.println("Opcion invalida. Seleccione una opcion del 1 al 3.");
            }
        }
    }
}

