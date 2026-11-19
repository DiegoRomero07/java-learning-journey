package Condicionales;

import java.util.Scanner;

public class diaSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        System.out.println("Ingrese un numero del 1 al 7: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            case 3:
                System.out.println("MIERCOLES");
                break;
            case 4:
                System.out.println("JUEVES");
                break;
            case 5:
                System.out.println("VIERNES");
                break;
            case 6:
                System.out.println("SABADO");
                break;
            case 7:
                System.out.println("DOMINGO");
                break;
            default:
                System.out.println("Número incorrecto: Debe de ser del 1 al 7");
                break;
        }
    }
}
