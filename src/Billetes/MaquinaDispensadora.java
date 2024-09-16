package Billetes;

public class MaquinaDispensadora {

    private HandlerBilletes manejador;

    public MaquinaDispensadora(){

        this.manejador = new Billetes100000();
        HandlerBilletes manejador50K = new Billetes50000();
        HandlerBilletes manejador20K = new Billetes20000();
        HandlerBilletes manejador10K = new Billetes10000();
        HandlerBilletes manejador5K = new Billetes5000();

        manejador.establecerSiguiente(manejador50K);
        manejador50K.establecerSiguiente(manejador20K);
        manejador20K.establecerSiguiente(manejador10K);
        manejador10K.establecerSiguiente(manejador5K);

    }

    public void retirar(int cantidad){
        if (cantidad % 5000 != 0) {
            System.out.println("Error: La cantidad no es reconocida");
        }else{
            manejador.procesar(cantidad);
        }
    }

}
