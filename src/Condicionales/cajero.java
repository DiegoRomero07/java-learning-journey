package Condicionales;

import java.util.Scanner;

public class cajero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double saldo = 100000;
        System.out.println("================ CAJERO AUTOMATICO ==================");
        do {
            System.out.print("""
                    1. Consultar saldo
                    2. Depositar
                    3. Retirar
                    4. Salir
                    Elije la opción que deseas:
                    """);

            opcion = sc.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:

                    System.out.println("============= SALDO ===============");
                    System.out.println("Su saldo es: " + saldo + "\n");
                    break;
                case 2:

                    double depositar;
                    System.out.println("=============== DEPOSITAR ===============");
                    System.out.print("Cuanto desea depositar: ");
                    depositar = sc.nextDouble();

                    if (depositar <= 0) {
                        System.out.println("No se puede depositar un saldo negativo!!");
                        break;
                    } else {
                        saldo += depositar;
                        System.out.print("Su saldo actual es de: " + saldo);
                    }
                    break;
                case 3:

                    System.out.println("================= RETIRAR ===================");
                    double retirar;
                    System.out.print("Cuanto desea retirar: ");
                    retirar = sc.nextDouble();


                    if (retirar <= 0) {
                        System.out.println("Error: Cantidad invalida");
                    } else if (retirar > saldo) {
                        System.out.println("Error: Saldo insuficiente");
                    } else {
                        System.out.print("El retiro ha sido de: " + retirar + "\n");
                        saldo -= retirar;
                        System.out.print("Saldo actual: " + saldo + "\n");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestros cajero automaticos. Adios!!");
                    break;
                default:
                    System.out.println("Error: Opción invalida!!!");
            }
        } while (opcion != 4);
    }
}
