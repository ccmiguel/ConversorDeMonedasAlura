import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConseguirValorMoneda consulta = new ConseguirValorMoneda();

        int opcion = 0;
        while(opcion != 8){
            System.out.println("**************************************************\n" +
                    "Bienvenidos al conversor de monedas :D \n\n" +
                    "Ingresa la conversion que deseas realizar\n\n" +
                    "1. Dolar a Peso Argentino\n" +
                    "2. Peso Argentino a Dolar\n" +
                    "3. Dolar a Real Brasilero\n" +
                    "4. Real Brasilero a Dolar\n" +
                    "5. Dolar a Peso Colombiano\n" +
                    "6. Peso colombiano a Dolar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir\n" +
                    "Elija una conversion valida:\n" +
                    "**************************************************\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    TransformarMoneda.convertir("USD", "ARS", consulta, lectura);
                    break;
                case 2:
                    TransformarMoneda.convertir("ARS", "USD", consulta, lectura);
                    break;
                case 3:
                    TransformarMoneda.convertir("USD", "BRL", consulta, lectura);
                    break;
                case 4:
                    TransformarMoneda.convertir("BRL", "USD", consulta, lectura);
                    break;
                case 5:
                    TransformarMoneda.convertir("USD", "COP", consulta, lectura);
                    break;
                case 6:
                    TransformarMoneda.convertir("COP", "USD", consulta, lectura);
                    break;
                case 7:
                    TransformarMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("Cerrando el programa ... ");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
}
