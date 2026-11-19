package Variables;

public class compra {
    public static void main(String[] args) {
        double producto1 = 15000;
        double producto2 = 8000;

        System.out.println("PRODUCTO 1");
        System.out.println("Precio: " + producto1);
        System.out.println("Cantidad: 3");
        System.out.println("______________________");

        double subtotal = producto1 * 3;
        System.out.println("Subtotal: " + subtotal);
        double IVA = subtotal * 0.19;
        System.out.println("IVA 19%: " + IVA);

        System.out.println("________________________");

        double total = subtotal + IVA;
        System.out.println("Total: " + total);

        System.out.println("PRODUCTO 2");
        System.out.println("Precio: " + producto2);
        System.out.println("Cantidad: 2");
        System.out.println("______________________");

        double subtotal2 = producto2 * 2;
        System.out.println("Subtotal: " + subtotal2);
        double IVA2 = subtotal2 * 0.19;
        System.out.println("IVA 19%: " + IVA2);

        System.out.println("________________________");

        double total2 = subtotal2 + IVA2;
        System.out.println("Total: " + total2);

        double totalGeneral = total + total2;
        System.out.println("total general: " + totalGeneral);
        double IVAGeneral = IVA + IVA2;
        System.out.println("IVA general: " + IVAGeneral);
        System.out.println("Total: " + totalGeneral);
    }
}
