package RetosCombinados;

import java.util.Scanner;

public class numeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número positivo: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero < 2) {
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        if (esPrimo) {
            System.out.println("El número " + numero + " es primo. ");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }

        sc.close();
    }
}
