package Metodos;

public class SistemaSumas {

    static int sumar(int a, int b) {
        return a + b;
    }

    static int sumar(int a, int b, int c) {
        return a + b + c;
    }

    static double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumar(4, 5));
        System.out.println(sumar(4, 5, 6));
        System.out.println(sumar(4.5, 5.0));
    }
}
