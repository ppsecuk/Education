package com.sda.tallinn6.fundamentals.practical.homework.extra.task1;

import java.util.Scanner;

public class Extra1 {
    public static void main(String[] args) {
        System.out.println("Enter any sentence:");

        while(true) {
            Scanner scanner = new Scanner(System.in);
            String sentence = scanner.nextLine();
            String reverse = "";

            for (int counter = sentence.length() - 1; counter >= 0; counter--) {
                reverse = reverse + sentence.charAt(counter);
            }
            System.out.println("Reversed sentence is: \n" + reverse);
        }
    }
}
