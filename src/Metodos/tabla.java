package Metodos;

public class tabla {

    static void mostrarTabla(){
        int numero = 5;
        for(int i=1;i<=10;i++){
            System.out.println(i + " x " + numero + " = " + i*numero);
        }
    }

    public static void main(String[] args) {
        mostrarTabla();
    }
}
