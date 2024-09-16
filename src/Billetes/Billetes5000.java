package Billetes;

public class Billetes5000 extends HandlerBilletes {

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 5000) {
            int numBilletes = cantidad / 5000;
            int sobrante = cantidad % 5000;
            System.out.println("Retirando " + numBilletes + " billetes de $5.000");
            if (sobrante > 0) {
                System.out.println("Cantidad no válida. No se puede retirar menos de $5.000");
            }
        } else {
            System.out.println("Cantidad no válida. No se puede retirar menos de $5.000");
        }
    }
}
