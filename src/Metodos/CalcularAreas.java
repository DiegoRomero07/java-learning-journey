package Metodos;

public class CalcularAreas {
    static double calcularAreaCuadrado(double lado){
        return lado*lado;
    }
    static double calcularAreaRectangulo(double base, double altura){
        return base*altura;
    }
    static double calcularRadioCirculo(double diametro){
        return diametro / 2;
    }

    public static void main(String[] args) {
        System.out.println(calcularAreaCuadrado(5));
        System.out.println(calcularAreaRectangulo(5, 5));
        System.out.println(calcularRadioCirculo(35));
    }
}

