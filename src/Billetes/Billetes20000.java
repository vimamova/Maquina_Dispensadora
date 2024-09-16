package Billetes;

public class Billetes20000 extends HandlerBilletes {

    @Override
    public void procesar(int cantidad) {
        if (cantidad >= 20000) {
            int numBilletes = cantidad / 20000;
            int sobrante = cantidad % 20000;
            System.out.println("Retirando " + numBilletes + " billetes de $20.000");
            if (sobrante > 0 && siguiente != null) {
                siguiente.procesar(sobrante);
            }
        } else if (siguiente != null) {
            siguiente.procesar(cantidad);
        }
    }
}
