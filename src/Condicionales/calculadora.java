package Condicionales;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== CALCULADORA ================");
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                """);
        System.out.print("Ingrese una opción: ");
        int opcion = sc.nextInt();
        int numero1 = 0, numero2 = 0;
        try {
            switch (opcion) {
                case 1:

                    System.out.println("=========== SUMA =============");
                    System.out.print("Ingrese número: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese número: ");
                    numero2 = sc.nextInt();

                    int suma = numero1 + numero2;

                    System.out.print("El resultado de la suma es: " + suma);

                    break;
                case 2:

                    System.out.println("=========== RESTA =============");
                    System.out.print("Ingrese número: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese número: ");
                    numero2 = sc.nextInt();

                    int resta = numero1 - numero2;

                    System.out.print("El resultado de la resta es: " + resta);
                    break;
                case 3:

                    System.out.println("=========== MULTIPLICACIÓN =============");
                    System.out.print("Ingrese número: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese número: ");
                    numero2 = sc.nextInt();

                    int multiplicacion = numero1 * numero2;

                    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
                    break;
                case 4:

                    System.out.println("=========== DIVISIÓN =============");
                    System.out.print("Ingrese número: ");
                    numero1 = sc.nextInt();
                    System.out.print("Ingrese número: ");
                    numero2 = sc.nextInt();

                    if (numero1 <= 0 || numero2 <= 0) {
                        System.out.println("Error: No se puede dividir por 0!!");
                    } else {
                        int division = numero1 / numero2;

                        System.out.print("El resultado de la división es: " + division);
                    }
                    break;
                default:
                    System.out.println("Error: opción invalida!!!");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida: debe escribir un numero");
        }
    }
}
