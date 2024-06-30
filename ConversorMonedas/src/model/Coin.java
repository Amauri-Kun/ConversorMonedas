package model;
import transaction.APIConsult;
import javax.swing.*;

public class Coin {
    public void convertir(String originCoin, String finalCoin) {
        APIConsult consult = new APIConsult();
        CoinImmutable coin = consult.searchCoin(originCoin, finalCoin);
//Operaciones
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir: "));
        double resultado = cantidad * coin.conversion_rate();
        System.out.println("La conversión es: "+resultado);
    }
}
