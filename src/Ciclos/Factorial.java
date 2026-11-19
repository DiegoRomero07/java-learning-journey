package Ciclos;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int factorial = 1;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("no se puede calcular un factorial de un número negativo");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
        }
        System.out.println("El factorial del número " + numero + "!" + " es: " + factorial);
    }
}
