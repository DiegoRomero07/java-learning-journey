package Metodos;

public class MayorEdad {

    static void verificarEdad(int edad){
        if (edad >= 18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }

    public static void main(String[] args) {
        verificarEdad(19);
    }
}
