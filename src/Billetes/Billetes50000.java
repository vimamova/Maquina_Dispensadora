package Billetes;

public class Billetes50000 extends HandlerBilletes {

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 50000) {
            int numBilletes = cantidad / 50000;
            int sobrante = cantidad % 50000;
            System.out.println("Retirando " + numBilletes + " billetes de $50.000");
            if (sobrante > 0 && siguiente != null) {
                siguiente.procesar(sobrante);
            }
        } else if (siguiente != null) {
            siguiente.procesar(cantidad);
        }
    }
}
