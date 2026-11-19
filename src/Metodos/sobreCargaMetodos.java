package Metodos;

public class sobreCargaMetodos {
     /*
    static int plusMethodInt(int x, int y){
        return x + y;
    }

    static double plusMethodDouble(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
    * */

    public void print(String text) {
        System.out.println(text);
    }

    public void print(int number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        sobreCargaMetodos sobreCargaMetodos = new sobreCargaMetodos();
        sobreCargaMetodos.print("Bienvenido a Java");
        sobreCargaMetodos.print(5);

    }
}
