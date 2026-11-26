package Metodos;

public class CajeroAutomatico {
    static int mostrarMenu(int opcion) {
        System.out.println("""
                1. Consultar saldo
                2. Depositar dinero
                3. Retirar dinero
                4. Consultar movimientos
                5. Salir
                """);
        System.out.println("Seleccione una opción: " + opcion);
        return opcion;
    }

    static double saldo = 100000;
    static String movimientos = "";

    static void consultarSaldo() {
        System.out.println("Su saldo es: " + saldo);
    }

    static boolean validarDeposito(double depositar) {
        return depositar > 0;
    }

    static boolean validarRetiro(double retiro) {
        return retiro > 0 && retiro <= saldo;
    }

    static double depositar(double cantidad) {
        if (validarDeposito(cantidad)) {
            saldo += cantidad;
            movimientos += "Deposito: " + cantidad + "\n";
            return saldo;
        } else {
            System.out.println("No puede depositar saldo negativo!!!");
            return saldo;
        }
    }

    static double retirar(double cantidad) {
        if (validarRetiro(cantidad)) {
            saldo -= cantidad;
            movimientos += "Retiro: " + cantidad + "\n";
            return saldo;
        } else {
            System.out.println("No puede retirar mas del saldo actual!!!!");
            return saldo;
        }
    }

    static void consultarMovimientos() {
        System.out.println("Historial de movimientos: ");
        System.out.println(movimientos);
    }

    public static void main(String[] args) {
        switch (mostrarMenu(4)) {
            case 1:
                consultarSaldo();
                break;
            case 2:
                System.out.println(depositar(50000));
                break;
            case 3:
                System.out.println(retirar(50000));
                break;
            case 4:
                consultarMovimientos();
                break;
            case 5:
                System.out.println("Saliendo del programa....");
                break;
            default:
                System.out.println("Opción incorrecta!!!");
                break;
        }
    }
}
