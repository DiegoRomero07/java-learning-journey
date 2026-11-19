package Condicionales;

import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor del producto: ");
        double valor = sc.nextDouble();

        if (valor > 100000) {
            double descuento = valor * 0.10;
            double precioFinal = valor - descuento;

            System.out.println("Tienes un descuento del 10% ");
            System.out.println("Valor del descuento: " + descuento);
            System.out.println("Precio final a pagar: " + precioFinal);
        } else {
            System.out.println("No aplica descuento. Precio final a pagar: " + valor);
        }
    }
}
