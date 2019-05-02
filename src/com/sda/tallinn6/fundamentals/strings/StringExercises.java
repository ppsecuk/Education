package com.sda.tallinn6.fundamentals.strings;

import java.util.Arrays;

public class StringExercises {
    public static void main(String[] args) {
        System.out.println("elvis and lives are anagram:" +isAnagram("elvis", "lives"));

    }
    private static boolean isAnagram(String first, String second){
        String sortedFirst = sort(first);
        String sortedSecond = sort(second);
        return sortedFirst.equals(sortedSecond);
    }
    private static String prepare(String text) {
        return text.toLowerCase()
                .trim()
                .replaceAll("\\s", "");
    }
    private static String sort(String text) {
        char[] chars = prepare(text).toCharArray();

        Arrays.sort(chars);
        return new String(chars);
    }

    private static String reverseText(String input){
        return new StringBuilder(input).reverse().toString();
    }
}
