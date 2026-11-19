package Ciclos;

import java.util.Scanner;

public class sumarWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int suma = 0;
        System.out.print("Ingrese el numero: ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            System.out.println("Ingrese el numero: ");
            numero = sc.nextInt();

        }
        System.out.println("El resultado es: " + suma);
    }
}
