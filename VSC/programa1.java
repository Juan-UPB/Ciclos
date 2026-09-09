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

        double coeficienteA;
        double coeficienteB;
        double coeficienteC;
        double delta;
        double x1;
        double x2;

        int cantidad;
        double numeroIngresado;
        double suma;
        double promedio;

        while (true) {

            System.out.println("+===============================================+");
            System.out.println("|              MENU PRINCIPAL                   |");
            System.out.println("+===============================================+");
            System.out.println("| 1. Calcular el n-esimo termino de Fibonacci   |");
            System.out.println("| 2. Calcular el n-esimo numero primo           |");
            System.out.println("| 3. Calcular las raices de una ecuacion        |");
            System.out.println("|    cuadratica                                 |");
            System.out.println("| 4. Calcular el promedio de n numeros          |");
            System.out.println("| 5. Salir                                      |");
            System.out.println("+===============================================+");
            System.out.print("Seleccione una opcion: ");

            if (!teclado.hasNextInt()) {
                System.out.println("Error: debe ingresar un numero entero.");
                teclado.nextLine();
                continue;
            }

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese el valor de n (0 a 46): ");

                    if (!teclado.hasNextInt()) {
                        System.out.println("Error: debe ingresar un numero entero.");
                        teclado.nextLine();
                        break;
                    }

                    n = teclado.nextInt();

                    if (n < 0 || n > 46) {

                        System.out.println(
                                "Error: el valor de n debe estar entre 0 y 46."
                        );

                    } else {

                        a = 0;
                        b = 1;
                        fibonacci = 0;

                        for (i = 0; i < n; i++) {

                            fibonacci = a;
                            a = b;

                            if (b > Integer.MAX_VALUE - fibonacci) {
                                System.out.println(
                                        "Error: el resultado supera el limite de int."
                                );
                                fibonacci = 0;
                                break;
                            }

                            b = fibonacci + b;
                        }

                        System.out.println(
                                "El valor de Fibonacci en la posicion "
                                        + n + " es: " + fibonacci
                        );
                    }

                    break;

                case 2:

                    System.out.print("Ingrese el valor de n (1 a 10000): ");

                    if (!teclado.hasNextInt()) {
                        System.out.println("Error: debe ingresar un numero entero.");
                        teclado.nextLine();
                        break;
                    }

                    n = teclado.nextInt();

                    if (n <= 0 || n > 10000) {

                        System.out.println(
                                "Error: el valor de n debe estar entre 1 y 10000."
                        );

                    } else {

                        contador = 0;
                        numero = 1;
                        primo = 0;

                        while (contador < n) {

                            numero++;

                            boolean esPrimo = true;

                            for (i = 2; i * i <= numero; i++) {

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

                        System.out.println(
                                "El numero primo en la posicion "
                                        + n + " es: " + primo
                        );
                    }

                    break;

                case 3:

                    System.out.println(
                            "\nEcuacion cuadratica: ax^2 + bx + c = 0"
                    );

                    System.out.print("Ingrese el valor de a: ");

                    if (!teclado.hasNextDouble()) {
                        System.out.println(
                                "Error: debe ingresar un numero."
                        );
                        teclado.nextLine();
                        break;
                    }

                    coeficienteA = teclado.nextDouble();

                    System.out.print("Ingrese el valor de b: ");

                    if (!teclado.hasNextDouble()) {
                        System.out.println(
                                "Error: debe ingresar un numero."
                        );
                        teclado.nextLine();
                        break;
                    }

                    coeficienteB = teclado.nextDouble();

                    System.out.print("Ingrese el valor de c: ");

                    if (!teclado.hasNextDouble()) {
                        System.out.println(
                                "Error: debe ingresar un numero."
                        );
                        teclado.nextLine();
                        break;
                    }

                    coeficienteC = teclado.nextDouble();

                    if (coeficienteA == 0) {

                        System.out.println(
                                "Error: el valor de a no puede ser 0."
                        );

                    } else {

                        delta = (coeficienteB * coeficienteB)
                                - (4 * coeficienteA * coeficienteC);

                        if (delta > 0) {

                            x1 = (-coeficienteB + Math.sqrt(delta))
                                    / (2 * coeficienteA);

                            x2 = (-coeficienteB - Math.sqrt(delta))
                                    / (2 * coeficienteA);

                            System.out.println(
                                    "La ecuacion tiene dos soluciones reales."
                            );

                            System.out.println("x1 = " + x1);
                            System.out.println("x2 = " + x2);

                        } else if (delta == 0) {

                            x1 = -coeficienteB
                                    / (2 * coeficienteA);

                            System.out.println(
                                    "La ecuacion tiene una solucion real."
                            );

                            System.out.println("x = " + x1);

                        } else {

                            System.out.println(
                                    "La ecuacion no tiene soluciones reales."
                            );
                        }
                    }

                    break;

                case 4:

                    System.out.print(
                            "¿Cuantos numeros desea ingresar? (1 a 1000): "
                    );

                    if (!teclado.hasNextInt()) {
                        System.out.println(
                                "Error: debe ingresar un numero entero."
                        );
                        teclado.nextLine();
                        break;
                    }

                    cantidad = teclado.nextInt();

                    if (cantidad <= 0 || cantidad > 1000) {

                        System.out.println(
                                "Error: la cantidad debe estar entre 1 y 1000."
                        );

                    } else {

                        suma = 0;

                        for (i = 1; i <= cantidad; i++) {

                            System.out.print(
                                    "Ingrese el numero " + i + ": "
                            );

                            if (!teclado.hasNextDouble()) {

                                System.out.println(
                                        "Error: debe ingresar un numero."
                                );

                                teclado.nextLine();
                                suma = 0;
                                cantidad = 0;
                                break;
                            }

                            numeroIngresado = teclado.nextDouble();

                            if (Double.isInfinite(numeroIngresado)
                                    || Double.isNaN(numeroIngresado)) {

                                System.out.println(
                                        "Error: el numero ingresado no es valido."
                                );

                                suma = 0;
                                cantidad = 0;
                                break;
                            }

                            if (Math.abs(numeroIngresado)
                                    > Double.MAX_VALUE - Math.abs(suma)) {

                                System.out.println(
                                        "Error: la suma supera el limite de double."
                                );

                                suma = 0;
                                cantidad = 0;
                                break;
                            }

                            suma = suma + numeroIngresado;
                        }

                        if (cantidad > 0) {

                            promedio = suma / cantidad;

                            System.out.println(
                                    "El promedio es: " + promedio
                            );
                        }
                    }

                    break;

                case 5:

                    System.out.println("Programa finalizado.");

                    teclado.close();

                    return;

                default:

                    System.out.println(
                            "Opcion invalida. Seleccione una opcion del 1 al 5."
                    );
            }
        }
    }
}