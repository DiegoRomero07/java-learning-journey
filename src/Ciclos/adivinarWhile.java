package Ciclos;

import java.util.Scanner;

public class adivinarWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = 89;
        int numero;
        int contador = 0;

        System.out.print("Digite um numero: ");
        numero = sc.nextInt();

        while (numero != numeroSecreto) {
            if (numeroSecreto > numero) {
                System.out.println("El número secreto es mayor que el ingresado!!!");
            } else {
                System.out.println("El número secreto es menor que el ingresado!!!");
            }
            System.out.print("Intente de nuevo: ");
            numero = sc.nextInt();
            contador++;
        }
        System.out.println("A adivinado el número en " + contador + " intentos");
    }
}
