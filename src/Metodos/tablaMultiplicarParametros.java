package Metodos;

public class tablaMultiplicarParametros {
    static void mostrarTabla(int numero) {
        System.out.println("TABLE DEL " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "x" + numero + " = " + i * numero);
        }
    }

    public static void main(String[] args) {
        mostrarTabla(7);
        mostrarTabla(8);
        mostrarTabla(9);
    }
}
