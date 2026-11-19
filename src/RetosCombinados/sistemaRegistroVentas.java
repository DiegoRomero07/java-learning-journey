package RetosCombinados;

import java.util.Scanner;

public class sistemaRegistroVentas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ventasTecnologia = 0;
        int ventasRopa = 0;
        int ventasAlimento = 0;
        int totalVentas;
        double porcentajeTecnologia, porcentajeRopa, porcentajeAlimento;


        System.out.println("=============== SISTEMA DE VENTAS ===============");
        System.out.println("""
                1. Registrar venta de tecnología
                2. Registrar venta de ropa
                3. Registrar venta de alimentos
                4. Finalizar registro
                """);
        System.out.println("Seleccione una opcion: ");
        int opcion = sc.nextInt();

        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    ventasTecnologia++;
                    break;
                case 2:
                    ventasRopa++;
                    break;
                case 3:
                    ventasAlimento++;
                    break;
                default:
                    System.out.println("Opción invalida!!!");
            }

            System.out.println("""
                    1. Registrar venta de tecnología
                    2. Registrar venta de ropa
                    3. Registrar venta de alimentos
                    4. Finalizar registro
                    """);
            System.out.println("Seleccione una opcion: ");
            opcion = sc.nextInt();
        }
        totalVentas = ventasTecnologia + ventasRopa + ventasAlimento;
        if (totalVentas > 0) {
            porcentajeTecnologia = ((double) ventasTecnologia / totalVentas) * 100;
            porcentajeRopa = ((double) ventasRopa / totalVentas) * 100;
            porcentajeAlimento = ((double) ventasAlimento / totalVentas) * 100;

            System.out.println("Total de ventas: " + totalVentas);
            System.out.println("Total de ventas tecnologicas: " + ventasTecnologia);
            System.out.println("Total de ventas ropa: " + ventasRopa);
            System.out.println("Total de ventas alimentos: " + ventasAlimento);

            System.out.println("Porcentaje de venta de tecnología: " + porcentajeTecnologia + "%");
            System.out.println("Porcentaje de venta de ropa: " + porcentajeRopa + "%");
            System.out.println("Porcentaje de venta de alimento: " + porcentajeAlimento + "%");
        } else {
            System.out.println("No se registraron ventas");
            System.out.println("No es posible calcular porcentajes");
        }

        System.out.println("Gracias por utilizar nuestro sistema de registro de ventas!!!");

        sc.close();
    }
}
