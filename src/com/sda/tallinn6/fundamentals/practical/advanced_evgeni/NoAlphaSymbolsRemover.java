package com.sda.tallinn6.fundamentals.practical.advanced_evgeni;

public class NoAlphaSymbolsRemover {

    public static void main(String[] args) {
        String initialString = "as4%fmvFD$lDF";

        String result = removeAllNoAlphaSymb(initialString);
        System.out.println(result);
    }

    private static String removeAllNoAlphaSymb(String initialString) {
        initialString = initialString.replaceAll("[^a-zA-Z0-9]", "");
        return initialString;
    }

}