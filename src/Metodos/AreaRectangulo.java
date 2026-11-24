package Metodos;

public class AreaRectangulo {
    static double calcularArea(double base, double altura){
        double area;
        area = base*altura;
        return area;
    }

    public static void main(String[] args) {
        System.out.println("El area del rectángulo es: " + calcularArea(15.5,15.6));
    }
}
