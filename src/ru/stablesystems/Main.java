package ru.stablesystems;
import ru.stablesystems.currency.*;

public class Main {

    public static void main(String[] args) {
        Fiat fiat = new Fiat();
        fiat.createWallet(1000, Fiat.Currency.RUR);
    }
}
