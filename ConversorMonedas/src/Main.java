import model.Coin;
import transaction.APIConsult;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        boolean bandera = true;
        Coin coin = new Coin();
//Ciclo while
        while(bandera) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("""
                    Ingrese una opción (solo el número):
                    1) Dólar =>> Peso argentino
                    2) Peso argentino =>> Dólar
                    3) Dólar =>> Real brasileño
                    4) Real brasileño =>> Dólar
                    5) Dólar =>> Peso colombiano
                    6) Peso colombiano =>> Dólar
                    7) Salir
                    """));

            switch (option) {
                case 1:
                    coin.convertir("USD", "ARS");
                    break;
                case 2:
                    coin.convertir("ARS", "USD");
                    break;
                case 3:
                    coin.convertir("USD", "BRL");
                    break;
                case 4:
                    coin.convertir("BRL", "USD");
                    break;
                case 5:
                    coin.convertir("USD", "COP");
                    break;
                case 6:
                    coin.convertir("COP", "USD");
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "¡Vuelva pronto!");
                    bandera = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        }
    }
}