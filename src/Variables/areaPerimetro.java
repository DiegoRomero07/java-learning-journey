package Variables;

import java.util.Scanner;

public class areaPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base;
        int altura;
        int area;
        int perimetro;

        System.out.print("Ingrese la base del triangulo: ");
        base = sc.nextInt();
        System.out.print("Ingrese la altura del triangulo: ");
        altura = sc.nextInt();

        System.out.print("Ingrese la base del rectangulo: ");
        base = sc.nextInt();
        System.out.print("Ingrese la altura del rectangulo: ");
        altura = sc.nextInt();

        area = (base * altura) / 2;
        perimetro = (2 * base) + (2 * altura);

        System.out.println("Area del trinagulo: " + area);
        System.out.println("Perimetro del triangulo: " + perimetro);
    }
}
