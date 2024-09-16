import java.util.Scanner;

import Billetes.MaquinaDispensadora;

public class Retiro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MaquinaDispensadora maquina = new MaquinaDispensadora();

        System.out.println("Ingrese la cantidad a retirar: ");
        int cantidad = scanner.nextInt();

        maquina.retirar(cantidad);
        scanner.close();
        
    }
}
