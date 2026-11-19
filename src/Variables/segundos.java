package Variables;

public class segundos {
    public static void main(String[] args) {
        int cantidadSegundos = 3665;
        int hora;
        int minutos;

        hora = cantidadSegundos / 3600;
        minutos = 65 % 60;

        System.out.println(hora + ":" + minutos + ":" + "5");
    }
}
