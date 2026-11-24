package Metodos;

public class SistemaSaludos {
    static void saludar(){
        System.out.println("¡Bienvenido al sistema!");
    }

    static void saludar(String nombre){
        System.out.println("Hola, " + nombre);
    }

    static void saludar(String nombre, int edad){
        System.out.println("Hola, " + nombre + ", tienes " + edad + "años");
    }

    public static void main(String[] args) {
        saludar();
        saludar("Diego");
        saludar("Diego", 25);
    }
}
