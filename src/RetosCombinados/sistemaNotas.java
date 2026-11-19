package RetosCombinados;

import java.util.Scanner;

public class sistemaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;
        double promedio;
        int aprobado = 0;
        int reprobado = 0;
        int notaMayor = 0;
        int notaMenor = 5;
        int sumaNota = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite la nota del alumno: ");
            nota = sc.nextInt();

            while (nota < 0 || nota > 5) {
                System.out.println("Nota invalida. Digite una nota entre 0 a 5: ");
                nota = sc.nextInt();
            }

            if (nota >= 3) {
                System.out.println("aprobo");
                aprobado++;
            } else {
                System.out.println("reprobado");
                reprobado++;
            }

            if (nota > notaMayor) {
                notaMayor = nota;
            } else if (nota < notaMenor) {
                notaMenor = nota;
            }
            sumaNota += nota;
        }


        promedio = sumaNota / 5.0;

        System.out.println("Cantidad de alumnos reprobados son: " + reprobado);
        System.out.println("Cantidad de alumnos aprobados son: " + aprobado);
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
