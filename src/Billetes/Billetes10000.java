package Billetes;

public class Billetes10000 extends HandlerBilletes {

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 10000) {
            int numBilletes = cantidad / 10000;
            int sobrante = cantidad % 10000;
            System.out.println("Retirando " + numBilletes + " billetes de $10.000");
            if (sobrante > 0 && siguiente != null) {
                siguiente.procesar(sobrante);
            }
        } else if (siguiente != null) {
            siguiente.procesar(cantidad);
        }
    }
}
