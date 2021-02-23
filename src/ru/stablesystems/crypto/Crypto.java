package ru.stablesystems.crypto;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.spec.ECField;

public class Crypto {
    double fiatAmmount;

    public enum Coin {
        Bitcoin,
        Etherium,
        BittorentCoin,
        Gramm,
        Doge,
        litecoin,
        EtheriumClassic
    }
    public void readFiatAmmount() {
        try (FileReader reader = new FileReader("C:\\Users\\novik\\Documents\\Repo\\CryptoDemo\\src\\ru\\stablesystems\\currency\\wallet.txt")) {
            int c;
            String fiatAmmountString = "";
            while((c=reader.read())!=-1){
                fiatAmmountString = fiatAmmountString + (char)c;
            }
            System.out.println(fiatAmmountString);
            fiatAmmount = Double.parseDouble(fiatAmmountString);
            System.out.println(fiatAmmount + "  спарсили");
        } catch (IOException e) {
            System.out.println("Something went wrong converting fiat to coins");
        }
    }

    public void convertToCoins(Coin coin, double ammount) throws Exception {
        double ammountOfCoins;
        if (ammount>fiatAmmount) {
            throw new Exception("Not enough money in the wallet");
    } else {
            ammountOfCoins = ammount/0.034;
            try (FileWriter fileWriter = new FileWriter("C:\\Users\\novik\\Documents\\Repo\\CryptoDemo\\src\\ru\\stablesystems\\currency\\walletCoin.txt", false)) {
                fileWriter.write("__Количество Doge_" + ammountOfCoins + "__Количество фиата_" + (fiatAmmount - ammount));
            } catch (Exception e) {
                System.out.println("неудача2");
            }
        }
    }

}
