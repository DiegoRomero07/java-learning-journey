package Metodos;

public class RegistroVentas {
    static void registrarVentas(String producto, int cantidad, double precio) {
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: " + precio);
        double total = cantidad * precio;
        System.out.println("Total: " + total);
    }

    public static void main(String[] args) {
        registrarVentas("Teclado", 3, 80000);
    }
}
