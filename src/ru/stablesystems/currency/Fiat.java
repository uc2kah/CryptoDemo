package ru.stablesystems.currency;
import java.io.*;

public class Fiat {
    double exchangeRateRUR = 1/76.8;
    double exchangeRateEUR = 1.1;

    public enum Currency {RUR, USD, EUR}


    public void createWallet(int ammount, Currency currency) {
        String fiatCurrency;
        switch (currency) {
            case RUR:
                fiatCurrency = ""+(ammount * exchangeRateRUR);
                break;
            case USD:
                fiatCurrency = ""+ammount;
                break;
            case EUR:
                fiatCurrency = ""+(ammount * exchangeRateEUR);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currency);
        }
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\novik\\Documents\\Repo\\CryptoDemo\\src\\ru\\stablesystems\\currency\\wallet.txt", false)) {
            fileWriter.write(fiatCurrency);
        } catch (IOException exception){
            System.out.println("Something went wrong");
        }

    }
    public void createWallet(int ammount, Currency currency, int ammount2, Currency currency2) {
        double fiatCurrency;
        switch (currency) {
            case RUR:
                fiatCurrency =(ammount * exchangeRateRUR);
                break;
            case USD:
                fiatCurrency =ammount;
                break;
            case EUR:
                fiatCurrency =(ammount * exchangeRateEUR);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currency);
        }
        switch (currency2) {
            case RUR:
                fiatCurrency =fiatCurrency + (ammount2 * exchangeRateRUR);
                break;
            case USD:
                fiatCurrency =fiatCurrency + ammount2;
                break;
            case EUR:
                fiatCurrency =fiatCurrency + (ammount2 * exchangeRateEUR);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currency);
        }
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\novik\\Documents\\Repo\\CryptoDemo\\src\\ru\\stablesystems\\currency\\wallet.txt", false)) {
            fileWriter.write(String.valueOf(fiatCurrency));
        } catch (IOException exception){
            System.out.println("Something went wrong");
        }

    }
    public void createWallet(int ammount, Currency currency, int ammount2, Currency currency2, int ammount3, Currency currency3) {
        double fiatCurrency;
        switch (currency) {
            case RUR:
                fiatCurrency =(ammount * exchangeRateRUR);
                break;
            case USD:
                fiatCurrency =ammount;
                break;
            case EUR:
                fiatCurrency =(ammount * exchangeRateEUR);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currency);
        }
        switch (currency2) {
            case RUR:
                fiatCurrency =fiatCurrency + (ammount2 * exchangeRateRUR);
                break;
            case USD:
                fiatCurrency =fiatCurrency + ammount2;
                break;
            case EUR:
                fiatCurrency =fiatCurrency + (ammount2 * exchangeRateEUR);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currency);
        }
        switch (currency3) {
            case RUR:
                fiatCurrency =fiatCurrency + (ammount3 * exchangeRateRUR);
                break;
            case USD:
                fiatCurrency =fiatCurrency + ammount3;
                break;
            case EUR:
                fiatCurrency =fiatCurrency + (ammount3 * exchangeRateEUR);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currency);
        }
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\novik\\Documents\\Repo\\CryptoDemo\\src\\ru\\stablesystems\\currency\\wallet.txt", false)) {
            fileWriter.write(String.valueOf(fiatCurrency));
        } catch (IOException exception){
            System.out.println("Something went wrong");
        }

    }
}
