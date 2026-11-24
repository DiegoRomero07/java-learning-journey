package Metodos;

import org.w3c.dom.ls.LSOutput;

public class NumeroPrimo {
    static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("El numero es primo: " + esPrimo(4));
    }
}
