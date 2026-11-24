package Metodos;

public class ConvertirTemperatura {

    static double convertirCelciusFahrenheit(double temperatura){
        return ((temperatura * 1.8)+32);
    }

    static double convertirFahrenheitCelcius(double temperatura){
        return ((temperatura - 32)/1.8);
    }

    static double convertirCelciusKelvin(double temperatura){
        return (temperatura + 273.15);
    }

    public static void main(String[] args) {
        System.out.println("La conversion de Celcius a Fahrenheit es: " + convertirCelciusFahrenheit(32));
        System.out.println("La conversión de Fahrenheit a Celcius es: " + convertirFahrenheitCelcius(273));
        System.out.println("La converción de Celcius a Kelvin es: " + convertirCelciusKelvin(100));
    }
}
