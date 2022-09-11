package com.com;

import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        String lineOfCurrencies = "USD JPY AUD SGD HKD CAD CHF GBP EURO INR";
        String[] currencies = lineOfCurrencies.split(" ");
        System.out.println(currencies.length);
        System.out.println("input string words separated by whitespace: " + lineOfCurrencies);
        System.out.println("output string: " + Arrays.toString(currencies));

    }
}
