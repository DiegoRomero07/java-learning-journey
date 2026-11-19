package Ciclos;

import java.util.Scanner;

public class contraseñaCorrectaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "Java123";
        boolean acceso = false;
        int intentos = 0;
        int maxIntentos = 3;


        while (!acceso && intentos < maxIntentos) {
            System.out.println("Ingrese la clave: ");
            String clave = sc.nextLine();
            intentos++;

            if (clave.equals(claveCorrecta)) {
                acceso = true;
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }

        if (acceso) {
            System.out.println("Acceso permitido! Bienvenido al sistema");
        } else {
            System.out.println("Cuenta bloqueada. Agotaste los 3 intentos.");
        }
        sc.close();
    }
}
