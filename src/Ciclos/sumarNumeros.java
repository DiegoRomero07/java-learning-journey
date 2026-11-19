package Ciclos;

import java.util.Scanner;

public class sumarNumeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        int suma = 0;
        System.out.println("Digite um numero positivo: ");
        numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}
