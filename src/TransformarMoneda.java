import java.util.Scanner;

public class TransformarMoneda {

    public static void convertir(String monedaBase, String monedaTarget,
                                 ConseguirValorMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        ValorMonedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La tasa de conversion para hoy\n1 " + monedaBase
                + " = " + monedas.conversion_rate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida
                + " " + monedas.target_code());

    }

    public static void convertirOtraMoneda(ConseguirValorMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda objetivo: ");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}