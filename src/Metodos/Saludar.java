package Metodos;

public class Saludar {
    static void saludar(String nombre){
        System.out.println("Hola, " + nombre+". Bienvenido al sistema.");
    }

    public static void main(String[] args) {
        saludar("Diego");
    }
}
