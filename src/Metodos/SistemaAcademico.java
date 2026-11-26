/*
* Construye un programa que permita:
1. Registrar tres notas.
2. Calcular el promedio.
3. Determinar si el estudiante aprobó o reprobó.
4. Mostrar la calificación final.
Condiciones:
- El promedio debe calcularse mediante un método.
- La validación de aprobación debe realizarse mediante otro método.
- Debes utilizar sobrecarga para calcular promedios de dos y tres notas.
*
* */

package Metodos;

import java.util.Locale;
import java.util.Scanner;

public class SistemaAcademico {

    static double calcularPromedio(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

    static double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    static boolean verificarAprobacion(double promedio){
        return promedio >= 3.0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese la primera nota: ");
        double nota1=sc.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        double nota2=sc.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        double nota3=sc.nextDouble();

        double promedio = calcularPromedio(nota1, nota2, nota3);
        boolean aprobado = verificarAprobacion(promedio);

        System.out.println("Promedio: "+promedio);

        if (aprobado){
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
