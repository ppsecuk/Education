package com.sda.tallinn6.fundamentals.practical.advanced_evgeni;

public class NoAlphaSymbolsRemover2 {

    public static void main(String[] args) {
        String initialString = "as4%fmvFD$lDF";

        String result = removeAllNoAlphaSymb(initialString);
        System.out.println(result);
        // "asfmvFDlDF"
    }

    private static String removeAllNoAlphaSymb(String initialString) {
        String s = initialString.chars()
                .filter(el -> el < 'z' && el > 'A')
                .mapToObj(item -> (char) item)
                .collect(StringBuilder::new, (sb, i) -> sb.append((char) i), StringBuilder::append)
                .toString();

        return s;
    }

}