package com.sda.tallinn6.fundamentals.practical.homework.extra.task1;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println("Welcome please enter the string");

        Scanner scanner = new Scanner(System.in);
        //scanner.next will take the first string
        //scanner.nextLine will take the sentence.
        String incomingString = scanner.nextLine();

        String[] words = incomingString.split(" ");


        /**
         * This is one way.
         */
        String resultWithoutStringBuilder = "";
        for (int counter = 0; counter < words.length; counter++) {
            String reverse = reverse(words[counter]);
            resultWithoutStringBuilder = resultWithoutStringBuilder + reverse + " ";
        }

        /**
         * This is another way.
         */
    /*    String resultWithStringBuilder = "";
        for (int counter = 0; counter < words.length; counter++) {
            String reverse = new StringBuilder(words[counter]).reverse().toString();
            resultWithStringBuilder = resultWithStringBuilder + reverse + " ";
        }*/

        System.out.println(resultWithoutStringBuilder);
       // System.out.println(resultWithStringBuilder);


    }

    private static String reverse(String source) {
        if (source == null || source.isEmpty()) {
            return source;
        }
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }

        return reverse;
    }


}
