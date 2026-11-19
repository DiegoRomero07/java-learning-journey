package Ciclos;

import java.util.Scanner;

public class tablaMultiplicar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multiplicar = i * numero;
            System.out.println(i + " * " + numero + " = " + multiplicar);
        }
    }
}
