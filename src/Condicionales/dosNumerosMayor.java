package Condicionales;

import java.util.Scanner;

public class dosNumerosMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite un numero: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println("Numero mayor es: " + numero1);
        } else if (numero1 < numero2) {
            System.out.println("Numero mayor es: " + numero2);
        } else if (numero1 == numero2) {
            System.out.println("Los numero son iguales");
        }
    }
}
