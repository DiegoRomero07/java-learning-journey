package Condicionales;

import java.util.Scanner;

public class numeroPositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero positivo es: " + numero);
        } else if (numero < 0) {
            System.out.println("El numero negativo es: " + numero);
        } else {
            System.out.println("El número es: " + numero);
        }
    }
}
