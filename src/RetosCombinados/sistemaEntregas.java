package RetosCombinados;

import java.util.Scanner;

public class sistemaEntregas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        int entregado = 0, noEntregado = 0, devuelto = 0;
        int totalPaquetesRegistrados;
        double porcentajeEfectivo;
        double porcentajeNoEfectivo;

        System.out.println("===========================BIENVENIDO AL SISTEMA DE REGISTRO DE ENTREGAS===========================");

        System.out.println("""
                1. Entregado
                2. No entregado
                3. Devuelto
                4. Salir
                """);
        System.out.println("Ingrese el estado que le quiere dar a la entrega: ");
        opcion = sc.nextInt();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    entregado++;
                    break;
                case 2:
                    noEntregado++;
                    break;
                case 3:
                    devuelto++;
                    break;
                default:
                    System.out.println("Opción inválida!!!!");
            }
            System.out.println("""
                    1. Entregado
                    2. No entregado
                    3. Devuelto
                    4. Salir
                    """);
            System.out.println("Ingrese el estado que le quiere dar a la entrega: ");
            opcion = sc.nextInt();
        }

        totalPaquetesRegistrados = entregado + noEntregado + devuelto;
        if (totalPaquetesRegistrados > 0) {
            porcentajeEfectivo = ((double) entregado / totalPaquetesRegistrados) * 100;

            porcentajeNoEfectivo = ((double) (noEntregado + devuelto) / totalPaquetesRegistrados) * 100;

            System.out.println("Total de entregas: " + entregado);
            System.out.println("Total de entregas no efectivas: " + noEntregado);
            System.out.println("Total de devueltos: " + devuelto);
            System.out.println("Total de paquetes: " + totalPaquetesRegistrados);

            System.out.println("Porcentaje efectivo: " + porcentajeEfectivo + "%");
            System.out.println("Porcentaje no efectivo: " + porcentajeNoEfectivo + "%");
        } else {
            System.out.println("No se registraron paquetes.");
            System.out.println("No es posible calcular los porcentajes.");
        }

        System.out.println("Gracias por utilizar nuestro sistema de registro de entregas");

        sc.close();
    }
}
