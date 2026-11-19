package Variables;

import java.util.Scanner;

public class conversionTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;

        System.out.print("Ingrese el valor de los grados en Celsius: ");
        celsius = sc.nextInt();
        fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("En Fahrenheit es: " + fahrenheit);
    }
}
