package Ciclos;

import java.util.Scanner;

public class validarEntradaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println("Ingrese el edad: ");
        edad = sc.nextInt();

        while (edad < 0 || edad > 120) {
            System.out.println("Ingrese el edad: ");
            edad = sc.nextInt();
        }
        System.out.println("La edad es: " + edad);
    }
}
