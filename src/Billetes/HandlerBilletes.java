package Billetes;

public abstract class HandlerBilletes {

    protected HandlerBilletes siguiente;

    public void establecerSiguiente(HandlerBilletes siguiente) {
        this.siguiente = siguiente;
    }

    protected abstract void procesar(int cantidad);

}
