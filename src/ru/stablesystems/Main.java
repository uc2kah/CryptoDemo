package ru.stablesystems;
import ru.stablesystems.currency.*;
import ru.stablesystems.crypto.*;

public class Main {

    public static void main(String[] args) {
        Fiat fiat = new Fiat();
        fiat.createWallet(1000, Fiat.Currency.RUR, 1000, Fiat.Currency.EUR);
        Crypto cryptoWallet = new Crypto();
        cryptoWallet.readFiatAmmount();
        try {
            cryptoWallet.convertToCoins(Crypto.Coin.Doge, 100);
        } catch (Exception e) {
            System.out.println("неудача");
            e.printStackTrace();
        }
    }
}
