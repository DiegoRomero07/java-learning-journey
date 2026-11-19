package Ciclos;

import java.util.Scanner;

public class contarParesImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int par = 0;
        int impar = 0;
        System.out.println("digite un numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("La cantidad de numero pares son: " + par);
        System.out.println("La cantidad de numero impares son: " + impar);
    }
}
