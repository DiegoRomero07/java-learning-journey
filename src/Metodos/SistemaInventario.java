/*
* Crea un programa que permita:
- Registrar productos.
- Calcular el valor total del inventario.
- Consultar si hay existencias.
- Calcular el precio con descuento.
Debes utilizar métodos con y sin parámetros, métodos con retorno y sobrecarga.
* */

package Metodos;

public class SistemaInventario {

    static double calcularTotalInventario(double precio1, int cantidad1,
                                          double precio2, int cantidad2,
                                          double precio3, int cantidad3) {

        return (precio1 * cantidad1)
                + (precio2 * cantidad2)
                + (precio3 * cantidad3);
    }

    static int calcularCantidadInventario(int cantidad1, int cantidad2, int cantidad3){
        return cantidad1 + cantidad2 + cantidad3;
    }

    static boolean hayExistencia(int cantidad){
        return cantidad > 0;
    }

    static boolean hayExistencia(int cantidad1,int cantidad2){
        return cantidad1 > 0 || cantidad2 > 0;
    }

    static double calcularPrecioFinal(double precio){
        return precio;
    }
    static double calcularPrecioFinal(double precio, double descuento){
        return precio - (precio * descuento / 100);
    }



    public static void main(String[] args) {

        double total = calcularTotalInventario(
                10000, 3,
                200000, 5,
                100000, 6
        );

        if (hayExistencia(1,1)){
            double precioFinal = calcularPrecioFinal(total);
            System.out.println("Precio final: " + precioFinal);
            System.out.println("Unidades en inventario: " + calcularCantidadInventario(3,5,6));
        } else{
            System.out.println("No hay Stock");
        }

    }
}
