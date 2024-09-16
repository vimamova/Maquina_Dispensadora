package Billetes;

public class Billetes100000 extends HandlerBilletes {

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 100000) {
            int numBilletes = cantidad / 100000;
            int sobrante = cantidad % 100000;
            System.out.println("Retirando " + numBilletes + " billetes de $100.000");
            if (sobrante > 0 && siguiente != null) {
                siguiente.procesar(sobrante);
            }
        } else if (siguiente != null) {
            siguiente.procesar(cantidad);
        }
    }
}
