package Ciclos;

import java.util.Scanner;

public class factorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int factorial = 1;
        int contador = 1;
        int numero;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("No se puede calcular el factorial de un numero negativo");
        } else {
            while (contador <= numero) {
                factorial *= contador;
                contador++;
            }
            System.out.println("El factorial del número " + numero + "!" + " es: " + factorial);
        }
    }
}
