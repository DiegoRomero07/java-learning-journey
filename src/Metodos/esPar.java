package Metodos;

public class esPar {
    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static void consultarNumero(int numero){
        if(esPar(numero)){
            System.out.println("Es Par");
        } else {
            System.out.println("No Es Par");
        }
    }

    public static void main(String[] args) {
        consultarNumero(15);
    }
}
