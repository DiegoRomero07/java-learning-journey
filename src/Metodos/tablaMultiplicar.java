package Metodos;

import java.util.Scanner;

public class tablaMultiplicar {
    static void mostrarMenu() {
        System.out.println("""
                1. Consultar tabla
                2. Salir
                """);
        System.out.println("Seleccione una opción: ");
    }

    static void tablaMultiplicar(int numero, int limite) {
        for (int i = 1; i <= limite; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
    }

    static boolean validarNumeros(int numero, int limite) {
        return numero > 0 && limite > 0;
    }

    static void consultarTabla(Scanner sc) {
        System.out.println("Introduce la tabla multiplicar: ");
        int numero = sc.nextInt();

        System.out.println("Hasta donde desea miltiplicar: ");
        int limite = sc.nextInt();
        if (validarNumeros(numero, limite)) {
            tablaMultiplicar(numero, limite);
        } else {
            System.out.println("Error, el número debe de ser mayor a 0");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    consultarTabla(sc);
                    break;
                case 2:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 2);
        {
            sc.close();
        }
    }
}
